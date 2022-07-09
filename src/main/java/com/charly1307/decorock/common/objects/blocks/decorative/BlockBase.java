package com.charly1307.decorock.common.objects.blocks.decorative;

import com.charly1307.decorock.DecoRockMain;
import com.charly1307.decorock.common.init.BlockInit;
import com.charly1307.decorock.common.init.ItemInit;
import com.charly1307.decorock.common.util.IHasModel;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockBase extends Block implements IHasModel {

	public BlockBase(String name, Material material) {
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(DecoRockMain.DECOROCKTAB);

		BlockInit.BLOCKS.add(this);
		ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));

	}

	@Override
	public void registerModels() {
		DecoRockMain.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
	}

}
