package com.stevenpaw.moretosee.block;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
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

import javax.annotation.Nullable;

public class PillarBlock extends Block{

    public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;
    protected static final VoxelShape SHAPE = Block.box(1.0D, 0.0D, 1.0D, 15.0D, 16.0D, 15.0D);

    public static final BooleanProperty OCCUPIED = BlockStateProperties.OCCUPIED;
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

    @Nullable
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        BlockPos blockpos = context.getClickedPos();
        BlockState blockstate = context.getLevel().getBlockState(blockpos);
        if (blockstate.equals(this)) {
            return blockstate.setValue(FACING, context.getHorizontalDirection().getOpposite()).setValue(OCCUPIED, true).setValue(BOTTOM, true).setValue(WATERLOGGED, Boolean.valueOf(false));
        } else {
            FluidState fluidstate = context.getLevel().getFluidState(blockpos);
            BlockState blockstate1 = this.defaultBlockState().setValue(FACING, context.getHorizontalDirection().getOpposite()).setValue(OCCUPIED, true).setValue(BOTTOM, true).setValue(WATERLOGGED, Boolean.valueOf(fluidstate.getType() == Fluids.WATER));
            Direction direction = context.getClickedFace();
            return direction != Direction.DOWN && (direction == Direction.UP || !(context.getClickLocation().y - (double)blockpos.getY() > 0.5D)) ? blockstate1 : blockstate1.setValue(FACING, context.getHorizontalDirection().getOpposite()).setValue(OCCUPIED, true).setValue(BOTTOM, true);
        }
    }

    @Override
    public void onPlace(BlockState pState, Level pLevel, BlockPos pPos, BlockState pOldState, boolean pIsMoving) {
        UpdateNeighbors(pLevel, pPos, pState);
        UpdateModel(pLevel,pPos,pState);
    }

    @Override
    public void onRemove(BlockState pState, Level pLevel, BlockPos pPos, BlockState pNewState, boolean pIsMoving) {
        UpdateNeighbors(pLevel, pPos, pState);
    }

    @Override
    public boolean onDestroyedByPlayer(BlockState state, Level level, BlockPos pos, Player player, boolean willHarvest, FluidState fluid) {
        UpdateNeighbors(level, pos, state);
        return true;
    }

    public void UpdateNeighbors (Level worldIn, BlockPos pos, BlockState state){
        if(worldIn.getBlockState(pos.above()).getBlock().getRegistryName().equals(this.getRegistryName())){
            PillarBlock pillar = (PillarBlock) worldIn.getBlockState(pos.above()).getBlock();
            pillar.UpdateModel((Level) worldIn, pos.above(), state);
        }
        if(worldIn.getBlockState(pos.below()).getBlock().getRegistryName().equals(this.getRegistryName())){
            PillarBlock pillar = (PillarBlock) worldIn.getBlockState(pos.below()).getBlock();
            pillar.UpdateModel((Level) worldIn, pos.below(), state);
        }
    }

    public void UpdateModel(Level worldIn, BlockPos pos, BlockState state) {
        Boolean top = false;
        Boolean bottom = false;
        Boolean waterlogged = worldIn.getBlockState(pos).getValue(WATERLOGGED);
        if(worldIn.getBlockState(pos.above()).getBlock().getRegistryName().equals(this.getRegistryName())){
            top = true;
        }
        if(worldIn.getBlockState(pos.below()).getBlock().getRegistryName().equals(this.getRegistryName())){
            bottom = true;
        }
        if(!worldIn.isClientSide()) {
            //TODO: Fix this crashing line 107:
            worldIn.setBlock(pos, state.setValue(OCCUPIED, top).setValue(BOTTOM, bottom).setValue(WATERLOGGED, waterlogged), 3);
        }
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder)
    {
        builder.add(FACING).add(OCCUPIED).add(BOTTOM).add(WATERLOGGED);
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
