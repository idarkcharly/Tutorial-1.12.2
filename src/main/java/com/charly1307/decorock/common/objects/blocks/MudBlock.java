package com.charly1307.decorock.common.objects.blocks;

import javax.annotation.Nullable;

import com.charly1307.decorock.DecoRockMain;
import com.charly1307.decorock.common.init.BlockInit;
import com.charly1307.decorock.common.init.ItemInit;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class MudBlock extends Block {

	protected static final AxisAlignedBB MUD_BLOCK_AABB = new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.875D, 1.0D);

	public MudBlock(String name) {

		super(Material.SAND);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(DecoRockMain.DECOROCKTAB);
		setHardness(0.5F);
		setResistance(0.5F);
		setSoundType(SoundType.SLIME);
		setHarvestLevel("shovel", 0);

		BlockInit.BLOCKS.add(this);
		ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}

	@Nullable
	public AxisAlignedBB getCollisionBoundingBox(IBlockState blockState, IBlockAccess worldIn, BlockPos pos) {
		return MUD_BLOCK_AABB;
	}

	public void onEntityCollidedWithBlock(World worldIn, BlockPos pos, IBlockState state, Entity entityIn) {
		entityIn.motionX *= 0.6D;
		entityIn.motionZ *= 0.6D;
	}

	public boolean isFullCube(IBlockState state) {
		return false;
	}
	
}