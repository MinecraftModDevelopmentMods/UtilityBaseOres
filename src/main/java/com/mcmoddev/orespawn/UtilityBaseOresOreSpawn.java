package com.mcmoddev.orespawn;

import com.google.common.base.Function;
import com.mcmoddev.utilitybaseores.ConfigHandler.Options;
import com.mcmoddev.utilitybaseores.blocks.ModBlocks;
import mmd.orespawn.api.OreSpawnAPI;
import mmd.orespawn.api.SpawnLogic;

public class UtilityBaseOresOreSpawn implements Function<OreSpawnAPI, SpawnLogic> {
	@Override
	public SpawnLogic apply(OreSpawnAPI api) {
		SpawnLogic logic = api.createSpawnLogic();

		// Vanilla
    	if (Options.enableFeatherOre) {
			logic.getDimension(0)
				.addOre(ModBlocks.featherOre.getDefaultState(), 6,  4,  6, 0, 128);
		}
    	if (Options.enableBoneOre) {
			logic.getDimension(0)
				.addOre(ModBlocks.boneOre.getDefaultState(), 6,  4,  6, 0, 128);
		}
    	if (Options.enableRottenOre) {
			logic.getDimension(0)
				.addOre(ModBlocks.rottenOre.getDefaultState(), 8,  4,  8, 0, 128);
		}
    	if (Options.enableGunPowderOre) {
			logic.getDimension(0)
				.addOre(ModBlocks.gunpowderOre.getDefaultState(), 2,  4,  4, 0, 10);
		}
    	if (Options.enablePrismarineOre) {
			logic.getDimension(0)
				.addOre(ModBlocks.prismarineOre.getDefaultState(), 2,  4,  4, 0, 32);
		}
    	if (Options.enableEnderOre) {
			logic.getDimension(0)
				.addOre(ModBlocks.enderOre.getDefaultState(), 2,  4, 4, 0, 32);
		}
    	if (Options.enableSlimeOre) {
			logic.getDimension(0)
		           .addOre(ModBlocks.slimeOre.getDefaultState(), 3, 3, 4, 0, 64);
		}
    	if (Options.enableFlintOre) {
			logic.getDimension(0)
				.addOre(ModBlocks.flintOre.getDefaultState(), 6, 6, 6, 0, 128);
		}
    	if (Options.enableCarrotOre) {
			logic.getDimension(0)
				.addOre(ModBlocks.carrotOre.getDefaultState(), 6,  4, 4, 32, 128);
		}
    	if (Options.enableMelonOre) {
			logic.getDimension(0)
				.addOre(ModBlocks.melonOre.getDefaultState(), 6,  4,  4, 32, 128);
		}
    	if (Options.enablePotatoOre) {
			logic.getDimension(0)
				.addOre(ModBlocks.potatoOre.getDefaultState(), 6,  4,  4, 32, 128);
		}
    	if (Options.enableChickenOre) {
			logic.getDimension(0)
				.addOre(ModBlocks.chickenOre.getDefaultState(), 6,  4,  4, 32, 128);
		}
    	if (Options.enableBeefOre) {
			logic.getDimension(0)
				.addOre(ModBlocks.beefOre.getDefaultState(), 6,  4,  4, 32, 128);
		}
    	if (Options.enablePorkchopOre) {
			logic.getDimension(0)
				.addOre(ModBlocks.porkchopOre.getDefaultState(), 6,  4,  4, 32, 128);
		}
    	if (Options.enableFishOre) {
			logic.getDimension(0)
				.addOre(ModBlocks.fishOre.getDefaultState(), 6,  4,  4, 32, 128);
		}
    	if (Options.enableGlowstoneOre) {
			logic.getDimension(0)
				.addOre(ModBlocks.glowstoneOre.getDefaultState(), 4,  4,  4, 0, 128);
		}
    	if (Options.enableBlazeOre) {
			logic.getDimension(0)
				.addOre(ModBlocks.blazeOre.getDefaultState(), 2,  4,  4, 0, 32);
		}
    	if (Options.enableMagmaOre) {
			logic.getDimension(0)
				.addOre(ModBlocks.magmaOre.getDefaultState(), 2,  4,  4, 0, 32);
		}
		return logic;	
	}
}