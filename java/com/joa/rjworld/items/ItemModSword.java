package main.java.com.joa.rjworld.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;

public class ItemModSword extends ItemSword{

	public ItemModSword (String unlocalizedName, ToolMaterial material) {
		super(material);
		
		this.setUnlocalizedName(unlocalizedName);
		this.setCreativeTab(CreativeTabs.tabCombat);
	}
}
