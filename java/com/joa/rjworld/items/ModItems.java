package main.java.com.joa.rjworld.items;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;

public final class ModItems {
	public static Item cyanite_ingot;
	public static Item cyanite_mass;
	public static Item reinforcedCyanite_ingot;
	public static Item steelium_ingot;
	public static Item zestoren_ingot;
	public static Item zestoren_nucleus;
    public static Item termonine_goo;
	public static Item cyanite_sword;
	public static Item cyanite_pickaxe;
	public static Item cyanite_axe;
	public static Item cyanite_shovel;
	public static Item cyanite_hoe;
	public static Item cyanite_helmet;
	public static Item cyanite_chestplate;
	public static Item cyanite_leggings;
	public static Item cyanite_boots;
	public static Item anloe_stick;
	public static Item zestoren_pickaxe;
	public static Item zestoren_sword;
	public static Item zestoren_shovel;
	public static Item zestoren_sword_ultimate;
	public static Item zestoren_axe;
	public static Item zestoren_hoe;
	public static Item zestoren_helmet;
	public static Item zestoren_chestplate;
	public static Item zestoren_leggings;
	public static Item zestoren_boots;
	public static Item kotter_compound;
	public static Item crystal_plasma;
	public static Item kotter_sword;
	public static Item plasma_container;
    public static Item ancient_meteorite_fragment;
    public static Item steelium_sword;
	public static ToolMaterial CYANITE = EnumHelper.addToolMaterial("CYANITE", 4, 2357, 9.0F, 3.0F, 8);
	public static ToolMaterial REINFORCEDCYANITE = EnumHelper.addToolMaterial("REINFORCEDCYANITE", 5, 2735, 11.0F, 5.0F, 15);
	public static ToolMaterial STEELIUM = EnumHelper.addToolMaterial("STEELIUM", 3, 1600, 7.0F, 2.0F, 10);
	public static ToolMaterial ZESTOREN = EnumHelper.addToolMaterial("ZESTOREN", 6, 3500, 15.0F, 7.0F, 5);
	public static ToolMaterial KOTTER = EnumHelper.addToolMaterial("KOTTER", 7, 4735, 17.0F, 8.0F, 23);
	public static ToolMaterial ZESTORENULT = EnumHelper.addToolMaterial("ZESTORENULT", 7, 5000, 18.0F, 10.0F, 37);
	public static ArmorMaterial CYANITEA = EnumHelper.addArmorMaterial("CYANITEA", "rjworld:cyanitea", 37, new int[]{3, 8, 6, 3}, 8);
	public static ArmorMaterial ZESTORENA = EnumHelper.addArmorMaterial("ZESTORENA", "rjworld:zestorena", 45, new int []{3,  8, 6, 3}, 45);

	public static void createItems() {
		GameRegistry.registerItem(cyanite_ingot = new BasicItem("cyanite_ingot"), "cyanite_ingot");
		GameRegistry.registerItem(cyanite_sword = new ItemModSword("cyanite_sword", CYANITE), "cyanite_sword");
		GameRegistry.registerItem(cyanite_pickaxe = new ItemModPickaxe("cyanite_pickaxe", CYANITE), "cyanite_pickaxe");
		GameRegistry.registerItem(cyanite_axe = new ItemModAxe("cyanite_axe", CYANITE), "cyanite_axe");
		GameRegistry.registerItem(cyanite_shovel = new ItemModSpade("cyanite_shovel", CYANITE), "cyanite_shovel");
		GameRegistry.registerItem(cyanite_hoe = new ItemModHoe("cyanite_hoe", CYANITE), "cyanite_hoe");
		GameRegistry.registerItem(cyanite_helmet = new ItemModArmor("cyanite_helmet", CYANITEA, 1, 0), "cyanite_helmet");
		GameRegistry.registerItem(cyanite_chestplate = new ItemModArmor("cyanite_chestplate", CYANITEA, 1, 1), "cyanite_chestplate");
		GameRegistry.registerItem(cyanite_leggings = new ItemModArmor("cyanite_leggings", CYANITEA, 2, 2), "cyanite_leggings");
		GameRegistry.registerItem(cyanite_boots = new ItemModArmor("cyanite_boots", CYANITEA, 1, 3), "cyanite_boots");
		GameRegistry.registerItem(reinforcedCyanite_ingot = new BasicItem("reinforcedCyanite_ingot"), "reinforcedCyanite_ingot");
		GameRegistry.registerItem(steelium_ingot = new BasicItem("steelium_ingot"), "steelium_ingot");
		GameRegistry.registerItem(zestoren_ingot = new BasicItem("zestoren_ingot"), "zestoren_ingot");
		GameRegistry.registerItem(cyanite_mass = new BasicItem("cyanite_mass"), "cyanite_mass");
		GameRegistry.registerItem(zestoren_nucleus = new BasicItem("zestoren_nucleus"), "zestoren_nucleus");
		GameRegistry.registerItem(anloe_stick = new BasicItem("anloe_stick"), "anloe_stick");
		GameRegistry.registerItem(zestoren_pickaxe = new ItemModPickaxe("zestoren_pickaxe", ZESTOREN), "zestoren_pickaxe");
		GameRegistry.registerItem(zestoren_sword = new ItemModSword("zestoren_sword", ZESTOREN), "zestoren_sword");
		GameRegistry.registerItem(zestoren_sword_ultimate = new ItemModSword("zestoren_sword_ultimate", ZESTORENULT), "zestoren_sword_ultimate");
		GameRegistry.registerItem(zestoren_shovel = new ItemModSpade("zestoren_shovel", ZESTOREN), "zestoren_shovel");
		GameRegistry.registerItem(zestoren_axe = new ItemModAxe("zestoren_axe", ZESTOREN), "zestoren_axe");
		GameRegistry.registerItem(zestoren_hoe = new ItemModHoe("zestoren_hoe", ZESTOREN), "zestoren_hoe");
		GameRegistry.registerItem(zestoren_helmet = new ItemModArmor("zestoren_helmet", ZESTORENA, 1, 0), "zestoren_helmet");
		GameRegistry.registerItem(zestoren_chestplate = new ItemModArmor("zestoren_chestplate", ZESTORENA, 1, 1), "zestoren_chestplate");
		GameRegistry.registerItem(zestoren_leggings = new ItemModArmor("zestoren_leggings", ZESTORENA, 2, 2), "zestoren_leggings");
		GameRegistry.registerItem(zestoren_boots = new ItemModArmor("zestoren_boots", ZESTORENA, 1, 3), "zestoren_boots");
		GameRegistry.registerItem(kotter_compound = new BasicItem("kotter_compound"), "kotter_compound");
		GameRegistry.registerItem(crystal_plasma = new BasicItem("crystal_plasma"), "crystal_plasma");
		GameRegistry.registerItem(kotter_sword = new ItemModSword("kotter_sword", KOTTER), "kotter_sword");
        GameRegistry.registerItem(termonine_goo = new BasicItem("termonine_goo"), "termonine_goo");
        GameRegistry.registerItem(steelium_sword = new ItemModSword("steelium_sword", STEELIUM), "steelium_sword");
        GameRegistry.registerItem(ancient_meteorite_fragment = new BasicItem("ancient_meteorite_fragment"), "ancient_meteorite_fragment");
		GameRegistry.registerItem(plasma_container = new BasicItem("plasma_container"), "plasma_container");
	}
	
	}
