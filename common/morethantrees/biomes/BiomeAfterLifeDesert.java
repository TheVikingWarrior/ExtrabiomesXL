package morethantrees.biomes;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.gen.feature.WorldGenTallGrass;
import net.minecraft.world.gen.feature.WorldGenerator;

public class BiomeAfterLifeDesert extends BiomeGenBase 
{
	
	public BiomeAfterLifeDesert(int i)
	{
		
		super(i);
		this.setBiomeName("Afterlife Desert");
		this.spawnableCreatureList.clear();
		this.spawnableMonsterList.clear();
		this.fillerBlock = (byte)Block.sandStone.blockID;
		this.topBlock = (byte)Block.sand.blockID;
		this.maxHeight = 0.2F;
		this.minHeight = 0.1F;
		this.theBiomeDecorator.deadBushPerChunk = 3;
		this.theBiomeDecorator.cactiPerChunk = 2;
		
	}
	
	public WorldGenerator getRandomWorldGenForGrass(Random par1Random)
    {
        return new WorldGenTallGrass(Block.dirt.blockID, 1);
    }
	
}