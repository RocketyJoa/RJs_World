package main.java.com.joa.rjworld.crafting;

import main.java.com.joa.rjworld.blocks.ModBlocks;
import main.java.com.joa.rjworld.items.ModItems;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModCrafting {
	public static void initCrafting() {
		//Items =========================================================================================
		GameRegistry.addRecipe(new ItemStack(ModItems.cyanite_ingot, 4),
				"!",
				'!', ModBlocks.cyanite_block);

		GameRegistry.addRecipe(new ItemStack(ModItems.zestoren_ingot, 5),
				"!",
				'!', ModBlocks.zestoren_block);

		GameRegistry.addRecipe(new ItemStack(ModItems.reinforcedCyanite_ingot, 4),
				"#%#",
				"%$%",
				"#%#",
				'#', ModItems.cyanite_ingot, '%', ModItems.steelium_ingot, '$', ModItems.cyanite_mass);

		GameRegistry.addRecipe(new ItemStack(ModItems.plasma_container, 1),
				"#%#",
				"% %",
				"#%#",
				'#', ModItems.zestoren_ingot, '%', ModItems.steelium_ingot);

		GameRegistry.addRecipe(new ItemStack(ModItems.steelium_ingot, 8),
				"%%%",
				"%&%",
				"%%%",
				'%', Items.iron_ingot, '&', Items.coal);

		GameRegistry.addRecipe(new ItemStack(ModItems.kotter_compound, 1),
				"%%%",
				"%&%",
				"%%%",
				'%', ModItems.crystal_plasma, '&', ModItems.plasma_container);

		GameRegistry.addSmelting(ModItems.cyanite_mass, new ItemStack(ModItems.cyanite_ingot), 1.0F);

		GameRegistry.addRecipe(new ItemStack(ModItems.zestoren_ingot),
				"###",
				"#$#",
				"###",
				'#', ModItems.cyanite_ingot, '$', ModItems.zestoren_nucleus);

		//Blocks =========================================================================================
		GameRegistry.addRecipe(new ItemStack(ModBlocks.cyanite_block),
				"$#$",
				"#$#",
				"$#$",
				'#', ModItems.cyanite_ingot, '$', ModItems.steelium_ingot);

		GameRegistry.addRecipe(new ItemStack(ModBlocks.building_block, 8),
				"%%%",
				"%$%",
				"%%%",
				'$', ModItems.cyanite_mass, '%', Blocks.brick_block);

		GameRegistry.addRecipe(new ItemStack(ModBlocks.zestoren_block),
				"###",
				"###",
				"###",
				'#', ModItems.zestoren_ingot);

		//Swords =========================================================================================
		GameRegistry.addRecipe(new ItemStack(ModItems.cyanite_sword),
				" # ",
				" # ",
				" I ",
				'#', ModItems.cyanite_ingot, 'I', Items.stick);

		GameRegistry.addRecipe(new ItemStack(ModItems.zestoren_sword),
				" # ",
				" # ",
				" % ",
				'#', ModItems.zestoren_ingot, '%', ModItems.steelium_ingot);

		GameRegistry.addRecipe(new ItemStack(ModItems.zestoren_sword_ultimate),
				" # ",
				"&#&",
				"$%$",
				'#', ModItems.zestoren_ingot, '&', ModItems.zestoren_nucleus, '%', ModItems.zestoren_sword, '$', Items.magma_cream);

		GameRegistry.addRecipe(new ItemStack(ModItems.kotter_sword),
				" /&",
				" /&",
				"&#&",
				'#', ModItems.zestoren_ingot, '&', ModItems.kotter_compound, '/', ModItems.steelium_ingot);

		GameRegistry.addRecipe(new ItemStack(ModItems.steelium_sword),
				" % ",
				" % ",
				" / ",
				'%', ModItems.steelium_ingot, '/', ModItems.reinforcedCyanite_ingot);

		//Pickaxes =========================================================================================
		GameRegistry.addRecipe(new ItemStack(ModItems.cyanite_pickaxe),
				"###",
				" I ",
				" I ",
				'#', ModItems.cyanite_ingot, 'I', Items.stick);

		GameRegistry.addRecipe(new ItemStack(ModItems.zestoren_pickaxe),
				"###",
				" % ",
				" % ",
				'#', ModItems.zestoren_ingot, '%', ModItems.steelium_ingot);

		//Axes =========================================================================================
		GameRegistry.addRecipe(new ItemStack(ModItems.cyanite_axe),
				" ##",
				" I#",
				" I ",
				'#', ModItems.cyanite_ingot, 'I', Items.stick);

		GameRegistry.addRecipe(new ItemStack(ModItems.zestoren_axe),
				"## ",
				"#/ ",
				" / ",
				'#', ModItems.zestoren_ingot, '/', ModItems.steelium_ingot);

		GameRegistry.addRecipe(new ItemStack(ModItems.zestoren_axe),
				" ##",
				" /#",
				" / ",
				'#', ModItems.zestoren_ingot, '/', ModItems.steelium_ingot);
		//Shovels =========================================================================================
		GameRegistry.addRecipe(new ItemStack(ModItems.cyanite_shovel),
				" # ",
				" I ",
				" I ",
				'#', ModItems.cyanite_ingot, 'I', Items.stick);

		GameRegistry.addRecipe(new ItemStack(ModItems.zestoren_shovel),
				" # ",
				" % ",
				" % ",
				'#', ModItems.zestoren_ingot, '%', ModItems.steelium_ingot);

		//Hoes =========================================================================================
		GameRegistry.addRecipe(new ItemStack(ModItems.cyanite_hoe),
				" ##",
				" I ",
				" I ",
				'#', ModItems.cyanite_ingot, 'I', Items.stick);

		GameRegistry.addRecipe(new ItemStack(ModItems.zestoren_hoe),
				"## ",
				" % ",
				" % ",
				'#', ModItems.zestoren_ingot, '%', ModItems.steelium_ingot);

		GameRegistry.addRecipe(new ItemStack(ModItems.zestoren_hoe),
				"## ",
				" % ",
				" % ",
				'#', ModItems.zestoren_ingot, '%', ModItems.steelium_ingot);

		//Special =========================================================================================
		GameRegistry.addRecipe(new ItemStack(ModItems.anloe_stick),
				"%%%",
				"%$%",
				"%%%",
				'%', Blocks.piston, '$', ModItems.steelium_ingot);

		//Armor =========================================================================================
		GameRegistry.addRecipe(new ItemStack(ModItems.cyanite_chestplate),
				"# #",
				"###",
				"###",
				'#', ModItems.cyanite_ingot);

		GameRegistry.addRecipe(new ItemStack(ModItems.cyanite_helmet),
				"###",
				"# #",
				'#', ModItems.cyanite_ingot);

		GameRegistry.addRecipe(new ItemStack(ModItems.cyanite_leggings),
				"###",
				"# #",
				"# #",
				'#', ModItems.cyanite_ingot);

		GameRegistry.addRecipe(new ItemStack(ModItems.cyanite_boots),
				"# #",
				"# #",
				'#', ModItems.cyanite_ingot);

		GameRegistry.addRecipe(new ItemStack(ModItems.zestoren_boots),
				"# #",
				"$%$",
				'#', ModItems.zestoren_ingot, '$', ModItems.steelium_ingot, '%', Items.nether_star);

		GameRegistry.addRecipe(new ItemStack(ModItems.zestoren_chestplate),
				"# #",
				"$%$",
				"$#$",
				'$', ModItems.zestoren_ingot, '#', ModItems.steelium_ingot, '%', Items.nether_star);

		GameRegistry.addRecipe(new ItemStack(ModItems.zestoren_helmet),
				"#%#",
				"$ $",
				'$', ModItems.zestoren_ingot, '#', ModItems.steelium_ingot, '%', Items.nether_star);

		GameRegistry.addRecipe(new ItemStack(ModItems.zestoren_leggings),
				"$%$",
				"# #",
				"$ $",
				'$', ModItems.zestoren_ingot, '#', ModItems.steelium_ingot, '%', Items.nether_star);
	}
}