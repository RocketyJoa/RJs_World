package main.java.com.joa.rjworld.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemHoe;

public class ItemModHoe extends ItemHoe {
		public ItemModHoe (String unlocalizedName, ToolMaterial material) {
			super(material);
			
			this.setUnlocalizedName(unlocalizedName);
			this.setCreativeTab(CreativeTabs.tabTools);
		}
}
