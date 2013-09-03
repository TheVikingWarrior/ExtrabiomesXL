package morethantrees.treegen;

import java.util.Random;

import morethantrees.MTJT;
import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

public class WorldGenCarrotTree extends WorldGenerator
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
            world.setBlock(i + 3, j + 0, k + 4, MTJT.carrotLog.blockID, 0, 2);
            world.setBlock(i + 3, j + 1, k + 4, MTJT.carrotLog.blockID, 0, 2);
            world.setBlock(i + 3, j + 2, k + 4, MTJT.carrotLog.blockID, 0, 2);
            world.setBlock(i + 2, j + 3, k + 4, MTJT.carrotLeaves.blockID, 0, 2);
            world.setBlock(i + 3, j + 3, k + 5, MTJT.carrotLeaves.blockID, 0, 2);
            world.setBlock(i + 3, j + 3, k + 4, MTJT.carrotLog.blockID, 0, 2);
            world.setBlock(i + 4, j + 3, k + 4, MTJT.carrotLeaves.blockID, 0, 2);
            world.setBlock(i + 1, j + 4, k + 5, MTJT.carrotLeaves.blockID, 0, 2);
            world.setBlock(i + 2, j + 4, k + 4, MTJT.carrotLeaves.blockID, 0, 2);
            world.setBlock(i + 2, j + 4, k + 3, MTJT.carrotLeaves.blockID, 0, 2);
            world.setBlock(i + 2, j + 4, k + 2, MTJT.carrotLeaves.blockID, 0, 2);
            world.setBlock(i + 3, j + 4, k + 4, MTJT.carrotLog.blockID, 0, 2);
            world.setBlock(i + 3, j + 4, k + 2, MTJT.carrotLeaves.blockID, 0, 2);
            world.setBlock(i + 4, j + 4, k + 6, MTJT.carrotLeaves.blockID, 0, 2);
            world.setBlock(i + 4, j + 4, k + 5, MTJT.carrotLeaves.blockID, 0, 2);
            world.setBlock(i + 4, j + 4, k + 4, MTJT.carrotLeaves.blockID, 0, 2);
            world.setBlock(i + 5, j + 4, k + 6, MTJT.carrotLeaves.blockID, 0, 2);
            world.setBlock(i + 1, j + 5, k + 4, MTJT.carrotLeaves.blockID, 0, 2);
            world.setBlock(i + 1, j + 5, k + 3, MTJT.carrotLeaves.blockID, 0, 2);
            world.setBlock(i + 2, j + 5, k + 4, MTJT.carrotLeaves.blockID, 0, 2);
            world.setBlock(i + 2, j + 5, k + 3, MTJT.carrotLog.blockID, 0, 2);
            world.setBlock(i + 2, j + 5, k + 2, MTJT.carrotLeaves.blockID, 0, 2);
            world.setBlock(i + 2, j + 5, k + 1, MTJT.carrotLeaves.blockID, 0, 2);
            world.setBlock(i + 3, j + 5, k + 5, MTJT.carrotLog.blockID, 0, 2);
            world.setBlock(i + 3, j + 5, k + 4, MTJT.carrotLeaves.blockID, 0, 2);
            world.setBlock(i + 3, j + 5, k + 1, MTJT.carrotLeaves.blockID, 0, 2);
            world.setBlock(i + 4, j + 5, k + 5, MTJT.carrotLeaves.blockID, 0, 2);
            world.setBlock(i + 5, j + 5, k + 3, MTJT.carrotLeaves.blockID, 0, 2);
            world.setBlock(i + 6, j + 5, k + 6, MTJT.carrotLeaves.blockID, 0, 2);
            world.setBlock(i + 0, j + 6, k + 4, MTJT.carrotLeaves.blockID, 0, 2);
            world.setBlock(i + 1, j + 6, k + 1, MTJT.carrotLeaves.blockID, 0, 2);
            world.setBlock(i + 2, j + 6, k + 6, MTJT.carrotLeaves.blockID, 0, 2);
            world.setBlock(i + 2, j + 6, k + 5, MTJT.carrotLeaves.blockID, 0, 2);
            world.setBlock(i + 2, j + 6, k + 3, MTJT.carrotLog.blockID, 0, 2);
            world.setBlock(i + 2, j + 6, k + 1, MTJT.carrotLeaves.blockID, 0, 2);
            world.setBlock(i + 3, j + 6, k + 3, MTJT.carrotLeaves.blockID, 0, 2);
            world.setBlock(i + 3, j + 6, k + 2, MTJT.carrotLeaves.blockID, 0, 2);
            world.setBlock(i + 4, j + 6, k + 6, MTJT.carrotLog.blockID, 0, 2);
            world.setBlock(i + 4, j + 6, k + 5, MTJT.carrotLeaves.blockID, 0, 2);
            world.setBlock(i + 4, j + 6, k + 4, MTJT.carrotLeaves.blockID, 0, 2);
            world.setBlock(i + 4, j + 6, k + 2, MTJT.carrotLeaves.blockID, 0, 2);
            world.setBlock(i + 5, j + 6, k + 7, MTJT.carrotLeaves.blockID, 0, 2);
            world.setBlock(i + 5, j + 6, k + 4, MTJT.carrotLeaves.blockID, 0, 2);
            world.setBlock(i + 6, j + 6, k + 6, MTJT.carrotLeaves.blockID, 0, 2);
            world.setBlock(i + 0, j + 7, k + 4, MTJT.carrotLeaves.blockID, 0, 2);
            world.setBlock(i + 0, j + 7, k + 2, MTJT.carrotLeaves.blockID, 0, 2);
            world.setBlock(i + 2, j + 7, k + 2, MTJT.carrotLeaves.blockID, 0, 2);
            world.setBlock(i + 2, j + 7, k + 0, MTJT.carrotLeaves.blockID, 0, 2);
            world.setBlock(i + 3, j + 7, k + 6, MTJT.carrotLeaves.blockID, 0, 2);
            world.setBlock(i + 3, j + 7, k + 4, MTJT.carrotLeaves.blockID, 0, 2);
            world.setBlock(i + 3, j + 7, k + 3, MTJT.carrotLeaves.blockID, 0, 2);
            world.setBlock(i + 3, j + 7, k + 2, MTJT.carrotLeaves.blockID, 0, 2);
            world.setBlock(i + 4, j + 7, k + 2, MTJT.carrotLeaves.blockID, 0, 2);
            world.setBlock(i + 5, j + 7, k + 4, MTJT.carrotLeaves.blockID, 0, 2);
            world.setBlock(i + 6, j + 7, k + 7, MTJT.carrotLeaves.blockID, 0, 2);
            world.setBlock(i + 6, j + 7, k + 6, MTJT.carrotLeaves.blockID, 0, 2);
            world.setBlock(i + 2, j + 8, k + 7, MTJT.carrotLeaves.blockID, 0, 2);
            world.setBlock(i + 2, j + 8, k + 1, MTJT.carrotLeaves.blockID, 0, 2);
            world.setBlock(i + 2, j + 8, k + 0, MTJT.carrotLeaves.blockID, 0, 2);
            world.setBlock(i + 3, j + 8, k + 4, MTJT.carrotLeaves.blockID, 0, 2);
            world.setBlock(i + 3, j + 8, k + 2, MTJT.carrotLeaves.blockID, 0, 2);
            world.setBlock(i + 4, j + 8, k + 7, MTJT.carrotLeaves.blockID, 0, 2);
            world.setBlock(i + 4, j + 8, k + 6, MTJT.carrotLeaves.blockID, 0, 2);
            world.setBlock(i + 4, j + 8, k + 4, MTJT.carrotLeaves.blockID, 0, 2);
            world.setBlock(i + 5, j + 8, k + 8, MTJT.carrotLeaves.blockID, 0, 2);
            world.setBlock(i + 3, j + 9, k + 5, MTJT.carrotLeaves.blockID, 0, 2);
            world.setBlock(i + 3, j + 9, k + 2, MTJT.carrotLeaves.blockID, 0, 2);
            world.setBlock(i + 4, j + 9, k + 7, MTJT.carrotLeaves.blockID, 0, 2);

  return true;
  }
} /*=====End of Code=====*/

