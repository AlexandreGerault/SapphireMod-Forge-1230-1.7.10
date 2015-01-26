package com.mralexan.sapphiremod;

import com.mralexan.sapphiremod.initializers.SapphireBlocks;
import com.mralexan.sapphiremod.initializers.SapphireItems;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;
import cpw.mods.fml.common.registry.GameRegistry;

public class RecipesRegister
{
	public static void registerRecipes()
	{
		///////////
		// ITEMS //
		///////////
			// Get 9 sapphires from a sapphire block :
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(SapphireItems.sapphireItem, 9), true, new Object[]{
	                "A",
	                'A', SapphireBlocks.sapphireBlock}));
			// Sapphire sword
			GameRegistry.addRecipe(new ShapedOreRecipe(SapphireItems.sapphireSword, true, new Object[]{
	                "A",
	                "A",
	                "B",
	                'A', SapphireItems.sapphireItem, 'B', Items.stick}));
			
			///////////
			// TOOLS //
			///////////
				//Sapphire axe
				GameRegistry.addRecipe(new ShapedOreRecipe(SapphireItems.sapphireAxe, true, new Object[]{
		                "AA",
		                "AB",
		                " B",
		                'A', SapphireItems.sapphireItem, 'B', Items.stick}));
				GameRegistry.addRecipe(new ShapedOreRecipe(SapphireItems.sapphireAxe, true, new Object[]{
		                "AA",
		                "BA",
		                "B ",
		                'A', SapphireItems.sapphireItem, 'B', Items.stick}));
				
				//Sapphire pick axe
				GameRegistry.addRecipe(new ShapedOreRecipe(SapphireItems.sapphirePickaxe, true, new Object[]{
		                "AAA",
		                " B ",
		                " B ",
		                'A', SapphireItems.sapphireItem, 'B', Items.stick}));
				
				//Sapphire shovel
				GameRegistry.addRecipe(new ShapedOreRecipe(SapphireItems.sapphireShovel, true, new Object[]{
		                "A",
		                "B",
		                "B",
		                'A', SapphireItems.sapphireItem, 'B', Items.stick}));
				
				//Sapphire hoe
				GameRegistry.addRecipe(new ShapedOreRecipe(SapphireItems.sapphireHoe, true, new Object[]{
		                "AA",
		                "B ",
		                "B ",
		                'A', SapphireItems.sapphireItem, 'B', Items.stick}));
				GameRegistry.addRecipe(new ShapedOreRecipe(SapphireItems.sapphireHoe, true, new Object[]{
		                "AA",
		                " B",
		                " B",
		                'A', SapphireItems.sapphireItem, 'B', Items.stick}));
				
			///////////
			// Armor //
			///////////
				
				//Sapphire helmet
				GameRegistry.addRecipe(new ShapedOreRecipe(SapphireItems.helmetSapphire, true, new Object[]{
		                "AAA",
		                "A A",
		                'A', SapphireItems.sapphireItem}));
				
				//Sapphire chestplate
				GameRegistry.addRecipe(new ShapedOreRecipe(SapphireItems.chestplateSapphire, true, new Object[]{
				        "A A",
				        "AAA",
				        "AAA",
				        'A', SapphireItems.sapphireItem}));
				
				//sapphire leggings
				GameRegistry.addRecipe(new ShapedOreRecipe(SapphireItems.legsSapphire, true, new Object[]{
				        "AAA",
				        "A A",
				        "A A",
				        'A', SapphireItems.sapphireItem}));
				
				//Sapphire boots
				GameRegistry.addRecipe(new ShapedOreRecipe(SapphireItems.bootsSapphire, true, new Object[]{
				        "A A",
				        "A A",
				        'A', SapphireItems.sapphireItem}));
		
			////////////
			// BLOCKS //
			////////////
				//Get a sapphire block from 9 sapphires
				GameRegistry.addRecipe(new ShapedOreRecipe(SapphireBlocks.sapphireBlock, true, new Object[]{
				        "AAA",
				        "AAA",
				        "AAA",
				        'A', SapphireItems.sapphireItem}));
	}
}
