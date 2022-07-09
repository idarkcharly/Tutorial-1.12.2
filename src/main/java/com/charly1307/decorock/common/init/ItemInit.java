package com.charly1307.decorock.common.init;

import java.util.ArrayList;
import java.util.List;

import com.charly1307.decorock.common.objects.items.ItemBase;

import net.minecraft.item.Item;

public class ItemInit {

	public static final List<Item> ITEMS = new ArrayList<Item>();

	// Items
	public static final Item SLICED_BREAD = new ItemBase("sliced_bread", 2, 0.2F, false);

}
