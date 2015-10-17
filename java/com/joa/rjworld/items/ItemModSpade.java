package main.java.com.joa.rjworld.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSpade;

public class ItemModSpade extends ItemSpade {
		public ItemModSpade (String unlocalizedName, ToolMaterial material) {
			super(material);
			
			this.setUnlocalizedName(unlocalizedName);
			this.setCreativeTab(CreativeTabs.tabTools);
		}
}
