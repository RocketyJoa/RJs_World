package main.java.com.joa.rjworld.client.render.items;

import main.java.com.joa.rjworld.Main;
import main.java.com.joa.rjworld.items.ModItems;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;

public class ItemRenderRegister {
	public static void registerItemRenderer() {
		reg(ModItems.cyanite_ingot);
		reg(ModItems.cyanite_sword);
		reg(ModItems.cyanite_pickaxe);
		reg(ModItems.cyanite_axe);
		reg(ModItems.cyanite_shovel);
		reg(ModItems.cyanite_hoe);
		
		reg(ModItems.cyanite_chestplate);
		reg(ModItems.cyanite_helmet);
		reg(ModItems.cyanite_boots);
		reg(ModItems.cyanite_leggings);
		reg(ModItems.zestoren_chestplate);
		reg(ModItems.zestoren_helmet);
		reg(ModItems.zestoren_leggings);
		reg(ModItems.zestoren_boots);
		
		reg(ModItems.reinforcedCyanite_ingot);
		reg(ModItems.steelium_ingot);
		reg(ModItems.zestoren_ingot);
		reg(ModItems.zestoren_nucleus); // <-- [Ja-Ja.]
		reg(ModItems.cyanite_mass); // <-- [Ja-Ja.]
		reg(ModItems.anloe_stick);
		reg(ModItems.zestoren_pickaxe);
		reg(ModItems.zestoren_sword);
		reg(ModItems.zestoren_shovel);
		reg(ModItems.zestoren_sword_ultimate);
		reg(ModItems.zestoren_axe);
		reg(ModItems.zestoren_hoe);
        reg(ModItems.kotter_compound);
        reg(ModItems.kotter_sword);
        reg(ModItems.crystal_plasma);
        reg(ModItems.plasma_container);
        reg(ModItems.termonine_goo);
        reg(ModItems.ancient_meteorite_fragment);
        reg(ModItems.steelium_sword);
	}
	
	public static String modid = Main.MODID;

	public static void reg(Item item) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(modid + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}

	public static void reg(Item item, int meta, String file) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, meta, new ModelResourceLocation(modid + ":" + file, "inventory"));
	}
}