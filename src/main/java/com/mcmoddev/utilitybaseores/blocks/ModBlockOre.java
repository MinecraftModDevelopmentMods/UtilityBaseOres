package com.mcmoddev.utilitybaseores.blocks;

import java.util.Random;

import javax.annotation.Nullable;

import com.mcmoddev.utilitybaseores.ConfigHandler.Options;

import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class ModBlockOre extends ExplosiveBlock {

	protected ModBlockOre(float Hardness, float Resistance) {
		super();

		this.setHarvestLevel("pickaxe", 1);
		this.setHardness(Hardness);
		this.setResistance(Resistance);
		this.setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	}
	
    @Nullable
    @Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune)
    {
            return this == ModBlocks.featherOre ? Items.FEATHER : 
            (this == ModBlocks.prismarineOre ? Items.PRISMARINE_SHARD:
            (this == ModBlocks.gunpowderOre ? Items.GUNPOWDER :
            (this == ModBlocks.boneOre ? Items.BONE :
            (this == ModBlocks.potatoOre ? Items.POTATO :
            (this == ModBlocks.chickenOre ? Items.CHICKEN :
            (this == ModBlocks.beefOre ? Items.BEEF :
            (this == ModBlocks.porkchopOre ? Items.PORKCHOP :
            (this == ModBlocks.fishOre ? Items.FISH :
            (this == ModBlocks.enderOre ? Items.ENDER_PEARL :
            (this == ModBlocks.magmaOre ? Items.MAGMA_CREAM :
            (this == ModBlocks.slimeOre ? Items.SLIME_BALL :
            (this == ModBlocks.flintOre ? Items.FLINT :
            (this == ModBlocks.carrotOre ? Items.CARROT :
            (this == ModBlocks.melonOre ? Items.MELON :
            (this == ModBlocks.rottenOre ? Items.ROTTEN_FLESH :
            (this == ModBlocks.blazeOre ? Items.BLAZE_POWDER :
            (this == ModBlocks.glowstoneOre ? Items.GLOWSTONE_DUST :
            	
            Item.getItemFromBlock(this))))))))))))))))));
    }

    @Override
    public int quantityDropped(Random random)
    {
    	
        return this == ModBlocks.featherOre ? 1 + random.nextInt(2):
            (this == ModBlocks.boneOre ? 1 + random.nextInt(2):
            (this == ModBlocks.rottenOre ? 1 + random.nextInt(2):
            (this == ModBlocks.blazeOre ? 1 + random.nextInt(2):
            (this == ModBlocks.glowstoneOre ? 1 + random.nextInt(2):
            (this == ModBlocks.gunpowderOre ? 1 + random.nextInt(2):
            (this == ModBlocks.prismarineOre ? 1 + random.nextInt(2):
            (this == ModBlocks.enderOre ? 1 + random.nextInt(2):
            (this == ModBlocks.magmaOre ? 1 + random.nextInt(2):
            (this == ModBlocks.slimeOre ? 1 + random.nextInt(2):
            (this == ModBlocks.flintOre ? 1 + random.nextInt(2):
            (this == ModBlocks.carrotOre ? 1 + random.nextInt(2):
            (this == ModBlocks.melonOre ? 1 + random.nextInt(2):
            (this == ModBlocks.potatoOre ? 1 + random.nextInt(2):
            (this == ModBlocks.chickenOre ? 1 + random.nextInt(2):
            (this == ModBlocks.beefOre ? 1 + random.nextInt(2):
            (this == ModBlocks.porkchopOre ? 1 + random.nextInt(2):
            (this == ModBlocks.fishOre ? 1 + random.nextInt(2):
            	
            1)))))))))))))))));

    	
		
		
    }

    
}
