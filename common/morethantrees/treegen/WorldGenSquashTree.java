package morethantrees.treegen;

import java.util.Random;

import morethantrees.MTJT;
import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

public class WorldGenSquashTree extends WorldGenerator
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
        world.setBlock(i + 6, j + 0, k + 9, MTJT.squashLog.blockID, 0, 2);
        world.setBlock(i + 6, j + 0, k + 8, MTJT.squashLog.blockID, 0, 2);
        world.setBlock(i + 7, j + 0, k + 9, MTJT.squashLog.blockID, 0, 2);
        world.setBlock(i + 7, j + 0, k + 8, MTJT.squashLog.blockID, 0, 2);
        
        world.setBlock(i + 6, j + 1, k + 9, MTJT.squashLog.blockID, 0, 2);
        world.setBlock(i + 6, j + 1, k + 8, MTJT.squashLog.blockID, 0, 2);
        world.setBlock(i + 7, j + 1, k + 9, MTJT.squashLog.blockID, 0, 2);
        world.setBlock(i + 7, j + 1, k + 8, MTJT.squashLog.blockID, 0, 2);
        
        world.setBlock(i + 6, j + 2, k + 9, MTJT.squashLog.blockID, 0, 2);
        world.setBlock(i + 6, j + 2, k + 8, MTJT.squashLog.blockID, 0, 2);
        world.setBlock(i + 7, j + 2, k + 9, MTJT.squashLog.blockID, 0, 2);
        world.setBlock(i + 7, j + 2, k + 8, MTJT.squashLog.blockID, 0, 2);
        
        world.setBlock(i + 6, j + 3, k + 9, MTJT.squashLog.blockID, 0, 2);
        world.setBlock(i + 6, j + 3, k + 8, MTJT.squashLog.blockID, 0, 2);
        world.setBlock(i + 7, j + 3, k + 9, MTJT.squashLog.blockID, 0, 2);
        world.setBlock(i + 7, j + 3, k + 8, MTJT.squashLog.blockID, 0, 2);
        world.setBlock(i + 6, j + 4, k + 9, MTJT.squashLog.blockID, 0, 2);
        world.setBlock(i + 6, j + 4, k + 8, MTJT.squashLog.blockID, 0, 2);
        world.setBlock(i + 7, j + 4, k + 9, MTJT.squashLog.blockID, 0, 2);
        world.setBlock(i + 7, j + 4, k + 8, MTJT.squashLog.blockID, 0, 2);
        
        world.setBlock(i + 6, j + 5, k + 9, MTJT.squashLog.blockID, 0, 2);
        world.setBlock(i + 7, j + 5, k + 9, MTJT.squashLog.blockID, 0, 2);
        world.setBlock(i + 8, j + 5, k + 10, MTJT.squashLog.blockID, 0, 2);
        world.setBlock(i + 8, j + 5, k + 9, MTJT.squashLog.blockID, 0, 2);
        world.setBlock(i + 9, j + 5, k + 11, MTJT.squashLeaves.blockID, 0, 2);
        world.setBlock(i + 10, j + 5, k + 11, MTJT.squashLeaves.blockID, 0, 2);
        
        world.setBlock(i + 7, j + 6, k + 10, MTJT.squashLeaves.blockID, 0, 2);
        world.setBlock(i + 7, j + 6, k + 9, MTJT.squashLog.blockID, 0, 2);
        world.setBlock(i + 8, j + 6, k + 11, MTJT.squashLeaves.blockID, 0, 2);
        world.setBlock(i + 8, j + 6, k + 10, MTJT.squashLog.blockID, 0, 2);
        world.setBlock(i + 8, j + 6, k + 9, MTJT.squashLog.blockID, 0, 2);
        world.setBlock(i + 8, j + 6, k + 8, MTJT.squashLeaves.blockID, 0, 2);
        world.setBlock(i + 9, j + 6, k + 12, MTJT.squashLeaves.blockID, 0, 2);
        world.setBlock(i + 9, j + 6, k + 11, MTJT.squashLog.blockID, 0, 2);
        world.setBlock(i + 9, j + 6, k + 10, MTJT.squashLog.blockID, 0, 2);
        world.setBlock(i + 9, j + 6, k + 9, MTJT.squashLeaves.blockID, 0, 2);
        world.setBlock(i + 10, j + 6, k + 12, MTJT.squashLeaves.blockID, 0, 2);
        world.setBlock(i + 10, j + 6, k + 11, MTJT.squashLog.blockID, 0, 2);
        world.setBlock(i + 10, j + 6, k + 10, MTJT.squashLeaves.blockID, 0, 2);
        world.setBlock(i + 11, j + 6, k + 12, MTJT.squashLeaves.blockID, 0, 2);
        world.setBlock(i + 11, j + 6, k + 11, MTJT.squashLeaves.blockID, 0, 2);
        
        world.setBlock(i + 3, j + 7, k + 11, MTJT.squashLeaves.blockID, 0, 2);
        world.setBlock(i + 4, j + 7, k + 12, MTJT.squashLeaves.blockID, 0, 2);
        world.setBlock(i + 4, j + 7, k + 11, MTJT.squashLeaves.blockID, 0, 2);
        world.setBlock(i + 4, j + 7, k + 10, MTJT.squashLeaves.blockID, 0, 2);
        world.setBlock(i + 5, j + 7, k + 11, MTJT.squashLeaves.blockID, 0, 2);
        world.setBlock(i + 5, j + 7, k + 10, MTJT.squashLeaves.blockID, 0, 2);
        world.setBlock(i + 5, j + 7, k + 9, MTJT.squashLeaves.blockID, 0, 2);
        world.setBlock(i + 6, j + 7, k + 11, MTJT.squashLeaves.blockID, 0, 2);
        world.setBlock(i + 6, j + 7, k + 10, MTJT.squashLeaves.blockID, 0, 2);
        world.setBlock(i + 6, j + 7, k + 9, MTJT.squashLog.blockID, 0, 2);
        world.setBlock(i + 6, j + 7, k + 8, MTJT.squashLeaves.blockID, 0, 2);
        world.setBlock(i + 7, j + 7, k + 11, MTJT.squashLeaves.blockID, 0, 2);
        world.setBlock(i + 7, j + 7, k + 10, MTJT.squashLeaves.blockID, 0, 2);
        world.setBlock(i + 7, j + 7, k + 9, MTJT.squashLog.blockID, 0, 2);
        world.setBlock(i + 7, j + 7, k + 8, MTJT.squashLeaves.blockID, 0, 2);
        world.setBlock(i + 8, j + 7, k + 12, MTJT.squashLeaves.blockID, 0, 2);
        world.setBlock(i + 8, j + 7, k + 11, MTJT.squashLeaves.blockID, 0, 2);
        world.setBlock(i + 8, j + 7, k + 10, MTJT.squashLeaves.blockID, 0, 2);
        world.setBlock(i + 8, j + 7, k + 9, MTJT.squashLeaves.blockID, 0, 2);
        world.setBlock(i + 8, j + 7, k + 8, MTJT.squashLeaves.blockID, 0, 2);
        world.setBlock(i + 8, j + 7, k + 7, MTJT.squashLeaves.blockID, 0, 2);
        world.setBlock(i + 8, j + 7, k + 6, MTJT.squashLeaves.blockID, 0, 2);
        world.setBlock(i + 9, j + 7, k + 13, MTJT.squashLeaves.blockID, 0, 2);
        world.setBlock(i + 9, j + 7, k + 12, MTJT.squashLeaves.blockID, 0, 2);
        world.setBlock(i + 9, j + 7, k + 11, MTJT.squashLeaves.blockID, 0, 2);
        world.setBlock(i + 9, j + 7, k + 10, MTJT.squashLeaves.blockID, 0, 2);
        world.setBlock(i + 9, j + 7, k + 9, MTJT.squashLeaves.blockID, 0, 2);
        world.setBlock(i + 9, j + 7, k + 8, MTJT.squashLeaves.blockID, 0, 2);
        world.setBlock(i + 9, j + 7, k + 7, MTJT.squashLeaves.blockID, 0, 2);
        world.setBlock(i + 9, j + 7, k + 6, MTJT.squashLeaves.blockID, 0, 2);
        world.setBlock(i + 10, j + 7, k + 13, MTJT.squashLeaves.blockID, 0, 2);
        world.setBlock(i + 10, j + 7, k + 12, MTJT.squashLog.blockID, 0, 2);
        world.setBlock(i + 10, j + 7, k + 11, MTJT.squashLeaves.blockID, 0, 2);
        world.setBlock(i + 10, j + 7, k + 10, MTJT.squashLeaves.blockID, 0, 2);
        world.setBlock(i + 10, j + 7, k + 9, MTJT.squashLeaves.blockID, 0, 2);
        world.setBlock(i + 11, j + 7, k + 13, MTJT.squashLeaves.blockID, 0, 2);
        world.setBlock(i + 11, j + 7, k + 12, MTJT.squashLog.blockID, 0, 2);
        world.setBlock(i + 11, j + 7, k + 11, MTJT.squashLeaves.blockID, 0, 2);
        world.setBlock(i + 11, j + 7, k + 10, MTJT.squashLeaves.blockID, 0, 2);
        world.setBlock(i + 12, j + 7, k + 13, MTJT.squashLeaves.blockID, 0, 2);
        world.setBlock(i + 12, j + 7, k + 12, MTJT.squashLeaves.blockID, 0, 2);
        world.setBlock(i + 12, j + 7, k + 11, MTJT.squashLeaves.blockID, 0, 2);
        
        world.setBlock(i + 2, j + 8, k + 11, MTJT.squashLeaves.blockID, 0, 2);
        world.setBlock(i + 2, j + 8, k + 10, MTJT.squashLeaves.blockID, 0, 2);
        world.setBlock(i + 3, j + 8, k + 12, MTJT.squashLeaves.blockID, 0, 2);
        world.setBlock(i + 3, j + 8, k + 11, MTJT.squashLeaves.blockID, 0, 2);
        world.setBlock(i + 3, j + 8, k + 10, MTJT.squashLeaves.blockID, 0, 2);
        world.setBlock(i + 3, j + 8, k + 9, MTJT.squashLeaves.blockID, 0, 2);
        world.setBlock(i + 4, j + 8, k + 13, MTJT.squashLeaves.blockID, 0, 2);
        world.setBlock(i + 4, j + 8, k + 12, MTJT.squashLeaves.blockID, 0, 2);
        world.setBlock(i + 4, j + 8, k + 11, MTJT.squashLog.blockID, 0, 2);
        world.setBlock(i + 4, j + 8, k + 10, MTJT.squashLeaves.blockID, 0, 2);
        world.setBlock(i + 4, j + 8, k + 9, MTJT.squashLeaves.blockID, 0, 2);
        world.setBlock(i + 4, j + 8, k + 8, MTJT.squashLeaves.blockID, 0, 2);
        world.setBlock(i + 5, j + 8, k + 12, MTJT.squashLeaves.blockID, 0, 2);
        world.setBlock(i + 5, j + 8, k + 11, MTJT.squashLog.blockID, 0, 2);
        world.setBlock(i + 5, j + 8, k + 10, MTJT.squashLog.blockID, 0, 2);
        world.setBlock(i + 5, j + 8, k + 9, MTJT.squashLog.blockID, 0, 2);
        world.setBlock(i + 5, j + 8, k + 8, MTJT.squashLeaves.blockID, 0, 2);
        world.setBlock(i + 5, j + 8, k + 7, MTJT.squashLeaves.blockID, 0, 2);
        world.setBlock(i + 6, j + 8, k + 11, MTJT.squashLeaves.blockID, 0, 2);
        world.setBlock(i + 6, j + 8, k + 10, MTJT.squashLog.blockID, 0, 2);
        world.setBlock(i + 6, j + 8, k + 9, MTJT.squashLog.blockID, 0, 2);
        world.setBlock(i + 6, j + 8, k + 8, MTJT.squashLeaves.blockID, 0, 2);
        world.setBlock(i + 6, j + 8, k + 7, MTJT.squashLeaves.blockID, 0, 2);
        world.setBlock(i + 7, j + 8, k + 12, MTJT.squashLeaves.blockID, 0, 2);
        world.setBlock(i + 7, j + 8, k + 11, MTJT.squashLeaves.blockID, 0, 2);
        world.setBlock(i + 7, j + 8, k + 10, MTJT.squashLeaves.blockID, 0, 2);
        world.setBlock(i + 7, j + 8, k + 9, MTJT.squashLog.blockID, 0, 2);
        world.setBlock(i + 7, j + 8, k + 8, MTJT.squashLog.blockID, 0, 2);
        world.setBlock(i + 7, j + 8, k + 7, MTJT.squashLeaves.blockID, 0, 2);
        world.setBlock(i + 7, j + 8, k + 6, MTJT.squashLeaves.blockID, 0, 2);
        world.setBlock(i + 8, j + 8, k + 13, MTJT.squashLeaves.blockID, 0, 2);
        world.setBlock(i + 8, j + 8, k + 12, MTJT.squashLeaves.blockID, 0, 2);
        world.setBlock(i + 8, j + 8, k + 11, MTJT.squashLeaves.blockID, 0, 2);
        world.setBlock(i + 8, j + 8, k + 10, MTJT.squashLeaves.blockID, 0, 2);
        world.setBlock(i + 8, j + 8, k + 9, MTJT.squashLeaves.blockID, 0, 2);
        world.setBlock(i + 8, j + 8, k + 8, MTJT.squashLog.blockID, 0, 2);
        world.setBlock(i + 8, j + 8, k + 7, MTJT.squashLog.blockID, 0, 2);
        world.setBlock(i + 8, j + 8, k + 6, MTJT.squashLog.blockID, 0, 2);
        world.setBlock(i + 8, j + 8, k + 5, MTJT.squashLeaves.blockID, 0, 2);
        world.setBlock(i + 9, j + 8, k + 14, MTJT.squashLeaves.blockID, 0, 2);
        world.setBlock(i + 9, j + 8, k + 13, MTJT.squashLeaves.blockID, 0, 2);
        world.setBlock(i + 9, j + 8, k + 12, MTJT.squashLeaves.blockID, 0, 2);
        world.setBlock(i + 9, j + 8, k + 11, MTJT.squashLeaves.blockID, 0, 2);
        world.setBlock(i + 9, j + 8, k + 9, MTJT.squashLeaves.blockID, 0, 2);
        world.setBlock(i + 9, j + 8, k + 8, MTJT.squashLeaves.blockID, 0, 2);
        world.setBlock(i + 9, j + 8, k + 7, MTJT.squashLeaves.blockID, 0, 2);
        world.setBlock(i + 9, j + 8, k + 6, MTJT.squashLeaves.blockID, 0, 2);
        world.setBlock(i + 9, j + 8, k + 5, MTJT.squashLeaves.blockID, 0, 2);
        world.setBlock(i + 9, j + 8, k + 4, MTJT.squashLeaves.blockID, 0, 2);
        world.setBlock(i + 10, j + 8, k + 14, MTJT.squashLeaves.blockID, 0, 2);
        world.setBlock(i + 10, j + 8, k + 13, MTJT.squashLeaves.blockID, 0, 2);
        world.setBlock(i + 10, j + 8, k + 12, MTJT.squashLeaves.blockID, 0, 2);
        world.setBlock(i + 10, j + 8, k + 11, MTJT.squashLeaves.blockID, 0, 2);
        world.setBlock(i + 10, j + 8, k + 10, MTJT.squashLeaves.blockID, 0, 2);
        world.setBlock(i + 10, j + 8, k + 9, MTJT.squashLeaves.blockID, 0, 2);
        world.setBlock(i + 10, j + 8, k + 8, MTJT.squashLeaves.blockID, 0, 2);
        world.setBlock(i + 10, j + 8, k + 7, MTJT.squashLeaves.blockID, 0, 2);
        world.setBlock(i + 10, j + 8, k + 6, MTJT.squashLeaves.blockID, 0, 2);
        world.setBlock(i + 10, j + 8, k + 5, MTJT.squashLeaves.blockID, 0, 2);
        world.setBlock(i + 10, j + 8, k + 4, MTJT.squashLeaves.blockID, 0, 2);
        world.setBlock(i + 11, j + 8, k + 14, MTJT.squashLeaves.blockID, 0, 2);
        world.setBlock(i + 11, j + 8, k + 13, MTJT.squashLeaves.blockID, 0, 2);
        world.setBlock(i + 11, j + 8, k + 12, MTJT.squashLeaves.blockID, 0, 2);
        world.setBlock(i + 11, j + 8, k + 11, MTJT.squashLeaves.blockID, 0, 2);
        world.setBlock(i + 11, j + 8, k + 10, MTJT.squashLeaves.blockID, 0, 2);
        world.setBlock(i + 11, j + 8, k + 9, MTJT.squashLeaves.blockID, 0, 2);
        world.setBlock(i + 12, j + 8, k + 13, MTJT.squashLeaves.blockID, 0, 2);
        world.setBlock(i + 12, j + 8, k + 12, MTJT.squashLeaves.blockID, 0, 2);
        world.setBlock(i + 12, j + 8, k + 11, MTJT.squashLeaves.blockID, 0, 2);
        world.setBlock(i + 12, j + 8, k + 10, MTJT.squashLeaves.blockID, 0, 2);
        world.setBlock(i + 13, j + 8, k + 12, MTJT.squashLeaves.blockID, 0, 2);
        world.setBlock(i + 13, j + 8, k + 11, MTJT.squashLeaves.blockID, 0, 2);
        world.setBlock(i + 2, j + 9, k + 12, MTJT.squashLeaves.blockID, 0, 2);
        world.setBlock(i + 2, j + 9, k + 11, MTJT.squashLeaves.blockID, 0, 2);
        world.setBlock(i + 2, j + 9, k + 10, MTJT.squashLeaves.blockID, 0, 2);
        world.setBlock(i + 2, j + 9, k + 9, MTJT.squashLeaves.blockID, 0, 2);
        world.setBlock(i + 3, j + 9, k + 13, MTJT.squashLeaves.blockID, 0, 2);
        world.setBlock(i + 3, j + 9, k + 12, MTJT.squashLeaves.blockID, 0, 2);
        world.setBlock(i + 3, j + 9, k + 11, MTJT.squashLog.blockID, 0, 2);
        world.setBlock(i + 3, j + 9, k + 10, MTJT.squashLeaves.blockID, 0, 2);
        world.setBlock(i + 3, j + 9, k + 9, MTJT.squashLeaves.blockID, 0, 2);
        world.setBlock(i + 3, j + 9, k + 8, MTJT.squashLeaves.blockID, 0, 2);
        world.setBlock(i + 4, j + 9, k + 13, MTJT.squashLeaves.blockID, 0, 2);
        world.setBlock(i + 4, j + 9, k + 12, MTJT.squashLeaves.blockID, 0, 2);
        world.setBlock(i + 4, j + 9, k + 11, MTJT.squashLog.blockID, 0, 2);
        world.setBlock(i + 4, j + 9, k + 10, MTJT.squashLeaves.blockID, 0, 2);
        world.setBlock(i + 4, j + 9, k + 9, MTJT.squashLeaves.blockID, 0, 2);
        world.setBlock(i + 4, j + 9, k + 8, MTJT.squashLeaves.blockID, 0, 2);
        world.setBlock(i + 4, j + 9, k + 7, MTJT.squashLeaves.blockID, 0, 2);
        world.setBlock(i + 5, j + 9, k + 13, MTJT.squashLeaves.blockID, 0, 2);
        world.setBlock(i + 5, j + 9, k + 12, MTJT.squashLeaves.blockID, 0, 2);
        world.setBlock(i + 5, j + 9, k + 11, MTJT.squashLeaves.blockID, 0, 2);
        world.setBlock(i + 5, j + 9, k + 10, MTJT.squashLeaves.blockID, 0, 2);
        world.setBlock(i + 5, j + 9, k + 9, MTJT.squashLeaves.blockID, 0, 2);
        world.setBlock(i + 5, j + 9, k + 8, MTJT.squashLeaves.blockID, 0, 2);
        world.setBlock(i + 5, j + 9, k + 7, MTJT.squashLeaves.blockID, 0, 2);
        world.setBlock(i + 6, j + 9, k + 12, MTJT.squashLeaves.blockID, 0, 2);
        world.setBlock(i + 6, j + 9, k + 11, MTJT.squashLeaves.blockID, 0, 2);
        world.setBlock(i + 6, j + 9, k + 10, MTJT.squashLeaves.blockID, 0, 2);
        world.setBlock(i + 6, j + 9, k + 9, MTJT.squashLeaves.blockID, 0, 2);
        world.setBlock(i + 6, j + 9, k + 8, MTJT.squashLeaves.blockID, 0, 2);
        world.setBlock(i + 6, j + 9, k + 7, MTJT.squashLeaves.blockID, 0, 2);
        world.setBlock(i + 6, j + 9, k + 6, MTJT.squashLeaves.blockID, 0, 2);
        world.setBlock(i + 7, j + 9, k + 10, MTJT.squashLeaves.blockID, 0, 2);
        world.setBlock(i + 7, j + 9, k + 9, MTJT.squashLeaves.blockID, 0, 2);
        world.setBlock(i + 7, j + 9, k + 8, MTJT.squashLeaves.blockID, 0, 2);
        world.setBlock(i + 7, j + 9, k + 7, MTJT.squashLeaves.blockID, 0, 2);
        world.setBlock(i + 7, j + 9, k + 6, MTJT.squashLeaves.blockID, 0, 2);
        world.setBlock(i + 7, j + 9, k + 5, MTJT.squashLeaves.blockID, 0, 2);
        world.setBlock(i + 8, j + 9, k + 11, MTJT.squashLeaves.blockID, 0, 2);
        world.setBlock(i + 8, j + 9, k + 10, MTJT.squashLeaves.blockID, 0, 2);
        world.setBlock(i + 8, j + 9, k + 9, MTJT.squashLeaves.blockID, 0, 2);
        world.setBlock(i + 8, j + 9, k + 8, MTJT.squashLeaves.blockID, 0, 2);
        world.setBlock(i + 8, j + 9, k + 7, MTJT.squashLeaves.blockID, 0, 2);
        world.setBlock(i + 8, j + 9, k + 6, MTJT.squashLog.blockID, 0, 2);
        world.setBlock(i + 8, j + 9, k + 5, MTJT.squashLeaves.blockID, 0, 2);
        world.setBlock(i + 8, j + 9, k + 4, MTJT.squashLeaves.blockID, 0, 2);
        world.setBlock(i + 9, j + 9, k + 12, MTJT.squashLeaves.blockID, 0, 2);
        world.setBlock(i + 9, j + 9, k + 11, MTJT.squashLeaves.blockID, 0, 2);
        world.setBlock(i + 9, j + 9, k + 10, MTJT.squashLeaves.blockID, 0, 2);
        world.setBlock(i + 9, j + 9, k + 9, MTJT.squashLeaves.blockID, 0, 2);
        world.setBlock(i + 9, j + 9, k + 8, MTJT.squashLeaves.blockID, 0, 2);
        world.setBlock(i + 9, j + 9, k + 7, MTJT.squashLeaves.blockID, 0, 2);
        world.setBlock(i + 9, j + 9, k + 6, MTJT.squashLog.blockID, 0, 2);
        world.setBlock(i + 9, j + 9, k + 5, MTJT.squashLog.blockID, 0, 2);
        world.setBlock(i + 9, j + 9, k + 4, MTJT.squashLog.blockID, 0, 2);
        world.setBlock(i + 9, j + 9, k + 3, MTJT.squashLeaves.blockID, 0, 2);
        world.setBlock(i + 10, j + 9, k + 13, MTJT.squashLeaves.blockID, 0, 2);
        world.setBlock(i + 10, j + 9, k + 12, MTJT.squashLeaves.blockID, 0, 2);
        world.setBlock(i + 10, j + 9, k + 11, MTJT.squashLeaves.blockID, 0, 2);
        world.setBlock(i + 10, j + 9, k + 10, MTJT.squashLeaves.blockID, 0, 2);
        world.setBlock(i + 10, j + 9, k + 9, MTJT.squashLeaves.blockID, 0, 2);
        world.setBlock(i + 10, j + 9, k + 8, MTJT.squashLeaves.blockID, 0, 2);
        world.setBlock(i + 10, j + 9, k + 6, MTJT.squashLeaves.blockID, 0, 2);
        world.setBlock(i + 10, j + 9, k + 5, MTJT.squashLeaves.blockID, 0, 2);
        world.setBlock(i + 10, j + 9, k + 4, MTJT.squashLog.blockID, 0, 2);
        world.setBlock(i + 10, j + 9, k + 3, MTJT.squashLeaves.blockID, 0, 2);
        world.setBlock(i + 11, j + 9, k + 13, MTJT.squashLeaves.blockID, 0, 2);
        world.setBlock(i + 11, j + 9, k + 12, MTJT.squashLeaves.blockID, 0, 2);
        world.setBlock(i + 11, j + 9, k + 11, MTJT.squashLeaves.blockID, 0, 2);
        world.setBlock(i + 11, j + 9, k + 10, MTJT.squashLeaves.blockID, 0, 2);
        world.setBlock(i + 11, j + 9, k + 6, MTJT.squashLeaves.blockID, 0, 2);
        world.setBlock(i + 11, j + 9, k + 5, MTJT.squashLeaves.blockID, 0, 2);
        world.setBlock(i + 11, j + 9, k + 4, MTJT.squashLeaves.blockID, 0, 2);
        world.setBlock(i + 12, j + 9, k + 12, MTJT.squashLeaves.blockID, 0, 2);
        world.setBlock(i + 12, j + 9, k + 11, MTJT.squashLeaves.blockID, 0, 2);
        world.setBlock(i + 3, j + 10, k + 12, MTJT.squashLeaves.blockID, 0, 2);
        world.setBlock(i + 3, j + 10, k + 11, MTJT.squashLeaves.blockID, 0, 2);
        world.setBlock(i + 4, j + 10, k + 12, MTJT.squashLeaves.blockID, 0, 2);
        world.setBlock(i + 4, j + 10, k + 11, MTJT.squashLeaves.blockID, 0, 2);
        world.setBlock(i + 4, j + 10, k + 10, MTJT.squashLeaves.blockID, 0, 2);
        world.setBlock(i + 4, j + 10, k + 9, MTJT.squashLeaves.blockID, 0, 2);
        world.setBlock(i + 5, j + 10, k + 11, MTJT.squashLeaves.blockID, 0, 2);
        world.setBlock(i + 5, j + 10, k + 10, MTJT.squashLeaves.blockID, 0, 2);
        world.setBlock(i + 5, j + 10, k + 9, MTJT.squashLeaves.blockID, 0, 2);
        world.setBlock(i + 5, j + 10, k + 8, MTJT.squashLeaves.blockID, 0, 2);
        world.setBlock(i + 6, j + 10, k + 10, MTJT.squashLeaves.blockID, 0, 2);
        world.setBlock(i + 6, j + 10, k + 9, MTJT.squashLeaves.blockID, 0, 2);
        world.setBlock(i + 6, j + 10, k + 8, MTJT.squashLeaves.blockID, 0, 2);
        world.setBlock(i + 6, j + 10, k + 7, MTJT.squashLeaves.blockID, 0, 2);
        world.setBlock(i + 7, j + 10, k + 9, MTJT.squashLeaves.blockID, 0, 2);
        world.setBlock(i + 7, j + 10, k + 8, MTJT.squashLeaves.blockID, 0, 2);
        world.setBlock(i + 7, j + 10, k + 7, MTJT.squashLeaves.blockID, 0, 2);
        world.setBlock(i + 7, j + 10, k + 6, MTJT.squashLeaves.blockID, 0, 2);
        world.setBlock(i + 8, j + 10, k + 10, MTJT.squashLeaves.blockID, 0, 2);
        world.setBlock(i + 8, j + 10, k + 9, MTJT.squashLeaves.blockID, 0, 2);
        world.setBlock(i + 8, j + 10, k + 8, MTJT.squashLeaves.blockID, 0, 2);
        world.setBlock(i + 8, j + 10, k + 7, MTJT.squashLeaves.blockID, 0, 2);
        world.setBlock(i + 8, j + 10, k + 6, MTJT.squashLeaves.blockID, 0, 2);
        world.setBlock(i + 8, j + 10, k + 5, MTJT.squashLeaves.blockID, 0, 2);
        world.setBlock(i + 9, j + 10, k + 10, MTJT.squashLeaves.blockID, 0, 2);
        world.setBlock(i + 9, j + 10, k + 9, MTJT.squashLeaves.blockID, 0, 2);
        world.setBlock(i + 9, j + 10, k + 8, MTJT.squashLeaves.blockID, 0, 2);
        world.setBlock(i + 9, j + 10, k + 6, MTJT.squashLeaves.blockID, 0, 2);
        world.setBlock(i + 9, j + 10, k + 5, MTJT.squashLeaves.blockID, 0, 2);
        world.setBlock(i + 9, j + 10, k + 4, MTJT.squashLeaves.blockID, 0, 2);
        world.setBlock(i + 10, j + 10, k + 12, MTJT.squashLeaves.blockID, 0, 2);
        world.setBlock(i + 10, j + 10, k + 11, MTJT.squashLeaves.blockID, 0, 2);
        world.setBlock(i + 10, j + 10, k + 10, MTJT.squashLeaves.blockID, 0, 2);
        world.setBlock(i + 10, j + 10, k + 5, MTJT.squashLeaves.blockID, 0, 2);
        world.setBlock(i + 10, j + 10, k + 4, MTJT.squashLeaves.blockID, 0, 2);
        world.setBlock(i + 11, j + 10, k + 12, MTJT.squashLeaves.blockID, 0, 2);
        world.setBlock(i + 11, j + 10, k + 11, MTJT.squashLeaves.blockID, 0, 2);
        world.setBlock(i + 5, j + 11, k + 10, MTJT.squashLeaves.blockID, 0, 2);
        world.setBlock(i + 5, j + 11, k + 9, MTJT.squashLeaves.blockID, 0, 2);
        world.setBlock(i + 6, j + 11, k + 9, MTJT.squashLeaves.blockID, 0, 2);
        world.setBlock(i + 6, j + 11, k + 8, MTJT.squashLeaves.blockID, 0, 2);
        world.setBlock(i + 7, j + 11, k + 8, MTJT.squashLeaves.blockID, 0, 2);
        world.setBlock(i + 7, j + 11, k + 7, MTJT.squashLeaves.blockID, 0, 2);
        world.setBlock(i + 8, j + 11, k + 9, MTJT.squashLeaves.blockID, 0, 2);
        world.setBlock(i + 8, j + 11, k + 8, MTJT.squashLeaves.blockID, 0, 2);
        world.setBlock(i + 8, j + 11, k + 6, MTJT.squashLeaves.blockID, 0, 2);
        world.setBlock(i + 9, j + 11, k + 5, MTJT.squashLeaves.blockID, 0, 2);
        
        return true;
    }
} /*=====End of Code=====*/
