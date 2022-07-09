package com.charly1307.decorock.common.objects.blocks.decorative;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class Stormtrooper extends BlockBase {
	// Recibe x1, y1, z1, x2, y2, z2
public static final AxisAlignedBB STORMTROOPER_AABB = new AxisAlignedBB(0.3125D, 0D, 0.3125D, 0.6875D, 0.5000, 0.5625);

	public Stormtrooper(String name) {
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
		return STORMTROOPER_AABB;
	}
}
