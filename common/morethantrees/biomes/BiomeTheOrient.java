package morethantrees.biomes;

import net.minecraft.block.Block;
import net.minecraft.world.biome.BiomeGenBase;

public class BiomeTheOrient extends BiomeGenBase 
{
	
	public BiomeTheOrient(int i)
	{
		
		super(i);
		this.setBiomeName("The Orient");
		this.spawnableCreatureList.clear();
		this.spawnableMonsterList.clear();
		this.fillerBlock = (byte)Block.dirt.blockID;
		this.topBlock = (byte)Block.grass.blockID;
		this.maxHeight = 0.23F;
		this.minHeight = 0.18F;
		
	}
	
	@Override
	public int getBiomeGrassColor()
    {
        return   0x009900;
    }

	
}
