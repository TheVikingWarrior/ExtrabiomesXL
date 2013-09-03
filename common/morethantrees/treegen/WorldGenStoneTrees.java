package morethantrees.treegen;

import java.util.Random;

import morethantrees.MTJT;
import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

public class WorldGenStoneTrees extends WorldGenerator
{
	public boolean generate(World world, Random var2, int i, int j, int k)
	  {
	    while ((world.isAirBlock(i + 10, j, k + 12)) && (j > 2))
	    {
	      j--;
	    }

	    int var6 = world.getBlockId(i + 10, j, k + 12);

	    if (var6 != Block.dirt.blockID && var6 != Block.sand.blockID && var6 != Block.sandStone.blockID)
	    {
	      return false;
	    }

	    for (int var7 = -2; var7 <= 2; var7++)
	    {
	      for (int var8 = -2; var8 <= 2; var8++)
	      {
	        if ((world.isAirBlock(i + var7 + 10, j - 1, k + var8 + 12)) && (world.isAirBlock(i + var7 + 10, j - 2, k + var8 + 12)))
	        {
	          return false;
	        }
	      }
	    }
    	world.setBlock(i + 3, j + 0, k + 3, MTJT.stoneLog.blockID, 0, 2);
        world.setBlock(i + 3, j + 1, k + 3, MTJT.stoneLog.blockID, 0, 2);
        world.setBlock(i + 1, j + 2, k + 4, MTJT.stoneLeaves.blockID, 0, 2);
        world.setBlock(i + 1, j + 2, k + 2, MTJT.stoneLeaves.blockID, 0, 2);
        world.setBlock(i + 2, j + 2, k + 5, MTJT.stoneLeaves.blockID, 0, 2);
        world.setBlock(i + 2, j + 2, k + 3, MTJT.stoneLeaves.blockID, 0, 2);
        world.setBlock(i + 2, j + 2, k + 0, MTJT.stoneLeaves.blockID, 0, 2);
        world.setBlock(i + 3, j + 2, k + 5, MTJT.stoneLeaves.blockID, 0, 2);
        world.setBlock(i + 3, j + 2, k + 4, MTJT.stoneLeaves.blockID, 0, 2);
        world.setBlock(i + 3, j + 2, k + 3, MTJT.stoneLog.blockID, 0, 2);
        world.setBlock(i + 3, j + 2, k + 2, MTJT.stoneLog.blockID, 0, 2);
        world.setBlock(i + 4, j + 2, k + 0, MTJT.stoneLeaves.blockID, 0, 2);
        world.setBlock(i + 5, j + 2, k + 5, MTJT.stoneLeaves.blockID, 0, 2);
        world.setBlock(i + 6, j + 2, k + 3, MTJT.stoneLeaves.blockID, 0, 2);
        world.setBlock(i + 6, j + 2, k + 2, MTJT.stoneLeaves.blockID, 0, 2);
        world.setBlock(i + 0, j + 3, k + 5, MTJT.stoneLeaves.blockID, 0, 2);
        world.setBlock(i + 0, j + 3, k + 4, MTJT.stoneLeaves.blockID, 0, 2);
        world.setBlock(i + 0, j + 3, k + 3, MTJT.stoneLeaves.blockID, 0, 2);
        world.setBlock(i + 1, j + 3, k + 6, MTJT.stoneLeaves.blockID, 0, 2);
        world.setBlock(i + 1, j + 3, k + 4, MTJT.stoneLeaves.blockID, 0, 2);
        world.setBlock(i + 1, j + 3, k + 2, MTJT.stoneLeaves.blockID, 0, 2);
        world.setBlock(i + 2, j + 3, k + 7, MTJT.stoneLeaves.blockID, 0, 2);
        world.setBlock(i + 2, j + 3, k + 5, MTJT.stoneLeaves.blockID, 0, 2);
        world.setBlock(i + 2, j + 3, k + 4, MTJT.stoneLog.blockID, 0, 2);
        world.setBlock(i + 2, j + 3, k + 3, MTJT.stoneLeaves.blockID, 0, 2);
        world.setBlock(i + 2, j + 3, k + 1, MTJT.stoneLeaves.blockID, 0, 2);
        world.setBlock(i + 3, j + 3, k + 3, MTJT.stoneLog.blockID, 0, 2);
        world.setBlock(i + 3, j + 3, k + 1, MTJT.stoneLeaves.blockID, 0, 2);
        world.setBlock(i + 4, j + 3, k + 5, MTJT.stoneLeaves.blockID, 0, 2);
        world.setBlock(i + 4, j + 3, k + 2, MTJT.stoneLeaves.blockID, 0, 2);
        world.setBlock(i + 4, j + 3, k + 1, MTJT.stoneLog.blockID, 0, 2);
        world.setBlock(i + 4, j + 3, k + 0, MTJT.stoneLeaves.blockID, 0, 2);
        world.setBlock(i + 5, j + 3, k + 4, MTJT.stoneLeaves.blockID, 0, 2);
        world.setBlock(i + 5, j + 3, k + 3, MTJT.stoneLeaves.blockID, 0, 2);
        world.setBlock(i + 5, j + 3, k + 1, MTJT.stoneLeaves.blockID, 0, 2);
        world.setBlock(i + 1, j + 4, k + 5, MTJT.stoneLeaves.blockID, 0, 2);
        world.setBlock(i + 1, j + 4, k + 3, MTJT.stoneLeaves.blockID, 0, 2);
        world.setBlock(i + 2, j + 4, k + 6, MTJT.stoneLeaves.blockID, 0, 2);
        world.setBlock(i + 2, j + 4, k + 0, MTJT.stoneLeaves.blockID, 0, 2);
        world.setBlock(i + 3, j + 4, k + 6, MTJT.stoneLeaves.blockID, 0, 2);
        world.setBlock(i + 3, j + 4, k + 5, MTJT.stoneLeaves.blockID, 0, 2);
        world.setBlock(i + 3, j + 4, k + 3, MTJT.stoneLog.blockID, 0, 2);
        world.setBlock(i + 3, j + 4, k + 2, MTJT.stoneLeaves.blockID, 0, 2);
        world.setBlock(i + 3, j + 4, k + 0, MTJT.stoneLeaves.blockID, 0, 2);
        world.setBlock(i + 4, j + 4, k + 4, MTJT.stoneLeaves.blockID, 0, 2);
        world.setBlock(i + 4, j + 4, k + 3, MTJT.stoneLeaves.blockID, 0, 2);
        world.setBlock(i + 4, j + 4, k + 1, MTJT.stoneLeaves.blockID, 0, 2);
        world.setBlock(i + 2, j + 5, k + 3, MTJT.stoneLeaves.blockID, 0, 2);
        world.setBlock(i + 3, j + 5, k + 4, MTJT.stoneLeaves.blockID, 0, 2);
        world.setBlock(i + 3, j + 5, k + 3, MTJT.stoneLeaves.blockID, 0, 2);
        world.setBlock(i + 3, j + 5, k + 2, MTJT.stoneLeaves.blockID, 0, 2);
        world.setBlock(i + 4, j + 5, k + 3, MTJT.stoneLeaves.blockID, 0, 2);
    	
    	return true;
    }
}