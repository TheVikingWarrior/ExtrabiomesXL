package morethantrees.biomes;

import net.minecraft.block.Block;
import net.minecraft.world.biome.BiomeGenBase;

public class BiomeCliffs extends BiomeGenBase
{
    
    public BiomeCliffs(int i)
    {
        
        super(i);
        this.setBiomeName("Cliffs");
        this.spawnableCreatureList.clear();
        this.spawnableMonsterList.clear();
        this.fillerBlock = (byte) Block.stone.blockID;
        this.topBlock = (byte) Block.grass.blockID;
        this.maxHeight = 0.83F;
        this.minHeight = -0.2F;
        
    }
    
}