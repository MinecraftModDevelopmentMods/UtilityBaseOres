package com.mcmoddev.utilitybaseores.blocks;

import java.util.HashMap;
import java.util.Map;

import com.mcmoddev.utilitybaseores.Main;
import com.mcmoddev.utilitybaseores.ConfigHandler.Options;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public final class ModBlocks {

	private static final Map<String, Block> allBlocks = new HashMap<String, Block>();

	public static Block featherOre;
	public static Block boneOre;
	public static Block rottenOre;
	public static Block blazeOre;
	public static Block glowstoneOre;
	public static Block gunpowderOre;
	public static Block prismarineOre;
	public static Block enderOre;
	public static Block magmaOre;
	public static Block slimeOre;
	public static Block flintOre;
	
	public static Block carrotOre;
	public static Block melonOre;
	public static Block potatoOre;
	public static Block chickenOre;
	public static Block beefOre;
	public static Block porkchopOre;
	public static Block fishOre;



	public static void createBlocks() {

		if (Options.enableFeatherOre) {
		featherOre = createOre("feather", 4.0f, 15.0f);}
		if (Options.enableBoneOre) {
		boneOre = createOre("bone", 4.0f, 15.0f);}
		if (Options.enableRottenOre) {
		rottenOre = createOre("rotten", 4.0f, 15.0f);}
		if (Options.enableBlazeOre) {
		blazeOre = createOre("blaze", 4.0f, 15.0f);}
		if (Options.enableGlowstoneOre) {
		glowstoneOre = createOre("glowstone", 4.0f, 15.0f);}
		if (Options.enableGunPowderOre) {
		gunpowderOre = createOre("gunpowder", 4.0f, 15.0f);}
		if (Options.enablePrismarineOre) {
		prismarineOre = createOre("prismarine", 4.0f, 15.0f);}
		if (Options.enableEnderOre) {
		enderOre = createOre("ender", 4.0f, 15.0f);}
		if (Options.enableMagmaOre) {
		magmaOre = createOre("magma", 4.0f, 15.0f);}
		if (Options.enableSlimeOre) {
		slimeOre = createOre("slime", 4.0f, 15.0f);}
		if (Options.enableFlintOre) {	
		flintOre = createOre("flint", 4.0f, 15.0f);}
		if (Options.enableCarrotOre) {
		carrotOre = createOre("carrot", 4.0f, 15.0f);}
		if (Options.enableMelonOre) {
		melonOre = createOre("melon", 4.0f, 15.0f);}
		if (Options.enablePotatoOre) {
		potatoOre = createOre("potato", 4.0f, 15.0f);}
		if (Options.enableChickenOre) {
		chickenOre = createOre("chicken", 4.0f, 15.0f);}
		if (Options.enableBeefOre) {
		beefOre = createOre("beef", 4.0f, 15.0f);}
		if (Options.enablePorkchopOre) {
		porkchopOre = createOre("porkchop", 4.0f, 15.0f);}
		if (Options.enableFishOre) {
		fishOre = createOre("fish", 4.0f, 15.0f);}

	}

	private static Block addBlock(Block block, String name) {
		ResourceLocation location = new ResourceLocation(Main.MODID, name);
		block.setRegistryName(location);
		block.setUnlocalizedName(location.toString());
		GameRegistry.register(block);
		ItemBlock itemBlock = new ItemBlock(block);
		itemBlock.setRegistryName(location);
		itemBlock.setUnlocalizedName(location.toString());
		GameRegistry.register(itemBlock);

		allBlocks.put(name, block);
		return block;
	}

	private static Block createOre(String name, float Hardness, float Resistance) {
		return addBlock(new ModBlockOre(Hardness, Resistance),name + "_ore");
	}

	@SideOnly(Side.CLIENT)
	public static void registerItemRenders(FMLInitializationEvent event) {
		for (final String name : allBlocks.keySet()) {
			Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(
					net.minecraft.item.Item.getItemFromBlock(allBlocks.get(name)), 0,
					new ModelResourceLocation(new ResourceLocation(Main.MODID, name), "inventory"));
		}
	}
}
