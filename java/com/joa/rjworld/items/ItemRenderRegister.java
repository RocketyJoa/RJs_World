package main.java.com.joa.rjworld.items;


import main.java.com.joa.rjworld.Main;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;

public final class ItemRenderRegister {

	public static void preInit() {
	}

	public static void registerItemRenderer() {
		reg(ModItems.cyanite_pickaxe);
		reg(ModItems.cyanite_axe);
		reg(ModItems.cyanite_shovel);
		reg(ModItems.cyanite_hoe);
		reg(ModItems.cyanite_sword);
		reg(ModItems.cyanite_ingot);
		reg(ModItems.reinforcedCyanite_ingot);
		reg(ModItems.steelium_ingot);
		reg(ModItems.zestoren_ingot);
		reg(ModItems.zestoren_nucleus);
		reg(ModItems.cyanite_mass);
		
		reg(ModItems.cyanite_helmet);
		reg(ModItems.cyanite_chestplate);
		reg(ModItems.cyanite_leggings);
		reg(ModItems.cyanite_boots);
		reg(ModItems.kotter_compound);
		reg(ModItems.kotter_sword);
		reg(ModItems.crystal_plasma);
}

	// ==========================================================================

	public static String modid = Main.MODID;

	public static void reg(Item item) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(modid + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}

	public static void reg(Item item, int meta, String file) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, meta, new ModelResourceLocation(modid + ":" + file, "inventory"));
	}
}
