package morethantrees.biomes;

import net.minecraft.block.Block;
import net.minecraft.world.biome.BiomeGenBase;

public class BiomeWitheringHeights extends BiomeGenBase 
{
	
	public BiomeWitheringHeights(int i)
	{
		
		super(i);
		this.setBiomeName("Withering Heights");
		this.spawnableCreatureList.clear();
		this.spawnableMonsterList.clear();
		this.fillerBlock = (byte)Block.dirt.blockID;
		this.topBlock = (byte)Block.grass.blockID;
		this.maxHeight = 2.0F;
		this.minHeight = 0.1F;
		
	}
	
}