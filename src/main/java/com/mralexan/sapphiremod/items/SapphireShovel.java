package com.mralexan.sapphiremod.items;

import com.mralexan.sapphiremod.Sapphire;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemSword;

public class SapphireShovel extends ItemSpade
{
	public String name;
	public SapphireShovel(String p_name, ToolMaterial material)
	{
		super(material);
		name = p_name;
		this.setUnlocalizedName(name);
	}
	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister register)
	{
		this.itemIcon = register.registerIcon(Sapphire.MODA+":"+name);
	}
}
