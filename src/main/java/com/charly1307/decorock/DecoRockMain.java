package com.charly1307.decorock;

import com.charly1307.decorock.common.proxy.CommonProxy;
import com.charly1307.decorock.common.recipes.CraftingRecipes;
import com.charly1307.decorock.common.util.Reference;
import com.charly1307.decorock.common.util.handlers.RegistryHandler;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION)
public class DecoRockMain {

	@Instance
	public static DecoRockMain instance;

	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
	public static CommonProxy proxy;

	
	public static final CreativeTabs DECOROCKTAB = new DecoRockTab("decorocktab");

	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
	}

	@EventHandler
	public void init(FMLInitializationEvent event) {
		CraftingRecipes.init();
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
			RegistryHandler.postInitRegistries();
	}

	@EventHandler
	public void serverInit(FMLServerStartingEvent event) {
		RegistryHandler.serverRegistries(event);
	}
}