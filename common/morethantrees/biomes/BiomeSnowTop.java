package morethantrees.biomes;

import net.minecraft.block.Block;
import net.minecraft.world.biome.BiomeGenBase;

public class BiomeSnowTop extends BiomeGenBase 
{
	
	public BiomeSnowTop(int i)
	{
		
		super(i);
		this.setBiomeName("SnowTop");
		this.spawnableCreatureList.clear();
		this.spawnableMonsterList.clear();
		this.fillerBlock = (byte)Block.grass.blockID;
		this.topBlock = (byte)Block.snow.blockID;
		this.maxHeight = 1.3F;
		this.minHeight = 0.1F;
		this.setTemperatureRainfall(0.0F, 0.5F);
		this.setEnableSnow();
		
	}
	
	@Override
	public int getBiomeGrassColor()
    {
        return   0xCCCCCC;
    }
	
}