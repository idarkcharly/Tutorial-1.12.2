package com.charly1307.decorock.common.util.handlers;

import com.charly1307.decorock.DecoRockMain;
import com.charly1307.decorock.common.init.BlockInit;
import com.charly1307.decorock.common.init.ItemInit;
import com.charly1307.decorock.common.recipes.CraftingRecipes;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@EventBusSubscriber
public class RegistryHandler {

	@SubscribeEvent
	public static void onItemRegister(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(ItemInit.ITEMS.toArray(new Item[0]));
	}

	@SubscribeEvent
	@SideOnly(Side.CLIENT)
	public static void onModelRegister(ModelRegistryEvent event) {
		for (Item item : ItemInit.ITEMS) {
			DecoRockMain.proxy.registerItemRenderer(item, 0, "inventory");
		}
	}

	@SubscribeEvent
	public static void onBlockRegister(RegistryEvent.Register<Block> event) {
		// BlockInit.getBlocks();
		event.getRegistry().registerAll(BlockInit.BLOCKS.toArray(new Block[0]));
	}

	public static void preInitRegistries() {
	}

	public static void initRegistries() {
		CraftingRecipes.init();
	}

	public static void postInitRegistries() {
	}

	public static void serverRegistries(FMLServerStartingEvent event) {
	}

}
