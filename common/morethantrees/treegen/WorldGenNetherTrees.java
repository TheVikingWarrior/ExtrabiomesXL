package morethantrees.treegen;

import java.util.Random;

import morethantrees.MTJT;
import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

public class WorldGenNetherTrees extends WorldGenerator
{
    public boolean generate(World world, Random var2, int i, int j, int k)
    {
        System.out.println("generating nether tree");
        while ((world.isAirBlock(i + 10, j, k + 12)) && (j > 2))
        {
            j--;
        }
        
        int var6 = world.getBlockId(i + 10, j, k + 12);
        if (var6 != Block.netherrack.blockID && var6 != Block.slowSand.blockID)
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
        world.setBlock(i + 5, j + 0, k + 6, MTJT.netherLog.blockID, 0, 2);
        world.setBlock(i + 5, j + 1, k + 6, MTJT.netherLog.blockID, 0, 2);
        //world.setBlock(i + 4, j + 2, k + 6, 127);
        world.setBlock(i + 4, j + 2, k + 5, MTJT.netherLeaves.blockID, 0, 2);
        world.setBlock(i + 5, j + 2, k + 8, MTJT.netherLeaves.blockID, 0, 2);
        //world.setBlock(i + 5, j + 2, k + 7, 127);
        world.setBlock(i + 5, j + 2, k + 6, MTJT.netherLog.blockID, 0, 2);
        //world.setBlock(i + 5, j + 2, k + 5, 127);
        //world.setBlock(i + 6, j + 2, k + 6, 127);
        world.setBlock(i + 6, j + 2, k + 5, MTJT.netherLog.blockID, 0, 2);
        //world.setBlock(i + 6, j + 2, k + 4, 127);
        world.setBlock(i + 6, j + 2, k + 1, MTJT.netherLeaves.blockID, 0, 2);
        world.setBlock(i + 7, j + 2, k + 9, MTJT.netherLeaves.blockID, 0, 2);
        //world.setBlock(i + 7, j + 2, k + 5, 127);
        world.setBlock(i + 7, j + 2, k + 0, MTJT.netherLeaves.blockID, 0, 2);
        world.setBlock(i + 8, j + 2, k + 1, MTJT.netherLeaves.blockID, 0, 2);
        world.setBlock(i + 2, j + 3, k + 6, MTJT.netherLeaves.blockID, 0, 2);
        //world.setBlock(i + 3, j + 3, k + 7, 127);
        world.setBlock(i + 3, j + 3, k + 3, MTJT.netherLeaves.blockID, 0, 2);
        world.setBlock(i + 4, j + 3, k + 10, MTJT.netherLeaves.blockID, 0, 2);
        //world.setBlock(i + 4, j + 3, k + 8, 127);
        world.setBlock(i + 4, j + 3, k + 7, MTJT.netherLog.blockID, 0, 2);
        world.setBlock(i + 4, j + 3, k + 4, MTJT.netherLeaves.blockID, 0, 2);
        world.setBlock(i + 5, j + 3, k + 7, MTJT.netherLeaves.blockID, 0, 2);
        world.setBlock(i + 5, j + 3, k + 6, MTJT.netherLeaves.blockID, 0, 2);
        world.setBlock(i + 5, j + 3, k + 5, MTJT.netherLeaves.blockID, 0, 2);
        world.setBlock(i + 5, j + 3, k + 3, MTJT.netherLeaves.blockID, 0, 2);
        world.setBlock(i + 5, j + 3, k + 2, MTJT.netherLeaves.blockID, 0, 2);
        world.setBlock(i + 5, j + 3, k + 1, MTJT.netherLeaves.blockID, 0, 2);
        world.setBlock(i + 6, j + 3, k + 9, MTJT.netherLeaves.blockID, 0, 2);
        //world.setBlock(i + 6, j + 3, k + 8, 127);
        world.setBlock(i + 6, j + 3, k + 7, MTJT.netherLog.blockID, 0, 2);
        world.setBlock(i + 6, j + 3, k + 6, MTJT.netherLeaves.blockID, 0, 2);
        world.setBlock(i + 6, j + 3, k + 4, MTJT.netherLog.blockID, 0, 2);
        world.setBlock(i + 6, j + 3, k + 3, MTJT.netherLog.blockID, 0, 2);
        world.setBlock(i + 6, j + 3, k + 2, MTJT.netherLeaves.blockID, 0, 2);
        //world.setBlock(i + 7, j + 3, k + 7, 127);
        world.setBlock(i + 7, j + 3, k + 6, MTJT.netherLeaves.blockID, 0, 2);
        world.setBlock(i + 7, j + 3, k + 3, MTJT.netherLeaves.blockID, 0, 2);
        world.setBlock(i + 7, j + 3, k + 1, MTJT.netherLeaves.blockID, 0, 2);
        world.setBlock(i + 9, j + 3, k + 3, MTJT.netherLeaves.blockID, 0, 2);
        world.setBlock(i + 0, j + 4, k + 7, MTJT.netherLeaves.blockID, 0, 2);
        world.setBlock(i + 2, j + 4, k + 6, MTJT.netherLeaves.blockID, 0, 2);
        world.setBlock(i + 2, j + 4, k + 5, MTJT.netherLeaves.blockID, 0, 2);
        world.setBlock(i + 3, j + 4, k + 9, MTJT.netherLeaves.blockID, 0, 2);
        world.setBlock(i + 3, j + 4, k + 8, MTJT.netherLeaves.blockID, 0, 2);
        world.setBlock(i + 3, j + 4, k + 6, MTJT.netherLog.blockID, 0, 2);
        world.setBlock(i + 3, j + 4, k + 4, MTJT.netherLeaves.blockID, 0, 2);
        world.setBlock(i + 4, j + 4, k + 7, MTJT.netherLeaves.blockID, 0, 2);
        world.setBlock(i + 4, j + 4, k + 3, MTJT.netherLeaves.blockID, 0, 2);
        world.setBlock(i + 5, j + 4, k + 8, MTJT.netherLeaves.blockID, 0, 2);
        world.setBlock(i + 5, j + 4, k + 6, MTJT.netherLeaves.blockID, 0, 2);
        world.setBlock(i + 5, j + 4, k + 5, MTJT.netherLeaves.blockID, 0, 2);
        world.setBlock(i + 5, j + 4, k + 4, MTJT.netherLeaves.blockID, 0, 2);
        world.setBlock(i + 6, j + 4, k + 11, MTJT.netherLeaves.blockID, 0, 2);
        world.setBlock(i + 6, j + 4, k + 8, MTJT.netherLog.blockID, 0, 2);
        world.setBlock(i + 6, j + 4, k + 6, MTJT.netherLeaves.blockID, 0, 2);
        world.setBlock(i + 6, j + 4, k + 2, MTJT.netherLeaves.blockID, 0, 2);
        world.setBlock(i + 7, j + 4, k + 6, MTJT.netherLog.blockID, 0, 2);
        world.setBlock(i + 7, j + 4, k + 2, MTJT.netherLog.blockID, 0, 2);
        world.setBlock(i + 7, j + 4, k + 1, MTJT.netherLeaves.blockID, 0, 2);
        world.setBlock(i + 8, j + 4, k + 9, MTJT.netherLeaves.blockID, 0, 2);
        world.setBlock(i + 8, j + 4, k + 6, MTJT.netherLeaves.blockID, 0, 2);
        world.setBlock(i + 9, j + 4, k + 4, MTJT.netherLeaves.blockID, 0, 2);
        world.setBlock(i + 1, j + 5, k + 4, MTJT.netherLeaves.blockID, 0, 2);
        world.setBlock(i + 2, j + 5, k + 7, MTJT.netherLeaves.blockID, 0, 2);
        world.setBlock(i + 3, j + 5, k + 8, MTJT.netherLeaves.blockID, 0, 2);
        world.setBlock(i + 3, j + 5, k + 6, MTJT.netherLog.blockID, 0, 2);
        world.setBlock(i + 3, j + 5, k + 3, MTJT.netherLeaves.blockID, 0, 2);
        world.setBlock(i + 4, j + 5, k + 9, MTJT.netherLeaves.blockID, 0, 2);
        world.setBlock(i + 4, j + 5, k + 6, MTJT.netherLeaves.blockID, 0, 2);
        world.setBlock(i + 4, j + 5, k + 4, MTJT.netherLeaves.blockID, 0, 2);
        world.setBlock(i + 4, j + 5, k + 1, MTJT.netherLeaves.blockID, 0, 2);
        world.setBlock(i + 5, j + 5, k + 9, MTJT.netherLeaves.blockID, 0, 2);
        world.setBlock(i + 5, j + 5, k + 6, MTJT.netherLeaves.blockID, 0, 2);
        world.setBlock(i + 5, j + 5, k + 5, MTJT.netherLeaves.blockID, 0, 2);
        world.setBlock(i + 5, j + 5, k + 4, MTJT.netherLeaves.blockID, 0, 2);
        world.setBlock(i + 6, j + 5, k + 9, MTJT.netherLog.blockID, 0, 2);
        world.setBlock(i + 6, j + 5, k + 6, MTJT.netherLeaves.blockID, 0, 2);
        world.setBlock(i + 6, j + 5, k + 5, MTJT.netherLeaves.blockID, 0, 2);
        world.setBlock(i + 6, j + 5, k + 2, MTJT.netherLeaves.blockID, 0, 2);
        world.setBlock(i + 7, j + 5, k + 9, MTJT.netherLeaves.blockID, 0, 2);
        world.setBlock(i + 7, j + 5, k + 8, MTJT.netherLeaves.blockID, 0, 2);
        world.setBlock(i + 7, j + 5, k + 6, MTJT.netherLog.blockID, 0, 2);
        world.setBlock(i + 7, j + 5, k + 3, MTJT.netherLeaves.blockID, 0, 2);
        world.setBlock(i + 8, j + 5, k + 10, MTJT.netherLeaves.blockID, 0, 2);
        world.setBlock(i + 8, j + 5, k + 9, MTJT.netherLeaves.blockID, 0, 2);
        world.setBlock(i + 8, j + 5, k + 6, MTJT.netherLeaves.blockID, 0, 2);
        world.setBlock(i + 8, j + 5, k + 4, MTJT.netherLeaves.blockID, 0, 2);
        world.setBlock(i + 9, j + 5, k + 9, MTJT.netherLeaves.blockID, 0, 2);
        world.setBlock(i + 10, j + 5, k + 7, MTJT.netherLeaves.blockID, 0, 2);
        world.setBlock(i + 2, j + 6, k + 8, MTJT.netherLeaves.blockID, 0, 2);
        world.setBlock(i + 2, j + 6, k + 5, MTJT.netherLeaves.blockID, 0, 2);
        world.setBlock(i + 3, j + 6, k + 7, MTJT.netherLeaves.blockID, 0, 2);
        world.setBlock(i + 3, j + 6, k + 6, MTJT.netherLeaves.blockID, 0, 2);
        world.setBlock(i + 3, j + 6, k + 4, MTJT.netherLeaves.blockID, 0, 2);
        world.setBlock(i + 3, j + 6, k + 3, MTJT.netherLeaves.blockID, 0, 2);
        world.setBlock(i + 4, j + 6, k + 8, MTJT.netherLeaves.blockID, 0, 2);
        world.setBlock(i + 4, j + 6, k + 7, MTJT.netherLeaves.blockID, 0, 2);
        world.setBlock(i + 4, j + 6, k + 6, MTJT.netherLeaves.blockID, 0, 2);
        world.setBlock(i + 4, j + 6, k + 4, MTJT.netherLeaves.blockID, 0, 2);
        world.setBlock(i + 5, j + 6, k + 6, MTJT.netherLeaves.blockID, 0, 2);
        world.setBlock(i + 5, j + 6, k + 2, MTJT.netherLeaves.blockID, 0, 2);
        world.setBlock(i + 6, j + 6, k + 8, MTJT.netherLeaves.blockID, 0, 2);
        world.setBlock(i + 6, j + 6, k + 6, MTJT.netherLeaves.blockID, 0, 2);
        world.setBlock(i + 7, j + 6, k + 6, MTJT.netherLeaves.blockID, 0, 2);
        world.setBlock(i + 7, j + 6, k + 3, MTJT.netherLeaves.blockID, 0, 2);
        world.setBlock(i + 8, j + 6, k + 7, MTJT.netherLeaves.blockID, 0, 2);
        world.setBlock(i + 9, j + 6, k + 9, MTJT.netherLeaves.blockID, 0, 2);
        world.setBlock(i + 9, j + 6, k + 5, MTJT.netherLeaves.blockID, 0, 2);
        world.setBlock(i + 3, j + 7, k + 7, MTJT.netherLeaves.blockID, 0, 2);
        world.setBlock(i + 5, j + 7, k + 7, MTJT.netherLeaves.blockID, 0, 2);
        world.setBlock(i + 6, j + 7, k + 8, MTJT.netherLeaves.blockID, 0, 2);
        world.setBlock(i + 7, j + 7, k + 6, MTJT.netherLeaves.blockID, 0, 2);
        world.setBlock(i + 9, j + 7, k + 7, MTJT.netherLeaves.blockID, 0, 2);
        world.setBlock(i + 8, j + 8, k + 6, MTJT.netherLeaves.blockID, 0, 2);
        world.setBlock(i + 8, j + 8, k + 5, MTJT.netherLeaves.blockID, 0, 2);
        return true;
    }
}
