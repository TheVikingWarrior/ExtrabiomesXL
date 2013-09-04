package morethantrees.treegen;

import java.util.Random;

import morethantrees.MTJT;
import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

public class WorldGenJCBTree extends WorldGenerator
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
        world.setBlock(i + 0, j + 0, k + 2, MTJT.japanesecherryBlossomLog.blockID, 0, 2);
        world.setBlock(i + 0, j + 0, k + 3, MTJT.japanesecherryBlossomLog.blockID, 0, 2);
        world.setBlock(i + 0, j + 0, k + 4, MTJT.japanesecherryBlossomLog.blockID, 0, 2);
        world.setBlock(i + 0, j + 1, k + 2, MTJT.japanesecherryBlossomLog.blockID, 0, 2);
        world.setBlock(i + 0, j + 1, k + 3, MTJT.japanesecherryBlossomLog.blockID, 0, 2);
        world.setBlock(i + 0, j + 1, k + 4, MTJT.japanesecherryBlossomLog.blockID, 0, 2);
        world.setBlock(i + 0, j + 2, k + 3, MTJT.japanesecherryBlossomLog.blockID, 0, 2);
        world.setBlock(i + 0, j + 6, k + 4, MTJT.japanesecherryBlossomLeaves.blockID, 0, 2);
        world.setBlock(i + 0, j + 6, k + 5, MTJT.japanesecherryBlossomLeaves.blockID, 0, 2);
        world.setBlock(i + 0, j + 6, k + 6, MTJT.japanesecherryBlossomLeaves.blockID, 0, 2);
        world.setBlock(i + 0, j + 6, k + 8, MTJT.japanesecherryBlossomLeaves.blockID, 0, 2);
        world.setBlock(i + 1, j + 0, k + 1, MTJT.japanesecherryBlossomLog.blockID, 0, 2);
        world.setBlock(i + 1, j + 0, k + 2, MTJT.japanesecherryBlossomLog.blockID, 0, 2);
        world.setBlock(i + 1, j + 0, k + 3, MTJT.japanesecherryBlossomLog.blockID, 0, 2);
        world.setBlock(i + 1, j + 0, k + 4, MTJT.japanesecherryBlossomLog.blockID, 0, 2);
        world.setBlock(i + 1, j + 0, k + 5, MTJT.japanesecherryBlossomLog.blockID, 0, 2);
        world.setBlock(i + 1, j + 1, k + 1, MTJT.japanesecherryBlossomLog.blockID, 0, 2);
        world.setBlock(i + 1, j + 1, k + 2, MTJT.japanesecherryBlossomLog.blockID, 0, 2);
        world.setBlock(i + 1, j + 1, k + 3, MTJT.japanesecherryBlossomLog.blockID, 0, 2);
        world.setBlock(i + 1, j + 1, k + 4, MTJT.japanesecherryBlossomLog.blockID, 0, 2);
        world.setBlock(i + 1, j + 2, k + 2, MTJT.japanesecherryBlossomLog.blockID, 0, 2);
        world.setBlock(i + 1, j + 2, k + 3, MTJT.japanesecherryBlossomLog.blockID, 0, 2);
        world.setBlock(i + 1, j + 2, k + 4, MTJT.japanesecherryBlossomLog.blockID, 0, 2);
        world.setBlock(i + 1, j + 3, k + 2, MTJT.japanesecherryBlossomLog.blockID, 0, 2);
        world.setBlock(i + 1, j + 3, k + 3, MTJT.japanesecherryBlossomLog.blockID, 0, 2);
        world.setBlock(i + 1, j + 6, k + 2, MTJT.japanesecherryBlossomLeaves.blockID, 0, 2);
        world.setBlock(i + 1, j + 6, k + 5, MTJT.japanesecherryBlossomLeaves.blockID, 0, 2);
        world.setBlock(i + 1, j + 6, k + 8, MTJT.japanesecherryBlossomLeaves.blockID, 0, 2);
        world.setBlock(i + 1, j + 6, k + 9, MTJT.japanesecherryBlossomLeaves.blockID, 0, 2);
        world.setBlock(i + 2, j + 0, k + 0, MTJT.japanesecherryBlossomLog.blockID, 0, 2);
        world.setBlock(i + 2, j + 0, k + 1, MTJT.japanesecherryBlossomLog.blockID, 0, 2);
        world.setBlock(i + 2, j + 0, k + 2, MTJT.japanesecherryBlossomLog.blockID, 0, 2);
        world.setBlock(i + 2, j + 0, k + 3, MTJT.japanesecherryBlossomLog.blockID, 0, 2);
        world.setBlock(i + 2, j + 0, k + 4, MTJT.japanesecherryBlossomLog.blockID, 0, 2);
        world.setBlock(i + 2, j + 0, k + 5, MTJT.japanesecherryBlossomLog.blockID, 0, 2);
        world.setBlock(i + 2, j + 1, k + 1, MTJT.japanesecherryBlossomLog.blockID, 0, 2);
        world.setBlock(i + 2, j + 1, k + 2, MTJT.japanesecherryBlossomLog.blockID, 0, 2);
        world.setBlock(i + 2, j + 1, k + 3, MTJT.japanesecherryBlossomLog.blockID, 0, 2);
        world.setBlock(i + 2, j + 1, k + 4, MTJT.japanesecherryBlossomLog.blockID, 0, 2);
        world.setBlock(i + 2, j + 1, k + 5, MTJT.japanesecherryBlossomLog.blockID, 0, 2);
        world.setBlock(i + 2, j + 2, k + 1, MTJT.japanesecherryBlossomLog.blockID, 0, 2);
        world.setBlock(i + 2, j + 2, k + 2, MTJT.japanesecherryBlossomLog.blockID, 0, 2);
        world.setBlock(i + 2, j + 2, k + 3, MTJT.japanesecherryBlossomLog.blockID, 0, 2);
        world.setBlock(i + 2, j + 2, k + 4, MTJT.japanesecherryBlossomLog.blockID, 0, 2);
        world.setBlock(i + 2, j + 3, k + 1, MTJT.japanesecherryBlossomLog.blockID, 0, 2);
        world.setBlock(i + 2, j + 3, k + 2, MTJT.japanesecherryBlossomLog.blockID, 0, 2);
        world.setBlock(i + 2, j + 3, k + 3, MTJT.japanesecherryBlossomLog.blockID, 0, 2);
        world.setBlock(i + 2, j + 3, k + 4, MTJT.japanesecherryBlossomLog.blockID, 0, 2);
        world.setBlock(i + 2, j + 4, k + 2, MTJT.japanesecherryBlossomLog.blockID, 0, 2);
        world.setBlock(i + 2, j + 4, k + 3, MTJT.japanesecherryBlossomLog.blockID, 0, 2);
        world.setBlock(i + 2, j + 5, k + 7, MTJT.japanesecherryBlossomLeaves.blockID, 0, 2);
        world.setBlock(i + 2, j + 6, k + 1, MTJT.japanesecherryBlossomLeaves.blockID, 0, 2);
        world.setBlock(i + 2, j + 6, k + 3, MTJT.japanesecherryBlossomLeaves.blockID, 0, 2);
        world.setBlock(i + 2, j + 6, k + 6, MTJT.japanesecherryBlossomLeaves.blockID, 0, 2);
        world.setBlock(i + 2, j + 6, k + 9, MTJT.japanesecherryBlossomLeaves.blockID, 0, 2);
        world.setBlock(i + 2, j + 6, k + 10, MTJT.japanesecherryBlossomLeaves.blockID, 0, 2);
        world.setBlock(i + 2, j + 6, k + 11, MTJT.japanesecherryBlossomLeaves.blockID, 0, 2);
        world.setBlock(i + 3, j + 0, k + 1, MTJT.japanesecherryBlossomLog.blockID, 0, 2);
        world.setBlock(i + 3, j + 0, k + 2, MTJT.japanesecherryBlossomLog.blockID, 0, 2);
        world.setBlock(i + 3, j + 0, k + 3, MTJT.japanesecherryBlossomLog.blockID, 0, 2);
        world.setBlock(i + 3, j + 0, k + 4, MTJT.japanesecherryBlossomLog.blockID, 0, 2);
        world.setBlock(i + 3, j + 1, k + 0, MTJT.japanesecherryBlossomLog.blockID, 0, 2);
        world.setBlock(i + 3, j + 1, k + 1, MTJT.japanesecherryBlossomLog.blockID, 0, 2);
        world.setBlock(i + 3, j + 1, k + 2, MTJT.japanesecherryBlossomLog.blockID, 0, 2);
        world.setBlock(i + 3, j + 1, k + 3, MTJT.japanesecherryBlossomLog.blockID, 0, 2);
        world.setBlock(i + 3, j + 1, k + 4, MTJT.japanesecherryBlossomLog.blockID, 0, 2);
        world.setBlock(i + 3, j + 1, k + 5, MTJT.japanesecherryBlossomLog.blockID, 0, 2);
        world.setBlock(i + 3, j + 2, k + 0, MTJT.japanesecherryBlossomLog.blockID, 0, 2);
        world.setBlock(i + 3, j + 2, k + 1, MTJT.japanesecherryBlossomLog.blockID, 0, 2);
        world.setBlock(i + 3, j + 2, k + 2, MTJT.japanesecherryBlossomLog.blockID, 0, 2);
        world.setBlock(i + 3, j + 2, k + 3, MTJT.japanesecherryBlossomLog.blockID, 0, 2);
        world.setBlock(i + 3, j + 2, k + 4, MTJT.japanesecherryBlossomLog.blockID, 0, 2);
        world.setBlock(i + 3, j + 2, k + 5, MTJT.japanesecherryBlossomLog.blockID, 0, 2);
        world.setBlock(i + 3, j + 3, k + 1, MTJT.japanesecherryBlossomLog.blockID, 0, 2);
        world.setBlock(i + 3, j + 3, k + 2, MTJT.japanesecherryBlossomLog.blockID, 0, 2);
        world.setBlock(i + 3, j + 3, k + 3, MTJT.japanesecherryBlossomLog.blockID, 0, 2);
        world.setBlock(i + 3, j + 3, k + 4, MTJT.japanesecherryBlossomLog.blockID, 0, 2);
        world.setBlock(i + 3, j + 3, k + 5, MTJT.japanesecherryBlossomLog.blockID, 0, 2);
        world.setBlock(i + 3, j + 4, k + 2, MTJT.japanesecherryBlossomLog.blockID, 0, 2);
        world.setBlock(i + 3, j + 4, k + 3, MTJT.japanesecherryBlossomLog.blockID, 0, 2);
        world.setBlock(i + 3, j + 4, k + 4, MTJT.japanesecherryBlossomLog.blockID, 0, 2);
        world.setBlock(i + 3, j + 4, k + 5, MTJT.japanesecherryBlossomLog.blockID, 0, 2);
        world.setBlock(i + 3, j + 5, k + 8, MTJT.japanesecherryBlossomLeaves.blockID, 0, 2);
        world.setBlock(i + 3, j + 6, k + 2, MTJT.japanesecherryBlossomLeaves.blockID, 0, 2);
        world.setBlock(i + 3, j + 6, k + 3, MTJT.japanesecherryBlossomLeaves.blockID, 0, 2);
        world.setBlock(i + 3, j + 6, k + 6, MTJT.japanesecherryBlossomLeaves.blockID, 0, 2);
        world.setBlock(i + 4, j + 0, k + 1, MTJT.japanesecherryBlossomLog.blockID, 0, 2);
        world.setBlock(i + 4, j + 0, k + 2, MTJT.japanesecherryBlossomLog.blockID, 0, 2);
        world.setBlock(i + 4, j + 0, k + 3, MTJT.japanesecherryBlossomLog.blockID, 0, 2);
        world.setBlock(i + 4, j + 1, k + 1, MTJT.japanesecherryBlossomLog.blockID, 0, 2);
        world.setBlock(i + 4, j + 1, k + 2, MTJT.japanesecherryBlossomLog.blockID, 0, 2);
        world.setBlock(i + 4, j + 1, k + 3, MTJT.japanesecherryBlossomLog.blockID, 0, 2);
        world.setBlock(i + 4, j + 1, k + 4, MTJT.japanesecherryBlossomLog.blockID, 0, 2);
        world.setBlock(i + 4, j + 2, k + 1, MTJT.japanesecherryBlossomLog.blockID, 0, 2);
        world.setBlock(i + 4, j + 2, k + 2, MTJT.japanesecherryBlossomLog.blockID, 0, 2);
        world.setBlock(i + 4, j + 2, k + 3, MTJT.japanesecherryBlossomLog.blockID, 0, 2);
        world.setBlock(i + 4, j + 2, k + 4, MTJT.japanesecherryBlossomLog.blockID, 0, 2);
        world.setBlock(i + 4, j + 2, k + 5, MTJT.japanesecherryBlossomLog.blockID, 0, 2);
        world.setBlock(i + 4, j + 3, k + 2, MTJT.japanesecherryBlossomLog.blockID, 0, 2);
        world.setBlock(i + 4, j + 3, k + 3, MTJT.japanesecherryBlossomLog.blockID, 0, 2);
        world.setBlock(i + 4, j + 3, k + 4, MTJT.japanesecherryBlossomLog.blockID, 0, 2);
        world.setBlock(i + 4, j + 3, k + 5, MTJT.japanesecherryBlossomLog.blockID, 0, 2);
        world.setBlock(i + 4, j + 4, k + 3, MTJT.japanesecherryBlossomLog.blockID, 0, 2);
        world.setBlock(i + 4, j + 4, k + 4, MTJT.japanesecherryBlossomLog.blockID, 0, 2);
        world.setBlock(i + 4, j + 4, k + 5, MTJT.japanesecherryBlossomLog.blockID, 0, 2);
        world.setBlock(i + 4, j + 4, k + 6, MTJT.japanesecherryBlossomLog.blockID, 0, 2);
        world.setBlock(i + 4, j + 4, k + 7, MTJT.japanesecherryBlossomLeaves.blockID, 0, 2);
        world.setBlock(i + 4, j + 4, k + 8, MTJT.japanesecherryBlossomLeaves.blockID, 0, 2);
        world.setBlock(i + 4, j + 4, k + 10, MTJT.japanesecherryBlossomLeaves.blockID, 0, 2);
        world.setBlock(i + 4, j + 5, k + 2, MTJT.japanesecherryBlossomLeaves.blockID, 0, 2);
        world.setBlock(i + 4, j + 5, k + 4, MTJT.japanesecherryBlossomLog.blockID, 0, 2);
        world.setBlock(i + 4, j + 5, k + 5, MTJT.japanesecherryBlossomLog.blockID, 0, 2);
        world.setBlock(i + 4, j + 5, k + 6, MTJT.japanesecherryBlossomLeaves.blockID, 0, 2);
        world.setBlock(i + 5, j + 0, k + 2, MTJT.japanesecherryBlossomLog.blockID, 0, 2);
        world.setBlock(i + 5, j + 1, k + 3, MTJT.japanesecherryBlossomLog.blockID, 0, 2);
        world.setBlock(i + 5, j + 2, k + 3, MTJT.japanesecherryBlossomLog.blockID, 0, 2);
        world.setBlock(i + 5, j + 2, k + 4, MTJT.japanesecherryBlossomLog.blockID, 0, 2);
        world.setBlock(i + 5, j + 3, k + 3, MTJT.japanesecherryBlossomLog.blockID, 0, 2);
        world.setBlock(i + 5, j + 3, k + 4, MTJT.japanesecherryBlossomLog.blockID, 0, 2);
        world.setBlock(i + 5, j + 3, k + 5, MTJT.japanesecherryBlossomLog.blockID, 0, 2);
        world.setBlock(i + 5, j + 3, k + 6, MTJT.japanesecherryBlossomLeaves.blockID, 0, 2);
        world.setBlock(i + 5, j + 3, k + 8, MTJT.japanesecherryBlossomLeaves.blockID, 0, 2);
        world.setBlock(i + 5, j + 4, k + 3, MTJT.japanesecherryBlossomLog.blockID, 0, 2);
        world.setBlock(i + 5, j + 4, k + 4, MTJT.japanesecherryBlossomLog.blockID, 0, 2);
        world.setBlock(i + 5, j + 4, k + 5, MTJT.japanesecherryBlossomLog.blockID, 0, 2);
        world.setBlock(i + 5, j + 4, k + 6, MTJT.japanesecherryBlossomLog.blockID, 0, 2);
        world.setBlock(i + 5, j + 4, k + 8, MTJT.japanesecherryBlossomLeaves.blockID, 0, 2);
        world.setBlock(i + 5, j + 4, k + 11, MTJT.japanesecherryBlossomLeaves.blockID, 0, 2);
        world.setBlock(i + 5, j + 5, k + 4, MTJT.japanesecherryBlossomLog.blockID, 0, 2);
        world.setBlock(i + 5, j + 5, k + 5, MTJT.japanesecherryBlossomLog.blockID, 0, 2);
        world.setBlock(i + 5, j + 5, k + 6, MTJT.japanesecherryBlossomLog.blockID, 0, 2);
        world.setBlock(i + 5, j + 5, k + 10, MTJT.japanesecherryBlossomLeaves.blockID, 0, 2);
        world.setBlock(i + 5, j + 6, k + 0, MTJT.japanesecherryBlossomLeaves.blockID, 0, 2);
        world.setBlock(i + 5, j + 6, k + 5, MTJT.japanesecherryBlossomLeaves.blockID, 0, 2);
        world.setBlock(i + 5, j + 6, k + 6, MTJT.japanesecherryBlossomLeaves.blockID, 0, 2);
        world.setBlock(i + 5, j + 6, k + 7, MTJT.japanesecherryBlossomLeaves.blockID, 0, 2);
        world.setBlock(i + 5, j + 6, k + 11, MTJT.japanesecherryBlossomLeaves.blockID, 0, 2);
        world.setBlock(i + 6, j + 2, k + 8, MTJT.japanesecherryBlossomLeaves.blockID, 0, 2);
        world.setBlock(i + 6, j + 2, k + 9, MTJT.japanesecherryBlossomLeaves.blockID, 0, 2);
        world.setBlock(i + 6, j + 2, k + 11, MTJT.japanesecherryBlossomLeaves.blockID, 0, 2);
        world.setBlock(i + 6, j + 3, k + 6, MTJT.japanesecherryBlossomLeaves.blockID, 0, 2);
        world.setBlock(i + 6, j + 3, k + 7, MTJT.japanesecherryBlossomLeaves.blockID, 0, 2);
        world.setBlock(i + 6, j + 3, k + 11, MTJT.japanesecherryBlossomLeaves.blockID, 0, 2);
        world.setBlock(i + 6, j + 4, k + 5, MTJT.japanesecherryBlossomLog.blockID, 0, 2);
        world.setBlock(i + 6, j + 4, k + 6, MTJT.japanesecherryBlossomLog.blockID, 0, 2);
        world.setBlock(i + 6, j + 4, k + 7, MTJT.japanesecherryBlossomLeaves.blockID, 0, 2);
        world.setBlock(i + 6, j + 4, k + 8, MTJT.japanesecherryBlossomLeaves.blockID, 0, 2);
        world.setBlock(i + 6, j + 5, k + 3, MTJT.japanesecherryBlossomLeaves.blockID, 0, 2);
        world.setBlock(i + 6, j + 5, k + 5, MTJT.japanesecherryBlossomLog.blockID, 0, 2);
        world.setBlock(i + 6, j + 5, k + 6, MTJT.japanesecherryBlossomLog.blockID, 0, 2);
        world.setBlock(i + 6, j + 5, k + 7, MTJT.japanesecherryBlossomLog.blockID, 0, 2);
        world.setBlock(i + 6, j + 5, k + 8, MTJT.japanesecherryBlossomLeaves.blockID, 0, 2);
        world.setBlock(i + 6, j + 5, k + 9, MTJT.japanesecherryBlossomLeaves.blockID, 0, 2);
        world.setBlock(i + 6, j + 6, k + 0, MTJT.japanesecherryBlossomLeaves.blockID, 0, 2);
        world.setBlock(i + 6, j + 6, k + 1, MTJT.japanesecherryBlossomLeaves.blockID, 0, 2);
        world.setBlock(i + 6, j + 6, k + 3, MTJT.japanesecherryBlossomLeaves.blockID, 0, 2);
        world.setBlock(i + 6, j + 6, k + 4, MTJT.japanesecherryBlossomLeaves.blockID, 0, 2);
        world.setBlock(i + 6, j + 6, k + 6, MTJT.japanesecherryBlossomLog.blockID, 0, 2);
        world.setBlock(i + 6, j + 6, k + 7, MTJT.japanesecherryBlossomLeaves.blockID, 0, 2);
        world.setBlock(i + 6, j + 6, k + 8, MTJT.japanesecherryBlossomLeaves.blockID, 0, 2);
        world.setBlock(i + 6, j + 6, k + 9, MTJT.japanesecherryBlossomLeaves.blockID, 0, 2);
        world.setBlock(i + 6, j + 6, k + 10, MTJT.japanesecherryBlossomLeaves.blockID, 0, 2);
        world.setBlock(i + 6, j + 6, k + 12, MTJT.japanesecherryBlossomLeaves.blockID, 0, 2);
        world.setBlock(i + 7, j + 2, k + 8, MTJT.japanesecherryBlossomLeaves.blockID, 0, 2);
        world.setBlock(i + 7, j + 2, k + 9, MTJT.japanesecherryBlossomLeaves.blockID, 0, 2);
        world.setBlock(i + 7, j + 2, k + 12, MTJT.japanesecherryBlossomLeaves.blockID, 0, 2);
        world.setBlock(i + 7, j + 2, k + 13, MTJT.japanesecherryBlossomLeaves.blockID, 0, 2);
        world.setBlock(i + 7, j + 3, k + 5, MTJT.japanesecherryBlossomLeaves.blockID, 0, 2);
        world.setBlock(i + 7, j + 3, k + 6, MTJT.japanesecherryBlossomLeaves.blockID, 0, 2);
        world.setBlock(i + 7, j + 3, k + 7, MTJT.japanesecherryBlossomLeaves.blockID, 0, 2);
        world.setBlock(i + 7, j + 3, k + 10, MTJT.japanesecherryBlossomLeaves.blockID, 0, 2);
        world.setBlock(i + 7, j + 3, k + 12, MTJT.japanesecherryBlossomLeaves.blockID, 0, 2);
        world.setBlock(i + 7, j + 4, k + 6, MTJT.japanesecherryBlossomLog.blockID, 0, 2);
        world.setBlock(i + 7, j + 4, k + 8, MTJT.japanesecherryBlossomLeaves.blockID, 0, 2);
        world.setBlock(i + 7, j + 4, k + 11, MTJT.japanesecherryBlossomLeaves.blockID, 0, 2);
        world.setBlock(i + 7, j + 4, k + 12, MTJT.japanesecherryBlossomLeaves.blockID, 0, 2);
        world.setBlock(i + 7, j + 5, k + 3, MTJT.japanesecherryBlossomLeaves.blockID, 0, 2);
        world.setBlock(i + 7, j + 5, k + 4, MTJT.japanesecherryBlossomLeaves.blockID, 0, 2);
        world.setBlock(i + 7, j + 5, k + 5, MTJT.japanesecherryBlossomLeaves.blockID, 0, 2);
        world.setBlock(i + 7, j + 5, k + 6, MTJT.japanesecherryBlossomLog.blockID, 0, 2);
        world.setBlock(i + 7, j + 5, k + 7, MTJT.japanesecherryBlossomLog.blockID, 0, 2);
        world.setBlock(i + 7, j + 5, k + 11, MTJT.japanesecherryBlossomLeaves.blockID, 0, 2);
        world.setBlock(i + 7, j + 5, k + 12, MTJT.japanesecherryBlossomLeaves.blockID, 0, 2);
        world.setBlock(i + 7, j + 5, k + 13, MTJT.japanesecherryBlossomLeaves.blockID, 0, 2);
        world.setBlock(i + 7, j + 6, k + 0, MTJT.japanesecherryBlossomLeaves.blockID, 0, 2);
        world.setBlock(i + 7, j + 6, k + 1, MTJT.japanesecherryBlossomLeaves.blockID, 0, 2);
        world.setBlock(i + 7, j + 6, k + 2, MTJT.japanesecherryBlossomLeaves.blockID, 0, 2);
        world.setBlock(i + 7, j + 6, k + 4, MTJT.japanesecherryBlossomLeaves.blockID, 0, 2);
        world.setBlock(i + 7, j + 6, k + 5, MTJT.japanesecherryBlossomLeaves.blockID, 0, 2);
        world.setBlock(i + 7, j + 6, k + 6, MTJT.japanesecherryBlossomLeaves.blockID, 0, 2);
        world.setBlock(i + 7, j + 6, k + 7, MTJT.japanesecherryBlossomLeaves.blockID, 0, 2);
        world.setBlock(i + 7, j + 6, k + 10, MTJT.japanesecherryBlossomLeaves.blockID, 0, 2);
        world.setBlock(i + 7, j + 6, k + 11, MTJT.japanesecherryBlossomLeaves.blockID, 0, 2);
        world.setBlock(i + 8, j + 2, k + 4, MTJT.japanesecherryBlossomLeaves.blockID, 0, 2);
        world.setBlock(i + 8, j + 2, k + 6, MTJT.japanesecherryBlossomLeaves.blockID, 0, 2);
        world.setBlock(i + 8, j + 2, k + 9, MTJT.japanesecherryBlossomLeaves.blockID, 0, 2);
        world.setBlock(i + 8, j + 3, k + 6, MTJT.japanesecherryBlossomLeaves.blockID, 0, 2);
        world.setBlock(i + 8, j + 3, k + 12, MTJT.japanesecherryBlossomLeaves.blockID, 0, 2);
        world.setBlock(i + 8, j + 4, k + 2, MTJT.japanesecherryBlossomLeaves.blockID, 0, 2);
        world.setBlock(i + 8, j + 4, k + 3, MTJT.japanesecherryBlossomLeaves.blockID, 0, 2);
        world.setBlock(i + 8, j + 4, k + 7, MTJT.japanesecherryBlossomLog.blockID, 0, 2);
        world.setBlock(i + 8, j + 4, k + 8, MTJT.japanesecherryBlossomLeaves.blockID, 0, 2);
        world.setBlock(i + 8, j + 5, k + 1, MTJT.japanesecherryBlossomLeaves.blockID, 0, 2);
        world.setBlock(i + 8, j + 5, k + 2, MTJT.japanesecherryBlossomLeaves.blockID, 0, 2);
        world.setBlock(i + 8, j + 5, k + 4, MTJT.japanesecherryBlossomLeaves.blockID, 0, 2);
        world.setBlock(i + 8, j + 5, k + 5, MTJT.japanesecherryBlossomLeaves.blockID, 0, 2);
        world.setBlock(i + 8, j + 5, k + 7, MTJT.japanesecherryBlossomLog.blockID, 0, 2);
        world.setBlock(i + 8, j + 5, k + 9, MTJT.japanesecherryBlossomLeaves.blockID, 0, 2);
        world.setBlock(i + 8, j + 5, k + 13, MTJT.japanesecherryBlossomLeaves.blockID, 0, 2);
        world.setBlock(i + 8, j + 6, k + 8, MTJT.japanesecherryBlossomLeaves.blockID, 0, 2);
        world.setBlock(i + 8, j + 6, k + 10, MTJT.japanesecherryBlossomLeaves.blockID, 0, 2);
        world.setBlock(i + 8, j + 6, k + 11, MTJT.japanesecherryBlossomLeaves.blockID, 0, 2);
        world.setBlock(i + 9, j + 2, k + 4, MTJT.japanesecherryBlossomLeaves.blockID, 0, 2);
        world.setBlock(i + 9, j + 2, k + 8, MTJT.japanesecherryBlossomLeaves.blockID, 0, 2);
        world.setBlock(i + 9, j + 2, k + 9, MTJT.japanesecherryBlossomLeaves.blockID, 0, 2);
        world.setBlock(i + 9, j + 2, k + 12, MTJT.japanesecherryBlossomLeaves.blockID, 0, 2);
        world.setBlock(i + 9, j + 3, k + 8, MTJT.japanesecherryBlossomLeaves.blockID, 0, 2);
        world.setBlock(i + 9, j + 3, k + 11, MTJT.japanesecherryBlossomLeaves.blockID, 0, 2);
        world.setBlock(i + 9, j + 3, k + 13, MTJT.japanesecherryBlossomLeaves.blockID, 0, 2);
        world.setBlock(i + 9, j + 4, k + 4, MTJT.japanesecherryBlossomLeaves.blockID, 0, 2);
        world.setBlock(i + 9, j + 4, k + 6, MTJT.japanesecherryBlossomLeaves.blockID, 0, 2);
        world.setBlock(i + 9, j + 4, k + 8, MTJT.japanesecherryBlossomLog.blockID, 0, 2);
        world.setBlock(i + 9, j + 4, k + 10, MTJT.japanesecherryBlossomLeaves.blockID, 0, 2);
        world.setBlock(i + 9, j + 5, k + 1, MTJT.japanesecherryBlossomLeaves.blockID, 0, 2);
        world.setBlock(i + 9, j + 5, k + 5, MTJT.japanesecherryBlossomLeaves.blockID, 0, 2);
        world.setBlock(i + 9, j + 5, k + 7, MTJT.japanesecherryBlossomLeaves.blockID, 0, 2);
        world.setBlock(i + 9, j + 5, k + 11, MTJT.japanesecherryBlossomLeaves.blockID, 0, 2);
        world.setBlock(i + 9, j + 5, k + 13, MTJT.japanesecherryBlossomLeaves.blockID, 0, 2);
        world.setBlock(i + 9, j + 6, k + 2, MTJT.japanesecherryBlossomLeaves.blockID, 0, 2);
        world.setBlock(i + 9, j + 6, k + 4, MTJT.japanesecherryBlossomLeaves.blockID, 0, 2);
        world.setBlock(i + 9, j + 6, k + 5, MTJT.japanesecherryBlossomLeaves.blockID, 0, 2);
        world.setBlock(i + 9, j + 6, k + 10, MTJT.japanesecherryBlossomLeaves.blockID, 0, 2);
        world.setBlock(i + 10, j + 2, k + 4, MTJT.japanesecherryBlossomLeaves.blockID, 0, 2);
        world.setBlock(i + 10, j + 2, k + 7, MTJT.japanesecherryBlossomLeaves.blockID, 0, 2);
        world.setBlock(i + 10, j + 2, k + 10, MTJT.japanesecherryBlossomLeaves.blockID, 0, 2);
        world.setBlock(i + 10, j + 2, k + 11, MTJT.japanesecherryBlossomLeaves.blockID, 0, 2);
        world.setBlock(i + 10, j + 2, k + 12, MTJT.japanesecherryBlossomLeaves.blockID, 0, 2);
        world.setBlock(i + 10, j + 2, k + 13, MTJT.japanesecherryBlossomLeaves.blockID, 0, 2);
        world.setBlock(i + 10, j + 2, k + 15, MTJT.japanesecherryBlossomLeaves.blockID, 0, 2);
        world.setBlock(i + 10, j + 3, k + 4, MTJT.japanesecherryBlossomLeaves.blockID, 0, 2);
        world.setBlock(i + 10, j + 3, k + 5, MTJT.japanesecherryBlossomLeaves.blockID, 0, 2);
        world.setBlock(i + 10, j + 3, k + 7, MTJT.japanesecherryBlossomLeaves.blockID, 0, 2);
        world.setBlock(i + 10, j + 3, k + 8, MTJT.japanesecherryBlossomLog.blockID, 0, 2);
        world.setBlock(i + 10, j + 3, k + 10, MTJT.japanesecherryBlossomLeaves.blockID, 0, 2);
        world.setBlock(i + 10, j + 3, k + 14, MTJT.japanesecherryBlossomLeaves.blockID, 0, 2);
        world.setBlock(i + 10, j + 4, k + 2, MTJT.japanesecherryBlossomLeaves.blockID, 0, 2);
        world.setBlock(i + 10, j + 4, k + 7, MTJT.japanesecherryBlossomLeaves.blockID, 0, 2);
        world.setBlock(i + 10, j + 4, k + 8, MTJT.japanesecherryBlossomLog.blockID, 0, 2);
        world.setBlock(i + 10, j + 4, k + 9, MTJT.japanesecherryBlossomLeaves.blockID, 0, 2);
        world.setBlock(i + 10, j + 4, k + 10, MTJT.japanesecherryBlossomLeaves.blockID, 0, 2);
        world.setBlock(i + 10, j + 4, k + 12, MTJT.japanesecherryBlossomLeaves.blockID, 0, 2);
        world.setBlock(i + 10, j + 4, k + 13, MTJT.japanesecherryBlossomLeaves.blockID, 0, 2);
        world.setBlock(i + 10, j + 4, k + 14, MTJT.japanesecherryBlossomLeaves.blockID, 0, 2);
        world.setBlock(i + 10, j + 5, k + 7, MTJT.japanesecherryBlossomLeaves.blockID, 0, 2);
        world.setBlock(i + 10, j + 6, k + 4, MTJT.japanesecherryBlossomLeaves.blockID, 0, 2);
        world.setBlock(i + 10, j + 6, k + 7, MTJT.japanesecherryBlossomLeaves.blockID, 0, 2);
        world.setBlock(i + 10, j + 6, k + 8, MTJT.japanesecherryBlossomLeaves.blockID, 0, 2);
        world.setBlock(i + 10, j + 6, k + 9, MTJT.japanesecherryBlossomLeaves.blockID, 0, 2);
        world.setBlock(i + 10, j + 6, k + 10, MTJT.japanesecherryBlossomLeaves.blockID, 0, 2);
        world.setBlock(i + 11, j + 2, k + 4, MTJT.japanesecherryBlossomLeaves.blockID, 0, 2);
        world.setBlock(i + 11, j + 2, k + 11, MTJT.japanesecherryBlossomLeaves.blockID, 0, 2);
        world.setBlock(i + 11, j + 2, k + 13, MTJT.japanesecherryBlossomLeaves.blockID, 0, 2);
        world.setBlock(i + 11, j + 2, k + 14, MTJT.japanesecherryBlossomLeaves.blockID, 0, 2);
        world.setBlock(i + 11, j + 3, k + 2, MTJT.japanesecherryBlossomLeaves.blockID, 0, 2);
        world.setBlock(i + 11, j + 3, k + 3, MTJT.japanesecherryBlossomLeaves.blockID, 0, 2);
        world.setBlock(i + 11, j + 3, k + 4, MTJT.japanesecherryBlossomLeaves.blockID, 0, 2);
        world.setBlock(i + 11, j + 3, k + 5, MTJT.japanesecherryBlossomLeaves.blockID, 0, 2);
        world.setBlock(i + 11, j + 3, k + 7, MTJT.japanesecherryBlossomLeaves.blockID, 0, 2);
        world.setBlock(i + 11, j + 3, k + 8, MTJT.japanesecherryBlossomLog.blockID, 0, 2);
        world.setBlock(i + 11, j + 3, k + 9, MTJT.japanesecherryBlossomLog.blockID, 0, 2);
        world.setBlock(i + 11, j + 3, k + 10, MTJT.japanesecherryBlossomLeaves.blockID, 0, 2);
        world.setBlock(i + 11, j + 3, k + 11, MTJT.japanesecherryBlossomLeaves.blockID, 0, 2);
        world.setBlock(i + 11, j + 3, k + 13, MTJT.japanesecherryBlossomLeaves.blockID, 0, 2);
        world.setBlock(i + 11, j + 4, k + 4, MTJT.japanesecherryBlossomLeaves.blockID, 0, 2);
        world.setBlock(i + 11, j + 4, k + 8, MTJT.japanesecherryBlossomLeaves.blockID, 0, 2);
        world.setBlock(i + 11, j + 4, k + 9, MTJT.japanesecherryBlossomLeaves.blockID, 0, 2);
        world.setBlock(i + 11, j + 4, k + 12, MTJT.japanesecherryBlossomLeaves.blockID, 0, 2);
        world.setBlock(i + 11, j + 5, k + 8, MTJT.japanesecherryBlossomLeaves.blockID, 0, 2);
        world.setBlock(i + 11, j + 5, k + 12, MTJT.japanesecherryBlossomLeaves.blockID, 0, 2);
        world.setBlock(i + 11, j + 6, k + 6, MTJT.japanesecherryBlossomLeaves.blockID, 0, 2);
        world.setBlock(i + 11, j + 6, k + 7, MTJT.japanesecherryBlossomLeaves.blockID, 0, 2);
        world.setBlock(i + 12, j + 2, k + 3, MTJT.japanesecherryBlossomLeaves.blockID, 0, 2);
        world.setBlock(i + 12, j + 2, k + 4, MTJT.japanesecherryBlossomLeaves.blockID, 0, 2);
        world.setBlock(i + 12, j + 2, k + 7, MTJT.japanesecherryBlossomLeaves.blockID, 0, 2);
        world.setBlock(i + 12, j + 2, k + 8, MTJT.japanesecherryBlossomLeaves.blockID, 0, 2);
        world.setBlock(i + 12, j + 2, k + 9, MTJT.japanesecherryBlossomLog.blockID, 0, 2);
        world.setBlock(i + 12, j + 2, k + 10, MTJT.japanesecherryBlossomLeaves.blockID, 0, 2);
        world.setBlock(i + 12, j + 2, k + 11, MTJT.japanesecherryBlossomLeaves.blockID, 0, 2);
        world.setBlock(i + 12, j + 2, k + 15, MTJT.japanesecherryBlossomLeaves.blockID, 0, 2);
        world.setBlock(i + 12, j + 3, k + 2, MTJT.japanesecherryBlossomLeaves.blockID, 0, 2);
        world.setBlock(i + 12, j + 3, k + 6, MTJT.japanesecherryBlossomLeaves.blockID, 0, 2);
        world.setBlock(i + 12, j + 3, k + 9, MTJT.japanesecherryBlossomLeaves.blockID, 0, 2);
        world.setBlock(i + 12, j + 3, k + 12, MTJT.japanesecherryBlossomLeaves.blockID, 0, 2);
        world.setBlock(i + 12, j + 3, k + 13, MTJT.japanesecherryBlossomLeaves.blockID, 0, 2);
        world.setBlock(i + 12, j + 4, k + 3, MTJT.japanesecherryBlossomLeaves.blockID, 0, 2);
        world.setBlock(i + 12, j + 4, k + 4, MTJT.japanesecherryBlossomLeaves.blockID, 0, 2);
        world.setBlock(i + 12, j + 4, k + 8, MTJT.japanesecherryBlossomLeaves.blockID, 0, 2);
        world.setBlock(i + 12, j + 4, k + 11, MTJT.japanesecherryBlossomLeaves.blockID, 0, 2);
        world.setBlock(i + 12, j + 5, k + 7, MTJT.japanesecherryBlossomLeaves.blockID, 0, 2);
        world.setBlock(i + 12, j + 5, k + 12, MTJT.japanesecherryBlossomLeaves.blockID, 0, 2);
        world.setBlock(i + 12, j + 6, k + 4, MTJT.japanesecherryBlossomLeaves.blockID, 0, 2);
        world.setBlock(i + 12, j + 6, k + 7, MTJT.japanesecherryBlossomLeaves.blockID, 0, 2);
        world.setBlock(i + 13, j + 2, k + 3, MTJT.japanesecherryBlossomLeaves.blockID, 0, 2);
        world.setBlock(i + 13, j + 2, k + 7, MTJT.japanesecherryBlossomLeaves.blockID, 0, 2);
        world.setBlock(i + 13, j + 2, k + 9, MTJT.japanesecherryBlossomLeaves.blockID, 0, 2);
        world.setBlock(i + 13, j + 2, k + 11, MTJT.japanesecherryBlossomLeaves.blockID, 0, 2);
        world.setBlock(i + 13, j + 3, k + 3, MTJT.japanesecherryBlossomLeaves.blockID, 0, 2);
        world.setBlock(i + 13, j + 3, k + 4, MTJT.japanesecherryBlossomLeaves.blockID, 0, 2);
        world.setBlock(i + 13, j + 3, k + 7, MTJT.japanesecherryBlossomLeaves.blockID, 0, 2);
        world.setBlock(i + 13, j + 3, k + 8, MTJT.japanesecherryBlossomLeaves.blockID, 0, 2);
        world.setBlock(i + 13, j + 3, k + 10, MTJT.japanesecherryBlossomLeaves.blockID, 0, 2);
        world.setBlock(i + 13, j + 3, k + 12, MTJT.japanesecherryBlossomLeaves.blockID, 0, 2);
        world.setBlock(i + 13, j + 3, k + 14, MTJT.japanesecherryBlossomLeaves.blockID, 0, 2);
        world.setBlock(i + 13, j + 4, k + 6, MTJT.japanesecherryBlossomLeaves.blockID, 0, 2);
        world.setBlock(i + 13, j + 4, k + 8, MTJT.japanesecherryBlossomLeaves.blockID, 0, 2);
        world.setBlock(i + 13, j + 4, k + 11, MTJT.japanesecherryBlossomLeaves.blockID, 0, 2);
        world.setBlock(i + 13, j + 4, k + 12, MTJT.japanesecherryBlossomLeaves.blockID, 0, 2);
        world.setBlock(i + 13, j + 5, k + 3, MTJT.japanesecherryBlossomLeaves.blockID, 0, 2);
        world.setBlock(i + 13, j + 5, k + 5, MTJT.japanesecherryBlossomLeaves.blockID, 0, 2);
        world.setBlock(i + 13, j + 5, k + 7, MTJT.japanesecherryBlossomLeaves.blockID, 0, 2);
        world.setBlock(i + 13, j + 5, k + 8, MTJT.japanesecherryBlossomLeaves.blockID, 0, 2);
        world.setBlock(i + 14, j + 2, k + 3, MTJT.japanesecherryBlossomLeaves.blockID, 0, 2);
        world.setBlock(i + 14, j + 2, k + 8, MTJT.japanesecherryBlossomLeaves.blockID, 0, 2);
        world.setBlock(i + 14, j + 2, k + 9, MTJT.japanesecherryBlossomLeaves.blockID, 0, 2);
        world.setBlock(i + 14, j + 2, k + 13, MTJT.japanesecherryBlossomLeaves.blockID, 0, 2);
        world.setBlock(i + 14, j + 2, k + 15, MTJT.japanesecherryBlossomLeaves.blockID, 0, 2);
        world.setBlock(i + 14, j + 3, k + 7, MTJT.japanesecherryBlossomLeaves.blockID, 0, 2);
        world.setBlock(i + 14, j + 3, k + 8, MTJT.japanesecherryBlossomLeaves.blockID, 0, 2);
        world.setBlock(i + 14, j + 3, k + 11, MTJT.japanesecherryBlossomLeaves.blockID, 0, 2);
        world.setBlock(i + 14, j + 3, k + 12, MTJT.japanesecherryBlossomLeaves.blockID, 0, 2);
        world.setBlock(i + 14, j + 4, k + 3, MTJT.japanesecherryBlossomLeaves.blockID, 0, 2);
        world.setBlock(i + 14, j + 4, k + 5, MTJT.japanesecherryBlossomLeaves.blockID, 0, 2);
        world.setBlock(i + 14, j + 4, k + 8, MTJT.japanesecherryBlossomLeaves.blockID, 0, 2);
        world.setBlock(i + 14, j + 4, k + 10, MTJT.japanesecherryBlossomLeaves.blockID, 0, 2);
        world.setBlock(i + 14, j + 5, k + 5, MTJT.japanesecherryBlossomLeaves.blockID, 0, 2);
        world.setBlock(i + 15, j + 2, k + 9, MTJT.japanesecherryBlossomLeaves.blockID, 0, 2);
        world.setBlock(i + 15, j + 2, k + 12, MTJT.japanesecherryBlossomLeaves.blockID, 0, 2);
        world.setBlock(i + 15, j + 2, k + 13, MTJT.japanesecherryBlossomLeaves.blockID, 0, 2);
        world.setBlock(i + 15, j + 3, k + 3, MTJT.japanesecherryBlossomLeaves.blockID, 0, 2);
        world.setBlock(i + 15, j + 3, k + 4, MTJT.japanesecherryBlossomLeaves.blockID, 0, 2);
        world.setBlock(i + 15, j + 3, k + 8, MTJT.japanesecherryBlossomLeaves.blockID, 0, 2);
        world.setBlock(i + 15, j + 3, k + 10, MTJT.japanesecherryBlossomLeaves.blockID, 0, 2);
        world.setBlock(i + 15, j + 3, k + 12, MTJT.japanesecherryBlossomLeaves.blockID, 0, 2);
        world.setBlock(i + 15, j + 4, k + 6, MTJT.japanesecherryBlossomLeaves.blockID, 0, 2);
        world.setBlock(i + 15, j + 4, k + 8, MTJT.japanesecherryBlossomLeaves.blockID, 0, 2);
        world.setBlock(i + 15, j + 4, k + 9, MTJT.japanesecherryBlossomLeaves.blockID, 0, 2);
        world.setBlock(i + 16, j + 2, k + 6, MTJT.japanesecherryBlossomLeaves.blockID, 0, 2);
        world.setBlock(i + 16, j + 2, k + 8, MTJT.japanesecherryBlossomLeaves.blockID, 0, 2);
        world.setBlock(i + 16, j + 2, k + 13, MTJT.japanesecherryBlossomLeaves.blockID, 0, 2);
        world.setBlock(i + 16, j + 3, k + 4, MTJT.japanesecherryBlossomLeaves.blockID, 0, 2);
        world.setBlock(i + 16, j + 3, k + 5, MTJT.japanesecherryBlossomLeaves.blockID, 0, 2);
        world.setBlock(i + 16, j + 3, k + 6, MTJT.japanesecherryBlossomLeaves.blockID, 0, 2);
        world.setBlock(i + 16, j + 3, k + 12, MTJT.japanesecherryBlossomLeaves.blockID, 0, 2);
        world.setBlock(i + 16, j + 4, k + 6, MTJT.japanesecherryBlossomLeaves.blockID, 0, 2);
        world.setBlock(i + 16, j + 4, k + 7, MTJT.japanesecherryBlossomLeaves.blockID, 0, 2);
        world.setBlock(i + 16, j + 4, k + 8, MTJT.japanesecherryBlossomLeaves.blockID, 0, 2);
        world.setBlock(i + 16, j + 4, k + 10, MTJT.japanesecherryBlossomLeaves.blockID, 0, 2);
        world.setBlock(i + 17, j + 2, k + 6, MTJT.japanesecherryBlossomLeaves.blockID, 0, 2);
        world.setBlock(i + 17, j + 2, k + 8, MTJT.japanesecherryBlossomLeaves.blockID, 0, 2);
        world.setBlock(i + 17, j + 2, k + 9, MTJT.japanesecherryBlossomLeaves.blockID, 0, 2);
        world.setBlock(i + 17, j + 2, k + 10, MTJT.japanesecherryBlossomLeaves.blockID, 0, 2);
        world.setBlock(i + 17, j + 2, k + 11, MTJT.japanesecherryBlossomLeaves.blockID, 0, 2);
        world.setBlock(i + 17, j + 3, k + 7, MTJT.japanesecherryBlossomLeaves.blockID, 0, 2);
        world.setBlock(i + 17, j + 3, k + 8, MTJT.japanesecherryBlossomLeaves.blockID, 0, 2);
        world.setBlock(i + 18, j + 2, k + 9, MTJT.japanesecherryBlossomLeaves.blockID, 0, 2);
        world.setBlock(i + 18, j + 2, k + 10, MTJT.japanesecherryBlossomLeaves.blockID, 0, 2);
        world.setBlock(i + 18, j + 2, k + 11, MTJT.japanesecherryBlossomLeaves.blockID, 0, 2);
        
        return true;
    }
}