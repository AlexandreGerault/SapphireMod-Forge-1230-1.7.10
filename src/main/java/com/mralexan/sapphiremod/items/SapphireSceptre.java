package com.mralexan.sapphiremod.items;

import com.mralexan.sapphiremod.Sapphire;
import com.mralexan.sapphiremod.initializers.SapphireBlocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class SapphireSceptre extends Item
{
	public String name;
	
	public SapphireSceptre(String p_name)
	{
		super();
		name = p_name;
		this.setUnlocalizedName(name);
		this.setCreativeTab(CreativeTabs.tabTools);
		// TODO Auto-generated constructor stub
	}

	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister register)
	{
		this.itemIcon = register.registerIcon(Sapphire.MODA+":"+name);
	}
}
