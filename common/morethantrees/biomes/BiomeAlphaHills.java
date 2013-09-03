package morethantrees.biomes;

import net.minecraft.block.Block;
import net.minecraft.world.biome.BiomeGenBase;

public class BiomeAlphaHills extends BiomeGenBase 
{
	
	public BiomeAlphaHills(int i)
	{
		
		super(i);
		this.setBiomeName("Alpha Hills");
		this.spawnableCreatureList.clear();
		this.spawnableMonsterList.clear();
		this.fillerBlock = (byte)Block.dirt.blockID;
		this.topBlock = (byte)Block.grass.blockID;
		this.maxHeight = 0.4F;
		this.minHeight = 0.1F;
		
	}
	
	@Override
	public int getBiomeGrassColor()
    {
        return   0x83F52C;
    }
	
}
