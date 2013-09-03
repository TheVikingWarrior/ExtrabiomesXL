package morethantrees.biomes;

import morethantrees.MTJT;
import net.minecraft.block.Block;
import net.minecraft.world.biome.BiomeGenBase;

public class BiomeHurtfulHills extends BiomeGenBase 
{
	
	public BiomeHurtfulHills(int i)
	{
		
		super(i);
		this.setBiomeName("Hurtful Hills");
		this.spawnableCreatureList.clear();
		this.spawnableMonsterList.clear();
		this.topBlock = (byte)Block.grass.blockID;
		this.fillerBlock = (byte)MTJT.naucylium.blockID;
		this.maxHeight = 0.625F;
		this.minHeight = 0.15F;
		
	}
	
}