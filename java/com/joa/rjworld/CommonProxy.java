package main.java.com.joa.rjworld;

import main.java.com.joa.rjworld.blocks.ModBlocks;
import main.java.com.joa.rjworld.crafting.ModCrafting;
import main.java.com.joa.rjworld.items.ModItems;
import main.java.com.joa.rjworld.world.TutorialWorldGenerator;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CommonProxy {
    public void preInit(FMLPreInitializationEvent e) {
    	ModItems.createItems();
        ModBlocks.createBlocks();
    }
    
    public void init(FMLInitializationEvent e) {
    	ModCrafting.initCrafting();
        GameRegistry.registerWorldGenerator(new TutorialWorldGenerator(), 0);
    }
    
    public void postInit(FMLPostInitializationEvent e) {
    }
}
