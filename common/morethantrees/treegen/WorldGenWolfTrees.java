package morethantrees.treegen;

import java.util.Random;

import morethantrees.MTJT;
import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

public class WorldGenWolfTrees extends WorldGenerator
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
	    world.setBlock(i + 3, j + 1, k + 7, MTJT.wolfLog.blockID, 0, 2);
        world.setBlock(i + 3, j + 2, k + 7, MTJT.wolfLog.blockID, 0, 2);
        world.setBlock(i + 3, j + 3, k + 7, MTJT.wolfLog.blockID, 0, 2);
        world.setBlock(i + 3, j + 3, k + 6, MTJT.wolfLog.blockID, 0, 2);
        world.setBlock(i + 1, j + 4, k + 5, MTJT.wolfLeaves.blockID, 0, 2);
        world.setBlock(i + 2, j + 4, k + 6, MTJT.wolfLeaves.blockID, 0, 2);
        world.setBlock(i + 2, j + 4, k + 5, MTJT.wolfLeaves.blockID, 0, 2);
        world.setBlock(i + 3, j + 4, k + 8, MTJT.wolfLog.blockID, 0, 2);
        world.setBlock(i + 3, j + 4, k + 6, MTJT.wolfLog.blockID, 0, 2);
        world.setBlock(i + 3, j + 4, k + 5, MTJT.wolfLog.blockID, 0, 2);
        world.setBlock(i + 3, j + 4, k + 4, MTJT.wolfLog.blockID, 0, 2);
        world.setBlock(i + 4, j + 4, k + 6, MTJT.wolfLog.blockID, 0, 2);
        world.setBlock(i + 0, j + 5, k + 10, MTJT.wolfLeaves.blockID, 0, 2);
        world.setBlock(i + 0, j + 5, k + 9, MTJT.wolfLeaves.blockID, 0, 2);
        world.setBlock(i + 0, j + 5, k + 8, MTJT.wolfLeaves.blockID, 0, 2);
        world.setBlock(i + 1, j + 5, k + 10, MTJT.wolfLeaves.blockID, 0, 2);
        world.setBlock(i + 1, j + 5, k + 9, MTJT.wolfLeaves.blockID, 0, 2);
        world.setBlock(i + 1, j + 5, k + 8, MTJT.wolfLeaves.blockID, 0, 2);
        world.setBlock(i + 1, j + 5, k + 4, MTJT.wolfLeaves.blockID, 0, 2);
        world.setBlock(i + 1, j + 5, k + 3, MTJT.wolfLeaves.blockID, 0, 2);
        world.setBlock(i + 1, j + 5, k + 2, MTJT.wolfLeaves.blockID, 0, 2);
        world.setBlock(i + 1, j + 5, k + 1, MTJT.wolfLeaves.blockID, 0, 2);
        world.setBlock(i + 2, j + 5, k + 9, MTJT.wolfLog.blockID, 0, 2);
        world.setBlock(i + 2, j + 5, k + 8, MTJT.wolfLeaves.blockID, 0, 2);
        world.setBlock(i + 2, j + 5, k + 5, MTJT.wolfLeaves.blockID, 0, 2);
        world.setBlock(i + 2, j + 5, k + 4, MTJT.wolfLeaves.blockID, 0, 2);
        world.setBlock(i + 2, j + 5, k + 0, MTJT.wolfLeaves.blockID, 0, 2);
        world.setBlock(i + 3, j + 5, k + 10, MTJT.wolfLog.blockID, 0, 2);
        world.setBlock(i + 3, j + 5, k + 9, MTJT.wolfLog.blockID, 0, 2);
        world.setBlock(i + 3, j + 5, k + 8, MTJT.wolfLeaves.blockID, 0, 2);
        world.setBlock(i + 3, j + 5, k + 6, MTJT.wolfLeaves.blockID, 0, 2);
        world.setBlock(i + 3, j + 5, k + 5, MTJT.wolfLeaves.blockID, 0, 2);
        world.setBlock(i + 3, j + 5, k + 4, MTJT.wolfLog.blockID, 0, 2);
        world.setBlock(i + 3, j + 5, k + 3, MTJT.wolfLog.blockID, 0, 2);
        world.setBlock(i + 3, j + 5, k + 0, MTJT.wolfLeaves.blockID, 0, 2);
        world.setBlock(i + 4, j + 5, k + 8, MTJT.wolfLeaves.blockID, 0, 2);
        world.setBlock(i + 4, j + 5, k + 7, MTJT.wolfLeaves.blockID, 0, 2);
        world.setBlock(i + 4, j + 5, k + 6, MTJT.wolfLeaves.blockID, 0, 2);
        world.setBlock(i + 4, j + 5, k + 5, MTJT.wolfLeaves.blockID, 0, 2);
        world.setBlock(i + 4, j + 5, k + 4, MTJT.wolfLeaves.blockID, 0, 2);
        world.setBlock(i + 4, j + 5, k + 0, MTJT.wolfLeaves.blockID, 0, 2);
        world.setBlock(i + 5, j + 5, k + 10, MTJT.wolfLeaves.blockID, 0, 2);
        world.setBlock(i + 5, j + 5, k + 9, MTJT.wolfLeaves.blockID, 0, 2);
        world.setBlock(i + 5, j + 5, k + 8, MTJT.wolfLeaves.blockID, 0, 2);
        world.setBlock(i + 5, j + 5, k + 6, MTJT.wolfLog.blockID, 0, 2);
        world.setBlock(i + 5, j + 5, k + 4, MTJT.wolfLeaves.blockID, 0, 2);
        world.setBlock(i + 5, j + 5, k + 3, MTJT.wolfLeaves.blockID, 0, 2);
        world.setBlock(i + 5, j + 5, k + 2, MTJT.wolfLeaves.blockID, 0, 2);
        world.setBlock(i + 5, j + 5, k + 1, MTJT.wolfLeaves.blockID, 0, 2);
        world.setBlock(i + 6, j + 5, k + 10, MTJT.wolfLeaves.blockID, 0, 2);
        world.setBlock(i + 6, j + 5, k + 9, MTJT.wolfLeaves.blockID, 0, 2);
        world.setBlock(i + 6, j + 5, k + 8, MTJT.wolfLeaves.blockID, 0, 2);
        world.setBlock(i + 6, j + 5, k + 7, MTJT.wolfLog.blockID, 0, 2);
        world.setBlock(i + 6, j + 5, k + 6, MTJT.wolfLog.blockID, 0, 2);
        world.setBlock(i + 7, j + 5, k + 10, MTJT.wolfLeaves.blockID, 0, 2);
        world.setBlock(i + 7, j + 5, k + 9, MTJT.wolfLeaves.blockID, 0, 2);
        world.setBlock(i + 7, j + 5, k + 8, MTJT.wolfLog.blockID, 0, 2);
        world.setBlock(i + 8, j + 5, k + 9, MTJT.wolfLeaves.blockID, 0, 2);
        world.setBlock(i + 8, j + 5, k + 8, MTJT.wolfLeaves.blockID, 0, 2);
        world.setBlock(i + 9, j + 5, k + 8, MTJT.wolfLeaves.blockID, 0, 2);
        world.setBlock(i + 9, j + 5, k + 7, MTJT.wolfLeaves.blockID, 0, 2);
        world.setBlock(i + 1, j + 6, k + 9, MTJT.wolfLog.blockID, 0, 2);
        world.setBlock(i + 2, j + 6, k + 11, MTJT.wolfLeaves.blockID, 0, 2);
        world.setBlock(i + 2, j + 6, k + 10, MTJT.wolfLeaves.blockID, 0, 2);
        world.setBlock(i + 2, j + 6, k + 9, MTJT.wolfLeaves.blockID, 0, 2);
        world.setBlock(i + 2, j + 6, k + 3, MTJT.wolfLeaves.blockID, 0, 2);
        world.setBlock(i + 2, j + 6, k + 2, MTJT.wolfLeaves.blockID, 0, 2);
        world.setBlock(i + 2, j + 6, k + 1, MTJT.wolfLeaves.blockID, 0, 2);
        world.setBlock(i + 3, j + 6, k + 11, MTJT.wolfLeaves.blockID, 0, 2);
        world.setBlock(i + 3, j + 6, k + 10, MTJT.wolfLeaves.blockID, 0, 2);
        world.setBlock(i + 3, j + 6, k + 9, MTJT.wolfLeaves.blockID, 0, 2);
        world.setBlock(i + 3, j + 6, k + 3, MTJT.wolfLeaves.blockID, 0, 2);
        world.setBlock(i + 3, j + 6, k + 2, MTJT.wolfLog.blockID, 0, 2);
        world.setBlock(i + 3, j + 6, k + 1, MTJT.wolfLeaves.blockID, 0, 2);
        world.setBlock(i + 4, j + 6, k + 11, MTJT.wolfLeaves.blockID, 0, 2);
        world.setBlock(i + 4, j + 6, k + 10, MTJT.wolfLeaves.blockID, 0, 2);
        world.setBlock(i + 4, j + 6, k + 9, MTJT.wolfLeaves.blockID, 0, 2);
        world.setBlock(i + 4, j + 6, k + 3, MTJT.wolfLeaves.blockID, 0, 2);
        world.setBlock(i + 4, j + 6, k + 2, MTJT.wolfLeaves.blockID, 0, 2);
        world.setBlock(i + 4, j + 6, k + 1, MTJT.wolfLeaves.blockID, 0, 2);
        world.setBlock(i + 5, j + 6, k + 7, MTJT.wolfLeaves.blockID, 0, 2);
        world.setBlock(i + 5, j + 6, k + 6, MTJT.wolfLeaves.blockID, 0, 2);
        world.setBlock(i + 5, j + 6, k + 5, MTJT.wolfLeaves.blockID, 0, 2);
        world.setBlock(i + 6, j + 6, k + 8, MTJT.wolfLeaves.blockID, 0, 2);
        world.setBlock(i + 6, j + 6, k + 7, MTJT.wolfLeaves.blockID, 0, 2);
        world.setBlock(i + 6, j + 6, k + 6, MTJT.wolfLog.blockID, 0, 2);
        world.setBlock(i + 6, j + 6, k + 5, MTJT.wolfLeaves.blockID, 0, 2);
        world.setBlock(i + 6, j + 6, k + 4, MTJT.wolfLeaves.blockID, 0, 2);
        world.setBlock(i + 7, j + 6, k + 8, MTJT.wolfLeaves.blockID, 0, 2);
        world.setBlock(i + 7, j + 6, k + 7, MTJT.wolfLeaves.blockID, 0, 2);
        world.setBlock(i + 7, j + 6, k + 6, MTJT.wolfLeaves.blockID, 0, 2);
        world.setBlock(i + 7, j + 6, k + 5, MTJT.wolfLeaves.blockID, 0, 2);
        world.setBlock(i + 7, j + 6, k + 4, MTJT.wolfLeaves.blockID, 0, 2);
        world.setBlock(i + 8, j + 6, k + 7, MTJT.wolfLeaves.blockID, 0, 2);
        world.setBlock(i + 8, j + 6, k + 6, MTJT.wolfLeaves.blockID, 0, 2);
        world.setBlock(i + 8, j + 6, k + 5, MTJT.wolfLeaves.blockID, 0, 2);
        world.setBlock(i + 0, j + 7, k + 10, MTJT.wolfLeaves.blockID, 0, 2);
        world.setBlock(i + 0, j + 7, k + 9, MTJT.wolfLeaves.blockID, 0, 2);
        world.setBlock(i + 0, j + 7, k + 8, MTJT.wolfLeaves.blockID, 0, 2);
        world.setBlock(i + 1, j + 7, k + 10, MTJT.wolfLeaves.blockID, 0, 2);
        world.setBlock(i + 1, j + 7, k + 9, MTJT.wolfLog.blockID, 0, 2);
        world.setBlock(i + 1, j + 7, k + 8, MTJT.wolfLeaves.blockID, 0, 2);
        world.setBlock(i + 2, j + 7, k + 10, MTJT.wolfLeaves.blockID, 0, 2);
        world.setBlock(i + 2, j + 7, k + 9, MTJT.wolfLeaves.blockID, 0, 2);
        world.setBlock(i + 2, j + 7, k + 8, MTJT.wolfLeaves.blockID, 0, 2);
        world.setBlock(i + 3, j + 7, k + 2, MTJT.wolfLeaves.blockID, 0, 2);
        world.setBlock(i + 6, j + 7, k + 6, MTJT.wolfLeaves.blockID, 0, 2);
        world.setBlock(i + 6, j + 7, k + 5, MTJT.wolfLeaves.blockID, 0, 2);
        world.setBlock(i + 7, j + 7, k + 7, MTJT.wolfLeaves.blockID, 0, 2);
        world.setBlock(i + 7, j + 7, k + 6, MTJT.wolfLeaves.blockID, 0, 2);
        world.setBlock(i + 1, j + 8, k + 9, MTJT.wolfLeaves.blockID, 0, 2);

      return true;
	  }  
}