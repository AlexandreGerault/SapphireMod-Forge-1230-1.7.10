package com.mralexan.sapphiremod.items;
import com.mralexan.sapphiremod.Sapphire;
import com.mralexan.sapphiremod.initializers.SapphireItems;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class SapphireArmor extends ItemArmor
{
	public String name;
	 private String [] armourTypes = new String [] {"helmetSapphire", "chestplateSapphire", "legsSapphire", "bootsSapphire"};
	
	public SapphireArmor(ArmorMaterial material, int renderIndex, int armourType, String p_name)
	{
		super(material, renderIndex, armourType);
		name = p_name;
		this.setUnlocalizedName(name);
	}
	
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String layer)
	{
		if(stack.getItem().equals(SapphireItems.helmetSapphire) || stack.getItem().equals(SapphireItems.chestplateSapphire) || stack.getItem().equals(SapphireItems.bootsSapphire))
			return "mralexan:textures/armor/sapphire_1.png";
		if(stack.getItem().equals(SapphireItems.legsSapphire))
			return "mralexan:textures/armor/sapphire_2.png";
		
		return null;
	}
	
	@Override
	public void registerIcons(IIconRegister register)
	{
		this.itemIcon = register.registerIcon(Sapphire.MODA+":"+name);
	}
	
	/*@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack stack)
	{
		if(stack.getItem() == Sapphire.bootsSapphire)
		{
			int j = EnchantmentHelper.getEnchantmentLevel(mainRegistry.speedBoost.effectId, stack);
			if(j > 0)
			{
				player.addPotionEffect(new PotionEffect(Potion.moveSpeed.getId(), 50, j - 1));
			}
		}
	}*/
	
}
