package com.stevenpaw.moretosee.block;

import net.minecraft.core.BlockPos;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.phys.shapes.BooleanOp;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

import java.util.stream.Stream;

public class Flag extends Block {

    public static final DirectionProperty FACING = BlockStateProperties.HORIZONTAL_FACING;

    public Flag(Properties pProperties) {
        super(pProperties);
    }

    private static final VoxelShape SHAPE_N = Stream.of(Block.box(2, 0, 7, 4, 16, 9), Block.box(4, 8, 7, 7, 15, 8), Block.box(7, 8, 8, 11, 15, 9), Block.box(11, 8, 7, 14, 15, 8)
        ).reduce((v1, v2) -> Shapes.join(v1,v2, BooleanOp.OR)).get();
    private static final VoxelShape SHAPE_E = Stream.of(Block.box(7, 0, 2, 9, 16, 4), Block.box(8, 8, 4, 9, 15, 7), Block.box(7, 8, 7, 8, 15, 11), Block.box(8, 8, 11, 9, 15, 14)
        ).reduce((v1, v2) -> Shapes.join(v1,v2, BooleanOp.OR)).get();
    private static final VoxelShape SHAPE_S = Stream.of(Block.box(12, 0, 7, 14, 16, 9), Block.box(9, 8, 8, 12, 15, 9), Block.box(5, 8, 7, 9, 15, 8), Block.box(2, 8, 8, 5, 15, 9)
        ).reduce((v1, v2) -> Shapes.join(v1,v2, BooleanOp.OR)).get();
    private static final VoxelShape SHAPE_W = Stream.of(Block.box(7, 0, 12, 9, 16, 14), Block.box(7, 8, 9, 8, 15, 12), Block.box(8, 8, 5, 9, 15, 9), Block.box(7, 8, 2, 8, 15, 5)
        ).reduce((v1, v2) -> Shapes.join(v1,v2, BooleanOp.OR)).get();

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter pLevel, BlockPos pPos, CollisionContext pContext)
    {
        switch (state.getValue(FACING))
        {
            default:
                return SHAPE_N;
            case EAST:
                return SHAPE_E;
            case SOUTH:
                return SHAPE_S;
            case WEST:
                return SHAPE_W;
        }
    }

    /*Facing*/
    @Override
    public BlockState getStateForPlacement(BlockPlaceContext context)
    {
        return this.defaultBlockState().setValue(FACING, context.getHorizontalDirection().getOpposite());
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

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder)
    {
        builder.add(FACING);
    }
}
