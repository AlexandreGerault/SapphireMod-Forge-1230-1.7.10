package com.mralexan.sapphiremod.registers;

import com.mralexan.sapphiremod.generators.SapphireWorldGenerator;

import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.registry.GameRegistry;

public class GameRegister
{
	public static void register()
	{
		RenderingRegistry.addNewArmourRendererPrefix("5");
		
		BlocksRegister.registerBlocks();
		ItemsRegister.registerItems();
		RecipesRegister.registerRecipes();
		
		GameRegistry.registerWorldGenerator(new SapphireWorldGenerator(), 0);
	}
}
