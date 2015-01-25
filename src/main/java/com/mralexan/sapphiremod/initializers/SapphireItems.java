package com.mralexan.sapphiremod.initializers;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

import com.mralexan.sapphiremod.Sapphire;
import com.mralexan.sapphiremod.items.SapphireArmor;
import com.mralexan.sapphiremod.items.SapphireAxe;
import com.mralexan.sapphiremod.items.SapphireHoe;
import com.mralexan.sapphiremod.items.SapphireItem;
import com.mralexan.sapphiremod.items.SapphirePickaxe;
import com.mralexan.sapphiremod.items.SapphireShovel;
import com.mralexan.sapphiremod.items.SapphireSword;

public class SapphireItems
{
	//Items
    public static Item sapphireItem;
    public static Item sapphireSword;
    public static Item sapphireAxe;
    public static Item sapphirePickaxe;
    public static Item sapphireShovel;
    public static Item sapphireHoe;
    
    public static Item helmetSapphire;
    public static Item chestplateSapphire;
    public static Item legsSapphire;
    public static Item bootsSapphire;
    
	public static void initializeItems()
	{
		sapphireItem = new SapphireItem("sapphireItem");
		sapphireSword = new SapphireSword("sapphireSword", Sapphire.SAPPHIRE);
		sapphireAxe = new SapphireAxe("sapphireAxe", Sapphire.SAPPHIRE);
		sapphirePickaxe = new SapphirePickaxe("sapphirePickaxe", Sapphire.SAPPHIRE);
		sapphireShovel = new SapphireShovel("sapphireShovel", Sapphire.SAPPHIRE);
		sapphireHoe = new SapphireHoe("sapphireHoe", Sapphire.SAPPHIRE);
		
		helmetSapphire = new SapphireArmor(Sapphire.ARMORSAPPHIRE, 5, 0, "helmetSapphire");
		chestplateSapphire = new SapphireArmor(Sapphire.ARMORSAPPHIRE, 5, 1, "chestplateSapphire");
		legsSapphire = new SapphireArmor(Sapphire.ARMORSAPPHIRE, 5, 2, "legsSapphire");
		bootsSapphire = new SapphireArmor(Sapphire.ARMORSAPPHIRE, 5, 3, "bootsSapphire");
		
		OreDictionary.registerOre("sapphireItem", sapphireItem);
	}
}
