package main.java.com.joa.rjworld;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Main.MODID, version = Main.VERSION, name = Main.NAME)
	public class Main {
	    public static final String MODID = "rjworld";
	    public static final String NAME= "RJ's World";
	    public static final String MODNAME = "RocketyJoa's Ideal World";
	    public static final String VERSION = "1.0.0.0";
   
	    @Instance
	    public static Main instance = new Main();
	    
	    @SidedProxy(clientSide="main.java.com.joa.rjworld.ClientProxy", serverSide="main.java.com.joa.rjworld.ServerProxy")
	public static CommonProxy proxy;
	    
	    @EventHandler 
	    public void preInit(FMLPreInitializationEvent e) {
	    	this.proxy.preInit(e);
	    }
	    
	    @EventHandler
	    public void init(FMLInitializationEvent e){
	    	this.proxy.init(e);
        }
	    
	    @EventHandler
	    public void postInit(FMLPostInitializationEvent e) {
	    	this.proxy.postInit(e);
	    }
	    
	}