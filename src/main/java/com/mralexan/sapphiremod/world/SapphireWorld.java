package com.mralexan.sapphiremod.world;

import cpw.mods.fml.common.IWorldGenerator;
import cpw.mods.fml.common.registry.GameRegistry;

public class SapphireWorld
{
	public static void registerWorld()
	{
		initWorldGen();
	}
	public static void initWorldGen()
	{
		registerWorldGen(new SapphireWorldGenerator(), 1);
	}
	public static void registerWorldGen(IWorldGenerator worldGenClass, int weightedProbabaility)
	{
		GameRegistry.registerWorldGenerator(worldGenClass, weightedProbabaility);
	}
}