package morethantrees.treegen;

import java.util.Random;

import morethantrees.MTJT;
import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

public class WorldGenExplosiveTrees extends WorldGenerator
{
    public boolean generate(World world, Random var2, int i, int j, int k)
    {
        while ((world.isAirBlock(i + 10, j, k + 12)) && (j > 2))
        {
            j--;
        }
        
        int var6 = world.getBlockId(i + 10, j, k + 12);
        
        if (var6 != Block.stone.blockID)
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
        world.setBlock(i + 7, j + 0, k + 6, MTJT.explosiveLog.blockID, 0, 2);
        world.setBlock(i + 7, j + 1, k + 6, MTJT.explosiveLog.blockID, 0, 2);
        world.setBlock(i + 7, j + 2, k + 6, MTJT.explosiveLog.blockID, 0, 2);
        world.setBlock(i + 7, j + 3, k + 6, MTJT.explosiveLog.blockID, 0, 2);
        world.setBlock(i + 7, j + 4, k + 6, MTJT.explosiveLog.blockID, 0, 2);
        world.setBlock(i + 7, j + 5, k + 6, MTJT.explosiveLog.blockID, 0, 2);
        world.setBlock(i + 7, j + 6, k + 6, MTJT.explosiveLog.blockID, 0, 2);
        world.setBlock(i + 7, j + 7, k + 6, MTJT.explosiveLog.blockID, 0, 2);
        world.setBlock(i + 7, j + 8, k + 6, MTJT.explosiveLog.blockID, 0, 2);
        world.setBlock(i + 7, j + 9, k + 6, MTJT.explosiveLog.blockID, 0, 2);
        world.setBlock(i + 7, j + 10, k + 6, MTJT.explosiveLog.blockID, 0, 2);
        world.setBlock(i + 7, j + 11, k + 6, MTJT.explosiveLog.blockID, 0, 2);
        world.setBlock(i + 7, j + 12, k + 6, MTJT.explosiveLog.blockID, 0, 2);
        world.setBlock(i + 5, j + 13, k + 8, MTJT.explosiveLeaves.blockID, 0, 2);
        world.setBlock(i + 7, j + 13, k + 6, MTJT.explosiveLog.blockID, 0, 2);
        world.setBlock(i + 7, j + 13, k + 5, MTJT.explosiveLeaves.blockID, 0, 2);
        world.setBlock(i + 5, j + 14, k + 6, MTJT.explosiveLeaves.blockID, 0, 2);
        world.setBlock(i + 7, j + 14, k + 9, MTJT.explosiveLeaves.blockID, 0, 2);
        world.setBlock(i + 7, j + 14, k + 6, MTJT.explosiveLog.blockID, 0, 2);
        world.setBlock(i + 5, j + 15, k + 8, MTJT.explosiveLeaves.blockID, 0, 2);
        world.setBlock(i + 6, j + 15, k + 8, MTJT.explosiveLeaves.blockID, 0, 2);
        world.setBlock(i + 7, j + 15, k + 7, MTJT.explosiveLeaves.blockID, 0, 2);
        world.setBlock(i + 7, j + 15, k + 6, MTJT.explosiveLog.blockID, 0, 2);
        world.setBlock(i + 7, j + 15, k + 3, MTJT.explosiveLeaves.blockID, 0, 2);
        world.setBlock(i + 8, j + 15, k + 8, MTJT.explosiveLeaves.blockID, 0, 2);
        world.setBlock(i + 8, j + 15, k + 6, MTJT.explosiveLeaves.blockID, 0, 2);
        world.setBlock(i + 10, j + 15, k + 6, MTJT.explosiveLeaves.blockID, 0, 2);
        world.setBlock(i + 3, j + 16, k + 5, MTJT.explosiveLeaves.blockID, 0, 2);
        world.setBlock(i + 3, j + 16, k + 3, MTJT.explosiveLeaves.blockID, 0, 2);
        world.setBlock(i + 4, j + 16, k + 6, MTJT.explosiveLeaves.blockID, 0, 2);
        world.setBlock(i + 6, j + 16, k + 5, MTJT.explosiveLog.blockID, 0, 2);
        world.setBlock(i + 6, j + 16, k + 3, MTJT.explosiveLeaves.blockID, 0, 2);
        world.setBlock(i + 7, j + 16, k + 7, MTJT.explosiveLog.blockID, 0, 2);
        world.setBlock(i + 7, j + 16, k + 6, MTJT.explosiveLeaves.blockID, 0, 2);
        world.setBlock(i + 4, j + 17, k + 5, MTJT.explosiveLeaves.blockID, 0, 2);
        world.setBlock(i + 5, j + 17, k + 7, MTJT.explosiveLeaves.blockID, 0, 2);
        world.setBlock(i + 5, j + 17, k + 5, MTJT.explosiveLeaves.blockID, 0, 2);
        world.setBlock(i + 6, j + 17, k + 9, MTJT.explosiveLeaves.blockID, 0, 2);
        world.setBlock(i + 6, j + 17, k + 5, MTJT.explosiveLog.blockID, 0, 2);
        world.setBlock(i + 7, j + 17, k + 8, MTJT.explosiveLog.blockID, 0, 2);
        world.setBlock(i + 7, j + 17, k + 6, MTJT.explosiveLeaves.blockID, 0, 2);
        world.setBlock(i + 7, j + 17, k + 3, MTJT.explosiveLeaves.blockID, 0, 2);
        world.setBlock(i + 8, j + 17, k + 4, MTJT.explosiveLeaves.blockID, 0, 2);
        world.setBlock(i + 9, j + 17, k + 6, MTJT.explosiveLeaves.blockID, 0, 2);
        world.setBlock(i + 3, j + 18, k + 6, MTJT.explosiveLeaves.blockID, 0, 2);
        world.setBlock(i + 3, j + 18, k + 3, MTJT.explosiveLeaves.blockID, 0, 2);
        world.setBlock(i + 4, j + 18, k + 6, MTJT.explosiveLeaves.blockID, 0, 2);
        world.setBlock(i + 5, j + 18, k + 7, MTJT.explosiveLeaves.blockID, 0, 2);
        world.setBlock(i + 5, j + 18, k + 5, MTJT.explosiveLog.blockID, 0, 2);
        world.setBlock(i + 5, j + 18, k + 4, MTJT.explosiveLeaves.blockID, 0, 2);
        world.setBlock(i + 6, j + 18, k + 9, MTJT.explosiveLog.blockID, 0, 2);
        world.setBlock(i + 6, j + 18, k + 2, MTJT.explosiveLeaves.blockID, 0, 2);
        world.setBlock(i + 7, j + 18, k + 6, MTJT.explosiveLog.blockID, 0, 2);
        world.setBlock(i + 7, j + 18, k + 4, MTJT.explosiveLog.blockID, 0, 2);
        world.setBlock(i + 7, j + 18, k + 2, MTJT.explosiveLeaves.blockID, 0, 2);
        world.setBlock(i + 8, j + 18, k + 6, MTJT.explosiveLeaves.blockID, 0, 2);
        world.setBlock(i + 8, j + 18, k + 5, MTJT.explosiveLeaves.blockID, 0, 2);
        world.setBlock(i + 8, j + 18, k + 4, MTJT.explosiveLeaves.blockID, 0, 2);
        world.setBlock(i + 9, j + 18, k + 10, MTJT.explosiveLeaves.blockID, 0, 2);
        world.setBlock(i + 9, j + 18, k + 6, MTJT.explosiveLeaves.blockID, 0, 2);
        world.setBlock(i + 9, j + 18, k + 2, MTJT.explosiveLeaves.blockID, 0, 2);
        world.setBlock(i + 9, j + 18, k + 1, MTJT.explosiveLeaves.blockID, 0, 2);
        world.setBlock(i + 10, j + 18, k + 1, MTJT.explosiveLeaves.blockID, 0, 2);
        world.setBlock(i + 2, j + 19, k + 9, MTJT.explosiveLeaves.blockID, 0, 2);
        world.setBlock(i + 2, j + 19, k + 4, MTJT.explosiveLeaves.blockID, 0, 2);
        world.setBlock(i + 4, j + 19, k + 9, MTJT.explosiveLeaves.blockID, 0, 2);
        world.setBlock(i + 4, j + 19, k + 8, MTJT.explosiveLeaves.blockID, 0, 2);
        world.setBlock(i + 4, j + 19, k + 7, MTJT.explosiveLeaves.blockID, 0, 2);
        world.setBlock(i + 4, j + 19, k + 4, MTJT.explosiveLeaves.blockID, 0, 2);
        world.setBlock(i + 5, j + 19, k + 5, MTJT.explosiveLog.blockID, 0, 2);
        world.setBlock(i + 5, j + 19, k + 4, MTJT.explosiveLeaves.blockID, 0, 2);
        world.setBlock(i + 5, j + 19, k + 3, MTJT.explosiveLeaves.blockID, 0, 2);
        world.setBlock(i + 6, j + 19, k + 12, MTJT.explosiveLeaves.blockID, 0, 2);
        world.setBlock(i + 6, j + 19, k + 10, MTJT.explosiveLeaves.blockID, 0, 2);
        world.setBlock(i + 6, j + 19, k + 9, MTJT.explosiveLog.blockID, 0, 2);
        world.setBlock(i + 6, j + 19, k + 4, MTJT.explosiveLeaves.blockID, 0, 2);
        world.setBlock(i + 7, j + 19, k + 12, MTJT.explosiveLeaves.blockID, 0, 2);
        world.setBlock(i + 7, j + 19, k + 7, MTJT.explosiveLeaves.blockID, 0, 2);
        world.setBlock(i + 7, j + 19, k + 4, MTJT.explosiveLeaves.blockID, 0, 2);
        world.setBlock(i + 7, j + 19, k + 3, MTJT.explosiveLeaves.blockID, 0, 2);
        world.setBlock(i + 8, j + 19, k + 7, MTJT.explosiveLog.blockID, 0, 2);
        world.setBlock(i + 8, j + 19, k + 3, MTJT.explosiveLog.blockID, 0, 2);
        world.setBlock(i + 9, j + 19, k + 11, MTJT.explosiveLeaves.blockID, 0, 2);
        world.setBlock(i + 10, j + 19, k + 7, MTJT.explosiveLeaves.blockID, 0, 2);
        world.setBlock(i + 10, j + 19, k + 6, MTJT.explosiveLeaves.blockID, 0, 2);
        world.setBlock(i + 10, j + 19, k + 5, MTJT.explosiveLeaves.blockID, 0, 2);
        world.setBlock(i + 10, j + 19, k + 4, MTJT.explosiveLeaves.blockID, 0, 2);
        world.setBlock(i + 11, j + 19, k + 8, MTJT.explosiveLeaves.blockID, 0, 2);
        world.setBlock(i + 11, j + 19, k + 3, MTJT.explosiveLeaves.blockID, 0, 2);
        world.setBlock(i + 2, j + 20, k + 2, MTJT.explosiveLeaves.blockID, 0, 2);
        world.setBlock(i + 3, j + 20, k + 9, MTJT.explosiveLeaves.blockID, 0, 2);
        world.setBlock(i + 3, j + 20, k + 7, MTJT.explosiveLeaves.blockID, 0, 2);
        world.setBlock(i + 4, j + 20, k + 10, MTJT.explosiveLeaves.blockID, 0, 2);
        world.setBlock(i + 4, j + 20, k + 9, MTJT.explosiveLeaves.blockID, 0, 2);
        world.setBlock(i + 4, j + 20, k + 6, MTJT.explosiveLog.blockID, 0, 2);
        world.setBlock(i + 4, j + 20, k + 4, MTJT.explosiveLog.blockID, 0, 2);
        world.setBlock(i + 4, j + 20, k + 3, MTJT.explosiveLeaves.blockID, 0, 2);
        world.setBlock(i + 5, j + 20, k + 7, MTJT.explosiveLeaves.blockID, 0, 2);
        world.setBlock(i + 5, j + 20, k + 4, MTJT.explosiveLeaves.blockID, 0, 2);
        world.setBlock(i + 5, j + 20, k + 3, MTJT.explosiveLeaves.blockID, 0, 2);
        world.setBlock(i + 6, j + 20, k + 9, MTJT.explosiveLeaves.blockID, 0, 2);
        world.setBlock(i + 6, j + 20, k + 7, MTJT.explosiveLeaves.blockID, 0, 2);
        world.setBlock(i + 6, j + 20, k + 5, MTJT.explosiveLeaves.blockID, 0, 2);
        world.setBlock(i + 6, j + 20, k + 3, MTJT.explosiveLeaves.blockID, 0, 2);
        world.setBlock(i + 6, j + 20, k + 2, MTJT.explosiveLeaves.blockID, 0, 2);
        world.setBlock(i + 7, j + 20, k + 11, MTJT.explosiveLeaves.blockID, 0, 2);
        world.setBlock(i + 7, j + 20, k + 10, MTJT.explosiveLog.blockID, 0, 2);
        world.setBlock(i + 7, j + 20, k + 8, MTJT.explosiveLeaves.blockID, 0, 2);
        world.setBlock(i + 7, j + 20, k + 6, MTJT.explosiveLeaves.blockID, 0, 2);
        world.setBlock(i + 7, j + 20, k + 5, MTJT.explosiveLeaves.blockID, 0, 2);
        world.setBlock(i + 7, j + 20, k + 3, MTJT.explosiveLeaves.blockID, 0, 2);
        world.setBlock(i + 8, j + 20, k + 6, MTJT.explosiveLeaves.blockID, 0, 2);
        world.setBlock(i + 8, j + 20, k + 3, MTJT.explosiveLog.blockID, 0, 2);
        world.setBlock(i + 8, j + 20, k + 1, MTJT.explosiveLeaves.blockID, 0, 2);
        world.setBlock(i + 8, j + 20, k + 0, MTJT.explosiveLeaves.blockID, 0, 2);
        world.setBlock(i + 9, j + 20, k + 9, MTJT.explosiveLeaves.blockID, 0, 2);
        world.setBlock(i + 9, j + 20, k + 6, MTJT.explosiveLog.blockID, 0, 2);
        world.setBlock(i + 9, j + 20, k + 4, MTJT.explosiveLeaves.blockID, 0, 2);
        world.setBlock(i + 10, j + 20, k + 9, MTJT.explosiveLeaves.blockID, 0, 2);
        world.setBlock(i + 12, j + 20, k + 6, MTJT.explosiveLeaves.blockID, 0, 2);
        world.setBlock(i + 2, j + 21, k + 9, MTJT.explosiveLeaves.blockID, 0, 2);
        world.setBlock(i + 3, j + 21, k + 6, MTJT.explosiveLeaves.blockID, 0, 2);
        world.setBlock(i + 3, j + 21, k + 5, MTJT.explosiveLeaves.blockID, 0, 2);
        world.setBlock(i + 3, j + 21, k + 4, MTJT.explosiveLog.blockID, 0, 2);
        world.setBlock(i + 3, j + 21, k + 0, MTJT.explosiveLeaves.blockID, 0, 2);
        world.setBlock(i + 4, j + 21, k + 8, MTJT.explosiveLeaves.blockID, 0, 2);
        world.setBlock(i + 4, j + 21, k + 7, MTJT.explosiveLog.blockID, 0, 2);
        world.setBlock(i + 4, j + 21, k + 6, MTJT.explosiveLeaves.blockID, 0, 2);
        world.setBlock(i + 4, j + 21, k + 0, MTJT.explosiveLeaves.blockID, 0, 2);
        world.setBlock(i + 5, j + 21, k + 12, MTJT.explosiveLeaves.blockID, 0, 2);
        world.setBlock(i + 5, j + 21, k + 7, MTJT.explosiveLeaves.blockID, 0, 2);
        world.setBlock(i + 6, j + 21, k + 9, MTJT.explosiveLeaves.blockID, 0, 2);
        world.setBlock(i + 6, j + 21, k + 8, MTJT.explosiveLeaves.blockID, 0, 2);
        world.setBlock(i + 6, j + 21, k + 5, MTJT.explosiveLeaves.blockID, 0, 2);
        world.setBlock(i + 6, j + 21, k + 4, MTJT.explosiveLeaves.blockID, 0, 2);
        world.setBlock(i + 6, j + 21, k + 3, MTJT.explosiveLeaves.blockID, 0, 2);
        world.setBlock(i + 7, j + 21, k + 13, MTJT.explosiveLeaves.blockID, 0, 2);
        world.setBlock(i + 7, j + 21, k + 10, MTJT.explosiveLeaves.blockID, 0, 2);
        world.setBlock(i + 8, j + 21, k + 5, MTJT.explosiveLeaves.blockID, 0, 2);
        world.setBlock(i + 8, j + 21, k + 3, MTJT.explosiveLeaves.blockID, 0, 2);
        world.setBlock(i + 8, j + 21, k + 2, MTJT.explosiveLeaves.blockID, 0, 2);
        world.setBlock(i + 9, j + 21, k + 9, MTJT.explosiveLeaves.blockID, 0, 2);
        world.setBlock(i + 9, j + 21, k + 3, MTJT.explosiveLeaves.blockID, 0, 2);
        world.setBlock(i + 10, j + 21, k + 10, MTJT.explosiveLeaves.blockID, 0, 2);
        world.setBlock(i + 0, j + 22, k + 4, MTJT.explosiveLeaves.blockID, 0, 2);
        world.setBlock(i + 0, j + 22, k + 2, MTJT.explosiveLeaves.blockID, 0, 2);
        world.setBlock(i + 2, j + 22, k + 0, MTJT.explosiveLeaves.blockID, 0, 2);
        world.setBlock(i + 3, j + 22, k + 4, MTJT.explosiveLeaves.blockID, 0, 2);
        world.setBlock(i + 3, j + 22, k + 3, MTJT.explosiveLog.blockID, 0, 2);
        world.setBlock(i + 3, j + 22, k + 1, MTJT.explosiveLeaves.blockID, 0, 2);
        world.setBlock(i + 4, j + 22, k + 9, MTJT.explosiveLeaves.blockID, 0, 2);
        world.setBlock(i + 4, j + 22, k + 8, MTJT.explosiveLeaves.blockID, 0, 2);
        world.setBlock(i + 4, j + 22, k + 7, MTJT.explosiveLeaves.blockID, 0, 2);
        world.setBlock(i + 4, j + 22, k + 5, MTJT.explosiveLeaves.blockID, 0, 2);
        world.setBlock(i + 4, j + 22, k + 0, MTJT.explosiveLeaves.blockID, 0, 2);
        world.setBlock(i + 5, j + 22, k + 3, MTJT.explosiveLeaves.blockID, 0, 2);
        world.setBlock(i + 6, j + 22, k + 12, MTJT.explosiveLeaves.blockID, 0, 2);
        world.setBlock(i + 6, j + 22, k + 4, MTJT.explosiveLeaves.blockID, 0, 2);
        world.setBlock(i + 6, j + 22, k + 3, MTJT.explosiveLeaves.blockID, 0, 2);
        world.setBlock(i + 7, j + 22, k + 1, MTJT.explosiveLeaves.blockID, 0, 2);
        world.setBlock(i + 9, j + 22, k + 3, MTJT.explosiveLeaves.blockID, 0, 2);
        world.setBlock(i + 10, j + 22, k + 6, MTJT.explosiveLeaves.blockID, 0, 2);
        world.setBlock(i + 2, j + 23, k + 7, MTJT.explosiveLeaves.blockID, 0, 2);
        world.setBlock(i + 2, j + 23, k + 1, MTJT.explosiveLeaves.blockID, 0, 2);
        world.setBlock(i + 3, j + 23, k + 5, MTJT.explosiveLeaves.blockID, 0, 2);
        world.setBlock(i + 6, j + 23, k + 2, MTJT.explosiveLeaves.blockID, 0, 2);
        world.setBlock(i + 7, j + 23, k + 11, MTJT.explosiveLeaves.blockID, 0, 2);
        world.setBlock(i + 8, j + 23, k + 5, MTJT.explosiveLeaves.blockID, 0, 2);
        world.setBlock(i + 9, j + 23, k + 4, MTJT.explosiveLeaves.blockID, 0, 2);
        world.setBlock(i + 9, j + 23, k + 3, MTJT.explosiveLeaves.blockID, 0, 2);
        world.setBlock(i + 1, j + 24, k + 5, MTJT.explosiveLeaves.blockID, 0, 2);
        world.setBlock(i + 2, j + 24, k + 4, MTJT.explosiveLeaves.blockID, 0, 2);
        world.setBlock(i + 2, j + 24, k + 1, MTJT.explosiveLeaves.blockID, 0, 2);
        world.setBlock(i + 4, j + 24, k + 7, MTJT.explosiveLeaves.blockID, 0, 2);
        world.setBlock(i + 3, j + 25, k + 2, MTJT.explosiveLeaves.blockID, 0, 2);
        
        return true;
    }
}