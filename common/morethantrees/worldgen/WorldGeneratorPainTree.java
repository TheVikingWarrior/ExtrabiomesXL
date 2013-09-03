package morethantrees.worldgen;

import java.util.Random;

import morethantrees.biomes.BiomeHurtfulHills;
import morethantrees.biomes.BiomeUnNaturalPlains;
import morethantrees.biomes.BiomeWitheringHeights;
import morethantrees.treegen.WorldGenPainTrees;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.chunk.IChunkProvider;
import cpw.mods.fml.common.IWorldGenerator;

public class WorldGeneratorPainTree implements IWorldGenerator 
{
 public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider)
 {
  switch (world.provider.dimensionId)
  {
   case -1: generateNether(world, random, chunkX*16, chunkZ*16);
   case 0: generateSurface(world, random, chunkX*16, chunkZ*16);
  }
 }

 private void generateSurface(World world, Random rand, int chunkX, int chunkZ) 
 {
	 BiomeGenBase biome = world.getWorldChunkManager().getBiomeGenAt(chunkX, chunkZ);
	 //WorldGenBalsamFirLargeTree tree = new WorldGenBalsamFirLargeTree();
	 
	 if((biome instanceof BiomeHurtfulHills))
	 {
        for(int x = 0;x<2;x++)
        {
        	int i = chunkX + rand.nextInt(16);
        	int k = chunkZ + rand.nextInt(16);
        	int j = world.getHeightValue(i, k);
        	new WorldGenPainTrees().generate(world, rand, i, j, k);
        }
	 }
	 if((biome instanceof BiomeWitheringHeights))
	 {
        for(int x = 0;x<2;x++)
        {
        	int i = chunkX + rand.nextInt(16);
        	int k = chunkZ + rand.nextInt(16);
        	int j = world.getHeightValue(i, k);
        	new WorldGenPainTrees().generate(world, rand, i, j, k);
        }
	 }
	 if((biome instanceof BiomeUnNaturalPlains))
	 {
        for(int x = 0;x<2;x++)
        {
        	int i = chunkX + rand.nextInt(128);
        	int k = chunkZ + rand.nextInt(128);
        	int j = world.getHeightValue(i, k);
        	new WorldGenPainTrees().generate(world, rand, i, j, k);
        }
	 }
 }

 private void generateNether(World world, Random random, int blockX, int blockZ) 
 {

 }

}