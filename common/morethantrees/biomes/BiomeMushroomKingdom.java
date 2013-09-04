package morethantrees.biomes;

import net.minecraft.block.Block;
import net.minecraft.world.biome.BiomeGenBase;

public class BiomeMushroomKingdom extends BiomeGenBase
{
    
    public BiomeMushroomKingdom(int i)
    {
        
        super(i);
        this.setBiomeName("MushroomKingdom");
        this.spawnableCreatureList.clear();
        this.spawnableMonsterList.clear();
        this.fillerBlock = (byte) Block.dirt.blockID;
        this.topBlock = (byte) Block.grass.blockID;
        this.theBiomeDecorator.treesPerChunk = -999;
        this.maxHeight = 0.258F;
        this.minHeight = 0.1F;
        this.setTemperatureRainfall(1.2F, 0.9F);
        
    }
    
    @Override
    public int getBiomeGrassColor()
    {
        return 0x996633;
    }
    
}
