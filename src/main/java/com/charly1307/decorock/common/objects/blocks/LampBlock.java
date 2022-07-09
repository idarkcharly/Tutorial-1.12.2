package com.charly1307.decorock.common.objects.blocks;

import com.charly1307.decorock.DecoRockMain;
import com.charly1307.decorock.common.init.BlockInit;
import com.charly1307.decorock.common.init.ItemInit;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemBlock;

public class LampBlock extends Block {

	public LampBlock(String name) {
		super(Material.REDSTONE_LIGHT);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(DecoRockMain.DECOROCKTAB);
		setLightLevel(1F);
		setHardness(0.5F);
		
		BlockInit.BLOCKS.add(this);
		ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}
}
