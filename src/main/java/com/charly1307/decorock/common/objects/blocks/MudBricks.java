package com.charly1307.decorock.common.objects.blocks;

import com.charly1307.decorock.DecoRockMain;
import com.charly1307.decorock.common.init.BlockInit;
import com.charly1307.decorock.common.init.ItemInit;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemBlock;

public class MudBricks extends Block {

	public MudBricks(String name) {
		super(Material.ROCK);

		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(DecoRockMain.DECOROCKTAB);
		setResistance(1F);
		setHardness(1.5F);
		setHarvestLevel("pickaxe", 1);
		setSoundType(SoundType.STONE);

		BlockInit.BLOCKS.add(this);
		ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}
}
