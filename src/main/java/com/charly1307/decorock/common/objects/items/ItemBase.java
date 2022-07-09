package com.charly1307.decorock.common.objects.items;

import com.charly1307.decorock.DecoRockMain;
import com.charly1307.decorock.common.init.ItemInit;

import net.minecraft.item.ItemFood;

public class ItemBase extends ItemFood {

	public ItemBase(String name, int amount, float saturation, boolean isWolfFood) {
		super(amount, saturation, isWolfFood);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(DecoRockMain.DECOROCKTAB);
		setAlwaysEdible();
		ItemInit.ITEMS.add(this);
	}
}
