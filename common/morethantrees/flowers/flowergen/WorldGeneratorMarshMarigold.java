package morethantrees.flowers.flowergen;

import java.util.Random;

import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.biome.BiomeGenSwamp;
import net.minecraft.world.chunk.IChunkProvider;
import cpw.mods.fml.common.IWorldGenerator;

public class WorldGeneratorMarshMarigold implements IWorldGenerator 
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
		if((biome instanceof BiomeGenSwamp))
		{
			if (random.nextInt(2) == 0)
			{
	        	int i = blockX + random.nextInt(16) + 8;
	        	int k = blockZ + random.nextInt(16) + 8;
	        	int j = world.getHeightValue(i, k);
	        	(new WorldGenMarshMarigold()).generate(world, random, i, j, k);
	        }
		}
	
    }
	private void generateNether(World world, Random random, int blockX, int blockZ) 
	{
			  
	}
}
