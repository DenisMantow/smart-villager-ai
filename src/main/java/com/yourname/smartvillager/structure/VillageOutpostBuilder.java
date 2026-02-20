package com.yourname.smartvillager.structure;

import net.minecraft.block.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class VillageOutpostBuilder {

    public static void build(World world, BlockPos pos) {
        world.setBlockState(pos, Blocks.COBBLESTONE.getDefaultState());
        world.setBlockState(pos.up(), Blocks.OAK_FENCE.getDefaultState());
        world.setBlockState(pos.up(2), Blocks.TORCH.getDefaultState());
    }
}
