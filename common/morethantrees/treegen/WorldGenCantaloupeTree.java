package morethantrees.treegen;

import java.util.Random;

import morethantrees.MTJT;
import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

public class WorldGenCantaloupeTree extends WorldGenerator
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
        world.setBlock(i + 6, j + 0, k + 4, MTJT.cantaloupeLog.blockID, 0, 2);
        world.setBlock(i + 7, j + 0, k + 5, MTJT.cantaloupeLog.blockID, 0, 2);
        world.setBlock(i + 7, j + 0, k + 4, MTJT.cantaloupeLog.blockID, 0, 2);
        world.setBlock(i + 8, j + 0, k + 6, MTJT.cantaloupeLog.blockID, 0, 2);
        world.setBlock(i + 8, j + 0, k + 5, MTJT.cantaloupeLog.blockID, 0, 2);
        world.setBlock(i + 8, j + 0, k + 4, MTJT.cantaloupeLog.blockID, 0, 2);
        world.setBlock(i + 8, j + 0, k + 3, MTJT.cantaloupeLog.blockID, 0, 2);
        world.setBlock(i + 9, j + 0, k + 5, MTJT.cantaloupeLog.blockID, 0, 2);
        world.setBlock(i + 9, j + 0, k + 4, MTJT.cantaloupeLog.blockID, 0, 2);
        world.setBlock(i + 9, j + 0, k + 3, MTJT.cantaloupeLog.blockID, 0, 2);
        world.setBlock(i + 10, j + 0, k + 4, MTJT.cantaloupeLog.blockID, 0, 2);
        
        world.setBlock(i + 7, j + 1, k + 4, MTJT.cantaloupeLog.blockID, 0, 2);
        world.setBlock(i + 8, j + 1, k + 5, MTJT.cantaloupeLog.blockID, 0, 2);
        world.setBlock(i + 8, j + 1, k + 4, MTJT.cantaloupeLog.blockID, 0, 2);
        world.setBlock(i + 9, j + 1, k + 4, MTJT.cantaloupeLog.blockID, 0, 2);
        
        world.setBlock(i + 8, j + 2, k + 4, MTJT.cantaloupeLog.blockID, 0, 2);
        world.setBlock(i + 9, j + 2, k + 4, MTJT.cantaloupeLog.blockID, 0, 2);
        
        world.setBlock(i + 8, j + 3, k + 4, MTJT.cantaloupeLog.blockID, 0, 2);
        
        world.setBlock(i + 8, j + 4, k + 4, MTJT.cantaloupeLog.blockID, 0, 2);
        
        world.setBlock(i + 5, j + 4, k + 8, MTJT.cantaloupeLeaves.blockID, 0, 2);
        world.setBlock(i + 6, j + 4, k + 8, MTJT.cantaloupeLeaves.blockID, 0, 2);
        world.setBlock(i + 6, j + 4, k + 7, MTJT.cantaloupeLeaves.blockID, 0, 2);
        world.setBlock(i + 8, j + 4, k + 4, MTJT.cantaloupeLog.blockID, 0, 2);
        world.setBlock(i + 9, j + 4, k + 4, MTJT.cantaloupeLog.blockID, 0, 2);
        world.setBlock(i + 10, j + 4, k + 5, MTJT.cantaloupeLeaves.blockID, 0, 2);
        world.setBlock(i + 10, j + 4, k + 4, MTJT.cantaloupeLog.blockID, 0, 2);
        world.setBlock(i + 11, j + 4, k + 6, MTJT.cantaloupeLeaves.blockID, 0, 2);
        world.setBlock(i + 11, j + 4, k + 5, MTJT.cantaloupeLog.blockID, 0, 2);
        world.setBlock(i + 11, j + 4, k + 4, MTJT.cantaloupeLog.blockID, 0, 2);
        world.setBlock(i + 12, j + 4, k + 6, MTJT.cantaloupeLeaves.blockID, 0, 2);
        world.setBlock(i + 12, j + 4, k + 5, MTJT.cantaloupeLeaves.blockID, 0, 2);
        
        world.setBlock(i + 3, j + 5, k + 10, MTJT.cantaloupeLeaves.blockID, 0, 2);
        world.setBlock(i + 3, j + 5, k + 9, MTJT.cantaloupeLeaves.blockID, 0, 2);
        world.setBlock(i + 4, j + 5, k + 10, MTJT.cantaloupeLeaves.blockID, 0, 2);
        world.setBlock(i + 4, j + 5, k + 9, MTJT.cantaloupeLeaves.blockID, 0, 2);
        world.setBlock(i + 4, j + 5, k + 8, MTJT.cantaloupeLeaves.blockID, 0, 2);
        world.setBlock(i + 4, j + 5, k + 7, MTJT.cantaloupeLeaves.blockID, 0, 2);
        world.setBlock(i + 5, j + 5, k + 9, MTJT.cantaloupeLeaves.blockID, 0, 2);
        world.setBlock(i + 5, j + 5, k + 8, MTJT.cantaloupeLog.blockID, 0, 2);
        world.setBlock(i + 5, j + 5, k + 7, MTJT.cantaloupeLeaves.blockID, 0, 2);
        world.setBlock(i + 5, j + 5, k + 6, MTJT.cantaloupeLeaves.blockID, 0, 2);
        world.setBlock(i + 6, j + 5, k + 9, MTJT.cantaloupeLeaves.blockID, 0, 2);
        world.setBlock(i + 6, j + 5, k + 8, MTJT.cantaloupeLog.blockID, 0, 2);
        world.setBlock(i + 6, j + 5, k + 7, MTJT.cantaloupeLog.blockID, 0, 2);
        world.setBlock(i + 6, j + 5, k + 6, MTJT.cantaloupeLeaves.blockID, 0, 2);
        world.setBlock(i + 6, j + 5, k + 5, MTJT.cantaloupeLeaves.blockID, 0, 2);
        world.setBlock(i + 6, j + 5, k + 4, MTJT.cantaloupeLeaves.blockID, 0, 2);
        world.setBlock(i + 7, j + 5, k + 8, MTJT.cantaloupeLeaves.blockID, 0, 2);
        world.setBlock(i + 7, j + 5, k + 7, MTJT.cantaloupeLeaves.blockID, 0, 2);
        world.setBlock(i + 7, j + 5, k + 6, MTJT.cantaloupeLeaves.blockID, 0, 2);
        world.setBlock(i + 7, j + 5, k + 5, MTJT.cantaloupeLog.blockID, 0, 2);
        world.setBlock(i + 7, j + 5, k + 4, MTJT.cantaloupeLeaves.blockID, 0, 2);
        world.setBlock(i + 7, j + 5, k + 3, MTJT.cantaloupeLeaves.blockID, 0, 2);
        world.setBlock(i + 8, j + 5, k + 5, MTJT.cantaloupeLog.blockID, 0, 2);
        world.setBlock(i + 8, j + 5, k + 4, MTJT.cantaloupeLog.blockID, 0, 2);
        world.setBlock(i + 8, j + 5, k + 3, MTJT.cantaloupeLog.blockID, 0, 2);
        world.setBlock(i + 8, j + 5, k + 2, MTJT.cantaloupeLeaves.blockID, 0, 2);
        world.setBlock(i + 9, j + 5, k + 4, MTJT.cantaloupeLog.blockID, 0, 2);
        world.setBlock(i + 9, j + 5, k + 3, MTJT.cantaloupeLeaves.blockID, 0, 2);
        world.setBlock(i + 10, j + 5, k + 5, MTJT.cantaloupeLeaves.blockID, 0, 2);
        world.setBlock(i + 10, j + 5, k + 4, MTJT.cantaloupeLeaves.blockID, 0, 2);
        world.setBlock(i + 11, j + 5, k + 7, MTJT.cantaloupeLeaves.blockID, 0, 2);
        world.setBlock(i + 11, j + 5, k + 6, MTJT.cantaloupeLeaves.blockID, 0, 2);
        world.setBlock(i + 11, j + 5, k + 5, MTJT.cantaloupeLog.blockID, 0, 2);
        world.setBlock(i + 11, j + 5, k + 4, MTJT.cantaloupeLeaves.blockID, 0, 2);
        world.setBlock(i + 12, j + 5, k + 8, MTJT.cantaloupeLeaves.blockID, 0, 2);
        world.setBlock(i + 12, j + 5, k + 7, MTJT.cantaloupeLeaves.blockID, 0, 2);
        world.setBlock(i + 12, j + 5, k + 6, MTJT.cantaloupeLog.blockID, 0, 2);
        world.setBlock(i + 12, j + 5, k + 5, MTJT.cantaloupeLog.blockID, 0, 2);
        world.setBlock(i + 12, j + 5, k + 4, MTJT.cantaloupeLeaves.blockID, 0, 2);
        world.setBlock(i + 13, j + 5, k + 7, MTJT.cantaloupeLeaves.blockID, 0, 2);
        world.setBlock(i + 13, j + 5, k + 6, MTJT.cantaloupeLeaves.blockID, 0, 2);
        world.setBlock(i + 13, j + 5, k + 5, MTJT.cantaloupeLeaves.blockID, 0, 2);
        
        world.setBlock(i + 2, j + 6, k + 10, MTJT.cantaloupeLeaves.blockID, 0, 2);
        world.setBlock(i + 2, j + 6, k + 9, MTJT.cantaloupeLeaves.blockID, 0, 2);
        world.setBlock(i + 3, j + 6, k + 11, MTJT.cantaloupeLeaves.blockID, 0, 2);
        world.setBlock(i + 3, j + 6, k + 10, MTJT.cantaloupeLeaves.blockID, 0, 2);
        world.setBlock(i + 3, j + 6, k + 9, MTJT.cantaloupeLeaves.blockID, 0, 2);
        world.setBlock(i + 3, j + 6, k + 8, MTJT.cantaloupeLeaves.blockID, 0, 2);
        world.setBlock(i + 3, j + 6, k + 7, MTJT.cantaloupeLeaves.blockID, 0, 2);
        world.setBlock(i + 4, j + 6, k + 10, MTJT.cantaloupeLeaves.blockID, 0, 2);
        world.setBlock(i + 4, j + 6, k + 9, MTJT.cantaloupeLeaves.blockID, 0, 2);
        world.setBlock(i + 4, j + 6, k + 8, MTJT.cantaloupeLeaves.blockID, 0, 2);
        world.setBlock(i + 4, j + 6, k + 7, MTJT.cantaloupeLeaves.blockID, 0, 2);
        world.setBlock(i + 4, j + 6, k + 6, MTJT.cantaloupeLeaves.blockID, 0, 2);
        world.setBlock(i + 5, j + 6, k + 10, MTJT.cantaloupeLeaves.blockID, 0, 2);
        world.setBlock(i + 5, j + 6, k + 9, MTJT.cantaloupeLeaves.blockID, 0, 2);
        world.setBlock(i + 5, j + 6, k + 8, MTJT.cantaloupeLeaves.blockID, 0, 2);
        world.setBlock(i + 5, j + 6, k + 7, MTJT.cantaloupeLeaves.blockID, 0, 2);
        world.setBlock(i + 5, j + 6, k + 6, MTJT.cantaloupeLeaves.blockID, 0, 2);
        world.setBlock(i + 5, j + 6, k + 5, MTJT.cantaloupeLeaves.blockID, 0, 2);
        world.setBlock(i + 6, j + 6, k + 10, MTJT.cantaloupeLeaves.blockID, 0, 2);
        world.setBlock(i + 6, j + 6, k + 9, MTJT.cantaloupeLeaves.blockID, 0, 2);
        world.setBlock(i + 6, j + 6, k + 8, MTJT.cantaloupeLeaves.blockID, 0, 2);
        world.setBlock(i + 6, j + 6, k + 7, MTJT.cantaloupeLog.blockID, 0, 2);
        world.setBlock(i + 6, j + 6, k + 6, MTJT.cantaloupeLog.blockID, 0, 2);
        world.setBlock(i + 6, j + 6, k + 5, MTJT.cantaloupeLeaves.blockID, 0, 2);
        world.setBlock(i + 6, j + 6, k + 4, MTJT.cantaloupeLeaves.blockID, 0, 2);
        world.setBlock(i + 6, j + 6, k + 3, MTJT.cantaloupeLeaves.blockID, 0, 2);
        world.setBlock(i + 7, j + 6, k + 9, MTJT.cantaloupeLeaves.blockID, 0, 2);
        world.setBlock(i + 7, j + 6, k + 8, MTJT.cantaloupeLeaves.blockID, 0, 2);
        world.setBlock(i + 7, j + 6, k + 7, MTJT.cantaloupeLeaves.blockID, 0, 2);
        world.setBlock(i + 7, j + 6, k + 6, MTJT.cantaloupeLog.blockID, 0, 2);
        world.setBlock(i + 7, j + 6, k + 5, MTJT.cantaloupeLog.blockID, 0, 2);
        world.setBlock(i + 7, j + 6, k + 4, MTJT.cantaloupeLog.blockID, 0, 2);
        world.setBlock(i + 7, j + 6, k + 3, MTJT.cantaloupeLeaves.blockID, 0, 2);
        world.setBlock(i + 7, j + 6, k + 2, MTJT.cantaloupeLeaves.blockID, 0, 2);
        world.setBlock(i + 8, j + 6, k + 8, MTJT.cantaloupeLeaves.blockID, 0, 2);
        world.setBlock(i + 8, j + 6, k + 7, MTJT.cantaloupeLeaves.blockID, 0, 2);
        world.setBlock(i + 8, j + 6, k + 4, MTJT.cantaloupeLog.blockID, 0, 2);
        world.setBlock(i + 8, j + 6, k + 3, MTJT.cantaloupeLog.blockID, 0, 2);
        world.setBlock(i + 8, j + 6, k + 2, MTJT.cantaloupeLog.blockID, 0, 2);
        world.setBlock(i + 8, j + 6, k + 1, MTJT.cantaloupeLeaves.blockID, 0, 2);
        world.setBlock(i + 9, j + 6, k + 6, MTJT.cantaloupeLeaves.blockID, 0, 2);
        world.setBlock(i + 9, j + 6, k + 5, MTJT.cantaloupeLog.blockID, 0, 2);
        world.setBlock(i + 9, j + 6, k + 4, MTJT.cantaloupeLeaves.blockID, 0, 2);
        world.setBlock(i + 9, j + 6, k + 3, MTJT.cantaloupeLeaves.blockID, 0, 2);
        world.setBlock(i + 9, j + 6, k + 2, MTJT.cantaloupeLog.blockID, 0, 2);
        world.setBlock(i + 9, j + 6, k + 1, MTJT.cantaloupeLeaves.blockID, 0, 2);
        world.setBlock(i + 10, j + 6, k + 7, MTJT.cantaloupeLeaves.blockID, 0, 2);
        world.setBlock(i + 10, j + 6, k + 6, MTJT.cantaloupeLeaves.blockID, 0, 2);
        world.setBlock(i + 10, j + 6, k + 4, MTJT.cantaloupeLeaves.blockID, 0, 2);
        world.setBlock(i + 10, j + 6, k + 3, MTJT.cantaloupeLeaves.blockID, 0, 2);
        world.setBlock(i + 10, j + 6, k + 2, MTJT.cantaloupeLeaves.blockID, 0, 2);
        world.setBlock(i + 11, j + 6, k + 8, MTJT.cantaloupeLeaves.blockID, 0, 2);
        world.setBlock(i + 11, j + 6, k + 7, MTJT.cantaloupeLeaves.blockID, 0, 2);
        world.setBlock(i + 11, j + 6, k + 6, MTJT.cantaloupeLeaves.blockID, 0, 2);
        world.setBlock(i + 11, j + 6, k + 5, MTJT.cantaloupeLeaves.blockID, 0, 2);
        world.setBlock(i + 11, j + 6, k + 4, MTJT.cantaloupeLeaves.blockID, 0, 2);
        world.setBlock(i + 12, j + 6, k + 9, MTJT.cantaloupeLeaves.blockID, 0, 2);
        world.setBlock(i + 12, j + 6, k + 8, MTJT.cantaloupeLeaves.blockID, 0, 2);
        world.setBlock(i + 12, j + 6, k + 7, MTJT.cantaloupeLeaves.blockID, 0, 2);
        world.setBlock(i + 12, j + 6, k + 6, MTJT.cantaloupeLeaves.blockID, 0, 2);
        world.setBlock(i + 12, j + 6, k + 5, MTJT.cantaloupeLeaves.blockID, 0, 2);
        world.setBlock(i + 13, j + 6, k + 8, MTJT.cantaloupeLeaves.blockID, 0, 2);
        world.setBlock(i + 13, j + 6, k + 7, MTJT.cantaloupeLeaves.blockID, 0, 2);
        world.setBlock(i + 13, j + 6, k + 6, MTJT.cantaloupeLeaves.blockID, 0, 2);
        world.setBlock(i + 3, j + 7, k + 10, MTJT.cantaloupeLeaves.blockID, 0, 2);
        world.setBlock(i + 3, j + 7, k + 9, MTJT.cantaloupeLeaves.blockID, 0, 2);
        world.setBlock(i + 3, j + 7, k + 8, MTJT.cantaloupeLeaves.blockID, 0, 2);
        world.setBlock(i + 4, j + 7, k + 9, MTJT.cantaloupeLeaves.blockID, 0, 2);
        world.setBlock(i + 4, j + 7, k + 8, MTJT.cantaloupeLeaves.blockID, 0, 2);
        world.setBlock(i + 4, j + 7, k + 7, MTJT.cantaloupeLeaves.blockID, 0, 2);
        world.setBlock(i + 4, j + 7, k + 4, MTJT.cantaloupeLeaves.blockID, 0, 2);
        world.setBlock(i + 4, j + 7, k + 3, MTJT.cantaloupeLeaves.blockID, 0, 2);
        world.setBlock(i + 5, j + 7, k + 9, MTJT.cantaloupeLeaves.blockID, 0, 2);
        world.setBlock(i + 5, j + 7, k + 8, MTJT.cantaloupeLeaves.blockID, 0, 2);
        world.setBlock(i + 5, j + 7, k + 7, MTJT.cantaloupeLeaves.blockID, 0, 2);
        world.setBlock(i + 5, j + 7, k + 5, MTJT.cantaloupeLeaves.blockID, 0, 2);
        world.setBlock(i + 5, j + 7, k + 4, MTJT.cantaloupeLeaves.blockID, 0, 2);
        world.setBlock(i + 5, j + 7, k + 3, MTJT.cantaloupeLeaves.blockID, 0, 2);
        world.setBlock(i + 5, j + 7, k + 2, MTJT.cantaloupeLeaves.blockID, 0, 2);
        world.setBlock(i + 6, j + 7, k + 9, MTJT.cantaloupeLeaves.blockID, 0, 2);
        world.setBlock(i + 6, j + 7, k + 8, MTJT.cantaloupeLeaves.blockID, 0, 2);
        world.setBlock(i + 6, j + 7, k + 7, MTJT.cantaloupeLeaves.blockID, 0, 2);
        world.setBlock(i + 6, j + 7, k + 6, MTJT.cantaloupeLeaves.blockID, 0, 2);
        world.setBlock(i + 6, j + 7, k + 5, MTJT.cantaloupeLeaves.blockID, 0, 2);
        world.setBlock(i + 6, j + 7, k + 4, MTJT.cantaloupeLeaves.blockID, 0, 2);
        world.setBlock(i + 6, j + 7, k + 3, MTJT.cantaloupeLog.blockID, 0, 2);
        world.setBlock(i + 6, j + 7, k + 2, MTJT.cantaloupeLeaves.blockID, 0, 2);
        world.setBlock(i + 7, j + 7, k + 8, MTJT.cantaloupeLeaves.blockID, 0, 2);
        world.setBlock(i + 7, j + 7, k + 7, MTJT.cantaloupeLeaves.blockID, 0, 2);
        world.setBlock(i + 7, j + 7, k + 6, MTJT.cantaloupeLeaves.blockID, 0, 2);
        world.setBlock(i + 7, j + 7, k + 5, MTJT.cantaloupeLeaves.blockID, 0, 2);
        world.setBlock(i + 7, j + 7, k + 4, MTJT.cantaloupeLog.blockID, 0, 2);
        world.setBlock(i + 7, j + 7, k + 3, MTJT.cantaloupeLog.blockID, 0, 2);
        world.setBlock(i + 7, j + 7, k + 2, MTJT.cantaloupeLeaves.blockID, 0, 2);
        world.setBlock(i + 7, j + 7, k + 1, MTJT.cantaloupeLeaves.blockID, 0, 2);
        world.setBlock(i + 8, j + 7, k + 8, MTJT.cantaloupeLeaves.blockID, 0, 2);
        world.setBlock(i + 8, j + 7, k + 7, MTJT.cantaloupeLeaves.blockID, 0, 2);
        world.setBlock(i + 8, j + 7, k + 6, MTJT.cantaloupeLeaves.blockID, 0, 2);
        world.setBlock(i + 8, j + 7, k + 5, MTJT.cantaloupeLeaves.blockID, 0, 2);
        world.setBlock(i + 8, j + 7, k + 4, MTJT.cantaloupeLeaves.blockID, 0, 2);
        world.setBlock(i + 8, j + 7, k + 3, MTJT.cantaloupeLeaves.blockID, 0, 2);
        world.setBlock(i + 8, j + 7, k + 2, MTJT.cantaloupeLeaves.blockID, 0, 2);
        world.setBlock(i + 8, j + 7, k + 1, MTJT.cantaloupeLeaves.blockID, 0, 2);
        world.setBlock(i + 8, j + 7, k + 0, MTJT.cantaloupeLeaves.blockID, 0, 2);
        world.setBlock(i + 9, j + 7, k + 7, MTJT.cantaloupeLeaves.blockID, 0, 2);
        world.setBlock(i + 9, j + 7, k + 6, MTJT.cantaloupeLog.blockID, 0, 2);
        world.setBlock(i + 9, j + 7, k + 5, MTJT.cantaloupeLog.blockID, 0, 2);
        world.setBlock(i + 9, j + 7, k + 4, MTJT.cantaloupeLeaves.blockID, 0, 2);
        world.setBlock(i + 9, j + 7, k + 3, MTJT.cantaloupeLeaves.blockID, 0, 2);
        world.setBlock(i + 9, j + 7, k + 2, MTJT.cantaloupeLeaves.blockID, 0, 2);
        world.setBlock(i + 9, j + 7, k + 1, MTJT.cantaloupeLeaves.blockID, 0, 2);
        world.setBlock(i + 10, j + 7, k + 8, MTJT.cantaloupeLeaves.blockID, 0, 2);
        world.setBlock(i + 10, j + 7, k + 7, MTJT.cantaloupeLeaves.blockID, 0, 2);
        world.setBlock(i + 10, j + 7, k + 6, MTJT.cantaloupeLog.blockID, 0, 2);
        world.setBlock(i + 10, j + 7, k + 5, MTJT.cantaloupeLeaves.blockID, 0, 2);
        world.setBlock(i + 10, j + 7, k + 4, MTJT.cantaloupeLeaves.blockID, 0, 2);
        world.setBlock(i + 10, j + 7, k + 3, MTJT.cantaloupeLeaves.blockID, 0, 2);
        world.setBlock(i + 10, j + 7, k + 2, MTJT.cantaloupeLeaves.blockID, 0, 2);
        world.setBlock(i + 10, j + 7, k + 1, MTJT.cantaloupeLeaves.blockID, 0, 2);
        world.setBlock(i + 11, j + 7, k + 9, MTJT.cantaloupeLeaves.blockID, 0, 2);
        world.setBlock(i + 11, j + 7, k + 8, MTJT.cantaloupeLeaves.blockID, 0, 2);
        world.setBlock(i + 11, j + 7, k + 7, MTJT.cantaloupeLeaves.blockID, 0, 2);
        world.setBlock(i + 11, j + 7, k + 6, MTJT.cantaloupeLeaves.blockID, 0, 2);
        world.setBlock(i + 11, j + 7, k + 5, MTJT.cantaloupeLeaves.blockID, 0, 2);
        world.setBlock(i + 11, j + 7, k + 4, MTJT.cantaloupeLeaves.blockID, 0, 2);
        world.setBlock(i + 11, j + 7, k + 3, MTJT.cantaloupeLeaves.blockID, 0, 2);
        world.setBlock(i + 11, j + 7, k + 2, MTJT.cantaloupeLeaves.blockID, 0, 2);
        world.setBlock(i + 12, j + 7, k + 8, MTJT.cantaloupeLeaves.blockID, 0, 2);
        world.setBlock(i + 12, j + 7, k + 7, MTJT.cantaloupeLeaves.blockID, 0, 2);
        world.setBlock(i + 12, j + 7, k + 6, MTJT.cantaloupeLeaves.blockID, 0, 2);
        world.setBlock(i + 12, j + 7, k + 5, MTJT.cantaloupeLeaves.blockID, 0, 2);
        world.setBlock(i + 13, j + 7, k + 7, MTJT.cantaloupeLeaves.blockID, 0, 2);
        world.setBlock(i + 13, j + 7, k + 6, MTJT.cantaloupeLeaves.blockID, 0, 2);
        world.setBlock(i + 4, j + 8, k + 8, MTJT.cantaloupeLeaves.blockID, 0, 2);
        world.setBlock(i + 4, j + 8, k + 3, MTJT.cantaloupeLeaves.blockID, 0, 2);
        world.setBlock(i + 4, j + 8, k + 2, MTJT.cantaloupeLeaves.blockID, 0, 2);
        world.setBlock(i + 5, j + 8, k + 9, MTJT.cantaloupeLeaves.blockID, 0, 2);
        world.setBlock(i + 5, j + 8, k + 8, MTJT.cantaloupeLeaves.blockID, 0, 2);
        world.setBlock(i + 5, j + 8, k + 4, MTJT.cantaloupeLeaves.blockID, 0, 2);
        world.setBlock(i + 5, j + 8, k + 3, MTJT.cantaloupeLog.blockID, 0, 2);
        world.setBlock(i + 5, j + 8, k + 2, MTJT.cantaloupeLeaves.blockID, 0, 2);
        world.setBlock(i + 6, j + 8, k + 8, MTJT.cantaloupeLeaves.blockID, 0, 2);
        world.setBlock(i + 6, j + 8, k + 7, MTJT.cantaloupeLeaves.blockID, 0, 2);
        world.setBlock(i + 6, j + 8, k + 5, MTJT.cantaloupeLeaves.blockID, 0, 2);
        world.setBlock(i + 6, j + 8, k + 4, MTJT.cantaloupeLeaves.blockID, 0, 2);
        world.setBlock(i + 6, j + 8, k + 3, MTJT.cantaloupeLog.blockID, 0, 2);
        world.setBlock(i + 6, j + 8, k + 2, MTJT.cantaloupeLeaves.blockID, 0, 2);
        world.setBlock(i + 6, j + 8, k + 1, MTJT.cantaloupeLeaves.blockID, 0, 2);
        world.setBlock(i + 7, j + 8, k + 7, MTJT.cantaloupeLeaves.blockID, 0, 2);
        world.setBlock(i + 7, j + 8, k + 6, MTJT.cantaloupeLeaves.blockID, 0, 2);
        world.setBlock(i + 7, j + 8, k + 5, MTJT.cantaloupeLeaves.blockID, 0, 2);
        world.setBlock(i + 7, j + 8, k + 4, MTJT.cantaloupeLeaves.blockID, 0, 2);
        world.setBlock(i + 7, j + 8, k + 3, MTJT.cantaloupeLeaves.blockID, 0, 2);
        world.setBlock(i + 7, j + 8, k + 2, MTJT.cantaloupeLeaves.blockID, 0, 2);
        world.setBlock(i + 7, j + 8, k + 1, MTJT.cantaloupeLeaves.blockID, 0, 2);
        world.setBlock(i + 7, j + 8, k + 0, MTJT.cantaloupeLeaves.blockID, 0, 2);
        world.setBlock(i + 8, j + 8, k + 7, MTJT.cantaloupeLeaves.blockID, 0, 2);
        world.setBlock(i + 8, j + 8, k + 6, MTJT.cantaloupeLeaves.blockID, 0, 2);
        world.setBlock(i + 8, j + 8, k + 5, MTJT.cantaloupeLeaves.blockID, 0, 2);
        world.setBlock(i + 8, j + 8, k + 4, MTJT.cantaloupeLeaves.blockID, 0, 2);
        world.setBlock(i + 8, j + 8, k + 3, MTJT.cantaloupeLeaves.blockID, 0, 2);
        world.setBlock(i + 8, j + 8, k + 2, MTJT.cantaloupeLeaves.blockID, 0, 2);
        world.setBlock(i + 8, j + 8, k + 1, MTJT.cantaloupeLeaves.blockID, 0, 2);
        world.setBlock(i + 9, j + 8, k + 6, MTJT.cantaloupeLeaves.blockID, 0, 2);
        world.setBlock(i + 9, j + 8, k + 5, MTJT.cantaloupeLeaves.blockID, 0, 2);
        world.setBlock(i + 9, j + 8, k + 4, MTJT.cantaloupeLeaves.blockID, 0, 2);
        world.setBlock(i + 9, j + 8, k + 3, MTJT.cantaloupeLeaves.blockID, 0, 2);
        world.setBlock(i + 9, j + 8, k + 2, MTJT.cantaloupeLeaves.blockID, 0, 2);
        world.setBlock(i + 9, j + 8, k + 1, MTJT.cantaloupeLeaves.blockID, 0, 2);
        world.setBlock(i + 10, j + 8, k + 7, MTJT.cantaloupeLeaves.blockID, 0, 2);
        world.setBlock(i + 10, j + 8, k + 6, MTJT.cantaloupeLog.blockID, 0, 2);
        world.setBlock(i + 10, j + 8, k + 5, MTJT.cantaloupeLeaves.blockID, 0, 2);
        world.setBlock(i + 10, j + 8, k + 4, MTJT.cantaloupeLeaves.blockID, 0, 2);
        world.setBlock(i + 10, j + 8, k + 3, MTJT.cantaloupeLeaves.blockID, 0, 2);
        world.setBlock(i + 10, j + 8, k + 2, MTJT.cantaloupeLeaves.blockID, 0, 2);
        world.setBlock(i + 11, j + 8, k + 8, MTJT.cantaloupeLeaves.blockID, 0, 2);
        world.setBlock(i + 11, j + 8, k + 7, MTJT.cantaloupeLeaves.blockID, 0, 2);
        world.setBlock(i + 11, j + 8, k + 6, MTJT.cantaloupeLog.blockID, 0, 2);
        world.setBlock(i + 11, j + 8, k + 5, MTJT.cantaloupeLeaves.blockID, 0, 2);
        world.setBlock(i + 12, j + 8, k + 7, MTJT.cantaloupeLeaves.blockID, 0, 2);
        world.setBlock(i + 12, j + 8, k + 6, MTJT.cantaloupeLeaves.blockID, 0, 2);
        world.setBlock(i + 5, j + 9, k + 3, MTJT.cantaloupeLeaves.blockID, 0, 2);
        world.setBlock(i + 6, j + 9, k + 4, MTJT.cantaloupeLeaves.blockID, 0, 2);
        world.setBlock(i + 6, j + 9, k + 3, MTJT.cantaloupeLeaves.blockID, 0, 2);
        world.setBlock(i + 7, j + 9, k + 5, MTJT.cantaloupeLeaves.blockID, 0, 2);
        world.setBlock(i + 7, j + 9, k + 4, MTJT.cantaloupeLeaves.blockID, 0, 2);
        world.setBlock(i + 7, j + 9, k + 3, MTJT.cantaloupeLeaves.blockID, 0, 2);
        world.setBlock(i + 7, j + 9, k + 2, MTJT.cantaloupeLeaves.blockID, 0, 2);
        world.setBlock(i + 7, j + 9, k + 1, MTJT.cantaloupeLeaves.blockID, 0, 2);
        world.setBlock(i + 8, j + 9, k + 6, MTJT.cantaloupeLeaves.blockID, 0, 2);
        world.setBlock(i + 8, j + 9, k + 5, MTJT.cantaloupeLeaves.blockID, 0, 2);
        world.setBlock(i + 8, j + 9, k + 4, MTJT.cantaloupeLeaves.blockID, 0, 2);
        world.setBlock(i + 8, j + 9, k + 3, MTJT.cantaloupeLeaves.blockID, 0, 2);
        world.setBlock(i + 8, j + 9, k + 2, MTJT.cantaloupeLeaves.blockID, 0, 2);
        world.setBlock(i + 9, j + 9, k + 5, MTJT.cantaloupeLeaves.blockID, 0, 2);
        world.setBlock(i + 9, j + 9, k + 4, MTJT.cantaloupeLeaves.blockID, 0, 2);
        world.setBlock(i + 9, j + 9, k + 3, MTJT.cantaloupeLeaves.blockID, 0, 2);
        world.setBlock(i + 10, j + 9, k + 6, MTJT.cantaloupeLeaves.blockID, 0, 2);
        world.setBlock(i + 10, j + 9, k + 5, MTJT.cantaloupeLeaves.blockID, 0, 2);
        world.setBlock(i + 11, j + 9, k + 6, MTJT.cantaloupeLeaves.blockID, 0, 2);
        
        return true;
    }
} /*=====End of Code=====*/