package main.java.com.joa.rjworld.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemPickaxe;

public class ItemModPickaxe extends ItemPickaxe {
	public ItemModPickaxe (String unlocalizedName, ToolMaterial material) {
		super(material);
		
		this.setUnlocalizedName(unlocalizedName);
		this.setCreativeTab(CreativeTabs.tabTools);
	}
}
