package morethantrees.biomes;

import net.minecraft.block.Block;
import net.minecraft.world.biome.BiomeGenBase;

public class BiomeTundra extends BiomeGenBase
{
    
    public BiomeTundra(int i)
    {
        
        super(i);
        this.setBiomeName("Tundra");
        this.spawnableCreatureList.clear();
        this.spawnableMonsterList.clear();
        this.theBiomeDecorator.treesPerChunk = -999;
        this.fillerBlock = (byte) Block.dirt.blockID;
        this.topBlock = (byte) Block.grass.blockID;
        this.maxHeight = 0.5F;
        this.minHeight = 0.3F;
        this.setTemperatureRainfall(0.02F, 0.5F);
        this.setEnableSnow();
        
    }
    
    @Override
    public int getBiomeGrassColor()
    {
        return 0xCCFFFF;
    }
    
}
