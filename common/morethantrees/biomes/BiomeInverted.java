package morethantrees.biomes;

import net.minecraft.block.Block;
import net.minecraft.world.biome.BiomeGenBase;

public class BiomeInverted extends BiomeGenBase 
{
	
	public BiomeInverted(int i)
	{
		
		super(i);
		this.setBiomeName("Inverted");
		this.spawnableCreatureList.clear();
		this.spawnableMonsterList.clear();
		this.fillerBlock = (byte)Block.dirt.blockID;
		this.topBlock = (byte)Block.grass.blockID;
		this.maxHeight = 3.0F;
		this.minHeight = -3.0F;
		
	}
	
}
