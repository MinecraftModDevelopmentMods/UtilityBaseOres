package com.mcmoddev.utilitybaseores;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Main.MODID, name = Main.MODNAME, version = Main.VERSION,
		dependencies = "required-after:Forge;after:orespawn",
		acceptedMinecraftVersions = "1.10.2,)",
		updateJSON = "https://raw.githubusercontent.com/MinecraftModDevelopment/UtilityBaseOres/master/update.json")

public class Main {

	@Instance
	public static Main INSTANCE = null;

	public static final String MODID = "utilitybaseores";
	public static final String MODNAME = "Utilty Base Ores";
	public static final String VERSION = "1.0";

	/** All ore-spawn files discovered in the ore-spawn folder */

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		INSTANCE = this;
		MinecraftForge.EVENT_BUS.register(this);
		// vanilla config loader
		Main.proxy.preInit(event);
	}

	@EventHandler
	public void init(FMLInitializationEvent event) {
		Main.proxy.init(event);
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		Main.proxy.postInit(event);
	}

	@SidedProxy(clientSide = "com.mcmoddev.utilitybaseores.ClientProxy", serverSide = "com.mcmoddev.utilitybaseores.ServerProxy")
	public static CommonProxy proxy;


			
		
	
}
