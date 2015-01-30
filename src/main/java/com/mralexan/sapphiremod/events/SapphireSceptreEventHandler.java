package com.mralexan.sapphiremod.events;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.monster.IMob;
import net.minecraft.entity.passive.IAnimals;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraftforge.event.entity.player.AttackEntityEvent;
import net.minecraftforge.event.entity.player.EntityInteractEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;

import com.mralexan.sapphiremod.items.SapphireSceptre;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class SapphireSceptreEventHandler
{

	@SubscribeEvent
	public void playerAttackMob(AttackEntityEvent event)
	{
		EntityPlayer player = event.entityPlayer;
		
		if(player.getHeldItem() != null && player.getHeldItem().getItem() instanceof SapphireSceptre)
		{
			System.out.println("Test - Sapphire sceptre in hand!");
			EntityLivingBase target = null;
			
			// Check if the target is a LinvingEntity (not a Minecart for example)
			if(event.target instanceof EntityLiving)
			{
				target = (EntityLivingBase) event.target;
			}
			
			// Heal the player if the target is a Mob
			if(event.target instanceof IMob)
			{
				System.out.println("Hit a munter with sapphire sceptre");
				player.heal(2);
			}
			// Increase the food level of the player if he hits an animal
			else if(event.target instanceof IAnimals)
			{
				System.out.println("Hit an animal with sapphire sceptre");
				if(player.getFoodStats().getFoodLevel() == 20)
				{
					player.addPotionEffect(new PotionEffect(Potion.field_76443_y.getId(), 0));
				}
				else if(player.getFoodStats().getFoodLevel() < 20)
				{
					player.addPotionEffect(new PotionEffect(Potion.field_76443_y.getId(), 2));
				}
			}
			// If the target is a Player, it heals the target
			else if(event.target instanceof EntityPlayer)
			{
				System.out.println("Hit a player with sapphire sceptre");
				player.destroyCurrentEquippedItem();;
			}
			
		}
	}
	
	@SubscribeEvent
	public void playerInteractWithOtherPlayer(EntityInteractEvent e)
	{
		EntityPlayer player = e.entityPlayer;
		
		if(e.target instanceof EntityPlayer)
		{
			EntityPlayer target = (EntityPlayer) e.target;
			
			//If the player has a sapphire scepter in his hand and interact with another player, it heals the target player
			if(player.getHeldItem() != null && player.getHeldItem().getItem() instanceof SapphireSceptre)
			{
				target.heal(2);
			}
		}
	}
}
