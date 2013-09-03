package morethantrees.treegen;

import java.util.Random;

import morethantrees.MTJT;
import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

public class WorldGenSmiteTrees extends WorldGenerator
{
	public boolean generate(World world, Random var2, int i, int j, int k)
	  {
	    while ((world.isAirBlock(i + 10, j, k + 12)) && (j > 2))
	    {
	      j--;
	    }

	    int var6 = world.getBlockId(i + 10, j, k + 12);

	    if (var6 != Block.grass.blockID && var6 != Block.dirt.blockID && var6 != Block.cobblestone.blockID)
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
    	world.setBlock(i + 3, j + 1, k + 6, MTJT.smiteLog.blockID, 0, 2);
        world.setBlock(i + 3, j + 2, k + 6, MTJT.smiteLog.blockID, 0, 2);
        world.setBlock(i + 2, j + 3, k + 6, MTJT.smiteLeaves.blockID, 0, 2);
        world.setBlock(i + 3, j + 3, k + 6, MTJT.smiteLog.blockID, 0, 2);
        world.setBlock(i + 4, j + 3, k + 6, MTJT.smiteLeaves.blockID, 0, 2);
        world.setBlock(i + 5, j + 3, k + 6, MTJT.smiteLeaves.blockID, 0, 2);
        world.setBlock(i + 0, j + 4, k + 6, MTJT.smiteLeaves.blockID, 0, 2);
        world.setBlock(i + 1, j + 4, k + 6, MTJT.smiteLeaves.blockID, 0, 2);
        world.setBlock(i + 2, j + 4, k + 8, MTJT.smiteLeaves.blockID, 0, 2);
        world.setBlock(i + 2, j + 4, k + 7, MTJT.smiteLeaves.blockID, 0, 2);
        world.setBlock(i + 2, j + 4, k + 6, MTJT.smiteLeaves.blockID, 0, 2);
        world.setBlock(i + 2, j + 4, k + 5, MTJT.smiteLeaves.blockID, 0, 2);
        world.setBlock(i + 3, j + 4, k + 6, MTJT.smiteLog.blockID, 0, 2);
        world.setBlock(i + 3, j + 4, k + 5, MTJT.smiteLog.blockID, 0, 2);
        world.setBlock(i + 3, j + 4, k + 4, MTJT.smiteLeaves.blockID, 0, 2);
        world.setBlock(i + 2, j + 5, k + 6, MTJT.smiteLeaves.blockID, 0, 2);
        world.setBlock(i + 3, j + 5, k + 5, MTJT.smiteLog.blockID, 0, 2);
        world.setBlock(i + 3, j + 5, k + 4, MTJT.smiteLeaves.blockID, 0, 2);
        world.setBlock(i + 3, j + 5, k + 3, MTJT.smiteLeaves.blockID, 0, 2);
        world.setBlock(i + 4, j + 5, k + 5, MTJT.smiteLeaves.blockID, 0, 2);
        world.setBlock(i + 4, j + 5, k + 4, MTJT.smiteLeaves.blockID, 0, 2);
        world.setBlock(i + 3, j + 6, k + 6, MTJT.smiteLeaves.blockID, 0, 2);
        world.setBlock(i + 3, j + 6, k + 5, MTJT.smiteLog.blockID, 0, 2);
        world.setBlock(i + 2, j + 7, k + 6, MTJT.smiteLeaves.blockID, 0, 2);
        world.setBlock(i + 3, j + 7, k + 9, MTJT.smiteLeaves.blockID, 0, 2);
        world.setBlock(i + 3, j + 7, k + 8, MTJT.smiteLeaves.blockID, 0, 2);
        world.setBlock(i + 3, j + 7, k + 7, MTJT.smiteLeaves.blockID, 0, 2);
        world.setBlock(i + 3, j + 7, k + 6, MTJT.smiteLeaves.blockID, 0, 2);
        world.setBlock(i + 3, j + 7, k + 5, MTJT.smiteLog.blockID, 0, 2);
        world.setBlock(i + 3, j + 7, k + 4, MTJT.smiteLeaves.blockID, 0, 2);
        world.setBlock(i + 4, j + 7, k + 6, MTJT.smiteLeaves.blockID, 0, 2);
        world.setBlock(i + 1, j + 8, k + 5, MTJT.smiteLeaves.blockID, 0, 2);
        world.setBlock(i + 2, j + 8, k + 5, MTJT.smiteLeaves.blockID, 0, 2);
        world.setBlock(i + 2, j + 8, k + 4, MTJT.smiteLeaves.blockID, 0, 2);
        world.setBlock(i + 3, j + 8, k + 7, MTJT.smiteLeaves.blockID, 0, 2);
        world.setBlock(i + 3, j + 8, k + 6, MTJT.smiteLog.blockID, 0, 2);
        world.setBlock(i + 3, j + 8, k + 5, MTJT.smiteLog.blockID, 0, 2);
        world.setBlock(i + 3, j + 8, k + 4, MTJT.smiteLeaves.blockID, 0, 2);
        world.setBlock(i + 3, j + 8, k + 3, MTJT.smiteLeaves.blockID, 0, 2);
        world.setBlock(i + 3, j + 8, k + 2, MTJT.smiteLeaves.blockID, 0, 2);
        world.setBlock(i + 4, j + 8, k + 4, MTJT.smiteLeaves.blockID, 0, 2);
        world.setBlock(i + 3, j + 9, k + 7, MTJT.smiteLeaves.blockID, 0, 2);
        world.setBlock(i + 3, j + 9, k + 6, MTJT.smiteLog.blockID, 0, 2);
        world.setBlock(i + 3, j + 9, k + 5, MTJT.smiteLeaves.blockID, 0, 2);
        world.setBlock(i + 0, j + 10, k + 6, MTJT.smiteLeaves.blockID, 0, 2);
        world.setBlock(i + 1, j + 10, k + 6, MTJT.smiteLeaves.blockID, 0, 2);
        world.setBlock(i + 2, j + 10, k + 7, MTJT.smiteLeaves.blockID, 0, 2);
        world.setBlock(i + 2, j + 10, k + 6, MTJT.smiteLeaves.blockID, 0, 2);
        world.setBlock(i + 2, j + 10, k + 5, MTJT.smiteLeaves.blockID, 0, 2);
        world.setBlock(i + 2, j + 10, k + 4, MTJT.smiteLeaves.blockID, 0, 2);
        world.setBlock(i + 3, j + 10, k + 8, MTJT.smiteLeaves.blockID, 0, 2);
        world.setBlock(i + 3, j + 10, k + 7, MTJT.smiteLeaves.blockID, 0, 2);
        world.setBlock(i + 3, j + 10, k + 6, MTJT.smiteLog.blockID, 0, 2);
        world.setBlock(i + 3, j + 10, k + 5, MTJT.smiteLeaves.blockID, 0, 2);
        world.setBlock(i + 4, j + 10, k + 7, MTJT.smiteLeaves.blockID, 0, 2);
        world.setBlock(i + 2, j + 11, k + 7, MTJT.smiteLog.blockID, 0, 2);
        world.setBlock(i + 2, j + 11, k + 6, MTJT.smiteLog.blockID, 0, 2);
        world.setBlock(i + 3, j + 11, k + 7, MTJT.smiteLeaves.blockID, 0, 2);
        world.setBlock(i + 3, j + 11, k + 6, MTJT.smiteLog.blockID, 0, 2);
        world.setBlock(i + 3, j + 11, k + 5, MTJT.smiteLog.blockID, 0, 2);
        world.setBlock(i + 4, j + 11, k + 6, MTJT.smiteLeaves.blockID, 0, 2);
        world.setBlock(i + 5, j + 11, k + 6, MTJT.smiteLeaves.blockID, 0, 2);
        world.setBlock(i + 0, j + 12, k + 7, MTJT.smiteLeaves.blockID, 0, 2);
        world.setBlock(i + 1, j + 12, k + 8, MTJT.smiteLeaves.blockID, 0, 2);
        world.setBlock(i + 1, j + 12, k + 7, MTJT.smiteLeaves.blockID, 0, 2);
        world.setBlock(i + 1, j + 12, k + 6, MTJT.smiteLeaves.blockID, 0, 2);
        world.setBlock(i + 1, j + 12, k + 4, MTJT.smiteLeaves.blockID, 0, 2);
        world.setBlock(i + 2, j + 12, k + 8, MTJT.smiteLog.blockID, 0, 2);
        world.setBlock(i + 2, j + 12, k + 7, MTJT.smiteLog.blockID, 0, 2);
        world.setBlock(i + 2, j + 12, k + 4, MTJT.smiteLeaves.blockID, 0, 2);
        world.setBlock(i + 3, j + 12, k + 9, MTJT.smiteLeaves.blockID, 0, 2);
        world.setBlock(i + 3, j + 12, k + 5, MTJT.smiteLog.blockID, 0, 2);
        world.setBlock(i + 3, j + 12, k + 4, MTJT.smiteLog.blockID, 0, 2);
        world.setBlock(i + 4, j + 12, k + 4, MTJT.smiteLeaves.blockID, 0, 2);
        world.setBlock(i + 5, j + 12, k + 4, MTJT.smiteLeaves.blockID, 0, 2);
        world.setBlock(i + 2, j + 13, k + 10, MTJT.smiteLeaves.blockID, 0, 2);
        world.setBlock(i + 2, j + 13, k + 9, MTJT.smiteLeaves.blockID, 0, 2);
        world.setBlock(i + 2, j + 13, k + 8, MTJT.smiteLog.blockID, 0, 2);
        world.setBlock(i + 2, j + 13, k + 7, MTJT.smiteLeaves.blockID, 0, 2);
        world.setBlock(i + 2, j + 13, k + 3, MTJT.smiteLeaves.blockID, 0, 2);
        world.setBlock(i + 3, j + 13, k + 9, MTJT.smiteLeaves.blockID, 0, 2);
        world.setBlock(i + 3, j + 13, k + 8, MTJT.smiteLeaves.blockID, 0, 2);
        world.setBlock(i + 3, j + 13, k + 5, MTJT.smiteLeaves.blockID, 0, 2);
        world.setBlock(i + 3, j + 13, k + 4, MTJT.smiteLog.blockID, 0, 2);
        world.setBlock(i + 3, j + 13, k + 3, MTJT.smiteLog.blockID, 0, 2);
        world.setBlock(i + 3, j + 13, k + 2, MTJT.smiteLeaves.blockID, 0, 2);
        world.setBlock(i + 3, j + 13, k + 1, MTJT.smiteLeaves.blockID, 0, 2);
        world.setBlock(i + 3, j + 13, k + 0, MTJT.smiteLeaves.blockID, 0, 2);
        world.setBlock(i + 4, j + 13, k + 3, MTJT.smiteLeaves.blockID, 0, 2);
        world.setBlock(i + 2, j + 14, k + 8, MTJT.smiteLog.blockID, 0, 2);
        world.setBlock(i + 3, j + 14, k + 5, MTJT.smiteLeaves.blockID, 0, 2);
        world.setBlock(i + 3, j + 14, k + 3, MTJT.smiteLog.blockID, 0, 2);
        world.setBlock(i + 4, j + 14, k + 3, MTJT.smiteLeaves.blockID, 0, 2);
        world.setBlock(i + 5, j + 14, k + 3, MTJT.smiteLeaves.blockID, 0, 2);
        world.setBlock(i + 1, j + 15, k + 8, MTJT.smiteLeaves.blockID, 0, 2);
        world.setBlock(i + 1, j + 15, k + 3, MTJT.smiteLeaves.blockID, 0, 2);
        world.setBlock(i + 2, j + 15, k + 9, MTJT.smiteLeaves.blockID, 0, 2);
        world.setBlock(i + 2, j + 15, k + 8, MTJT.smiteLog.blockID, 0, 2);
        world.setBlock(i + 2, j + 15, k + 7, MTJT.smiteLeaves.blockID, 0, 2);
        world.setBlock(i + 2, j + 15, k + 4, MTJT.smiteLeaves.blockID, 0, 2);
        world.setBlock(i + 2, j + 15, k + 3, MTJT.smiteLeaves.blockID, 0, 2);
        world.setBlock(i + 2, j + 15, k + 2, MTJT.smiteLeaves.blockID, 0, 2);
        world.setBlock(i + 3, j + 15, k + 8, MTJT.smiteLeaves.blockID, 0, 2);
        world.setBlock(i + 3, j + 15, k + 5, MTJT.smiteLeaves.blockID, 0, 2);
        world.setBlock(i + 3, j + 15, k + 4, MTJT.smiteLeaves.blockID, 0, 2);
        world.setBlock(i + 3, j + 15, k + 3, MTJT.smiteLog.blockID, 0, 2);
        world.setBlock(i + 3, j + 15, k + 2, MTJT.smiteLeaves.blockID, 0, 2);
        world.setBlock(i + 3, j + 15, k + 1, MTJT.smiteLeaves.blockID, 0, 2);
        world.setBlock(i + 3, j + 15, k + 0, MTJT.smiteLeaves.blockID, 0, 2);
        world.setBlock(i + 4, j + 15, k + 3, MTJT.smiteLeaves.blockID, 0, 2);
        world.setBlock(i + 2, j + 16, k + 8, MTJT.smiteLeaves.blockID, 0, 2);
        world.setBlock(i + 3, j + 16, k + 3, MTJT.smiteLog.blockID, 0, 2);
        world.setBlock(i + 2, j + 17, k + 9, MTJT.smiteLeaves.blockID, 0, 2);
        world.setBlock(i + 2, j + 17, k + 8, MTJT.smiteLeaves.blockID, 0, 2);
        world.setBlock(i + 2, j + 17, k + 7, MTJT.smiteLeaves.blockID, 0, 2);
        world.setBlock(i + 2, j + 17, k + 3, MTJT.smiteLeaves.blockID, 0, 2);
        world.setBlock(i + 3, j + 17, k + 8, MTJT.smiteLeaves.blockID, 0, 2);
        world.setBlock(i + 3, j + 17, k + 4, MTJT.smiteLeaves.blockID, 0, 2);
        world.setBlock(i + 3, j + 17, k + 3, MTJT.smiteLog.blockID, 0, 2);
        world.setBlock(i + 3, j + 17, k + 2, MTJT.smiteLeaves.blockID, 0, 2);
        world.setBlock(i + 4, j + 17, k + 3, MTJT.smiteLeaves.blockID, 0, 2);
        world.setBlock(i + 0, j + 18, k + 3, MTJT.smiteLeaves.blockID, 0, 2);
        world.setBlock(i + 1, j + 18, k + 3, MTJT.smiteLeaves.blockID, 0, 2);
        world.setBlock(i + 2, j + 18, k + 8, MTJT.smiteLeaves.blockID, 0, 2);
        world.setBlock(i + 2, j + 18, k + 4, MTJT.smiteLeaves.blockID, 0, 2);
        world.setBlock(i + 2, j + 18, k + 3, MTJT.smiteLeaves.blockID, 0, 2);
        world.setBlock(i + 2, j + 18, k + 2, MTJT.smiteLeaves.blockID, 0, 2);
        world.setBlock(i + 3, j + 18, k + 5, MTJT.smiteLeaves.blockID, 0, 2);
        world.setBlock(i + 3, j + 18, k + 4, MTJT.smiteLeaves.blockID, 0, 2);
        world.setBlock(i + 3, j + 18, k + 3, MTJT.smiteLog.blockID, 0, 2);
        world.setBlock(i + 3, j + 18, k + 2, MTJT.smiteLeaves.blockID, 0, 2);
        world.setBlock(i + 3, j + 18, k + 1, MTJT.smiteLeaves.blockID, 0, 2);
        world.setBlock(i + 3, j + 18, k + 0, MTJT.smiteLeaves.blockID, 0, 2);
        world.setBlock(i + 4, j + 18, k + 4, MTJT.smiteLeaves.blockID, 0, 2);
        world.setBlock(i + 4, j + 18, k + 3, MTJT.smiteLeaves.blockID, 0, 2);
        world.setBlock(i + 4, j + 18, k + 2, MTJT.smiteLeaves.blockID, 0, 2);
        world.setBlock(i + 5, j + 18, k + 3, MTJT.smiteLeaves.blockID, 0, 2);
        world.setBlock(i + 3, j + 19, k + 3, MTJT.smiteLeaves.blockID, 0, 2);

        return true;
    }
}