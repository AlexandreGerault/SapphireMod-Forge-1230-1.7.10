package com.mralexan.sapphiremod.items;

import com.mralexan.sapphiremod.Sapphire;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemPickaxe;

public class SapphirePickaxe extends ItemPickaxe
{
	public String name;
	
	public SapphirePickaxe( String p_name, ToolMaterial material)
	{
		super(material);
		name = p_name;
		this.setUnlocalizedName(name);
		// TODO Auto-generated constructor stub
	}

	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister register)
	{
		this.itemIcon = register.registerIcon(Sapphire.MODA+":"+name);
	}
}
