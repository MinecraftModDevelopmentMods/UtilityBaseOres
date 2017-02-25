package com.mcmoddev.utilitybaseores;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.*;
import java.util.*;

import com.mcmoddev.utilitybaseores.Main;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.config.Configuration;
//import net.minecraftforge.common.config.*;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.MissingModsException;
//import net.minecraftforge.fml.common.*;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.versioning.ArtifactVersion;
//import net.minecraftforge.fml.common.versioning.*;
import net.minecraftforge.fml.common.versioning.DefaultArtifactVersion;

/**
 * @author p455w0rd
 *
 */
public class ConfigHandler {

	private static Configuration configuration;
	private static final String CONFIG_FILE = "config/UtilityBaseOres.cfg";
	private static final String ORES = "Ores";
	private static final String ORESPAWN_CFG_PATH = "orespawn";

	@SubscribeEvent
	public void onConfigChange(ConfigChangedEvent.OnConfigChangedEvent e) {
		if (e.getModID().equals(Main.MODID)) {
			init();
		}
	}

	public static void init() {
		if (configuration == null) {
			configuration = new Configuration(new File(CONFIG_FILE));
			MinecraftForge.EVENT_BUS.register(new ConfigHandler());
		}

		// METALS
		Options.enableFeatherOre = configuration.getBoolean("enableFeatherOre", ORES, true, "Enable Feather Ore");
		Options.enableChickenOre = configuration.getBoolean("enableChickenOre", ORES, true, "Enable Chicken Ore");
		Options.enableBeefOre = configuration.getBoolean("enableLeatherOre", ORES, true, "Enable Leather Ore");
		Options.enablePorkchopOre = configuration.getBoolean("enablePorkchopOre", ORES, true, "Enable Porkchop Ore");
		Options.enableFishOre = configuration.getBoolean("enableFishOre", ORES, true, "Enable Fish Ore");
		Options.enableBoneOre = configuration.getBoolean("enableBoneOre", ORES, true, "Enable Bone Ore");
		Options.enableRottenOre = configuration.getBoolean("enableRottenOre",ORES, true, "Enable Rotten Ore");
		Options.enableBlazeOre = configuration.getBoolean("enableBlazeOre", ORES, false, "Enable Blaze Ore");
		Options.enableGlowstoneOre = configuration.getBoolean("enableGlowstoneOre", ORES, false, "Enable Glowstone Ore");
		Options.enableGunPowderOre = configuration.getBoolean("enableGunPowderOre", ORES, true, "Enable Gunpowder Ore");
		Options.enablePrismarineOre = configuration.getBoolean("enablePrismarineOre", ORES, true, "Enable Prismarine Ore");
		Options.enableEnderOre = configuration.getBoolean("enableEnderOre", ORES, true, "Enable Ender Ore");
		Options.enableMagmaOre = configuration.getBoolean("enableMagmaOre", ORES, false, "Enable Magma Ores");
		Options.enableSlimeOre = configuration.getBoolean("enableSlimeOre", ORES, true, "Enable Slime Ore");
		Options.enableFlintOre = configuration.getBoolean("enableFlintOre", ORES, true, "Enable Flint Ore");
		Options.enableCarrotOre = configuration.getBoolean("enableCarrotOre", ORES, true, "Enable Carrot Ore");
		Options.enableMelonOre = configuration.getBoolean("enableMelonOre", ORES, true, "Enable Melon Ore");
		Options.enablePotatoOre = configuration.getBoolean("enablePotatoOre", ORES, true, "Enable Potato Ore");

		
		
		if (configuration.hasChanged()) {
			configuration.save();
		}

		if (com.mcmoddev.utilitybaseores.ConfigHandler.Options.requireMMDOreSpawn ) {
			if (!Loader.isModLoaded("orespawn")) {
				final HashSet<ArtifactVersion> orespawnMod = new HashSet<ArtifactVersion>();
				orespawnMod.add(new DefaultArtifactVersion("2.0.0.15"));
				throw new MissingModsException(orespawnMod, "orespawn", "MMD Ore Spawn Mod");
			}
			final Path oreSpawnFile = Paths.get(ORESPAWN_CFG_PATH, Main.MODID + ".json");
			if (!(oreSpawnFile.toFile().exists())) {
				try {
					Files.createDirectories(oreSpawnFile.getParent());
				}
				catch (final IOException ex) {
					//Main.logger.error("Failed to write file " + oreSpawnFile, ex);
				}
			}
		}


			
		
	}

	public static class Options {

		public static boolean requireMMDOreSpawn = true;
		public static boolean enableFeatherOre = true;
		public static boolean enableBeefOre = true;
		public static boolean enablePorkchopOre = true;
		public static boolean enableFishOre= true;
		public static boolean enableBoneOre = true;
		public static boolean enableRottenOre = true;
		public static boolean enableChickenOre = true;
		public static boolean enableBlazeOre = false;
		public static boolean enableGlowstoneOre = false;
		public static boolean enableGunPowderOre = true;
		public static boolean enablePrismarineOre = true;
		public static boolean enableEnderOre = true;
		public static boolean enableMagmaOre = false;
		public static boolean enableSlimeOre = true;
		public static boolean enableFlintOre = true;
		public static boolean enableCarrotOre = true;
		public static boolean enableMelonOre = true;
		public static boolean enablePotatoOre = true;

		
		
	
	

		private Options() {
			throw new IllegalAccessError("Not a instantiable class");
		}
	}

	
}