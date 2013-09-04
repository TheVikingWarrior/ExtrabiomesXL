package morethantrees.biomes;

import morethantrees.MTJT;
import net.minecraft.block.Block;
import net.minecraft.world.biome.BiomeGenBase;

public class BiomeBlackMountains extends BiomeGenBase
{
    
    public BiomeBlackMountains(int i)
    {
        
        super(i);
        this.setBiomeName("Black Mountains");
        this.spawnableCreatureList.clear();
        this.spawnableMonsterList.clear();
        this.fillerBlock = (byte) MTJT.slate.blockID;
        this.topBlock = (byte) Block.stone.blockID;
        this.maxHeight = 0.8F;
        this.minHeight = 0.1F;
        
    }
    
}
