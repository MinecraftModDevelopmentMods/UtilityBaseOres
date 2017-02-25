package com.mcmoddev.utilitybaseores;

import com.mcmoddev.utilitybaseores.blocks.ModBlocks;

import org.apache.logging.log4j.Logger;

import net.minecraftforge.fml.common.FMLLog;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLInterModComms;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {

	private static final Logger logger = FMLLog.getLogger();

	public void preInit(FMLPreInitializationEvent event) {
		ModBlocks.createBlocks();
		ConfigHandler.init();;

		FMLInterModComms.sendFunctionMessage("orespawn", "api", "com.mcmoddev.orespawn.UtilityBaseOresOreSpawn");

		
	}

	public void init(FMLInitializationEvent event) {
		//ModCrafting.initCrafting();
		//GameRegistry.registerWorldGenerator(new WorldGen(), 0);

	}

	public void postInit(FMLPostInitializationEvent event) {
		//
	}

	public void info(String s) {
		logger.info(s);
	}

	public void error(String s) {
		logger.error(s);
	}
}
