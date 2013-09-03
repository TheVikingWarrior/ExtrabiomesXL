package morethantrees.biomes;

import net.minecraft.block.Block;
import net.minecraft.world.biome.BiomeGenBase;

public class BiomeCactusFields extends BiomeGenBase 
{
	
	public BiomeCactusFields(int i)
	{
		
		super(i);
		this.setBiomeName("CactusFields");
		this.spawnableCreatureList.clear();
		this.spawnableMonsterList.clear();
		this.fillerBlock = (byte)Block.dirt.blockID;
		this.topBlock = (byte)Block.sand.blockID;
		this.maxHeight = 0.1F;
		this.minHeight = 0.0F;
		this.theBiomeDecorator.cactiPerChunk = 75;
        
	}
	
	@Override
	public int getBiomeGrassColor()
    {
        return   0x999966;
    }
	
}
