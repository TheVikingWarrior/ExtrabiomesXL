package morethantrees.treegen;

import java.util.Random;

import morethantrees.MTJT;
import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

public class WorldGenRainTrees extends WorldGenerator
{

	public boolean generate(World world, Random var2, int i, int j, int k)
	  {
	    while ((world.isAirBlock(i + 10, j, k + 12)) && (j > 2))
	    {
	      j--;
	    }

	    int var6 = world.getBlockId(i + 10, j, k + 12);

	    if (var6 != Block.grass.blockID)
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
	    world.setBlock(i + 5, j + 0, k + 5, MTJT.waterLog.blockID, 0, 2);
        world.setBlock(i + 6, j + 0, k + 6, MTJT.waterLog.blockID, 0, 2);
        world.setBlock(i + 5, j + 1, k + 5, MTJT.waterLog.blockID, 0, 2);
        world.setBlock(i + 5, j + 2, k + 5, MTJT.waterLog.blockID, 0, 2);
        world.setBlock(i + 5, j + 3, k + 5, MTJT.waterLog.blockID, 0, 2);
        world.setBlock(i + 5, j + 4, k + 5, MTJT.waterLog.blockID, 0, 2);
        world.setBlock(i + 5, j + 5, k + 5, MTJT.waterLog.blockID, 0, 2);
        world.setBlock(i + 5, j + 6, k + 5, MTJT.waterLog.blockID, 0, 2);
        world.setBlock(i + 5, j + 7, k + 5, MTJT.waterLog.blockID, 0, 2);
        world.setBlock(i + 5, j + 8, k + 5, MTJT.waterLog.blockID, 0, 2);
        world.setBlock(i + 5, j + 9, k + 5, MTJT.waterLog.blockID, 0, 2);
        world.setBlock(i + 5, j + 9, k + 4, MTJT.waterLog.blockID, 0, 2);
        world.setBlock(i + 4, j + 10, k + 3, MTJT.waterLog.blockID, 0, 2);
        world.setBlock(i + 5, j + 10, k + 6, MTJT.waterLog.blockID, 0, 2);
        world.setBlock(i + 6, j + 10, k + 4, MTJT.waterLog.blockID, 0, 2);
        world.setBlock(i + 1, j + 11, k + 6, MTJT.waterLeaves.blockID, 0, 2);
        world.setBlock(i + 1, j + 11, k + 2, MTJT.waterLeaves.blockID, 0, 2);
        world.setBlock(i + 3, j + 11, k + 8, MTJT.waterLeaves.blockID, 0, 2);
        world.setBlock(i + 3, j + 11, k + 7, MTJT.waterLeaves.blockID, 0, 2);
        world.setBlock(i + 3, j + 11, k + 0, MTJT.waterLeaves.blockID, 0, 2);
        world.setBlock(i + 4, j + 11, k + 8, MTJT.waterLeaves.blockID, 0, 2);
        world.setBlock(i + 4, j + 11, k + 6, MTJT.waterLog.blockID, 0, 2);
        world.setBlock(i + 4, j + 11, k + 4, MTJT.waterLeaves.blockID, 0, 2);
        world.setBlock(i + 4, j + 11, k + 3, MTJT.waterLog.blockID, 0, 2);
        world.setBlock(i + 5, j + 11, k + 4, MTJT.waterLeaves.blockID, 0, 2);
        world.setBlock(i + 5, j + 11, k + 1, MTJT.waterLeaves.blockID, 0, 2);
        world.setBlock(i + 6, j + 11, k + 8, MTJT.waterLeaves.blockID, 0, 2);
        world.setBlock(i + 6, j + 11, k + 7, MTJT.waterLog.blockID, 0, 2);
        world.setBlock(i + 6, j + 11, k + 2, MTJT.waterLeaves.blockID, 0, 2);
        world.setBlock(i + 7, j + 11, k + 8, MTJT.waterLeaves.blockID, 0, 2);
        world.setBlock(i + 7, j + 11, k + 4, MTJT.waterLog.blockID, 0, 2);
        world.setBlock(i + 8, j + 11, k + 5, MTJT.waterLeaves.blockID, 0, 2);
        world.setBlock(i + 8, j + 11, k + 3, MTJT.waterLeaves.blockID, 0, 2);
        world.setBlock(i + 8, j + 11, k + 1, MTJT.waterLeaves.blockID, 0, 2);
        world.setBlock(i + 9, j + 11, k + 5, MTJT.waterLeaves.blockID, 0, 2);
        world.setBlock(i + 2, j + 12, k + 4, MTJT.waterLeaves.blockID, 0, 2);
        world.setBlock(i + 3, j + 12, k + 7, MTJT.waterLeaves.blockID, 0, 2);
        world.setBlock(i + 3, j + 12, k + 6, MTJT.waterLog.blockID, 0, 2);
        world.setBlock(i + 3, j + 12, k + 3, MTJT.waterLeaves.blockID, 0, 2);
        world.setBlock(i + 3, j + 12, k + 2, MTJT.waterLog.blockID, 0, 2);
        world.setBlock(i + 4, j + 12, k + 9, MTJT.waterLeaves.blockID, 0, 2);
        world.setBlock(i + 4, j + 12, k + 6, MTJT.waterLeaves.blockID, 0, 2);
        world.setBlock(i + 4, j + 12, k + 4, MTJT.waterLeaves.blockID, 0, 2);
        world.setBlock(i + 4, j + 12, k + 2, MTJT.waterLeaves.blockID, 0, 2);
        world.setBlock(i + 5, j + 12, k + 7, MTJT.waterLeaves.blockID, 0, 2);
        world.setBlock(i + 5, j + 12, k + 5, MTJT.waterLeaves.blockID, 0, 2);
        world.setBlock(i + 5, j + 12, k + 4, MTJT.waterLog.blockID, 0, 2);
        world.setBlock(i + 5, j + 12, k + 2, MTJT.waterLeaves.blockID, 0, 2);
        world.setBlock(i + 5, j + 12, k + 1, MTJT.waterLeaves.blockID, 0, 2);
        world.setBlock(i + 6, j + 12, k + 10, MTJT.waterLeaves.blockID, 0, 2);
        world.setBlock(i + 6, j + 12, k + 9, MTJT.waterLeaves.blockID, 0, 2);
        world.setBlock(i + 6, j + 12, k + 8, MTJT.waterLog.blockID, 0, 2);
        world.setBlock(i + 6, j + 12, k + 2, MTJT.waterLeaves.blockID, 0, 2);
        world.setBlock(i + 7, j + 12, k + 5, MTJT.waterLeaves.blockID, 0, 2);
        world.setBlock(i + 7, j + 12, k + 3, MTJT.waterLog.blockID, 0, 2);
        world.setBlock(i + 7, j + 12, k + 2, MTJT.waterLeaves.blockID, 0, 2);
        world.setBlock(i + 7, j + 12, k + 0, MTJT.waterLeaves.blockID, 0, 2);
        world.setBlock(i + 8, j + 12, k + 5, MTJT.waterLog.blockID, 0, 2);
        world.setBlock(i + 8, j + 12, k + 3, MTJT.waterLeaves.blockID, 0, 2);
        world.setBlock(i + 8, j + 12, k + 2, MTJT.waterLeaves.blockID, 0, 2);
        world.setBlock(i + 8, j + 12, k + 1, MTJT.waterLeaves.blockID, 0, 2);
        world.setBlock(i + 9, j + 12, k + 4, MTJT.waterLeaves.blockID, 0, 2);
        world.setBlock(i + 10, j + 12, k + 6, MTJT.waterLeaves.blockID, 0, 2);
        world.setBlock(i + 10, j + 12, k + 2, MTJT.waterLeaves.blockID, 0, 2);
        world.setBlock(i + 0, j + 13, k + 5, MTJT.waterLeaves.blockID, 0, 2);
        world.setBlock(i + 1, j + 13, k + 7, MTJT.waterLeaves.blockID, 0, 2);
        world.setBlock(i + 1, j + 13, k + 5, MTJT.waterLeaves.blockID, 0, 2);
        world.setBlock(i + 2, j + 13, k + 7, MTJT.waterLeaves.blockID, 0, 2);
        world.setBlock(i + 2, j + 13, k + 2, MTJT.waterLeaves.blockID, 0, 2);
        world.setBlock(i + 3, j + 13, k + 8, MTJT.waterLeaves.blockID, 0, 2);
        world.setBlock(i + 3, j + 13, k + 5, MTJT.waterLog.blockID, 0, 2);
        world.setBlock(i + 3, j + 13, k + 4, MTJT.waterLeaves.blockID, 0, 2);
        world.setBlock(i + 3, j + 13, k + 3, MTJT.waterLeaves.blockID, 0, 2);
        world.setBlock(i + 4, j + 13, k + 8, MTJT.waterLeaves.blockID, 0, 2);
        world.setBlock(i + 4, j + 13, k + 7, MTJT.waterLog.blockID, 0, 2);
        world.setBlock(i + 4, j + 13, k + 5, MTJT.waterLeaves.blockID, 0, 2);
        world.setBlock(i + 4, j + 13, k + 3, MTJT.waterLeaves.blockID, 0, 2);
        world.setBlock(i + 5, j + 13, k + 8, MTJT.waterLeaves.blockID, 0, 2);
        world.setBlock(i + 5, j + 13, k + 6, MTJT.waterLeaves.blockID, 0, 2);
        world.setBlock(i + 5, j + 13, k + 5, MTJT.waterLog.blockID, 0, 2);
        world.setBlock(i + 5, j + 13, k + 4, MTJT.waterLeaves.blockID, 0, 2);
        world.setBlock(i + 5, j + 13, k + 3, MTJT.waterLeaves.blockID, 0, 2);
        world.setBlock(i + 6, j + 13, k + 8, MTJT.waterLeaves.blockID, 0, 2);
        world.setBlock(i + 6, j + 13, k + 5, MTJT.waterLeaves.blockID, 0, 2);
        world.setBlock(i + 6, j + 13, k + 4, MTJT.waterLeaves.blockID, 0, 2);
        world.setBlock(i + 6, j + 13, k + 3, MTJT.waterLeaves.blockID, 0, 2);
        world.setBlock(i + 6, j + 13, k + 2, MTJT.waterLog.blockID, 0, 2);
        world.setBlock(i + 6, j + 13, k + 1, MTJT.waterLeaves.blockID, 0, 2);
        world.setBlock(i + 6, j + 13, k + 0, MTJT.waterLeaves.blockID, 0, 2);
        world.setBlock(i + 7, j + 13, k + 8, MTJT.waterLog.blockID, 0, 2);
        world.setBlock(i + 7, j + 13, k + 7, MTJT.waterLeaves.blockID, 0, 2);
        world.setBlock(i + 7, j + 13, k + 4, MTJT.waterLeaves.blockID, 0, 2);
        world.setBlock(i + 7, j + 13, k + 3, MTJT.waterLeaves.blockID, 0, 2);
        world.setBlock(i + 8, j + 13, k + 5, MTJT.waterLeaves.blockID, 0, 2);
        world.setBlock(i + 8, j + 13, k + 2, MTJT.waterLog.blockID, 0, 2);
        world.setBlock(i + 8, j + 13, k + 1, MTJT.waterLeaves.blockID, 0, 2);
        world.setBlock(i + 9, j + 13, k + 8, MTJT.waterLeaves.blockID, 0, 2);
        world.setBlock(i + 9, j + 13, k + 3, MTJT.waterLeaves.blockID, 0, 2);
        world.setBlock(i + 0, j + 14, k + 5, MTJT.waterLeaves.blockID, 0, 2);
        world.setBlock(i + 1, j + 14, k + 7, MTJT.waterLeaves.blockID, 0, 2);
        world.setBlock(i + 1, j + 14, k + 4, MTJT.waterLeaves.blockID, 0, 2);
        world.setBlock(i + 2, j + 14, k + 7, MTJT.waterLeaves.blockID, 0, 2);
        world.setBlock(i + 2, j + 14, k + 5, MTJT.waterLog.blockID, 0, 2);
        world.setBlock(i + 2, j + 14, k + 3, MTJT.waterLeaves.blockID, 0, 2);
        world.setBlock(i + 3, j + 14, k + 6, MTJT.waterLeaves.blockID, 0, 2);
        world.setBlock(i + 4, j + 14, k + 3, MTJT.waterLeaves.blockID, 0, 2);
        world.setBlock(i + 5, j + 14, k + 7, MTJT.waterLeaves.blockID, 0, 2);
        world.setBlock(i + 6, j + 14, k + 3, MTJT.waterLeaves.blockID, 0, 2);
        world.setBlock(i + 6, j + 14, k + 2, MTJT.waterLeaves.blockID, 0, 2);
        world.setBlock(i + 7, j + 14, k + 10, MTJT.waterLeaves.blockID, 0, 2);
        world.setBlock(i + 7, j + 14, k + 8, MTJT.waterLeaves.blockID, 0, 2);
        world.setBlock(i + 7, j + 14, k + 7, MTJT.waterLeaves.blockID, 0, 2);
        world.setBlock(i + 7, j + 14, k + 5, MTJT.waterLeaves.blockID, 0, 2);
        world.setBlock(i + 7, j + 14, k + 2, MTJT.waterLeaves.blockID, 0, 2);
        world.setBlock(i + 8, j + 14, k + 6, MTJT.waterLeaves.blockID, 0, 2);
        world.setBlock(i + 8, j + 14, k + 2, MTJT.waterLeaves.blockID, 0, 2);
        world.setBlock(i + 9, j + 14, k + 3, MTJT.waterLeaves.blockID, 0, 2);
        world.setBlock(i + 2, j + 15, k + 7, MTJT.waterLeaves.blockID, 0, 2);
        world.setBlock(i + 3, j + 15, k + 5, MTJT.waterLeaves.blockID, 0, 2);
        world.setBlock(i + 3, j + 15, k + 4, MTJT.waterLeaves.blockID, 0, 2);
        world.setBlock(i + 3, j + 15, k + 3, MTJT.waterLeaves.blockID, 0, 2);
        world.setBlock(i + 4, j + 15, k + 7, MTJT.waterLeaves.blockID, 0, 2);
        world.setBlock(i + 4, j + 15, k + 6, MTJT.waterLeaves.blockID, 0, 2);
        world.setBlock(i + 5, j + 15, k + 5, MTJT.waterLeaves.blockID, 0, 2);
        world.setBlock(i + 6, j + 15, k + 2, MTJT.waterLeaves.blockID, 0, 2);
        world.setBlock(i + 2, j + 16, k + 4, MTJT.waterLeaves.blockID, 0, 2);
        world.setBlock(i + 3, j + 16, k + 5, MTJT.waterLeaves.blockID, 0, 2);

      return true;
	  }  
}