package com.charly1307.decorock.common.init;

import java.util.ArrayList;
import java.util.List;

import com.charly1307.decorock.common.objects.blocks.FrogLight;
import com.charly1307.decorock.common.objects.blocks.LampBlock;
import com.charly1307.decorock.common.objects.blocks.MudBlock;
import com.charly1307.decorock.common.objects.blocks.MudBricks;
import com.charly1307.decorock.common.objects.blocks.decorative.MiniPig;
import com.charly1307.decorock.common.objects.blocks.decorative.Stormtrooper;

import net.minecraft.block.Block;

public class BlockInit {

	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	//Bloques "normales"
		public static final Block FROG_LIGHT = new FrogLight("frog_light");
		public static final Block LAMP_BLOCK = new LampBlock("lamp_block");
		public static final Block MUD_BLOCK = new MudBlock("mud_block");
		public static final Block MUD_BRICKS = new MudBricks("mud_bricks");
	//Bloques custom
		public static final Block STORMTROOPER = new Stormtrooper("stormtrooper");
		public static final Block MINI_PIG = new MiniPig("mini_pig");

		
}
