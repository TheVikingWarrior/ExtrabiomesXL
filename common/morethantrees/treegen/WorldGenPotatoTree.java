package morethantrees.treegen;

import java.util.Random;

import morethantrees.MTJT;
import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

public class WorldGenPotatoTree extends WorldGenerator
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
        world.setBlock(i + 6, j + 0, k + 10, MTJT.potatoLog.blockID, 0, 2);
        world.setBlock(i + 6, j + 0, k + 8, MTJT.potatoLog.blockID, 0, 2);
        world.setBlock(i + 8, j + 0, k + 7, MTJT.potatoLog.blockID, 0, 2);
        world.setBlock(i + 8, j + 0, k + 6, MTJT.potatoLog.blockID, 0, 2);
        world.setBlock(i + 9, j + 0, k + 9, MTJT.potatoLog.blockID, 0, 2);
        
        world.setBlock(i + 6, j + 1, k + 10, MTJT.potatoLog.blockID, 0, 2);
        world.setBlock(i + 6, j + 1, k + 8, MTJT.potatoLog.blockID, 0, 2);
        world.setBlock(i + 8, j + 1, k + 7, MTJT.potatoLog.blockID, 0, 2);
        world.setBlock(i + 8, j + 1, k + 6, MTJT.potatoLog.blockID, 0, 2);
        world.setBlock(i + 9, j + 1, k + 9, MTJT.potatoLog.blockID, 0, 2);
        world.setBlock(i + 6, j + 2, k + 9, MTJT.potatoLog.blockID, 0, 2);
        world.setBlock(i + 7, j + 2, k + 10, MTJT.potatoLog.blockID, 0, 2);
        world.setBlock(i + 7, j + 2, k + 9, MTJT.potatoLog.blockID, 0, 2);
        world.setBlock(i + 7, j + 2, k + 8, MTJT.potatoLog.blockID, 0, 2);
        world.setBlock(i + 8, j + 2, k + 9, MTJT.potatoLog.blockID, 0, 2);
        world.setBlock(i + 8, j + 2, k + 8, MTJT.potatoLog.blockID, 0, 2);
        world.setBlock(i + 8, j + 2, k + 7, MTJT.potatoLog.blockID, 0, 2);
        world.setBlock(i + 7, j + 3, k + 9, MTJT.potatoLog.blockID, 0, 2);
        world.setBlock(i + 7, j + 3, k + 8, MTJT.potatoLog.blockID, 0, 2);
        world.setBlock(i + 8, j + 3, k + 9, MTJT.potatoLog.blockID, 0, 2);
        world.setBlock(i + 8, j + 3, k + 8, MTJT.potatoLog.blockID, 0, 2);
        world.setBlock(i + 7, j + 4, k + 8, MTJT.potatoLog.blockID, 0, 2);
        world.setBlock(i + 8, j + 4, k + 9, MTJT.potatoLog.blockID, 0, 2);
        world.setBlock(i + 7, j + 5, k + 9, MTJT.potatoLog.blockID, 0, 2);
        world.setBlock(i + 7, j + 5, k + 8, MTJT.potatoLog.blockID, 0, 2);
        world.setBlock(i + 7, j + 6, k + 10, MTJT.potatoLog.blockID, 0, 2);
        world.setBlock(i + 7, j + 6, k + 9, MTJT.potatoLog.blockID, 0, 2);
        world.setBlock(i + 7, j + 6, k + 8, MTJT.potatoLog.blockID, 0, 2);
        world.setBlock(i + 7, j + 6, k + 7, MTJT.potatoLog.blockID, 0, 2);
        world.setBlock(i + 11, j + 6, k + 5, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 11, j + 6, k + 4, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 12, j + 6, k + 10, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 12, j + 6, k + 9, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 12, j + 6, k + 5, MTJT.potatoLog.blockID, 0, 2);
        world.setBlock(i + 12, j + 6, k + 4, MTJT.potatoLog.blockID, 0, 2);
        world.setBlock(i + 12, j + 6, k + 3, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 13, j + 6, k + 10, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 13, j + 6, k + 9, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 13, j + 6, k + 8, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 13, j + 6, k + 6, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 13, j + 6, k + 5, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 13, j + 6, k + 4, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 14, j + 6, k + 5, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 6, j + 7, k + 10, MTJT.potatoLog.blockID, 0, 2);
        world.setBlock(i + 6, j + 7, k + 7, MTJT.potatoLog.blockID, 0, 2);
        world.setBlock(i + 6, j + 7, k + 6, MTJT.potatoLog.blockID, 0, 2);
        world.setBlock(i + 7, j + 7, k + 10, MTJT.potatoLog.blockID, 0, 2);
        world.setBlock(i + 7, j + 7, k + 9, MTJT.potatoLog.blockID, 0, 2);
        world.setBlock(i + 7, j + 7, k + 7, MTJT.potatoLog.blockID, 0, 2);
        world.setBlock(i + 8, j + 7, k + 9, MTJT.potatoLog.blockID, 0, 2);
        world.setBlock(i + 8, j + 7, k + 8, MTJT.potatoLog.blockID, 0, 2);
        world.setBlock(i + 9, j + 7, k + 8, MTJT.potatoLog.blockID, 0, 2);
        world.setBlock(i + 10, j + 7, k + 9, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 10, j + 7, k + 8, MTJT.potatoLog.blockID, 0, 2);
        world.setBlock(i + 10, j + 7, k + 5, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 10, j + 7, k + 4, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 11, j + 7, k + 10, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 11, j + 7, k + 9, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 11, j + 7, k + 5, MTJT.potatoLog.blockID, 0, 2);
        world.setBlock(i + 11, j + 7, k + 4, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 11, j + 7, k + 3, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 12, j + 7, k + 11, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 12, j + 7, k + 10, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 12, j + 7, k + 9, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 12, j + 7, k + 8, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 12, j + 7, k + 5, MTJT.potatoLog.blockID, 0, 2);
        world.setBlock(i + 12, j + 7, k + 4, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 13, j + 7, k + 11, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 13, j + 7, k + 10, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 13, j + 7, k + 9, MTJT.potatoLog.blockID, 0, 2);
        world.setBlock(i + 13, j + 7, k + 8, MTJT.potatoLog.blockID, 0, 2);
        world.setBlock(i + 13, j + 7, k + 7, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 13, j + 7, k + 5, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 14, j + 7, k + 10, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 14, j + 7, k + 9, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 14, j + 7, k + 8, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 5, j + 8, k + 12, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 5, j + 8, k + 11, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 5, j + 8, k + 10, MTJT.potatoLog.blockID, 0, 2);
        world.setBlock(i + 5, j + 8, k + 6, MTJT.potatoLog.blockID, 0, 2);
        world.setBlock(i + 5, j + 8, k + 4, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 6, j + 8, k + 12, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 6, j + 8, k + 11, MTJT.potatoLog.blockID, 0, 2);
        world.setBlock(i + 6, j + 8, k + 10, MTJT.potatoLog.blockID, 0, 2);
        world.setBlock(i + 6, j + 8, k + 6, MTJT.potatoLog.blockID, 0, 2);
        world.setBlock(i + 6, j + 8, k + 5, MTJT.potatoLog.blockID, 0, 2);
        world.setBlock(i + 7, j + 8, k + 11, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 7, j + 8, k + 10, MTJT.potatoLog.blockID, 0, 2);
        world.setBlock(i + 7, j + 8, k + 9, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 8, j + 8, k + 10, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 8, j + 8, k + 9, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 9, j + 8, k + 8, MTJT.potatoLog.blockID, 0, 2);
        world.setBlock(i + 9, j + 8, k + 7, MTJT.potatoLog.blockID, 0, 2);
        world.setBlock(i + 10, j + 8, k + 8, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 10, j + 8, k + 7, MTJT.potatoLog.blockID, 0, 2);
        world.setBlock(i + 10, j + 8, k + 6, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 11, j + 8, k + 9, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 11, j + 8, k + 8, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 11, j + 8, k + 7, MTJT.potatoLog.blockID, 0, 2);
        world.setBlock(i + 11, j + 8, k + 6, MTJT.potatoLog.blockID, 0, 2);
        world.setBlock(i + 11, j + 8, k + 5, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 11, j + 8, k + 4, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 12, j + 8, k + 10, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 12, j + 8, k + 9, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 12, j + 8, k + 8, MTJT.potatoLog.blockID, 0, 2);
        world.setBlock(i + 12, j + 8, k + 7, MTJT.potatoLog.blockID, 0, 2);
        world.setBlock(i + 12, j + 8, k + 6, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 12, j + 8, k + 5, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 13, j + 8, k + 10, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 13, j + 8, k + 9, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 13, j + 8, k + 8, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 13, j + 8, k + 7, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 13, j + 8, k + 6, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 14, j + 8, k + 7, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 2, j + 9, k + 8, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 2, j + 9, k + 7, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 2, j + 9, k + 6, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 3, j + 9, k + 9, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 3, j + 9, k + 8, MTJT.potatoLog.blockID, 0, 2);
        world.setBlock(i + 3, j + 9, k + 7, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 3, j + 9, k + 6, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 3, j + 9, k + 5, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 3, j + 9, k + 4, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 4, j + 9, k + 13, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 4, j + 9, k + 12, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 4, j + 9, k + 11, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 4, j + 9, k + 9, MTJT.potatoLog.blockID, 0, 2);
        world.setBlock(i + 4, j + 9, k + 8, MTJT.potatoLog.blockID, 0, 2);
        world.setBlock(i + 4, j + 9, k + 5, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 4, j + 9, k + 4, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 4, j + 9, k + 3, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 5, j + 9, k + 13, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 5, j + 9, k + 12, MTJT.potatoLog.blockID, 0, 2);
        world.setBlock(i + 5, j + 9, k + 11, MTJT.potatoLog.blockID, 0, 2);
        world.setBlock(i + 5, j + 9, k + 10, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 5, j + 9, k + 9, MTJT.potatoLog.blockID, 0, 2);
        world.setBlock(i + 5, j + 9, k + 8, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 5, j + 9, k + 5, MTJT.potatoLog.blockID, 0, 2);
        world.setBlock(i + 5, j + 9, k + 4, MTJT.potatoLog.blockID, 0, 2);
        world.setBlock(i + 5, j + 9, k + 3, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 6, j + 9, k + 13, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 6, j + 9, k + 12, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 6, j + 9, k + 11, MTJT.potatoLog.blockID, 0, 2);
        world.setBlock(i + 6, j + 9, k + 10, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 6, j + 9, k + 9, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 6, j + 9, k + 6, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 6, j + 9, k + 5, MTJT.potatoLog.blockID, 0, 2);
        world.setBlock(i + 6, j + 9, k + 4, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 6, j + 9, k + 3, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 7, j + 9, k + 12, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 7, j + 9, k + 11, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 7, j + 9, k + 10, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 7, j + 9, k + 9, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 7, j + 9, k + 8, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 7, j + 9, k + 6, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 7, j + 9, k + 5, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 7, j + 9, k + 4, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 8, j + 9, k + 11, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 8, j + 9, k + 10, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 8, j + 9, k + 9, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 8, j + 9, k + 8, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 9, j + 9, k + 10, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 9, j + 9, k + 9, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 9, j + 9, k + 8, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 9, j + 9, k + 7, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 10, j + 9, k + 7, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 11, j + 9, k + 7, MTJT.potatoLog.blockID, 0, 2);
        world.setBlock(i + 11, j + 9, k + 6, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 12, j + 9, k + 9, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 12, j + 9, k + 8, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 12, j + 9, k + 7, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 12, j + 9, k + 6, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 12, j + 9, k + 5, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 13, j + 9, k + 6, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 13, j + 9, k + 5, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 0, j + 10, k + 8, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 1, j + 10, k + 9, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 1, j + 10, k + 8, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 1, j + 10, k + 7, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 2, j + 10, k + 11, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 2, j + 10, k + 10, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 2, j + 10, k + 9, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 2, j + 10, k + 8, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 2, j + 10, k + 7, MTJT.potatoLog.blockID, 0, 2);
        world.setBlock(i + 2, j + 10, k + 6, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 2, j + 10, k + 5, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 2, j + 10, k + 4, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 3, j + 10, k + 13, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 3, j + 10, k + 12, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 3, j + 10, k + 11, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 3, j + 10, k + 10, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 3, j + 10, k + 9, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 3, j + 10, k + 8, MTJT.potatoLog.blockID, 0, 2);
        world.setBlock(i + 3, j + 10, k + 7, MTJT.potatoLog.blockID, 0, 2);
        world.setBlock(i + 3, j + 10, k + 6, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 3, j + 10, k + 5, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 3, j + 10, k + 4, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 3, j + 10, k + 3, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 4, j + 10, k + 14, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 4, j + 10, k + 13, MTJT.potatoLog.blockID, 0, 2);
        world.setBlock(i + 4, j + 10, k + 12, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 4, j + 10, k + 11, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 4, j + 10, k + 10, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 4, j + 10, k + 9, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 4, j + 10, k + 8, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 4, j + 10, k + 7, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 4, j + 10, k + 6, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 4, j + 10, k + 5, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 4, j + 10, k + 4, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 4, j + 10, k + 3, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 4, j + 10, k + 2, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 5, j + 10, k + 14, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 5, j + 10, k + 13, MTJT.potatoLog.blockID, 0, 2);
        world.setBlock(i + 5, j + 10, k + 12, MTJT.potatoLog.blockID, 0, 2);
        world.setBlock(i + 5, j + 10, k + 11, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 5, j + 10, k + 10, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 5, j + 10, k + 9, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 5, j + 10, k + 8, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 5, j + 10, k + 7, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 5, j + 10, k + 6, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 5, j + 10, k + 5, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 5, j + 10, k + 4, MTJT.potatoLog.blockID, 0, 2);
        world.setBlock(i + 5, j + 10, k + 3, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 5, j + 10, k + 2, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 6, j + 10, k + 14, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 6, j + 10, k + 13, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 6, j + 10, k + 12, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 6, j + 10, k + 11, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 6, j + 10, k + 10, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 6, j + 10, k + 9, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 6, j + 10, k + 8, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 6, j + 10, k + 7, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 6, j + 10, k + 6, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 6, j + 10, k + 5, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 6, j + 10, k + 4, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 6, j + 10, k + 3, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 6, j + 10, k + 2, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 7, j + 10, k + 13, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 7, j + 10, k + 12, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 7, j + 10, k + 11, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 7, j + 10, k + 10, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 7, j + 10, k + 9, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 7, j + 10, k + 8, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 7, j + 10, k + 7, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 7, j + 10, k + 6, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 7, j + 10, k + 5, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 7, j + 10, k + 4, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 7, j + 10, k + 3, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 8, j + 10, k + 12, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 8, j + 10, k + 11, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 8, j + 10, k + 10, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 8, j + 10, k + 9, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 8, j + 10, k + 8, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 8, j + 10, k + 7, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 8, j + 10, k + 6, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 8, j + 10, k + 5, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 8, j + 10, k + 4, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 9, j + 10, k + 8, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 9, j + 10, k + 7, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 9, j + 10, k + 6, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 10, j + 10, k + 8, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 10, j + 10, k + 7, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 10, j + 10, k + 6, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 10, j + 10, k + 5, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 11, j + 10, k + 8, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 11, j + 10, k + 7, MTJT.potatoLog.blockID, 0, 2);
        world.setBlock(i + 11, j + 10, k + 6, MTJT.potatoLog.blockID, 0, 2);
        world.setBlock(i + 11, j + 10, k + 5, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 12, j + 10, k + 8, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 12, j + 10, k + 7, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 12, j + 10, k + 6, MTJT.potatoLog.blockID, 0, 2);
        world.setBlock(i + 12, j + 10, k + 5, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 12, j + 10, k + 4, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 13, j + 10, k + 7, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 13, j + 10, k + 6, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 13, j + 10, k + 5, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 13, j + 10, k + 4, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 14, j + 10, k + 6, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 14, j + 10, k + 5, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 14, j + 10, k + 4, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 1, j + 11, k + 8, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 1, j + 11, k + 7, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 1, j + 11, k + 6, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 2, j + 11, k + 9, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 2, j + 11, k + 8, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 2, j + 11, k + 7, MTJT.potatoLog.blockID, 0, 2);
        world.setBlock(i + 2, j + 11, k + 6, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 3, j + 11, k + 10, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 3, j + 11, k + 9, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 3, j + 11, k + 8, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 3, j + 11, k + 7, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 3, j + 11, k + 6, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 3, j + 11, k + 5, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 3, j + 11, k + 4, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 4, j + 11, k + 13, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 4, j + 11, k + 12, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 4, j + 11, k + 11, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 4, j + 11, k + 10, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 4, j + 11, k + 9, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 4, j + 11, k + 8, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 4, j + 11, k + 7, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 4, j + 11, k + 6, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 4, j + 11, k + 5, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 4, j + 11, k + 4, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 4, j + 11, k + 3, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 5, j + 11, k + 13, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 5, j + 11, k + 12, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 5, j + 11, k + 11, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 5, j + 11, k + 10, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 5, j + 11, k + 9, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 5, j + 11, k + 8, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 5, j + 11, k + 7, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 5, j + 11, k + 6, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 5, j + 11, k + 5, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 5, j + 11, k + 4, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 5, j + 11, k + 3, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 6, j + 11, k + 12, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 6, j + 11, k + 11, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 6, j + 11, k + 10, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 6, j + 11, k + 9, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 6, j + 11, k + 8, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 6, j + 11, k + 7, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 6, j + 11, k + 6, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 6, j + 11, k + 5, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 6, j + 11, k + 4, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 6, j + 11, k + 3, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 7, j + 11, k + 11, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 7, j + 11, k + 10, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 7, j + 11, k + 9, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 7, j + 11, k + 6, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 7, j + 11, k + 5, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 7, j + 11, k + 4, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 8, j + 11, k + 8, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 9, j + 11, k + 7, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 9, j + 11, k + 6, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 9, j + 11, k + 5, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 10, j + 11, k + 7, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 10, j + 11, k + 6, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 10, j + 11, k + 5, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 10, j + 11, k + 4, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 11, j + 11, k + 7, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 11, j + 11, k + 6, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 11, j + 11, k + 5, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 11, j + 11, k + 4, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 12, j + 11, k + 8, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 12, j + 11, k + 7, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 12, j + 11, k + 6, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 12, j + 11, k + 5, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 12, j + 11, k + 4, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 12, j + 11, k + 3, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 13, j + 11, k + 8, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 13, j + 11, k + 7, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 13, j + 11, k + 6, MTJT.potatoLog.blockID, 0, 2);
        world.setBlock(i + 13, j + 11, k + 5, MTJT.potatoLog.blockID, 0, 2);
        world.setBlock(i + 13, j + 11, k + 4, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 13, j + 11, k + 3, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 14, j + 11, k + 7, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 14, j + 11, k + 6, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 14, j + 11, k + 5, MTJT.potatoLog.blockID, 0, 2);
        world.setBlock(i + 14, j + 11, k + 4, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 14, j + 11, k + 3, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 15, j + 11, k + 6, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 15, j + 11, k + 5, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 15, j + 11, k + 4, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 15, j + 11, k + 3, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 2, j + 12, k + 7, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 3, j + 12, k + 8, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 3, j + 12, k + 7, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 4, j + 12, k + 9, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 4, j + 12, k + 8, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 4, j + 12, k + 7, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 4, j + 12, k + 6, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 5, j + 12, k + 11, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 5, j + 12, k + 10, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 5, j + 12, k + 9, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 5, j + 12, k + 8, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 5, j + 12, k + 7, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 5, j + 12, k + 6, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 5, j + 12, k + 5, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 5, j + 12, k + 4, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 6, j + 12, k + 10, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 6, j + 12, k + 9, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 6, j + 12, k + 6, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 6, j + 12, k + 5, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 11, j + 12, k + 6, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 11, j + 12, k + 5, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 12, j + 12, k + 7, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 12, j + 12, k + 6, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 12, j + 12, k + 5, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 13, j + 12, k + 6, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 13, j + 12, k + 5, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 13, j + 12, k + 4, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 14, j + 12, k + 5, MTJT.potatoLeaves.blockID, 0, 2);
        world.setBlock(i + 14, j + 12, k + 4, MTJT.potatoLeaves.blockID, 0, 2);
        
        return true;
    }
} /*=====End of Code=====*/
