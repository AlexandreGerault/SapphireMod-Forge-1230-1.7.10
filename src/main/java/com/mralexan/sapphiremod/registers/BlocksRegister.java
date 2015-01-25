package com.mralexan.sapphiremod.registers;

import com.mralexan.sapphiremod.Sapphire;
import com.mralexan.sapphiremod.initializers.SapphireBlocks;

import cpw.mods.fml.common.registry.GameRegistry;

public class BlocksRegister
{
	public static void registerBlocks()
	{
    	GameRegistry.registerBlock(SapphireBlocks.sapphireBlock, "sapphireBlock");
    	GameRegistry.registerBlock(SapphireBlocks.sapphireOre, "sapphireOre");
	}
}
