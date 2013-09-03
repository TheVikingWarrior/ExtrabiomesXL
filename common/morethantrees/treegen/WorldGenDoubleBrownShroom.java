package morethantrees.treegen;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

public class WorldGenDoubleBrownShroom extends WorldGenerator
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
    	world.setBlock(i + 5, j + 0, k + 5, 100, 0, 2);
        world.setBlock(i + 5, j + 1, k + 5, 100, 0, 2);
        world.setBlock(i + 5, j + 2, k + 5, 100, 0, 2);
        world.setBlock(i + 5, j + 3, k + 5, 100, 0, 2);
        world.setBlock(i + 5, j + 4, k + 6, 100, 0, 2);
        world.setBlock(i + 5, j + 4, k + 5, 100, 0, 2);
        world.setBlock(i + 5, j + 5, k + 7, 100, 0, 2);
        world.setBlock(i + 5, j + 5, k + 5, 100, 0, 2);
        world.setBlock(i + 5, j + 6, k + 8, 100, 0, 2);
        world.setBlock(i + 5, j + 6, k + 5, 100, 0, 2);
        world.setBlock(i + 5, j + 7, k + 9, 100, 0, 2);
        world.setBlock(i + 5, j + 7, k + 5, 100, 0, 2);
        world.setBlock(i + 2, j + 8, k + 10, 100, 0, 2);
        world.setBlock(i + 2, j + 8, k + 9, 100, 0, 2);
        world.setBlock(i + 2, j + 8, k + 8, 100, 0, 2);
        world.setBlock(i + 3, j + 8, k + 11, 100, 0, 2);
        world.setBlock(i + 3, j + 8, k + 7, 100, 0, 2);
        world.setBlock(i + 4, j + 8, k + 12, 100, 0, 2);
        world.setBlock(i + 4, j + 8, k + 6, 100, 0, 2);
        world.setBlock(i + 5, j + 8, k + 12, 100, 0, 2);
        world.setBlock(i + 5, j + 8, k + 9, 100, 0, 2);
        world.setBlock(i + 5, j + 8, k + 6, 100, 0, 2);
        world.setBlock(i + 5, j + 8, k + 5, 100, 0, 2);
        world.setBlock(i + 6, j + 8, k + 12, 100, 0, 2);
        world.setBlock(i + 6, j + 8, k + 6, 100, 0, 2);
        world.setBlock(i + 7, j + 8, k + 11, 100, 0, 2);
        world.setBlock(i + 7, j + 8, k + 7, 100, 0, 2);
        world.setBlock(i + 8, j + 8, k + 10, 100, 0, 2);
        world.setBlock(i + 8, j + 8, k + 9, 100, 0, 2);
        world.setBlock(i + 8, j + 8, k + 8, 100, 0, 2);
        world.setBlock(i + 3, j + 9, k + 10, 100, 0, 2);
        world.setBlock(i + 3, j + 9, k + 9, 100, 0, 2);
        world.setBlock(i + 3, j + 9, k + 8, 100, 0, 2);
        world.setBlock(i + 4, j + 9, k + 11, 100, 0, 2);
        world.setBlock(i + 4, j + 9, k + 10, 100, 0, 2);
        world.setBlock(i + 4, j + 9, k + 9, 100, 0, 2);
        world.setBlock(i + 4, j + 9, k + 8, 100, 0, 2);
        world.setBlock(i + 4, j + 9, k + 7, 100, 0, 2);
        world.setBlock(i + 5, j + 9, k + 11, 100, 0, 2);
        world.setBlock(i + 5, j + 9, k + 10, 100, 0, 2);
        world.setBlock(i + 5, j + 9, k + 9, 100, 0, 2);
        world.setBlock(i + 5, j + 9, k + 8, 100, 0, 2);
        world.setBlock(i + 5, j + 9, k + 7, 100, 0, 2);
        world.setBlock(i + 5, j + 9, k + 5, 100, 0, 2);
        world.setBlock(i + 6, j + 9, k + 11, 100, 0, 2);
        world.setBlock(i + 6, j + 9, k + 10, 100, 0, 2);
        world.setBlock(i + 6, j + 9, k + 9, 100, 0, 2);
        world.setBlock(i + 6, j + 9, k + 8, 100, 0, 2);
        world.setBlock(i + 6, j + 9, k + 7, 100, 0, 2);
        world.setBlock(i + 7, j + 9, k + 10, 100, 0, 2);
        world.setBlock(i + 7, j + 9, k + 9, 100, 0, 2);
        world.setBlock(i + 7, j + 9, k + 8, 100, 0, 2);
        world.setBlock(i + 5, j + 10, k + 5, 100, 0, 2);
        world.setBlock(i + 5, j + 11, k + 5, 100, 0, 2);
        world.setBlock(i + 5, j + 12, k + 5, 100, 0, 2);
        world.setBlock(i + 5, j + 13, k + 5, 100, 0, 2);
        world.setBlock(i + 5, j + 14, k + 5, 100, 0, 2);
        world.setBlock(i + 5, j + 15, k + 5, 100, 0, 2);
        world.setBlock(i + 5, j + 16, k + 5, 100, 0, 2);
        world.setBlock(i + 5, j + 17, k + 5, 100, 0, 2);
        world.setBlock(i + 5, j + 18, k + 5, 100, 0, 2);
        world.setBlock(i + 0, j + 19, k + 7, 100, 0, 2);
        world.setBlock(i + 0, j + 19, k + 6, 100, 0, 2);
        world.setBlock(i + 0, j + 19, k + 5, 100, 0, 2);
        world.setBlock(i + 0, j + 19, k + 4, 100, 0, 2);
        world.setBlock(i + 0, j + 19, k + 3, 100, 0, 2);
        world.setBlock(i + 1, j + 19, k + 8, 100, 0, 2);
        world.setBlock(i + 1, j + 19, k + 2, 100, 0, 2);
        world.setBlock(i + 2, j + 19, k + 9, 100, 0, 2);
        world.setBlock(i + 2, j + 19, k + 1, 100, 0, 2);
        world.setBlock(i + 3, j + 19, k + 10, 100, 0, 2);
        world.setBlock(i + 3, j + 19, k + 0, 100, 0, 2);
        world.setBlock(i + 4, j + 19, k + 10, 100, 0, 2);
        world.setBlock(i + 4, j + 19, k + 0, 100, 0, 2);
        world.setBlock(i + 5, j + 19, k + 10, 100, 0, 2);
        world.setBlock(i + 5, j + 19, k + 5, 100, 0, 2);
        world.setBlock(i + 5, j + 19, k + 0, 100, 0, 2);
        world.setBlock(i + 6, j + 19, k + 10, 100, 0, 2);
        world.setBlock(i + 6, j + 19, k + 0, 100, 0, 2);
        world.setBlock(i + 7, j + 19, k + 10, 100, 0, 2);
        world.setBlock(i + 7, j + 19, k + 0, 100, 0, 2);
        world.setBlock(i + 8, j + 19, k + 9, 100, 0, 2);
        world.setBlock(i + 8, j + 19, k + 1, 100, 0, 2);
        world.setBlock(i + 9, j + 19, k + 8, 100, 0, 2);
        world.setBlock(i + 9, j + 19, k + 2, 100, 0, 2);
        world.setBlock(i + 10, j + 19, k + 7, 100, 0, 2);
        world.setBlock(i + 10, j + 19, k + 6, 100, 0, 2);
        world.setBlock(i + 10, j + 19, k + 5, 100, 0, 2);
        world.setBlock(i + 10, j + 19, k + 4, 100, 0, 2);
        world.setBlock(i + 10, j + 19, k + 3, 100, 0, 2);
        world.setBlock(i + 1, j + 20, k + 7, 100, 0, 2);
        world.setBlock(i + 1, j + 20, k + 6, 100, 0, 2);
        world.setBlock(i + 1, j + 20, k + 5, 100, 0, 2);
        world.setBlock(i + 1, j + 20, k + 4, 100, 0, 2);
        world.setBlock(i + 1, j + 20, k + 3, 100, 0, 2);
        world.setBlock(i + 2, j + 20, k + 8, 100, 0, 2);
        world.setBlock(i + 2, j + 20, k + 2, 100, 0, 2);
        world.setBlock(i + 3, j + 20, k + 9, 100, 0, 2);
        world.setBlock(i + 3, j + 20, k + 1, 100, 0, 2);
        world.setBlock(i + 4, j + 20, k + 9, 100, 0, 2);
        world.setBlock(i + 4, j + 20, k + 1, 100, 0, 2);
        world.setBlock(i + 5, j + 20, k + 9, 100, 0, 2);
        world.setBlock(i + 5, j + 20, k + 5, 100, 0, 2);
        world.setBlock(i + 5, j + 20, k + 1, 100, 0, 2);
        world.setBlock(i + 6, j + 20, k + 9, 100, 0, 2);
        world.setBlock(i + 6, j + 20, k + 1, 100, 0, 2);
        world.setBlock(i + 7, j + 20, k + 9, 100, 0, 2);
        world.setBlock(i + 7, j + 20, k + 1, 100, 0, 2);
        world.setBlock(i + 8, j + 20, k + 8, 100, 0, 2);
        world.setBlock(i + 8, j + 20, k + 2, 100, 0, 2);
        world.setBlock(i + 9, j + 20, k + 7, 100, 0, 2);
        world.setBlock(i + 9, j + 20, k + 6, 100, 0, 2);
        world.setBlock(i + 9, j + 20, k + 5, 100, 0, 2);
        world.setBlock(i + 9, j + 20, k + 4, 100, 0, 2);
        world.setBlock(i + 9, j + 20, k + 3, 100, 0, 2);
        world.setBlock(i + 2, j + 21, k + 7, 100, 0, 2);
        world.setBlock(i + 2, j + 21, k + 6, 100, 0, 2);
        world.setBlock(i + 2, j + 21, k + 5, 100, 0, 2);
        world.setBlock(i + 2, j + 21, k + 4, 100, 0, 2);
        world.setBlock(i + 2, j + 21, k + 3, 100, 0, 2);
        world.setBlock(i + 3, j + 21, k + 8, 100, 0, 2);
        world.setBlock(i + 3, j + 21, k + 7, 100, 0, 2);
        world.setBlock(i + 3, j + 21, k + 6, 100, 0, 2);
        world.setBlock(i + 3, j + 21, k + 5, 100, 0, 2);
        world.setBlock(i + 3, j + 21, k + 4, 100, 0, 2);
        world.setBlock(i + 3, j + 21, k + 3, 100, 0, 2);
        world.setBlock(i + 3, j + 21, k + 2, 100, 0, 2);
        world.setBlock(i + 4, j + 21, k + 8, 100, 0, 2);
        world.setBlock(i + 4, j + 21, k + 7, 100, 0, 2);
        world.setBlock(i + 4, j + 21, k + 6, 100, 0, 2);
        world.setBlock(i + 4, j + 21, k + 5, 100, 0, 2);
        world.setBlock(i + 4, j + 21, k + 4, 100, 0, 2);
        world.setBlock(i + 4, j + 21, k + 3, 100, 0, 2);
        world.setBlock(i + 4, j + 21, k + 2, 100, 0, 2);
        world.setBlock(i + 5, j + 21, k + 8, 100, 0, 2);
        world.setBlock(i + 5, j + 21, k + 7, 100, 0, 2);
        world.setBlock(i + 5, j + 21, k + 6, 100, 0, 2);
        world.setBlock(i + 5, j + 21, k + 5, 100, 0, 2);
        world.setBlock(i + 5, j + 21, k + 4, 100, 0, 2);
        world.setBlock(i + 5, j + 21, k + 3, 100, 0, 2);
        world.setBlock(i + 5, j + 21, k + 2, 100, 0, 2);
        world.setBlock(i + 6, j + 21, k + 8, 100, 0, 2);
        world.setBlock(i + 6, j + 21, k + 7, 100, 0, 2);
        world.setBlock(i + 6, j + 21, k + 6, 100, 0, 2);
        world.setBlock(i + 6, j + 21, k + 5, 100, 0, 2);
        world.setBlock(i + 6, j + 21, k + 4, 100, 0, 2);
        world.setBlock(i + 6, j + 21, k + 3, 100, 0, 2);
        world.setBlock(i + 6, j + 21, k + 2, 100, 0, 2);
        world.setBlock(i + 7, j + 21, k + 8, 100, 0, 2);
        world.setBlock(i + 7, j + 21, k + 7, 100, 0, 2);
        world.setBlock(i + 7, j + 21, k + 6, 100, 0, 2);
        world.setBlock(i + 7, j + 21, k + 5, 100, 0, 2);
        world.setBlock(i + 7, j + 21, k + 4, 100, 0, 2);
        world.setBlock(i + 7, j + 21, k + 3, 100, 0, 2);
        world.setBlock(i + 7, j + 21, k + 2, 100, 0, 2);
        world.setBlock(i + 8, j + 21, k + 7, 100, 0, 2);
        world.setBlock(i + 8, j + 21, k + 6, 100, 0, 2);
        world.setBlock(i + 8, j + 21, k + 5, 100, 0, 2);
        world.setBlock(i + 8, j + 21, k + 4, 100, 0, 2);
        world.setBlock(i + 8, j + 21, k + 3, 100, 0, 2);

return true;
}
}
