package main.java.com.joa.rjworld.blocks;

import main.java.com.joa.rjworld.items.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.fml.common.registry.GameRegistry;

public final class ModBlocks {
	public static Block cyanite_block;
	public static Block zestoren_ore;
	public static Block cyanite_ore;
	public static Block zestoren_block;
	public static Block building_block;
    public static Block plasma_cluster;
	
	public static void createBlocks() {
	    GameRegistry.registerBlock(cyanite_block = new BasicBlock("cyanite_block"), "cyanite_block");
	    GameRegistry.registerBlock(zestoren_ore = new ModBlockOre("zestoren_ore", Material.iron, ModItems.zestoren_nucleus, 1, 3), "zestoren_ore");
	    GameRegistry.registerBlock(cyanite_ore = new ModBlockOre("cyanite_ore", Material.rock, ModItems.cyanite_mass, 1, 5), "cyanite_ore");
	    GameRegistry.registerBlock(zestoren_block = new BasicBlock("zestoren_block"), "zestoren_block");
	    GameRegistry.registerBlock(building_block = new BasicBlock("building_block"), "building_block");
        GameRegistry.registerBlock(plasma_cluster = new ModBlockOre("plasma_cluster", Material.iron, ModItems.crystal_plasma, 0, 2), "plasma_cluster");
	}
}
