package morethantrees.treegen;

import java.util.Random;

import morethantrees.MTJT;
import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

public class WorldGenRedwoodTrees extends WorldGenerator
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
        world.setBlock(i + 3, j + -1, k + 3, Block.dirt.blockID);// keep this
        world.setBlock(i + 3, j + 0, k + 3, MTJT.redwoodLog.blockID);///This sets what your tree will look like
        world.setBlock(i + 3, j + 1, k + 3, MTJT.redwoodLog.blockID);// You should make your own version
        world.setBlock(i + 3, j + 2, k + 3, MTJT.redwoodLog.blockID);
        world.setBlock(i + 3, j + 3, k + 3, MTJT.redwoodLog.blockID);
        world.setBlock(i + 3, j + 4, k + 3, MTJT.redwoodLog.blockID);
        world.setBlock(i + 3, j + 5, k + 3, MTJT.redwoodLog.blockID);
        world.setBlock(i + 3, j + 6, k + 3, MTJT.redwoodLog.blockID);
        world.setBlock(i + 2, j + 6, k + 3, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 3, j + 6, k + 3, MTJT.redwoodLog.blockID);
        world.setBlock(i + 4, j + 6, k + 3, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 3, j + 7, k + 3, MTJT.redwoodLog.blockID);
        world.setBlock(i + 1, j + 7, k + 4, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 1, j + 7, k + 3, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 2, j + 7, k + 4, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 2, j + 7, k + 3, MTJT.redwoodLog.blockID);
        world.setBlock(i + 2, j + 7, k + 2, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 3, j + 7, k + 4, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 3, j + 7, k + 3, MTJT.redwoodLog.blockID);
        world.setBlock(i + 4, j + 7, k + 4, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 4, j + 7, k + 3, MTJT.redwoodLog.blockID);
        world.setBlock(i + 4, j + 7, k + 2, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 5, j + 7, k + 3, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 3, j + 8, k + 3, MTJT.redwoodLog.blockID);
        world.setBlock(i + 0, j + 8, k + 5, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 1, j + 8, k + 6, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 1, j + 8, k + 5, MTJT.redwoodLog.blockID);
        world.setBlock(i + 1, j + 8, k + 4, MTJT.redwoodLog.blockID);
        world.setBlock(i + 1, j + 8, k + 3, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 2, j + 8, k + 5, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 2, j + 8, k + 4, MTJT.redwoodLog.blockID);
        world.setBlock(i + 2, j + 8, k + 3, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 2, j + 8, k + 2, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 3, j + 8, k + 5, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 3, j + 8, k + 4, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 3, j + 8, k + 3, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 3, j + 8, k + 2, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 3, j + 8, k + 1, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 4, j + 8, k + 5, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 4, j + 8, k + 4, MTJT.redwoodLog.blockID);
        world.setBlock(i + 4, j + 8, k + 3, MTJT.redwoodLog.blockID);
        world.setBlock(i + 4, j + 8, k + 2, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 5, j + 8, k + 5, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 5, j + 8, k + 4, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 5, j + 8, k + 3, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 5, j + 8, k + 2, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 3, j + 9, k + 3, MTJT.redwoodLog.blockID);
        world.setBlock(i + 0, j + 9, k + 6, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 0, j + 9, k + 2, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 1, j + 9, k + 7, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 1, j + 9, k + 6, MTJT.redwoodLog.blockID);
        world.setBlock(i + 1, j + 9, k + 5, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 1, j + 9, k + 4, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 1, j + 9, k + 3, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 1, j + 9, k + 2, MTJT.redwoodLog.blockID);
        world.setBlock(i + 1, j + 9, k + 1, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 2, j + 9, k + 6, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 2, j + 9, k + 5, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 2, j + 9, k + 4, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 2, j + 9, k + 3, MTJT.redwoodLog.blockID);
        world.setBlock(i + 2, j + 9, k + 2, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 3, j + 9, k + 4, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 3, j + 9, k + 2, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 3, j + 9, k + 1, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 4, j + 9, k + 5, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 4, j + 9, k + 4, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 4, j + 9, k + 3, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 4, j + 9, k + 2, MTJT.redwoodLog.blockID);
        world.setBlock(i + 4, j + 9, k + 1, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 5, j + 9, k + 6, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 5, j + 9, k + 5, MTJT.redwoodLog.blockID);
        world.setBlock(i + 5, j + 9, k + 4, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 5, j + 9, k + 3, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 5, j + 9, k + 2, MTJT.redwoodLog.blockID);
        world.setBlock(i + 5, j + 9, k + 1, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 6, j + 9, k + 5, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 6, j + 9, k + 2, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 3, j + 10, k + 3, MTJT.redwoodLog.blockID);
        world.setBlock(i + 0, j + 10, k + 7, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 0, j + 10, k + 6, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 0, j + 10, k + 3, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 0, j + 10, k + 2, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 0, j + 10, k + 1, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 1, j + 10, k + 6, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 1, j + 10, k + 3, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 1, j + 10, k + 2, MTJT.redwoodLog.blockID);
        world.setBlock(i + 1, j + 10, k + 1, MTJT.redwoodLog.blockID);
        world.setBlock(i + 1, j + 10, k + 0, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 2, j + 10, k + 3, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 2, j + 10, k + 2, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 3, j + 10, k + 3, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 4, j + 10, k + 2, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 5, j + 10, k + 5, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 5, j + 10, k + 4, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 5, j + 10, k + 2, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 5, j + 10, k + 1, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 6, j + 10, k + 6, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 6, j + 10, k + 5, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 6, j + 10, k + 4, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 6, j + 10, k + 1, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 1, j + 11, k + 2, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 1, j + 11, k + 2, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 1, j + 11, k + 1, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 6, j + 11, k + 6, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 3, j + 11, k + 3, MTJT.redwoodLog.blockID);
        world.setBlock(i + 3, j + 12, k + 3, MTJT.redwoodLog.blockID);///This sets what your tree will look like
        world.setBlock(i + 3, j + 13, k + 3, MTJT.redwoodLog.blockID);// You should make your own version
        world.setBlock(i + 3, j + 14, k + 3, MTJT.redwoodLog.blockID);
        world.setBlock(i + 3, j + 15, k + 3, MTJT.redwoodLog.blockID);
        world.setBlock(i + 3, j + 16, k + 3, MTJT.redwoodLog.blockID);
        world.setBlock(i + 3, j + 17, k + 3, MTJT.redwoodLog.blockID);
        world.setBlock(i + 2, j + 18, k + 3, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 3, j + 18, k + 3, MTJT.redwoodLog.blockID);
        world.setBlock(i + 4, j + 18, k + 3, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 1, j + 19, k + 4, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 1, j + 19, k + 3, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 2, j + 19, k + 4, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 2, j + 19, k + 3, MTJT.redwoodLog.blockID);
        world.setBlock(i + 2, j + 19, k + 2, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 3, j + 19, k + 4, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 3, j + 19, k + 3, MTJT.redwoodLog.blockID);
        world.setBlock(i + 4, j + 19, k + 4, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 4, j + 19, k + 3, MTJT.redwoodLog.blockID);
        world.setBlock(i + 4, j + 19, k + 2, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 5, j + 19, k + 3, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 0, j + 20, k + 5, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 1, j + 20, k + 6, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 1, j + 20, k + 5, MTJT.redwoodLog.blockID);
        world.setBlock(i + 1, j + 20, k + 4, MTJT.redwoodLog.blockID);
        world.setBlock(i + 1, j + 20, k + 3, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 2, j + 20, k + 5, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 2, j + 20, k + 4, MTJT.redwoodLog.blockID);
        world.setBlock(i + 2, j + 20, k + 3, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 2, j + 20, k + 2, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 3, j + 20, k + 5, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 3, j + 20, k + 4, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 3, j + 20, k + 3, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 3, j + 20, k + 2, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 3, j + 20, k + 1, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 4, j + 20, k + 5, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 4, j + 20, k + 4, MTJT.redwoodLog.blockID);
        world.setBlock(i + 4, j + 20, k + 3, MTJT.redwoodLog.blockID);
        world.setBlock(i + 4, j + 20, k + 2, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 5, j + 20, k + 5, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 5, j + 20, k + 4, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 5, j + 20, k + 3, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 5, j + 20, k + 2, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 3, j + 21, k + 3, MTJT.redwoodLog.blockID);
        world.setBlock(i + 0, j + 21, k + 6, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 0, j + 21, k + 2, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 1, j + 21, k + 7, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 1, j + 21, k + 6, MTJT.redwoodLog.blockID);
        world.setBlock(i + 1, j + 21, k + 5, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 1, j + 21, k + 4, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 1, j + 21, k + 3, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 1, j + 21, k + 2, MTJT.redwoodLog.blockID);
        world.setBlock(i + 1, j + 21, k + 1, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 2, j + 21, k + 6, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 2, j + 21, k + 5, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 2, j + 21, k + 4, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 2, j + 21, k + 3, MTJT.redwoodLog.blockID);
        world.setBlock(i + 2, j + 21, k + 2, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 3, j + 21, k + 4, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 3, j + 21, k + 2, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 3, j + 21, k + 1, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 4, j + 21, k + 5, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 4, j + 21, k + 4, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 4, j + 21, k + 3, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 4, j + 21, k + 2, MTJT.redwoodLog.blockID);
        world.setBlock(i + 4, j + 21, k + 1, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 5, j + 21, k + 6, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 5, j + 21, k + 5, MTJT.redwoodLog.blockID);
        world.setBlock(i + 5, j + 21, k + 4, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 5, j + 21, k + 3, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 5, j + 21, k + 2, MTJT.redwoodLog.blockID);
        world.setBlock(i + 5, j + 21, k + 1, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 6, j + 21, k + 5, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 6, j + 21, k + 2, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 3, j + 22, k + 3, MTJT.redwoodLog.blockID);
        world.setBlock(i + 0, j + 22, k + 7, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 0, j + 22, k + 6, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 0, j + 22, k + 3, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 0, j + 22, k + 2, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 0, j + 22, k + 1, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 1, j + 22, k + 6, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 1, j + 22, k + 3, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 1, j + 22, k + 2, MTJT.redwoodLog.blockID);
        world.setBlock(i + 1, j + 22, k + 1, MTJT.redwoodLog.blockID);
        world.setBlock(i + 1, j + 22, k + 0, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 2, j + 22, k + 3, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 2, j + 22, k + 2, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 3, j + 22, k + 3, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 4, j + 22, k + 2, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 5, j + 22, k + 5, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 5, j + 22, k + 4, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 5, j + 22, k + 2, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 5, j + 22, k + 1, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 6, j + 22, k + 6, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 6, j + 22, k + 5, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 6, j + 22, k + 4, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 6, j + 22, k + 1, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 3, j + 23, k + 3, MTJT.redwoodLog.blockID);
        world.setBlock(i + 1, j + 23, k + 2, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 1, j + 23, k + 1, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 6, j + 23, k + 6, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 3, j + 24, k + 3, MTJT.redwoodLog.blockID);// keep this
        world.setBlock(i + 3, j + 25, k + 3, MTJT.redwoodLog.blockID);///This sets what your tree will look like
        world.setBlock(i + 3, j + 26, k + 3, MTJT.redwoodLog.blockID);// You should make your own version
        world.setBlock(i + 3, j + 27, k + 3, MTJT.redwoodLog.blockID);
        world.setBlock(i + 3, j + 28, k + 3, MTJT.redwoodLog.blockID);
        world.setBlock(i + 3, j + 29, k + 3, MTJT.redwoodLog.blockID);
        world.setBlock(i + 3, j + 30, k + 3, MTJT.redwoodLog.blockID);
        world.setBlock(i + 3, j + 31, k + 3, MTJT.redwoodLog.blockID);
        world.setBlock(i + 2, j + 32, k + 3, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 3, j + 32, k + 3, MTJT.redwoodLog.blockID);
        world.setBlock(i + 4, j + 32, k + 3, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 3, j + 33, k + 3, MTJT.redwoodLog.blockID);
        world.setBlock(i + 1, j + 33, k + 4, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 1, j + 33, k + 3, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 2, j + 33, k + 4, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 2, j + 33, k + 3, MTJT.redwoodLog.blockID);
        world.setBlock(i + 2, j + 33, k + 2, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 3, j + 33, k + 4, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 3, j + 33, k + 3, MTJT.redwoodLog.blockID);
        world.setBlock(i + 4, j + 33, k + 4, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 4, j + 33, k + 3, MTJT.redwoodLog.blockID);
        world.setBlock(i + 4, j + 33, k + 2, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 5, j + 33, k + 3, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 3, j + 34, k + 3, MTJT.redwoodLog.blockID);
        world.setBlock(i + 0, j + 34, k + 5, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 1, j + 34, k + 6, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 1, j + 34, k + 5, MTJT.redwoodLog.blockID);
        world.setBlock(i + 1, j + 34, k + 4, MTJT.redwoodLog.blockID);
        world.setBlock(i + 1, j + 34, k + 3, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 2, j + 34, k + 5, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 2, j + 34, k + 4, MTJT.redwoodLog.blockID);
        world.setBlock(i + 2, j + 34, k + 3, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 2, j + 34, k + 2, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 3, j + 34, k + 5, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 3, j + 34, k + 4, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 3, j + 34, k + 3, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 3, j + 34, k + 2, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 3, j + 34, k + 1, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 4, j + 34, k + 5, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 4, j + 34, k + 4, MTJT.redwoodLog.blockID);
        world.setBlock(i + 4, j + 34, k + 3, MTJT.redwoodLog.blockID);
        world.setBlock(i + 4, j + 34, k + 2, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 5, j + 34, k + 5, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 5, j + 34, k + 4, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 5, j + 34, k + 3, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 5, j + 34, k + 2, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 3, j + 35, k + 3, MTJT.redwoodLog.blockID);
        world.setBlock(i + 0, j + 35, k + 6, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 0, j + 35, k + 2, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 1, j + 35, k + 7, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 1, j + 35, k + 6, MTJT.redwoodLog.blockID);
        world.setBlock(i + 1, j + 35, k + 5, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 1, j + 35, k + 4, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 1, j + 35, k + 3, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 1, j + 35, k + 2, MTJT.redwoodLog.blockID);
        world.setBlock(i + 1, j + 35, k + 1, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 2, j + 35, k + 6, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 2, j + 35, k + 5, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 2, j + 35, k + 4, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 2, j + 35, k + 3, MTJT.redwoodLog.blockID);
        world.setBlock(i + 2, j + 35, k + 2, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 3, j + 35, k + 4, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 3, j + 35, k + 2, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 3, j + 35, k + 1, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 4, j + 35, k + 5, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 4, j + 35, k + 4, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 4, j + 35, k + 3, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 4, j + 35, k + 2, MTJT.redwoodLog.blockID);
        world.setBlock(i + 4, j + 35, k + 1, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 5, j + 35, k + 6, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 5, j + 35, k + 5, MTJT.redwoodLog.blockID);
        world.setBlock(i + 5, j + 35, k + 4, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 5, j + 35, k + 3, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 5, j + 35, k + 2, MTJT.redwoodLog.blockID);
        world.setBlock(i + 5, j + 35, k + 1, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 6, j + 35, k + 5, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 6, j + 35, k + 2, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 3, j + 36, k + 3, MTJT.redwoodLog.blockID);
        world.setBlock(i + 0, j + 36, k + 7, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 0, j + 36, k + 6, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 0, j + 36, k + 3, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 0, j + 36, k + 2, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 0, j + 36, k + 1, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 1, j + 36, k + 6, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 1, j + 36, k + 3, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 1, j + 36, k + 2, MTJT.redwoodLog.blockID);
        world.setBlock(i + 1, j + 36, k + 1, MTJT.redwoodLog.blockID);
        world.setBlock(i + 1, j + 36, k + 0, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 2, j + 36, k + 3, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 2, j + 36, k + 2, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 3, j + 36, k + 3, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 4, j + 36, k + 2, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 5, j + 36, k + 5, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 5, j + 36, k + 4, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 5, j + 36, k + 2, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 5, j + 36, k + 1, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 6, j + 36, k + 6, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 6, j + 36, k + 5, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 6, j + 36, k + 4, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 6, j + 36, k + 1, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 1, j + 37, k + 2, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 1, j + 37, k + 2, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 1, j + 37, k + 1, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 6, j + 37, k + 6, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 3, j + 37, k + 3, MTJT.redwoodLog.blockID);
        world.setBlock(i + 3, j + 38, k + 3, MTJT.redwoodLog.blockID);///This sets what your tree will look like
        world.setBlock(i + 3, j + 39, k + 3, MTJT.redwoodLog.blockID);// You should make your own version
        world.setBlock(i + 3, j + 40, k + 3, MTJT.redwoodLog.blockID);
        world.setBlock(i + 3, j + 41, k + 3, MTJT.redwoodLog.blockID);
        world.setBlock(i + 3, j + 42, k + 3, MTJT.redwoodLog.blockID);
        world.setBlock(i + 3, j + 43, k + 3, MTJT.redwoodLog.blockID);
        world.setBlock(i + 2, j + 44, k + 3, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 3, j + 44, k + 3, MTJT.redwoodLog.blockID);
        world.setBlock(i + 4, j + 44, k + 3, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 1, j + 45, k + 4, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 1, j + 45, k + 3, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 2, j + 45, k + 4, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 2, j + 45, k + 3, MTJT.redwoodLog.blockID);
        world.setBlock(i + 2, j + 45, k + 2, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 3, j + 45, k + 4, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 3, j + 45, k + 3, MTJT.redwoodLog.blockID);
        world.setBlock(i + 4, j + 45, k + 4, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 4, j + 45, k + 3, MTJT.redwoodLog.blockID);
        world.setBlock(i + 4, j + 45, k + 2, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 5, j + 45, k + 3, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 0, j + 46, k + 5, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 1, j + 46, k + 6, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 1, j + 46, k + 5, MTJT.redwoodLog.blockID);
        world.setBlock(i + 1, j + 46, k + 4, MTJT.redwoodLog.blockID);
        world.setBlock(i + 1, j + 46, k + 3, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 2, j + 46, k + 5, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 2, j + 46, k + 4, MTJT.redwoodLog.blockID);
        world.setBlock(i + 2, j + 46, k + 3, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 2, j + 46, k + 2, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 3, j + 46, k + 5, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 3, j + 46, k + 4, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 3, j + 46, k + 3, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 3, j + 46, k + 2, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 3, j + 46, k + 1, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 4, j + 46, k + 5, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 4, j + 46, k + 4, MTJT.redwoodLog.blockID);
        world.setBlock(i + 4, j + 46, k + 3, MTJT.redwoodLog.blockID);
        world.setBlock(i + 4, j + 46, k + 2, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 5, j + 46, k + 5, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 5, j + 46, k + 4, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 5, j + 46, k + 3, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 5, j + 46, k + 2, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 0, j + 47, k + 6, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 0, j + 47, k + 2, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 1, j + 47, k + 7, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 1, j + 47, k + 6, MTJT.redwoodLog.blockID);
        world.setBlock(i + 1, j + 47, k + 5, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 1, j + 47, k + 4, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 1, j + 47, k + 3, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 1, j + 47, k + 2, MTJT.redwoodLog.blockID);
        world.setBlock(i + 1, j + 47, k + 1, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 2, j + 47, k + 6, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 2, j + 47, k + 5, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 2, j + 47, k + 4, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 2, j + 47, k + 3, MTJT.redwoodLog.blockID);
        world.setBlock(i + 2, j + 47, k + 2, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 3, j + 47, k + 4, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 3, j + 47, k + 2, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 3, j + 47, k + 1, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 4, j + 47, k + 5, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 4, j + 47, k + 4, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 4, j + 47, k + 3, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 4, j + 47, k + 2, MTJT.redwoodLog.blockID);
        world.setBlock(i + 4, j + 47, k + 1, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 5, j + 47, k + 6, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 5, j + 47, k + 5, MTJT.redwoodLog.blockID);
        world.setBlock(i + 5, j + 47, k + 4, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 5, j + 47, k + 3, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 5, j + 47, k + 2, MTJT.redwoodLog.blockID);
        world.setBlock(i + 5, j + 47, k + 1, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 6, j + 47, k + 5, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 6, j + 47, k + 2, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 0, j + 48, k + 7, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 0, j + 48, k + 6, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 0, j + 48, k + 3, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 0, j + 48, k + 2, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 0, j + 48, k + 1, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 1, j + 48, k + 6, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 1, j + 48, k + 3, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 1, j + 48, k + 2, MTJT.redwoodLog.blockID);
        world.setBlock(i + 1, j + 48, k + 1, MTJT.redwoodLog.blockID);
        world.setBlock(i + 1, j + 48, k + 0, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 2, j + 48, k + 3, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 2, j + 48, k + 2, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 3, j + 48, k + 3, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 4, j + 48, k + 2, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 5, j + 48, k + 5, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 5, j + 48, k + 4, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 5, j + 48, k + 2, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 5, j + 48, k + 1, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 6, j + 48, k + 6, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 6, j + 48, k + 5, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 6, j + 48, k + 4, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 6, j + 48, k + 1, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 1, j + 49, k + 2, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 1, j + 49, k + 1, MTJT.redwoodLeaves.blockID);
        world.setBlock(i + 6, j + 49, k + 6, MTJT.redwoodLeaves.blockID);
        return true;
    }
}