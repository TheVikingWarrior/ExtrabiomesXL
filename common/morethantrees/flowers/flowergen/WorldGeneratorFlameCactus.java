package morethantrees.flowers.flowergen;

import java.util.Random;

import morethantrees.MTJT;
import morethantrees.biomes.BiomeAfterLifeDesert;
import morethantrees.biomes.BiomeCactusFields;
import morethantrees.biomes.BiomeHurtfulHills;
import morethantrees.biomes.BiomePetrifiedHills;
import morethantrees.biomes.BiomeTheOrient;
import morethantrees.biomes.BiomeUnNaturalPlains;
import morethantrees.biomes.BiomeZeroValley;
import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.chunk.IChunkProvider;
import cpw.mods.fml.common.IWorldGenerator;

public class WorldGeneratorFlameCactus implements IWorldGenerator 
{
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) 
	{
		switch (world.provider.dimensionId)
		  {
		   case -1: generateNether(world, random, chunkX*16, chunkZ*16);
		   case 0: generateSurface(world, random, chunkX*16, chunkZ*16);
		  }		
	}
	private void generateSurface(World world, Random random, int blockX, int blockZ) 
    {
		BiomeGenBase biome = world.getWorldChunkManager().getBiomeGenAt(blockX, blockZ);
		if((biome instanceof BiomeAfterLifeDesert))
		{
			if (random.nextInt(10) == 0)
			{
	        	int i = blockX + random.nextInt(64) + 8;
	        	int k = blockZ + random.nextInt(64) + 8;
	        	int j = world.getHeightValue(i, k);
	        	
	        	if (world.getBlockId(i, j - 1, k) == Block.dirt.blockID || world.getBlockId(i, j - 1, k) == Block.sand.blockID)
                {
                    world.setBlock(i, j, k, MTJT.flameCactus.blockID, 0, 2);
                }
	        }
		}
		if((biome instanceof BiomeCactusFields))
		{
			if (random.nextInt(10) == 0)
			{
	        	int i = blockX + random.nextInt(64) + 8;
	        	int k = blockZ + random.nextInt(64) + 8;
	        	int j = world.getHeightValue(i, k);
	        	
	        	if (world.getBlockId(i, j - 1, k) == Block.dirt.blockID || world.getBlockId(i, j - 1, k) == Block.sand.blockID)
                {
                    world.setBlock(i, j, k, MTJT.flameCactus.blockID, 0, 2);
                }
	        }
		}
		if((biome instanceof BiomeHurtfulHills))
		{
			if (random.nextInt(10) == 0)
			{
	        	int i = blockX + random.nextInt(64) + 8;
	        	int k = blockZ + random.nextInt(64) + 8;
	        	int j = world.getHeightValue(i, k);
	        	
	        	if (world.getBlockId(i, j - 1, k) == Block.dirt.blockID || world.getBlockId(i, j - 1, k) == Block.sand.blockID)
                {
                    world.setBlock(i, j, k, MTJT.flameCactus.blockID, 0, 2);
                }
	        }
		}
		if((biome instanceof BiomePetrifiedHills))
		{
			if (random.nextInt(10) == 0)
			{
	        	int i = blockX + random.nextInt(64) + 8;
	        	int k = blockZ + random.nextInt(64) + 8;
	        	int j = world.getHeightValue(i, k);
	        	
	        	if (world.getBlockId(i, j - 1, k) == Block.dirt.blockID || world.getBlockId(i, j - 1, k) == Block.sand.blockID)
                {
                    world.setBlock(i, j, k, MTJT.flameCactus.blockID, 0, 2);
                }
	        }
		}
		if((biome instanceof BiomeTheOrient))
		{
			if (random.nextInt(10) == 0)
			{
	        	int i = blockX + random.nextInt(64) + 8;
	        	int k = blockZ + random.nextInt(64) + 8;
	        	int j = world.getHeightValue(i, k);
	        	
	        	if (world.getBlockId(i, j - 1, k) == Block.dirt.blockID || world.getBlockId(i, j - 1, k) == Block.sand.blockID)
                {
                    world.setBlock(i, j, k, MTJT.flameCactus.blockID, 0, 2);
                }
	        }
		}
		if((biome instanceof BiomeUnNaturalPlains))
		{
			if (random.nextInt(10) == 0)
			{
	        	int i = blockX + random.nextInt(64) + 8;
	        	int k = blockZ + random.nextInt(64) + 8;
	        	int j = world.getHeightValue(i, k);
	        	
	        	if (world.getBlockId(i, j - 1, k) == Block.dirt.blockID || world.getBlockId(i, j - 1, k) == Block.sand.blockID)
                {
                    world.setBlock(i, j, k, MTJT.flameCactus.blockID, 0, 2);
                }
	        }
		}
		if((biome instanceof BiomeZeroValley))
		{
			if (random.nextInt(10) == 0)
			{
	        	int i = blockX + random.nextInt(64) + 8;
	        	int k = blockZ + random.nextInt(64) + 8;
	        	int j = world.getHeightValue(i, k);
	        	
	        	if (world.getBlockId(i, j - 1, k) == Block.dirt.blockID || world.getBlockId(i, j - 1, k) == Block.sand.blockID)
                {
                    world.setBlock(i, j, k, MTJT.flameCactus.blockID, 0, 2);
                }
	        }
		}
    }
	private void generateNether(World world, Random random, int blockX, int blockZ) 
	{
			  
	}
}