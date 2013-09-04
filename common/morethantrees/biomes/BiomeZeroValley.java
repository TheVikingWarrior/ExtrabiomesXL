package morethantrees.biomes;

import net.minecraft.block.Block;
import net.minecraft.world.biome.BiomeGenBase;

public class BiomeZeroValley extends BiomeGenBase
{
    //private BiomeDecoratorMTJT customBiomeDecorator;
    
    public BiomeZeroValley(int i)
    {
        
        super(i);
        this.setBiomeName("Zero Valley");
        this.spawnableCreatureList.clear();
        this.spawnableMonsterList.clear();
        this.fillerBlock = (byte) Block.stone.blockID;
        this.topBlock = (byte) Block.cobblestone.blockID;
        this.maxHeight = 2.0F;
        this.minHeight = 0.2F;
        
    }
    
}
