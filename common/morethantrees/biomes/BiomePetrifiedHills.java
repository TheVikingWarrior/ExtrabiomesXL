package morethantrees.biomes;

import net.minecraft.block.Block;
import net.minecraft.world.biome.BiomeDecorator;
import net.minecraft.world.biome.BiomeGenBase;

public class BiomePetrifiedHills extends BiomeGenBase
{
    
    public BiomePetrifiedHills(int i)
    {
        
        super(i);
        this.setBiomeName("Petrified Hills");
        this.spawnableCreatureList.clear();
        this.spawnableMonsterList.clear();
        this.theBiomeDecorator = new BiomeDecorator(this);
        this.fillerBlock = (byte) Block.cobblestone.blockID;
        this.topBlock = (byte) Block.sandStone.blockID;
        this.maxHeight = 0.4F;
        this.minHeight = 0.1F;
        
    }
    
}
