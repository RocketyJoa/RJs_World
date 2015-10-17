package main.java.com.joa.rjworld.client.render.blocks;

import main.java.com.joa.rjworld.Main;
import main.java.com.joa.rjworld.blocks.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;

public final class BlockRenderRegister {
	public static void registerBlockRenderer() {
    reg(ModBlocks.cyanite_block);
    reg(ModBlocks.cyanite_ore);
    reg(ModBlocks.zestoren_ore);
    reg(ModBlocks.zestoren_block);
    reg(ModBlocks.building_block);
	}
	
	public static String modid = Main.MODID;
	
	public static void reg(Block block) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
    	.register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(modid + ":" + block.getUnlocalizedName().substring(5), "inventory"));
	}
}

