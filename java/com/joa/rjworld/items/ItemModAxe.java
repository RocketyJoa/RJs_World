package main.java.com.joa.rjworld.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemAxe;

public class ItemModAxe extends ItemAxe {
	public ItemModAxe (String unlocalizedName, ToolMaterial material) {
		super(material);
		
		this.setUnlocalizedName(unlocalizedName);
		this.setCreativeTab(CreativeTabs.tabTools);
	}
}