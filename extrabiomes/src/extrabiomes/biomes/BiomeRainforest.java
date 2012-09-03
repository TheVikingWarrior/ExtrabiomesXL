/**
 * This mod is distributed under the terms of the Minecraft Mod Public
 * License 1.0, or MMPL. Please check the contents of the license
 * located in /MMPL-1.0.txt
 */

package extrabiomes.biomes;

import static com.google.common.base.Preconditions.checkNotNull;

import java.util.Random;

import extrabiomes.terrain.CustomBiomeDecorator;


import net.minecraft.src.BiomeDecorator;
import net.minecraft.src.Block;
import net.minecraft.src.WorldGenTallGrass;
import net.minecraft.src.WorldGenerator;

public class BiomeRainforest extends ExtrabiomeGenBase {

	public BiomeRainforest(int id) {
		super(id);

		setColor(0x0BD626);
		setBiomeName("Rainforest");
		temperature = 1.1F;
		rainfall = 1.4F;
		minHeight = 0.4F;
		maxHeight = 1.3F;
	}

	@Override
	protected BiomeDecorator createBiomeDecorator() {
		return new CustomBiomeDecorator.Builder(this).treesPerChunk(7)
				.grassPerChunk(4).flowersPerChunk(2).build();
	}

	@Override
	public WorldGenerator getRandomWorldGenForGrass(Random rand) {
		if (checkNotNull(rand).nextInt(4) == 0)
			return new WorldGenTallGrass(Block.tallGrass.blockID, 2);

		return super.getRandomWorldGenForGrass(rand);
	}

	@Override
	public WorldGenerator getRandomWorldGenForTrees(Random rand) {

		if (checkNotNull(rand).nextInt(99999) == 0)
			return worldGeneratorForest;
		if (rand.nextInt(4) == 0) return worldGeneratorBigTree;

		return worldGeneratorTrees;
	}

}