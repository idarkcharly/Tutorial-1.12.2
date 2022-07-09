package com.charly1307.decorock;

import com.charly1307.decorock.common.init.ItemInit;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class DecoRockTab extends CreativeTabs {

	public DecoRockTab(String label) {
		super("decorocktab");
	}

	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(ItemInit.SLICED_BREAD);
	}

}
