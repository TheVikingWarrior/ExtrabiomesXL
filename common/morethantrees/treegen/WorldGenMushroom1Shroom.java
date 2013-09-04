package morethantrees.treegen;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

public class WorldGenMushroom1Shroom extends WorldGenerator
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
        world.setBlock(i + 5, j + 0, k + 10, 17, 1, 2);
        world.setBlock(i + 6, j + 0, k + 11, 17, 1, 2);
        world.setBlock(i + 6, j + 0, k + 10, 17, 1, 2);
        world.setBlock(i + 6, j + 1, k + 10, 17, 1, 2);
        world.setBlock(i + 6, j + 1, k + 9, 17, 1, 2);
        world.setBlock(i + 7, j + 1, k + 10, 17, 1, 2);
        world.setBlock(i + 6, j + 2, k + 9, 17, 1, 2);
        world.setBlock(i + 7, j + 2, k + 10, 17, 1, 2);
        world.setBlock(i + 7, j + 2, k + 9, 17, 1, 2);
        world.setBlock(i + 7, j + 3, k + 9, 17, 1, 2);
        world.setBlock(i + 7, j + 3, k + 8, 17, 1, 2);
        world.setBlock(i + 8, j + 3, k + 9, 17, 1, 2);
        world.setBlock(i + 7, j + 4, k + 9, 17, 1, 2);
        world.setBlock(i + 7, j + 4, k + 8, 17, 1, 2);
        world.setBlock(i + 8, j + 4, k + 9, 17, 1, 2);
        world.setBlock(i + 8, j + 4, k + 8, 17, 1, 2);
        world.setBlock(i + 0, j + 5, k + 8, 88, 0, 2);
        world.setBlock(i + 1, j + 5, k + 9, 88, 0, 2);
        world.setBlock(i + 1, j + 5, k + 7, 88, 0, 2);
        world.setBlock(i + 2, j + 5, k + 10, 88, 0, 2);
        world.setBlock(i + 2, j + 5, k + 6, 88, 0, 2);
        world.setBlock(i + 3, j + 5, k + 11, 88, 0, 2);
        world.setBlock(i + 3, j + 5, k + 5, 88, 0, 2);
        world.setBlock(i + 4, j + 5, k + 12, 88, 0, 2);
        world.setBlock(i + 4, j + 5, k + 4, 88, 0, 2);
        world.setBlock(i + 5, j + 5, k + 13, 88, 0, 2);
        world.setBlock(i + 5, j + 5, k + 3, 88, 0, 2);
        world.setBlock(i + 6, j + 5, k + 14, 88, 0, 2);
        world.setBlock(i + 6, j + 5, k + 2, 88, 0, 2);
        world.setBlock(i + 7, j + 5, k + 15, 88, 0, 2);
        world.setBlock(i + 7, j + 5, k + 14, 89, 0, 2);
        world.setBlock(i + 7, j + 5, k + 8, 17, 1, 2);
        world.setBlock(i + 7, j + 5, k + 2, 89, 0, 2);
        world.setBlock(i + 7, j + 5, k + 1, 88, 0, 2);
        world.setBlock(i + 8, j + 5, k + 16, 88, 0, 2);
        world.setBlock(i + 8, j + 5, k + 15, 89, 0, 2);
        world.setBlock(i + 8, j + 5, k + 9, 17, 1, 2);
        world.setBlock(i + 8, j + 5, k + 8, 17, 1, 2);
        world.setBlock(i + 8, j + 5, k + 7, 17, 1, 2);
        world.setBlock(i + 8, j + 5, k + 1, 89, 0, 2);
        world.setBlock(i + 8, j + 5, k + 0, 88, 0, 2);
        world.setBlock(i + 9, j + 5, k + 15, 88, 0, 2);
        world.setBlock(i + 9, j + 5, k + 14, 89, 0, 2);
        world.setBlock(i + 9, j + 5, k + 8, 17, 1, 2);
        world.setBlock(i + 9, j + 5, k + 2, 89, 0, 2);
        world.setBlock(i + 9, j + 5, k + 1, 88, 0, 2);
        world.setBlock(i + 10, j + 5, k + 14, 88, 0, 2);
        world.setBlock(i + 10, j + 5, k + 2, 88, 0, 2);
        world.setBlock(i + 11, j + 5, k + 13, 88, 0, 2);
        world.setBlock(i + 11, j + 5, k + 3, 88, 0, 2);
        world.setBlock(i + 12, j + 5, k + 12, 88, 0, 2);
        world.setBlock(i + 12, j + 5, k + 4, 88, 0, 2);
        world.setBlock(i + 13, j + 5, k + 11, 88, 0, 2);
        world.setBlock(i + 13, j + 5, k + 5, 88, 0, 2);
        world.setBlock(i + 14, j + 5, k + 10, 88, 0, 2);
        world.setBlock(i + 14, j + 5, k + 6, 88, 0, 2);
        world.setBlock(i + 15, j + 5, k + 9, 88, 0, 2);
        world.setBlock(i + 15, j + 5, k + 7, 88, 0, 2);
        world.setBlock(i + 16, j + 5, k + 8, 88, 0, 2);
        world.setBlock(i + 1, j + 6, k + 8, 88, 0, 2);
        world.setBlock(i + 2, j + 6, k + 9, 88, 0, 2);
        world.setBlock(i + 2, j + 6, k + 8, 89, 0, 2);
        world.setBlock(i + 2, j + 6, k + 7, 88, 0, 2);
        world.setBlock(i + 3, j + 6, k + 10, 88, 0, 2);
        world.setBlock(i + 3, j + 6, k + 9, 89, 0, 2);
        world.setBlock(i + 3, j + 6, k + 7, 89, 0, 2);
        world.setBlock(i + 3, j + 6, k + 6, 88, 0, 2);
        world.setBlock(i + 4, j + 6, k + 11, 88, 0, 2);
        world.setBlock(i + 4, j + 6, k + 10, 89, 0, 2);
        world.setBlock(i + 4, j + 6, k + 5, 88, 0, 2);
        world.setBlock(i + 5, j + 6, k + 12, 88, 0, 2);
        world.setBlock(i + 5, j + 6, k + 4, 88, 0, 2);
        world.setBlock(i + 6, j + 6, k + 13, 88, 0, 2);
        world.setBlock(i + 6, j + 6, k + 3, 88, 0, 2);
        world.setBlock(i + 7, j + 6, k + 14, 88, 0, 2);
        world.setBlock(i + 7, j + 6, k + 8, 17, 1, 2);
        world.setBlock(i + 7, j + 6, k + 2, 88, 0, 2);
        world.setBlock(i + 8, j + 6, k + 15, 88, 0, 2);
        world.setBlock(i + 8, j + 6, k + 14, 89, 0, 2);
        world.setBlock(i + 8, j + 6, k + 9, 17, 1, 2);
        world.setBlock(i + 8, j + 6, k + 8, 17, 1, 2);
        world.setBlock(i + 8, j + 6, k + 7, 17, 1, 2);
        world.setBlock(i + 8, j + 6, k + 1, 88, 0, 2);
        world.setBlock(i + 9, j + 6, k + 14, 88, 0, 2);
        world.setBlock(i + 9, j + 6, k + 8, 17, 1, 2);
        world.setBlock(i + 9, j + 6, k + 2, 88, 0, 2);
        world.setBlock(i + 10, j + 6, k + 13, 88, 0, 2);
        world.setBlock(i + 10, j + 6, k + 3, 88, 0, 2);
        world.setBlock(i + 11, j + 6, k + 12, 88, 0, 2);
        world.setBlock(i + 11, j + 6, k + 7, 89, 0, 2);
        world.setBlock(i + 11, j + 6, k + 4, 88, 0, 2);
        world.setBlock(i + 12, j + 6, k + 11, 88, 0, 2);
        world.setBlock(i + 12, j + 6, k + 10, 89, 0, 2);
        world.setBlock(i + 12, j + 6, k + 9, 89, 0, 2);
        world.setBlock(i + 12, j + 6, k + 8, 89, 0, 2);
        world.setBlock(i + 12, j + 6, k + 7, 89, 0, 2);
        world.setBlock(i + 12, j + 6, k + 6, 89, 0, 2);
        world.setBlock(i + 12, j + 6, k + 5, 88, 0, 2);
        world.setBlock(i + 13, j + 6, k + 10, 88, 0, 2);
        world.setBlock(i + 13, j + 6, k + 9, 89, 0, 2);
        world.setBlock(i + 13, j + 6, k + 8, 89, 0, 2);
        world.setBlock(i + 13, j + 6, k + 7, 89, 0, 2);
        world.setBlock(i + 13, j + 6, k + 6, 88, 0, 2);
        world.setBlock(i + 14, j + 6, k + 9, 88, 0, 2);
        world.setBlock(i + 14, j + 6, k + 8, 89, 0, 2);
        world.setBlock(i + 14, j + 6, k + 7, 88, 0, 2);
        world.setBlock(i + 15, j + 6, k + 8, 88, 0, 2);
        world.setBlock(i + 2, j + 7, k + 8, 88, 0, 2);
        world.setBlock(i + 3, j + 7, k + 9, 88, 0, 2);
        world.setBlock(i + 3, j + 7, k + 8, 89, 0, 2);
        world.setBlock(i + 3, j + 7, k + 7, 88, 0, 2);
        world.setBlock(i + 4, j + 7, k + 10, 88, 0, 2);
        world.setBlock(i + 4, j + 7, k + 9, 89, 0, 2);
        world.setBlock(i + 4, j + 7, k + 7, 89, 0, 2);
        world.setBlock(i + 4, j + 7, k + 6, 88, 0, 2);
        world.setBlock(i + 5, j + 7, k + 11, 88, 0, 2);
        world.setBlock(i + 5, j + 7, k + 5, 88, 0, 2);
        world.setBlock(i + 6, j + 7, k + 12, 88, 0, 2);
        world.setBlock(i + 6, j + 7, k + 4, 88, 0, 2);
        world.setBlock(i + 7, j + 7, k + 13, 88, 0, 2);
        world.setBlock(i + 7, j + 7, k + 3, 88, 0, 2);
        world.setBlock(i + 8, j + 7, k + 14, 88, 0, 2);
        world.setBlock(i + 8, j + 7, k + 8, 17, 1, 2);
        world.setBlock(i + 8, j + 7, k + 2, 88, 0, 2);
        world.setBlock(i + 9, j + 7, k + 13, 88, 0, 2);
        world.setBlock(i + 9, j + 7, k + 3, 88, 0, 2);
        world.setBlock(i + 10, j + 7, k + 12, 88, 0, 2);
        world.setBlock(i + 10, j + 7, k + 4, 88, 0, 2);
        world.setBlock(i + 11, j + 7, k + 11, 88, 0, 2);
        world.setBlock(i + 11, j + 7, k + 10, 88, 0, 2);
        world.setBlock(i + 11, j + 7, k + 9, 88, 0, 2);
        world.setBlock(i + 11, j + 7, k + 8, 89, 0, 2);
        world.setBlock(i + 11, j + 7, k + 7, 88, 0, 2);
        world.setBlock(i + 11, j + 7, k + 6, 88, 0, 2);
        world.setBlock(i + 11, j + 7, k + 5, 88, 0, 2);
        world.setBlock(i + 12, j + 7, k + 10, 88, 0, 2);
        world.setBlock(i + 12, j + 7, k + 9, 88, 0, 2);
        world.setBlock(i + 12, j + 7, k + 8, 88, 0, 2);
        world.setBlock(i + 12, j + 7, k + 7, 88, 0, 2);
        world.setBlock(i + 12, j + 7, k + 6, 88, 0, 2);
        world.setBlock(i + 13, j + 7, k + 9, 88, 0, 2);
        world.setBlock(i + 13, j + 7, k + 8, 88, 0, 2);
        world.setBlock(i + 13, j + 7, k + 7, 88, 0, 2);
        world.setBlock(i + 14, j + 7, k + 8, 88, 0, 2);
        world.setBlock(i + 3, j + 8, k + 8, 88, 0, 2);
        world.setBlock(i + 4, j + 8, k + 9, 88, 0, 2);
        world.setBlock(i + 4, j + 8, k + 8, 88, 0, 2);
        world.setBlock(i + 4, j + 8, k + 7, 88, 0, 2);
        world.setBlock(i + 5, j + 8, k + 10, 88, 0, 2);
        world.setBlock(i + 5, j + 8, k + 9, 88, 0, 2);
        world.setBlock(i + 5, j + 8, k + 8, 88, 0, 2);
        world.setBlock(i + 5, j + 8, k + 7, 88, 0, 2);
        world.setBlock(i + 5, j + 8, k + 6, 88, 0, 2);
        world.setBlock(i + 6, j + 8, k + 11, 88, 0, 2);
        world.setBlock(i + 6, j + 8, k + 10, 88, 0, 2);
        world.setBlock(i + 6, j + 8, k + 9, 88, 0, 2);
        world.setBlock(i + 6, j + 8, k + 8, 88, 0, 2);
        world.setBlock(i + 6, j + 8, k + 7, 88, 0, 2);
        world.setBlock(i + 6, j + 8, k + 6, 88, 0, 2);
        world.setBlock(i + 6, j + 8, k + 5, 88, 0, 2);
        world.setBlock(i + 7, j + 8, k + 12, 88, 0, 2);
        world.setBlock(i + 7, j + 8, k + 11, 88, 0, 2);
        world.setBlock(i + 7, j + 8, k + 10, 88, 0, 2);
        world.setBlock(i + 7, j + 8, k + 9, 88, 0, 2);
        world.setBlock(i + 7, j + 8, k + 8, 88, 0, 2);
        world.setBlock(i + 7, j + 8, k + 7, 88, 0, 2);
        world.setBlock(i + 7, j + 8, k + 6, 88, 0, 2);
        world.setBlock(i + 7, j + 8, k + 5, 88, 0, 2);
        world.setBlock(i + 7, j + 8, k + 4, 88, 0, 2);
        world.setBlock(i + 8, j + 8, k + 13, 88, 0, 2);
        world.setBlock(i + 8, j + 8, k + 12, 88, 0, 2);
        world.setBlock(i + 8, j + 8, k + 11, 88, 0, 2);
        world.setBlock(i + 8, j + 8, k + 10, 88, 0, 2);
        world.setBlock(i + 8, j + 8, k + 9, 88, 0, 2);
        world.setBlock(i + 8, j + 8, k + 8, 88, 0, 2);
        world.setBlock(i + 8, j + 8, k + 7, 88, 0, 2);
        world.setBlock(i + 8, j + 8, k + 6, 88, 0, 2);
        world.setBlock(i + 8, j + 8, k + 5, 88, 0, 2);
        world.setBlock(i + 8, j + 8, k + 4, 88, 0, 2);
        world.setBlock(i + 8, j + 8, k + 3, 88, 0, 2);
        world.setBlock(i + 9, j + 8, k + 12, 88, 0, 2);
        world.setBlock(i + 9, j + 8, k + 11, 88, 0, 2);
        world.setBlock(i + 9, j + 8, k + 10, 88, 0, 2);
        world.setBlock(i + 9, j + 8, k + 9, 88, 0, 2);
        world.setBlock(i + 9, j + 8, k + 8, 88, 0, 2);
        world.setBlock(i + 9, j + 8, k + 7, 88, 0, 2);
        world.setBlock(i + 9, j + 8, k + 6, 88, 0, 2);
        world.setBlock(i + 9, j + 8, k + 5, 88, 0, 2);
        world.setBlock(i + 9, j + 8, k + 4, 88, 0, 2);
        world.setBlock(i + 10, j + 8, k + 11, 88, 0, 2);
        world.setBlock(i + 10, j + 8, k + 10, 88, 0, 2);
        world.setBlock(i + 10, j + 8, k + 9, 88, 0, 2);
        world.setBlock(i + 10, j + 8, k + 8, 88, 0, 2);
        world.setBlock(i + 10, j + 8, k + 7, 88, 0, 2);
        world.setBlock(i + 10, j + 8, k + 6, 88, 0, 2);
        world.setBlock(i + 10, j + 8, k + 5, 88, 0, 2);
        world.setBlock(i + 11, j + 8, k + 10, 88, 0, 2);
        world.setBlock(i + 11, j + 8, k + 9, 88, 0, 2);
        world.setBlock(i + 11, j + 8, k + 8, 88, 0, 2);
        world.setBlock(i + 11, j + 8, k + 7, 88, 0, 2);
        world.setBlock(i + 11, j + 8, k + 6, 88, 0, 2);
        world.setBlock(i + 12, j + 8, k + 9, 88, 0, 2);
        world.setBlock(i + 12, j + 8, k + 8, 88, 0, 2);
        world.setBlock(i + 12, j + 8, k + 7, 88, 0, 2);
        world.setBlock(i + 13, j + 8, k + 8, 88, 0, 2);
        
        return true;
    }
}
