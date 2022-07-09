package com.charly1307.decorock.common.objects.blocks.decorative;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class MiniPig extends BlockBase {
	public static final AxisAlignedBB MINIPIG_AABB = new AxisAlignedBB(0.3125D, 0D, 0.3125D, 0.6875D, 0.5000,
			0.5625);

	public MiniPig(String name) {
		super(name, Material.CLOTH);
	}

	@Override
	public boolean isOpaqueCube(IBlockState state) {
		return false;
	}

	@Override
	public boolean isFullCube(IBlockState state) {
		return false;
	}

	@Override
	public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
		return MINIPIG_AABB;
	}

}
