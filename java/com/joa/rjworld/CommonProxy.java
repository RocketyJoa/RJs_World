package main.java.com.joa.rjworld;

import main.java.com.joa.rjworld.blocks.ModBlocks;
import main.java.com.joa.rjworld.crafting.ModCrafting;
import main.java.com.joa.rjworld.items.ModItems;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {
    public void preInit(FMLPreInitializationEvent e) {
    	ModItems.createItems();
        ModBlocks.createBlocks();
    }
    
    public void init(FMLInitializationEvent e) {
    	ModCrafting.initCrafting();
    }
    
    public void postInit(FMLPostInitializationEvent e) {
    }
}
