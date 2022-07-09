package com.charly1307.decorock.common.objects.blocks;

import com.charly1307.decorock.DecoRockMain;
import com.charly1307.decorock.common.init.BlockInit;
import com.charly1307.decorock.common.init.ItemInit;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemBlock;

public class FrogLight extends Block {

	public FrogLight(String name) {

		super(Material.WOOD);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(DecoRockMain.DECOROCKTAB);
		setLightLevel(0.8F);
		setHardness(0.3F);
		setSoundType(SoundType.WOOD);
		setHarvestLevel("axe", 1);
		BlockInit.BLOCKS.add(this);
		ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}

}
