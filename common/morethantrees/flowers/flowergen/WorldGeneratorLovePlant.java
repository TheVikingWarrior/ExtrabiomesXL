package morethantrees.flowers.flowergen;

import java.util.Random;

import morethantrees.MTJT;
import morethantrees.biomes.BiomeAlphaHills;
import morethantrees.biomes.BiomeEggHills;
import morethantrees.biomes.BiomeFruitValley;
import morethantrees.biomes.BiomeParadise;
import morethantrees.biomes.BiomeRainForrest;
import morethantrees.biomes.BiomeRedwoodForrest;
import morethantrees.biomes.BiomeWhitePlains;
import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.chunk.IChunkProvider;
import cpw.mods.fml.common.IWorldGenerator;

public class WorldGeneratorLovePlant implements IWorldGenerator
{
    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider)
    {
        switch (world.provider.dimensionId)
        {
            case -1:
                generateNether(world, random, chunkX * 16, chunkZ * 16);
            case 0:
                generateSurface(world, random, chunkX * 16, chunkZ * 16);
        }
    }
    
    private void generateSurface(World world, Random random, int blockX, int blockZ)
    {
        BiomeGenBase biome = world.getWorldChunkManager().getBiomeGenAt(blockX, blockZ);
        if ((biome instanceof BiomeAlphaHills))
        {
            for (int x = 0; x < 2; x++)
            {
                int i = blockX + random.nextInt(16);
                int k = blockZ + random.nextInt(16);
                int j = world.getHeightValue(i, k);
                
                if (world.getBlockId(i, j - 1, k) == Block.dirt.blockID || world.getBlockId(i, j - 1, k) == Block.grass.blockID)
                {
                    world.setBlock(i, j, k, MTJT.lovePlant.blockID, 0, 2);
                }
            }
        }
        if ((biome instanceof BiomeEggHills))
        {
            for (int x = 0; x < 2; x++)
            {
                int i = blockX + random.nextInt(16);
                int k = blockZ + random.nextInt(16);
                int j = world.getHeightValue(i, k);
                
                if (world.getBlockId(i, j - 1, k) == Block.dirt.blockID || world.getBlockId(i, j - 1, k) == Block.grass.blockID)
                {
                    world.setBlock(i, j, k, MTJT.lovePlant.blockID, 0, 2);
                }
            }
        }
        if ((biome instanceof BiomeFruitValley))
        {
            for (int x = 0; x < 2; x++)
            {
                int i = blockX + random.nextInt(16);
                int k = blockZ + random.nextInt(16);
                int j = world.getHeightValue(i, k);
                
                if (world.getBlockId(i, j - 1, k) == Block.dirt.blockID || world.getBlockId(i, j - 1, k) == Block.grass.blockID)
                {
                    world.setBlock(i, j, k, MTJT.lovePlant.blockID, 0, 2);
                }
            }
        }
        if ((biome instanceof BiomeParadise))
        {
            for (int x = 0; x < 2; x++)
            {
                int i = blockX + random.nextInt(16);
                int k = blockZ + random.nextInt(16);
                int j = world.getHeightValue(i, k);
                
                if (world.getBlockId(i, j - 1, k) == Block.dirt.blockID || world.getBlockId(i, j - 1, k) == Block.grass.blockID)
                {
                    world.setBlock(i, j, k, MTJT.lovePlant.blockID, 0, 2);
                }
            }
        }
        if ((biome instanceof BiomeRainForrest))
        {
            for (int x = 0; x < 2; x++)
            {
                int i = blockX + random.nextInt(16);
                int k = blockZ + random.nextInt(16);
                int j = world.getHeightValue(i, k);
                
                if (world.getBlockId(i, j - 1, k) == Block.dirt.blockID || world.getBlockId(i, j - 1, k) == Block.grass.blockID)
                {
                    world.setBlock(i, j, k, MTJT.lovePlant.blockID, 0, 2);
                }
            }
        }
        if ((biome instanceof BiomeRedwoodForrest))
        {
            for (int x = 0; x < 2; x++)
            {
                int i = blockX + random.nextInt(16);
                int k = blockZ + random.nextInt(16);
                int j = world.getHeightValue(i, k);
                
                if (world.getBlockId(i, j - 1, k) == Block.dirt.blockID || world.getBlockId(i, j - 1, k) == Block.grass.blockID)
                {
                    world.setBlock(i, j, k, MTJT.lovePlant.blockID, 0, 2);
                }
            }
        }
        if ((biome instanceof BiomeWhitePlains))
        {
            for (int x = 0; x < 2; x++)
            {
                int i = blockX + random.nextInt(16);
                int k = blockZ + random.nextInt(16);
                int j = world.getHeightValue(i, k);
                
                if (world.getBlockId(i, j - 1, k) == Block.dirt.blockID || world.getBlockId(i, j - 1, k) == Block.grass.blockID)
                {
                    world.setBlock(i, j, k, MTJT.lovePlant.blockID, 0, 2);
                }
            }
        }
    }
    
    private void generateNether(World world, Random random, int blockX, int blockZ)
    {   
        
    }
}