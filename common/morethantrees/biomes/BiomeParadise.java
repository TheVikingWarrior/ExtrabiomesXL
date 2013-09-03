package morethantrees.biomes;

import net.minecraft.block.Block;
import net.minecraft.world.biome.BiomeGenBase;

public class BiomeParadise extends BiomeGenBase 
{
	
	public BiomeParadise(int i)
	{
		
		super(i);
		this.setBiomeName("Paradise");
		this.spawnableCreatureList.clear();
		this.spawnableMonsterList.clear();
		this.fillerBlock = (byte)Block.dirt.blockID;
		this.topBlock = (byte)Block.grass.blockID;
		this.maxHeight = 0.4F;
		this.minHeight = 0.3F;
		
	}
	
	@Override
	public int getBiomeGrassColor()
    {
        return   0x55A0B5;
    }
	
}
