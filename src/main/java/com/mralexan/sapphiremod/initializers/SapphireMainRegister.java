package com.mralexan.sapphiremod.initializers;

import com.mralexan.sapphiremod.blocks.SapphireBlock;
import com.mralexan.sapphiremod.world.SapphireWorld;

public class SapphireMainRegister
{
	public static void register()
	{
		SapphireBlocks.registerBlocks();
		SapphireItems.registerItems();
		SapphireWorld.registerWorld();
	}
}
