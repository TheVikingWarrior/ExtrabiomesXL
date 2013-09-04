package morethantrees.treegen;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

public class WorldGenMaritimePineLargeTree extends WorldGenerator
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
        world.setBlock(i + 3, j + 0, k + 5, 17, 1, 2);
        world.setBlock(i + 3, j + 0, k + 4, 17, 1, 2);
        world.setBlock(i + 4, j + 0, k + 6, 17, 1, 2);
        world.setBlock(i + 4, j + 0, k + 5, 17, 1, 2);
        world.setBlock(i + 4, j + 0, k + 4, 17, 1, 2);
        world.setBlock(i + 5, j + 0, k + 5, 17, 1, 2);
        world.setBlock(i + 3, j + 1, k + 4, 17, 1, 2);
        world.setBlock(i + 4, j + 1, k + 5, 17, 1, 2);
        world.setBlock(i + 4, j + 1, k + 4, 17, 1, 2);
        world.setBlock(i + 4, j + 2, k + 5, 17, 1, 2);
        world.setBlock(i + 4, j + 2, k + 4, 17, 1, 2);
        world.setBlock(i + 4, j + 3, k + 5, 17, 1, 2);
        world.setBlock(i + 4, j + 3, k + 4, 17, 1, 2);
        world.setBlock(i + 4, j + 4, k + 5, 17, 1, 2);
        world.setBlock(i + 4, j + 5, k + 5, 17, 1, 2);
        world.setBlock(i + 4, j + 6, k + 5, 17, 1, 2);
        world.setBlock(i + 4, j + 7, k + 5, 17, 1, 2);
        world.setBlock(i + 5, j + 8, k + 5, 17, 1, 2);
        world.setBlock(i + 5, j + 9, k + 5, 17, 1, 2);
        world.setBlock(i + 5, j + 10, k + 5, 17, 1, 2);
        world.setBlock(i + 5, j + 11, k + 5, 17, 1, 2);
        world.setBlock(i + 5, j + 12, k + 5, 17, 1, 2);
        world.setBlock(i + 5, j + 13, k + 5, 17, 1, 2);
        world.setBlock(i + 4, j + 14, k + 4, 17, 1, 2);
        world.setBlock(i + 5, j + 14, k + 5, 17, 1, 2);
        world.setBlock(i + 4, j + 15, k + 4, 17, 1, 2);
        world.setBlock(i + 4, j + 16, k + 4, 17, 1, 2);
        world.setBlock(i + 4, j + 17, k + 4, 17, 1, 2);
        world.setBlock(i + 2, j + 18, k + 2, 18, 1, 2);
        world.setBlock(i + 2, j + 18, k + 1, 18, 1, 2);
        world.setBlock(i + 3, j + 18, k + 2, 18, 1, 2);
        world.setBlock(i + 4, j + 18, k + 4, 17, 1, 2);
        world.setBlock(i + 8, j + 18, k + 6, 18, 1, 2);
        world.setBlock(i + 8, j + 18, k + 4, 18, 1, 2);
        world.setBlock(i + 0, j + 19, k + 3, 18, 1, 2);
        world.setBlock(i + 2, j + 19, k + 0, 18, 1, 2);
        world.setBlock(i + 3, j + 19, k + 4, 18, 1, 2);
        world.setBlock(i + 3, j + 19, k + 3, 17, 1, 2);
        world.setBlock(i + 3, j + 19, k + 2, 18, 1, 2);
        world.setBlock(i + 3, j + 19, k + 0, 18, 1, 2);
        world.setBlock(i + 4, j + 19, k + 4, 17, 1, 2);
        world.setBlock(i + 4, j + 19, k + 3, 18, 1, 2);
        world.setBlock(i + 5, j + 19, k + 4, 17, 1, 2);
        world.setBlock(i + 7, j + 19, k + 3, 18, 1, 2);
        world.setBlock(i + 9, j + 19, k + 6, 18, 1, 2);
        world.setBlock(i + 9, j + 19, k + 5, 18, 1, 2);
        world.setBlock(i + 1, j + 20, k + 4, 18, 1, 2);
        world.setBlock(i + 1, j + 20, k + 2, 18, 1, 2);
        world.setBlock(i + 2, j + 20, k + 2, 17, 1, 2);
        world.setBlock(i + 3, j + 20, k + 3, 18, 1, 2);
        world.setBlock(i + 3, j + 20, k + 0, 18, 1, 2);
        world.setBlock(i + 4, j + 20, k + 4, 17, 1, 2);
        world.setBlock(i + 4, j + 20, k + 2, 18, 1, 2);
        world.setBlock(i + 5, j + 20, k + 5, 18, 1, 2);
        world.setBlock(i + 6, j + 20, k + 5, 17, 1, 2);
        world.setBlock(i + 7, j + 20, k + 6, 18, 1, 2);
        world.setBlock(i + 7, j + 20, k + 5, 17, 1, 2);
        world.setBlock(i + 8, j + 20, k + 6, 18, 1, 2);
        world.setBlock(i + 8, j + 20, k + 5, 18, 1, 2);
        world.setBlock(i + 0, j + 21, k + 2, 18, 1, 2);
        world.setBlock(i + 2, j + 21, k + 3, 18, 1, 2);
        world.setBlock(i + 2, j + 21, k + 0, 18, 1, 2);
        world.setBlock(i + 3, j + 21, k + 4, 18, 1, 2);
        world.setBlock(i + 3, j + 21, k + 2, 18, 1, 2);
        world.setBlock(i + 3, j + 21, k + 1, 18, 1, 2);
        world.setBlock(i + 4, j + 21, k + 4, 17, 1, 2);
        world.setBlock(i + 4, j + 21, k + 2, 18, 1, 2);
        world.setBlock(i + 5, j + 21, k + 5, 18, 1, 2);
        world.setBlock(i + 5, j + 21, k + 4, 18, 1, 2);
        world.setBlock(i + 7, j + 21, k + 5, 18, 1, 2);
        world.setBlock(i + 7, j + 21, k + 4, 18, 1, 2);
        world.setBlock(i + 1, j + 22, k + 6, 18, 1, 2);
        world.setBlock(i + 2, j + 22, k + 4, 18, 1, 2);
        world.setBlock(i + 2, j + 22, k + 3, 18, 1, 2);
        world.setBlock(i + 2, j + 22, k + 2, 18, 1, 2);
        world.setBlock(i + 3, j + 22, k + 4, 17, 1, 2);
        world.setBlock(i + 3, j + 22, k + 3, 18, 1, 2);
        world.setBlock(i + 3, j + 22, k + 2, 18, 1, 2);
        world.setBlock(i + 4, j + 22, k + 6, 18, 1, 2);
        world.setBlock(i + 4, j + 22, k + 4, 17, 1, 2);
        world.setBlock(i + 4, j + 22, k + 3, 18, 1, 2);
        world.setBlock(i + 5, j + 22, k + 7, 18, 1, 2);
        world.setBlock(i + 6, j + 22, k + 6, 18, 1, 2);
        world.setBlock(i + 6, j + 22, k + 4, 18, 1, 2);
        world.setBlock(i + 6, j + 22, k + 2, 18, 1, 2);
        world.setBlock(i + 6, j + 22, k + 1, 18, 1, 2);
        world.setBlock(i + 8, j + 22, k + 6, 18, 1, 2);
        world.setBlock(i + 1, j + 23, k + 4, 18, 1, 2);
        world.setBlock(i + 1, j + 23, k + 2, 18, 1, 2);
        world.setBlock(i + 2, j + 23, k + 6, 18, 1, 2);
        world.setBlock(i + 2, j + 23, k + 5, 18, 1, 2);
        world.setBlock(i + 2, j + 23, k + 4, 17, 1, 2);
        world.setBlock(i + 2, j + 23, k + 3, 18, 1, 2);
        world.setBlock(i + 2, j + 23, k + 2, 18, 1, 2);
        world.setBlock(i + 3, j + 23, k + 6, 18, 1, 2);
        world.setBlock(i + 3, j + 23, k + 5, 18, 1, 2);
        world.setBlock(i + 3, j + 23, k + 4, 18, 1, 2);
        world.setBlock(i + 3, j + 23, k + 3, 18, 1, 2);
        world.setBlock(i + 3, j + 23, k + 2, 18, 1, 2);
        world.setBlock(i + 4, j + 23, k + 7, 18, 1, 2);
        world.setBlock(i + 4, j + 23, k + 6, 18, 1, 2);
        world.setBlock(i + 4, j + 23, k + 5, 17, 1, 2);
        world.setBlock(i + 4, j + 23, k + 4, 17, 1, 2);
        world.setBlock(i + 4, j + 23, k + 3, 18, 1, 2);
        world.setBlock(i + 4, j + 23, k + 1, 18, 1, 2);
        world.setBlock(i + 5, j + 23, k + 5, 18, 1, 2);
        world.setBlock(i + 5, j + 23, k + 3, 17, 1, 2);
        world.setBlock(i + 6, j + 23, k + 5, 18, 1, 2);
        world.setBlock(i + 6, j + 23, k + 3, 18, 1, 2);
        world.setBlock(i + 6, j + 23, k + 2, 18, 1, 2);
        world.setBlock(i + 7, j + 23, k + 3, 18, 1, 2);
        world.setBlock(i + 7, j + 23, k + 2, 18, 1, 2);
        world.setBlock(i + 0, j + 24, k + 4, 18, 1, 2);
        world.setBlock(i + 0, j + 24, k + 3, 18, 1, 2);
        world.setBlock(i + 1, j + 24, k + 5, 18, 1, 2);
        world.setBlock(i + 1, j + 24, k + 2, 18, 1, 2);
        world.setBlock(i + 2, j + 24, k + 7, 18, 1, 2);
        world.setBlock(i + 2, j + 24, k + 6, 18, 1, 2);
        world.setBlock(i + 2, j + 24, k + 5, 18, 1, 2);
        world.setBlock(i + 2, j + 24, k + 4, 18, 1, 2);
        world.setBlock(i + 2, j + 24, k + 3, 17, 1, 2);
        world.setBlock(i + 3, j + 24, k + 4, 18, 1, 2);
        world.setBlock(i + 3, j + 24, k + 2, 18, 1, 2);
        world.setBlock(i + 4, j + 24, k + 6, 17, 1, 2);
        world.setBlock(i + 4, j + 24, k + 5, 18, 1, 2);
        world.setBlock(i + 4, j + 24, k + 4, 17, 1, 2);
        world.setBlock(i + 4, j + 24, k + 2, 17, 1, 2);
        world.setBlock(i + 5, j + 24, k + 6, 18, 1, 2);
        world.setBlock(i + 5, j + 24, k + 5, 18, 1, 2);
        world.setBlock(i + 5, j + 24, k + 4, 18, 1, 2);
        world.setBlock(i + 5, j + 24, k + 2, 18, 1, 2);
        world.setBlock(i + 6, j + 24, k + 7, 18, 1, 2);
        world.setBlock(i + 6, j + 24, k + 6, 18, 1, 2);
        world.setBlock(i + 6, j + 24, k + 5, 18, 1, 2);
        world.setBlock(i + 6, j + 24, k + 3, 17, 1, 2);
        world.setBlock(i + 1, j + 25, k + 3, 18, 1, 2);
        world.setBlock(i + 2, j + 25, k + 4, 18, 1, 2);
        world.setBlock(i + 2, j + 25, k + 3, 18, 1, 2);
        world.setBlock(i + 3, j + 25, k + 8, 18, 1, 2);
        world.setBlock(i + 3, j + 25, k + 5, 18, 1, 2);
        world.setBlock(i + 3, j + 25, k + 4, 18, 1, 2);
        world.setBlock(i + 3, j + 25, k + 3, 18, 1, 2);
        world.setBlock(i + 4, j + 25, k + 6, 18, 1, 2);
        world.setBlock(i + 4, j + 25, k + 5, 18, 1, 2);
        world.setBlock(i + 4, j + 25, k + 4, 17, 1, 2);
        world.setBlock(i + 4, j + 25, k + 3, 18, 1, 2);
        world.setBlock(i + 5, j + 25, k + 6, 18, 1, 2);
        world.setBlock(i + 5, j + 25, k + 5, 18, 1, 2);
        world.setBlock(i + 5, j + 25, k + 4, 18, 1, 2);
        world.setBlock(i + 6, j + 25, k + 3, 18, 1, 2);
        world.setBlock(i + 6, j + 25, k + 2, 18, 1, 2);
        world.setBlock(i + 2, j + 26, k + 4, 18, 1, 2);
        world.setBlock(i + 2, j + 26, k + 3, 18, 1, 2);
        world.setBlock(i + 3, j + 26, k + 5, 18, 1, 2);
        world.setBlock(i + 3, j + 26, k + 4, 18, 1, 2);
        world.setBlock(i + 4, j + 26, k + 7, 18, 1, 2);
        world.setBlock(i + 4, j + 26, k + 3, 18, 1, 2);
        world.setBlock(i + 6, j + 26, k + 4, 18, 1, 2);
        world.setBlock(i + 4, j + 27, k + 5, 18, 1, 2);
        world.setBlock(i + 4, j + 27, k + 4, 18, 1, 2);
        world.setBlock(i + 4, j + 27, k + 3, 18, 1, 2);
        world.setBlock(i + 5, j + 27, k + 3, 18, 1, 2);
        
        return true;
    }
}
