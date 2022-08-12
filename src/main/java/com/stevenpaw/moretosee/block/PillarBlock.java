package com.stevenpaw.moretosee.block;


import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

public class PillarBlock extends Block {

    public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;
    protected static final VoxelShape SHAPE = Block.box(1.0D, 0.0D, 1.0D, 15.0D, 16.0D, 15.0D);

    public static final BooleanProperty UP = BlockStateProperties.UP;
    public static final BooleanProperty BOTTOM = BlockStateProperties.BOTTOM;

    public static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;

    public PillarBlock(Properties pProperties) {super(pProperties);}


    @Override
    public VoxelShape getShape(BlockState state, BlockGetter pLevel, BlockPos pPos, CollisionContext pContext)
    {
        return SHAPE;
    }

    @Override
    public BlockState rotate(BlockState state, Rotation rot)
    {
        return state.setValue(FACING, rot.rotate(state.getValue(FACING)));
    }

    @Override
    public BlockState mirror(BlockState state, Mirror mirrorIn)
    {
        return state.rotate(mirrorIn.getRotation(state.getValue(FACING)));
    }

    public BlockState getStateForPlacement(BlockPlaceContext context) {
        Level level = context.getLevel();
        BlockPos blockpos = context.getClickedPos();

        return this.defaultBlockState().setValue(WATERLOGGED, false).setValue(BOTTOM, Boolean.valueOf(!this.isBottom(level, blockpos))).setValue(UP, Boolean.valueOf(!this.isTop(level, blockpos)));
    }

    private boolean isBottom(BlockGetter level, BlockPos pos) {
        return !(level.getBlockState(pos.below()).getBlock().getRegistryName() == this.getRegistryName());
    }

    private boolean isTop(BlockGetter level, BlockPos pos) {
        return !(level.getBlockState(pos.above()).getBlock().getRegistryName() == this.getRegistryName());
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder)
    {
        builder.add(FACING, UP, BOTTOM, WATERLOGGED);
    }

    @Override
    public boolean propagatesSkylightDown(BlockState pState, BlockGetter pLevel, BlockPos pPos) {
        return !pState.getValue(WATERLOGGED);
    }

    @Override
    public FluidState getFluidState(BlockState state) {
        return state.getValue(WATERLOGGED) ? Fluids.WATER.defaultFluidState() : super.getFluidState(state);
    }
}
