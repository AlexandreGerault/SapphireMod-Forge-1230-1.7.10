package com.mralexan.sapphiremod.events;

import ibxm.Player;

import com.mralexan.sapphiremod.initializers.SapphireBlocks;
import com.mralexan.sapphiremod.initializers.SapphireItems;
import com.mralexan.sapphiremod.items.SapphireSceptre;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.entity.item.EntityMinecartEmpty;
import net.minecraft.entity.monster.EntityWitch;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.monster.IMob;
import net.minecraft.entity.passive.IAnimals;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.IChatComponent;
import net.minecraftforge.event.entity.player.AttackEntityEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.event.entity.player.PlayerUseItemEvent;
import net.minecraftforge.event.entity.player.PlayerUseItemEvent.Start;
import net.minecraftforge.event.world.BlockEvent;

public class SapphireEventHandler
{

	@SubscribeEvent
	public void checkUpdate(PlayerEvent.PlayerLoggedInEvent event)
	{
		System.out.println(event.player.getDisplayName() + " just joined the game !");
	}
	
	@SubscribeEvent
	public void playerAttackMob(AttackEntityEvent event)
	{	
		if(event.entityPlayer.getHeldItem() != null && event.entityPlayer.getHeldItem().getItem() instanceof SapphireSceptre)
		{
			System.out.println("Test - Sapphire sceptre in hand!");
			EntityLivingBase target = null;
			
			if(event.target instanceof EntityLiving)
			{
				target = (EntityLivingBase) event.target;
			}
			
			
			if(event.target instanceof IMob)
			{
				System.out.println("Hit a munter with sapphire sceptre");
				event.entityPlayer.setHealth(event.entityPlayer.getHealth() + 2);
				target.addPotionEffect(new PotionEffect(Potion.wither.id, 1200));
			}
			else if(event.target instanceof IAnimals)
			{
				System.out.println("Hit an animal with sapphire sceptre");
				if(event.entityPlayer.getFoodStats().getFoodLevel() == 20)
				{
					event.entityPlayer.addPotionEffect(new PotionEffect(Potion.field_76443_y.getId(), 0));
				}
				else if(event.entityPlayer.getFoodStats().getFoodLevel() < 20)
				{
					event.entityPlayer.addPotionEffect(new PotionEffect(Potion.field_76443_y.getId(), 20));
				}
			}
			
			else if(event.target instanceof EntityPlayer)
			{
				System.out.println("Hit a player with sapphire sceptre");
				((EntityPlayer) event.target).setHealth(target.getHealth() + 6);
			}
			
		}
	}
}
