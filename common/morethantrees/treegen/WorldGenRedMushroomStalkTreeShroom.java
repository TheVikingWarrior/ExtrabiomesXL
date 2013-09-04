package morethantrees.treegen;

import java.util.Random;

import morethantrees.MTJT;
import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

public class WorldGenRedMushroomStalkTreeShroom extends WorldGenerator
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
        world.setBlock(i + 27, j + 0, k + 21, MTJT.mushroomStemmWhite.blockID, 0, 2);
        world.setBlock(i + 28, j + 0, k + 21, MTJT.mushroomStemmWhite.blockID, 0, 2);
        world.setBlock(i + 27, j + 1, k + 21, MTJT.mushroomStemmWhite.blockID, 0, 2);
        world.setBlock(i + 27, j + 2, k + 21, MTJT.mushroomStemmWhite.blockID, 0, 2);
        world.setBlock(i + 27, j + 3, k + 21, MTJT.mushroomStemmWhite.blockID, 0, 2);
        world.setBlock(i + 27, j + 4, k + 21, MTJT.mushroomStemmWhite.blockID, 0, 2);
        world.setBlock(i + 27, j + 5, k + 21, MTJT.mushroomStemmWhite.blockID, 0, 2);
        world.setBlock(i + 27, j + 6, k + 21, MTJT.mushroomStemmWhite.blockID, 0, 2);
        world.setBlock(i + 27, j + 7, k + 21, MTJT.mushroomStemmWhite.blockID, 0, 2);
        world.setBlock(i + 27, j + 8, k + 21, MTJT.mushroomStemmWhite.blockID, 0, 2);
        world.setBlock(i + 27, j + 9, k + 21, MTJT.mushroomStemmWhite.blockID, 0, 2);
        world.setBlock(i + 27, j + 10, k + 21, MTJT.mushroomStemmWhite.blockID, 0, 2);
        world.setBlock(i + 27, j + 11, k + 21, MTJT.mushroomStemmWhite.blockID, 0, 2);
        world.setBlock(i + 27, j + 12, k + 21, MTJT.mushroomStemmWhite.blockID, 0, 2);
        world.setBlock(i + 27, j + 13, k + 21, MTJT.mushroomStemmWhite.blockID, 0, 2);
        world.setBlock(i + 27, j + 14, k + 21, MTJT.mushroomStemmWhite.blockID, 0, 2);
        world.setBlock(i + 27, j + 15, k + 21, MTJT.mushroomStemmWhite.blockID, 0, 2);
        world.setBlock(i + 27, j + 16, k + 21, MTJT.mushroomStemmWhite.blockID, 0, 2);
        world.setBlock(i + 27, j + 17, k + 21, MTJT.mushroomStemmWhite.blockID, 0, 2);
        world.setBlock(i + 27, j + 18, k + 21, MTJT.mushroomStemmWhite.blockID, 0, 2);
        world.setBlock(i + 27, j + 19, k + 21, MTJT.mushroomStemmWhite.blockID, 0, 2);
        world.setBlock(i + 27, j + 20, k + 21, MTJT.mushroomStemmWhite.blockID, 0, 2);
        world.setBlock(i + 27, j + 21, k + 21, MTJT.mushroomStemmWhite.blockID, 0, 2);
        world.setBlock(i + 27, j + 22, k + 21, MTJT.mushroomStemmWhite.blockID, 0, 2);
        world.setBlock(i + 27, j + 23, k + 21, MTJT.mushroomStemmWhite.blockID, 0, 2);
        world.setBlock(i + 27, j + 24, k + 21, MTJT.mushroomStemmWhite.blockID, 0, 2);
        world.setBlock(i + 27, j + 25, k + 21, MTJT.mushroomStemmWhite.blockID, 0, 2);
        world.setBlock(i + 27, j + 26, k + 21, MTJT.mushroomStemmWhite.blockID, 0, 2);
        world.setBlock(i + 27, j + 27, k + 21, MTJT.mushroomStemmWhite.blockID, 0, 2);
        world.setBlock(i + 27, j + 28, k + 21, MTJT.mushroomStemmWhite.blockID, 0, 2);
        world.setBlock(i + 27, j + 29, k + 21, MTJT.mushroomStemmWhite.blockID, 0, 2);
        world.setBlock(i + 27, j + 30, k + 21, MTJT.mushroomStemmWhite.blockID, 0, 2);
        world.setBlock(i + 27, j + 31, k + 21, MTJT.mushroomStemmWhite.blockID, 0, 2);
        world.setBlock(i + 27, j + 32, k + 21, MTJT.mushroomStemmWhite.blockID, 0, 2);
        world.setBlock(i + 27, j + 33, k + 21, MTJT.mushroomStemmWhite.blockID, 0, 2);
        world.setBlock(i + 27, j + 34, k + 21, MTJT.mushroomStemmWhite.blockID, 0, 2);
        world.setBlock(i + 27, j + 35, k + 21, MTJT.mushroomStemmWhite.blockID, 0, 2);
        world.setBlock(i + 27, j + 36, k + 21, MTJT.mushroomStemmWhite.blockID, 0, 2);
        world.setBlock(i + 27, j + 37, k + 21, MTJT.mushroomStemmWhite.blockID, 0, 2);
        world.setBlock(i + 27, j + 38, k + 21, MTJT.mushroomStemmWhite.blockID, 0, 2);
        world.setBlock(i + 27, j + 39, k + 21, MTJT.mushroomStemmWhite.blockID, 0, 2);
        world.setBlock(i + 27, j + 40, k + 21, MTJT.mushroomStemmWhite.blockID, 0, 2);
        world.setBlock(i + 26, j + 41, k + 21, MTJT.mushroomStemmWhite.blockID, 0, 2);
        world.setBlock(i + 27, j + 41, k + 21, MTJT.mushroomStemmWhite.blockID, 0, 2);
        world.setBlock(i + 25, j + 42, k + 21, MTJT.mushroomStemmWhite.blockID, 0, 2);
        world.setBlock(i + 27, j + 42, k + 21, MTJT.mushroomStemmWhite.blockID, 0, 2);
        world.setBlock(i + 24, j + 43, k + 21, MTJT.mushroomStemmWhite.blockID, 0, 2);
        world.setBlock(i + 27, j + 43, k + 21, MTJT.mushroomStemmWhite.blockID, 0, 2);
        world.setBlock(i + 23, j + 44, k + 21, MTJT.mushroomStemmWhite.blockID, 0, 2);
        world.setBlock(i + 27, j + 44, k + 21, MTJT.mushroomStemmWhite.blockID, 0, 2);
        world.setBlock(i + 22, j + 45, k + 21, MTJT.mushroomStemmWhite.blockID, 0, 2);
        world.setBlock(i + 27, j + 45, k + 21, MTJT.mushroomStemmWhite.blockID, 0, 2);
        world.setBlock(i + 27, j + 45, k + 20, MTJT.mushroomStemmWhite.blockID, 0, 2);
        world.setBlock(i + 21, j + 46, k + 21, MTJT.mushroomStemmWhite.blockID, 0, 2);
        world.setBlock(i + 27, j + 46, k + 21, MTJT.mushroomStemmWhite.blockID, 0, 2);
        world.setBlock(i + 27, j + 46, k + 19, MTJT.mushroomStemmWhite.blockID, 0, 2);
        world.setBlock(i + 20, j + 47, k + 21, MTJT.mushroomStemmWhite.blockID, 0, 2);
        world.setBlock(i + 27, j + 47, k + 22, MTJT.mushroomStemmWhite.blockID, 0, 2);
        world.setBlock(i + 27, j + 47, k + 21, MTJT.mushroomStemmWhite.blockID, 0, 2);
        world.setBlock(i + 28, j + 47, k + 18, MTJT.mushroomStemmWhite.blockID, 0, 2);
        world.setBlock(i + 19, j + 48, k + 21, MTJT.mushroomStemmWhite.blockID, 0, 2);
        world.setBlock(i + 27, j + 48, k + 23, MTJT.mushroomStemmWhite.blockID, 0, 2);
        world.setBlock(i + 27, j + 48, k + 21, MTJT.mushroomStemmWhite.blockID, 0, 2);
        world.setBlock(i + 28, j + 48, k + 21, MTJT.mushroomStemmWhite.blockID, 0, 2);
        world.setBlock(i + 28, j + 48, k + 17, MTJT.mushroomStemmWhite.blockID, 0, 2);
        world.setBlock(i + 18, j + 49, k + 21, MTJT.mushroomStemmWhite.blockID, 0, 2);
        world.setBlock(i + 27, j + 49, k + 24, MTJT.mushroomStemmWhite.blockID, 0, 2);
        world.setBlock(i + 27, j + 49, k + 21, MTJT.mushroomStemmWhite.blockID, 0, 2);
        world.setBlock(i + 28, j + 49, k + 16, MTJT.mushroomStemmWhite.blockID, 0, 2);
        world.setBlock(i + 29, j + 49, k + 21, MTJT.mushroomStemmWhite.blockID, 0, 2);
        world.setBlock(i + 17, j + 50, k + 21, MTJT.mushroomStemmWhite.blockID, 0, 2);
        world.setBlock(i + 27, j + 50, k + 25, MTJT.mushroomStemmWhite.blockID, 0, 2);
        world.setBlock(i + 27, j + 50, k + 21, MTJT.mushroomStemmWhite.blockID, 0, 2);
        world.setBlock(i + 29, j + 50, k + 16, MTJT.mushroomStemmWhite.blockID, 0, 2);
        world.setBlock(i + 30, j + 50, k + 21, MTJT.mushroomStemmWhite.blockID, 0, 2);
        world.setBlock(i + 16, j + 51, k + 21, MTJT.mushroomStemmWhite.blockID, 0, 2);
        world.setBlock(i + 27, j + 51, k + 26, MTJT.mushroomStemmWhite.blockID, 0, 2);
        world.setBlock(i + 27, j + 51, k + 21, MTJT.mushroomStemmWhite.blockID, 0, 2);
        world.setBlock(i + 29, j + 51, k + 15, MTJT.mushroomStemmWhite.blockID, 0, 2);
        world.setBlock(i + 31, j + 51, k + 21, MTJT.mushroomStemmWhite.blockID, 0, 2);
        world.setBlock(i + 15, j + 52, k + 21, MTJT.mushroomStemmWhite.blockID, 0, 2);
        world.setBlock(i + 27, j + 52, k + 27, MTJT.mushroomStemmWhite.blockID, 0, 2);
        world.setBlock(i + 27, j + 52, k + 21, MTJT.mushroomStemmWhite.blockID, 0, 2);
        world.setBlock(i + 28, j + 52, k + 21, MTJT.mushroomStemmWhite.blockID, 0, 2);
        world.setBlock(i + 29, j + 52, k + 14, MTJT.mushroomStemmWhite.blockID, 0, 2);
        world.setBlock(i + 32, j + 52, k + 21, MTJT.mushroomStemmWhite.blockID, 0, 2);
        world.setBlock(i + 14, j + 53, k + 21, MTJT.mushroomStemmWhite.blockID, 0, 2);
        world.setBlock(i + 27, j + 53, k + 28, MTJT.mushroomStemmWhite.blockID, 0, 2);
        world.setBlock(i + 27, j + 53, k + 21, MTJT.mushroomStemmWhite.blockID, 0, 2);
        world.setBlock(i + 28, j + 53, k + 20, MTJT.mushroomStemmWhite.blockID, 0, 2);
        world.setBlock(i + 30, j + 53, k + 13, MTJT.mushroomStemmWhite.blockID, 0, 2);
        world.setBlock(i + 33, j + 53, k + 21, MTJT.mushroomStemmWhite.blockID, 0, 2);
        world.setBlock(i + 13, j + 54, k + 21, MTJT.mushroomStemmWhite.blockID, 0, 2);
        world.setBlock(i + 27, j + 54, k + 29, MTJT.mushroomStemmWhite.blockID, 0, 2);
        world.setBlock(i + 27, j + 54, k + 21, MTJT.mushroomStemmWhite.blockID, 0, 2);
        world.setBlock(i + 28, j + 54, k + 19, MTJT.mushroomStemmWhite.blockID, 0, 2);
        world.setBlock(i + 30, j + 54, k + 12, MTJT.mushroomStemmWhite.blockID, 0, 2);
        world.setBlock(i + 34, j + 54, k + 21, MTJT.mushroomStemmWhite.blockID, 0, 2);
        world.setBlock(i + 12, j + 55, k + 21, MTJT.mushroomStemmWhite.blockID, 0, 2);
        world.setBlock(i + 27, j + 55, k + 30, MTJT.mushroomStemmWhite.blockID, 0, 2);
        world.setBlock(i + 27, j + 55, k + 21, MTJT.mushroomStemmWhite.blockID, 0, 2);
        world.setBlock(i + 28, j + 55, k + 18, MTJT.mushroomStemmWhite.blockID, 0, 2);
        world.setBlock(i + 31, j + 55, k + 12, MTJT.mushroomStemmWhite.blockID, 0, 2);
        world.setBlock(i + 35, j + 55, k + 21, MTJT.mushroomStemmWhite.blockID, 0, 2);
        world.setBlock(i + 11, j + 56, k + 21, MTJT.mushroomStemmWhite.blockID, 0, 2);
        world.setBlock(i + 27, j + 56, k + 31, MTJT.mushroomStemmWhite.blockID, 0, 2);
        world.setBlock(i + 27, j + 56, k + 21, MTJT.mushroomStemmWhite.blockID, 0, 2);
        world.setBlock(i + 28, j + 56, k + 17, MTJT.mushroomStemmWhite.blockID, 0, 2);
        world.setBlock(i + 31, j + 56, k + 11, MTJT.mushroomStemmWhite.blockID, 0, 2);
        world.setBlock(i + 36, j + 56, k + 21, MTJT.mushroomStemmWhite.blockID, 0, 2);
        world.setBlock(i + 10, j + 57, k + 21, MTJT.mushroomStemmWhite.blockID, 0, 2);
        world.setBlock(i + 27, j + 57, k + 32, MTJT.mushroomStemmWhite.blockID, 0, 2);
        world.setBlock(i + 27, j + 57, k + 21, MTJT.mushroomStemmWhite.blockID, 0, 2);
        world.setBlock(i + 28, j + 57, k + 16, MTJT.mushroomStemmWhite.blockID, 0, 2);
        world.setBlock(i + 31, j + 57, k + 10, MTJT.mushroomStemmWhite.blockID, 0, 2);
        world.setBlock(i + 37, j + 57, k + 21, MTJT.mushroomStemmWhite.blockID, 0, 2);
        world.setBlock(i + 9, j + 58, k + 21, MTJT.mushroomStemmWhite.blockID, 0, 2);
        world.setBlock(i + 27, j + 58, k + 33, MTJT.mushroomStemmWhite.blockID, 0, 2);
        world.setBlock(i + 27, j + 58, k + 21, MTJT.mushroomStemmWhite.blockID, 0, 2);
        world.setBlock(i + 28, j + 58, k + 15, MTJT.mushroomStemmWhite.blockID, 0, 2);
        world.setBlock(i + 32, j + 58, k + 9, MTJT.mushroomStemmWhite.blockID, 0, 2);
        world.setBlock(i + 38, j + 58, k + 21, MTJT.mushroomStemmWhite.blockID, 0, 2);
        world.setBlock(i + 8, j + 59, k + 21, MTJT.mushroomStemmWhite.blockID, 0, 2);
        world.setBlock(i + 27, j + 59, k + 34, MTJT.mushroomStemmWhite.blockID, 0, 2);
        world.setBlock(i + 27, j + 59, k + 21, MTJT.mushroomStemmWhite.blockID, 0, 2);
        world.setBlock(i + 28, j + 59, k + 14, MTJT.mushroomStemmWhite.blockID, 0, 2);
        world.setBlock(i + 32, j + 59, k + 8, MTJT.mushroomStemmWhite.blockID, 0, 2);
        world.setBlock(i + 39, j + 59, k + 21, MTJT.mushroomStemmWhite.blockID, 0, 2);
        world.setBlock(i + 7, j + 60, k + 21, MTJT.mushroomStemmWhite.blockID, 0, 2);
        world.setBlock(i + 27, j + 60, k + 35, MTJT.mushroomStemmWhite.blockID, 0, 2);
        world.setBlock(i + 27, j + 60, k + 21, MTJT.mushroomStemmWhite.blockID, 0, 2);
        world.setBlock(i + 27, j + 60, k + 20, MTJT.mushroomStemmWhite.blockID, 0, 2);
        world.setBlock(i + 28, j + 60, k + 13, MTJT.mushroomStemmWhite.blockID, 0, 2);
        world.setBlock(i + 32, j + 60, k + 7, MTJT.mushroomStemmWhite.blockID, 0, 2);
        world.setBlock(i + 40, j + 60, k + 21, MTJT.mushroomStemmWhite.blockID, 0, 2);
        world.setBlock(i + 6, j + 61, k + 21, MTJT.mushroomStemmWhite.blockID, 0, 2);
        world.setBlock(i + 27, j + 61, k + 36, MTJT.mushroomStemmWhite.blockID, 0, 2);
        world.setBlock(i + 27, j + 61, k + 21, MTJT.mushroomStemmWhite.blockID, 0, 2);
        world.setBlock(i + 28, j + 61, k + 20, MTJT.mushroomStemmWhite.blockID, 0, 2);
        world.setBlock(i + 28, j + 61, k + 12, MTJT.mushroomStemmWhite.blockID, 0, 2);
        world.setBlock(i + 33, j + 61, k + 7, MTJT.mushroomStemmWhite.blockID, 0, 2);
        world.setBlock(i + 41, j + 61, k + 21, MTJT.mushroomStemmWhite.blockID, 0, 2);
        world.setBlock(i + 5, j + 62, k + 21, MTJT.mushroomStemmWhite.blockID, 0, 2);
        world.setBlock(i + 27, j + 62, k + 37, MTJT.mushroomStemmWhite.blockID, 0, 2);
        world.setBlock(i + 27, j + 62, k + 21, MTJT.mushroomStemmWhite.blockID, 0, 2);
        world.setBlock(i + 28, j + 62, k + 11, MTJT.mushroomStemmWhite.blockID, 0, 2);
        world.setBlock(i + 29, j + 62, k + 20, MTJT.mushroomStemmWhite.blockID, 0, 2);
        world.setBlock(i + 33, j + 62, k + 6, MTJT.mushroomStemmWhite.blockID, 0, 2);
        world.setBlock(i + 42, j + 62, k + 21, MTJT.mushroomStemmWhite.blockID, 0, 2);
        world.setBlock(i + 4, j + 63, k + 21, MTJT.mushroomStemmWhite.blockID, 0, 2);
        world.setBlock(i + 27, j + 63, k + 38, MTJT.mushroomStemmWhite.blockID, 0, 2);
        world.setBlock(i + 27, j + 63, k + 21, MTJT.mushroomStemmWhite.blockID, 0, 2);
        world.setBlock(i + 28, j + 63, k + 10, MTJT.mushroomStemmWhite.blockID, 0, 2);
        world.setBlock(i + 30, j + 63, k + 20, MTJT.mushroomStemmWhite.blockID, 0, 2);
        world.setBlock(i + 33, j + 63, k + 5, MTJT.mushroomStemmWhite.blockID, 0, 2);
        world.setBlock(i + 43, j + 63, k + 21, MTJT.mushroomStemmWhite.blockID, 0, 2);
        world.setBlock(i + 3, j + 64, k + 21, MTJT.mushroomStemmWhite.blockID, 0, 2);
        world.setBlock(i + 27, j + 64, k + 39, MTJT.mushroomStemmWhite.blockID, 0, 2);
        world.setBlock(i + 27, j + 64, k + 21, MTJT.mushroomStemmWhite.blockID, 0, 2);
        world.setBlock(i + 28, j + 64, k + 9, MTJT.mushroomStemmWhite.blockID, 0, 2);
        world.setBlock(i + 31, j + 64, k + 20, MTJT.mushroomStemmWhite.blockID, 0, 2);
        world.setBlock(i + 34, j + 64, k + 4, MTJT.mushroomStemmWhite.blockID, 0, 2);
        world.setBlock(i + 44, j + 64, k + 21, MTJT.mushroomStemmWhite.blockID, 0, 2);
        world.setBlock(i + 0, j + 65, k + 22, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 0, j + 65, k + 21, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 0, j + 65, k + 20, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 1, j + 65, k + 23, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 1, j + 65, k + 19, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 2, j + 65, k + 24, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 2, j + 65, k + 18, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 3, j + 65, k + 24, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 3, j + 65, k + 21, MTJT.mushroomStemmWhite.blockID, 0, 2);
        world.setBlock(i + 3, j + 65, k + 18, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 4, j + 65, k + 24, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 4, j + 65, k + 18, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 5, j + 65, k + 23, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 5, j + 65, k + 19, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 6, j + 65, k + 22, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 6, j + 65, k + 21, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 6, j + 65, k + 20, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 27, j + 65, k + 40, MTJT.mushroomStemmWhite.blockID, 0, 2);
        world.setBlock(i + 27, j + 65, k + 21, MTJT.mushroomStemmWhite.blockID, 0, 2);
        world.setBlock(i + 28, j + 65, k + 8, MTJT.mushroomStemmWhite.blockID, 0, 2);
        world.setBlock(i + 32, j + 65, k + 19, MTJT.mushroomStemmWhite.blockID, 0, 2);
        world.setBlock(i + 34, j + 65, k + 3, MTJT.mushroomStemmWhite.blockID, 0, 2);
        world.setBlock(i + 45, j + 65, k + 21, MTJT.mushroomStemmWhite.blockID, 0, 2);
        world.setBlock(i + 1, j + 66, k + 22, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 1, j + 66, k + 21, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 1, j + 66, k + 20, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 2, j + 66, k + 23, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 2, j + 66, k + 22, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 2, j + 66, k + 21, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 2, j + 66, k + 20, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 2, j + 66, k + 19, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 3, j + 66, k + 23, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 3, j + 66, k + 22, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 3, j + 66, k + 21, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 3, j + 66, k + 20, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 3, j + 66, k + 19, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 4, j + 66, k + 23, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 4, j + 66, k + 22, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 4, j + 66, k + 21, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 4, j + 66, k + 20, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 4, j + 66, k + 19, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 5, j + 66, k + 22, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 5, j + 66, k + 21, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 5, j + 66, k + 20, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 27, j + 66, k + 21, MTJT.mushroomStemmWhite.blockID, 0, 2);
        world.setBlock(i + 28, j + 66, k + 41, MTJT.mushroomStemmWhite.blockID, 0, 2);
        world.setBlock(i + 28, j + 66, k + 8, MTJT.mushroomStemmWhite.blockID, 0, 2);
        world.setBlock(i + 33, j + 66, k + 19, MTJT.mushroomStemmWhite.blockID, 0, 2);
        world.setBlock(i + 35, j + 66, k + 3, MTJT.mushroomStemmWhite.blockID, 0, 2);
        world.setBlock(i + 46, j + 66, k + 21, MTJT.mushroomStemmWhite.blockID, 0, 2);
        world.setBlock(i + 25, j + 67, k + 42, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 25, j + 67, k + 41, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 25, j + 67, k + 40, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 25, j + 67, k + 9, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 25, j + 67, k + 8, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 25, j + 67, k + 7, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 26, j + 67, k + 43, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 26, j + 67, k + 39, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 26, j + 67, k + 10, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 26, j + 67, k + 6, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 27, j + 67, k + 44, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 27, j + 67, k + 38, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 27, j + 67, k + 21, MTJT.mushroomStemmWhite.blockID, 0, 2);
        world.setBlock(i + 27, j + 67, k + 11, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 27, j + 67, k + 5, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 28, j + 67, k + 44, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 28, j + 67, k + 41, MTJT.mushroomStemmWhite.blockID, 0, 2);
        world.setBlock(i + 28, j + 67, k + 38, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 28, j + 67, k + 11, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 28, j + 67, k + 8, MTJT.mushroomStemmWhite.blockID, 0, 2);
        world.setBlock(i + 28, j + 67, k + 5, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 29, j + 67, k + 44, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 29, j + 67, k + 38, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 29, j + 67, k + 11, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 29, j + 67, k + 5, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 30, j + 67, k + 43, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 30, j + 67, k + 39, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 30, j + 67, k + 10, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 30, j + 67, k + 6, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 31, j + 67, k + 42, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 31, j + 67, k + 41, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 31, j + 67, k + 40, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 31, j + 67, k + 9, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 31, j + 67, k + 8, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 31, j + 67, k + 7, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 32, j + 67, k + 4, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 32, j + 67, k + 3, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 32, j + 67, k + 2, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 33, j + 67, k + 5, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 33, j + 67, k + 1, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 34, j + 67, k + 19, MTJT.mushroomStemmWhite.blockID, 0, 2);
        world.setBlock(i + 34, j + 67, k + 6, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 34, j + 67, k + 0, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 35, j + 67, k + 6, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 35, j + 67, k + 3, MTJT.mushroomStemmWhite.blockID, 0, 2);
        world.setBlock(i + 35, j + 67, k + 0, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 36, j + 67, k + 6, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 36, j + 67, k + 0, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 37, j + 67, k + 5, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 37, j + 67, k + 1, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 38, j + 67, k + 4, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 38, j + 67, k + 3, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 38, j + 67, k + 2, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 47, j + 67, k + 22, MTJT.mushroomStemmWhite.blockID, 0, 2);
        world.setBlock(i + 26, j + 68, k + 42, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 26, j + 68, k + 41, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 26, j + 68, k + 40, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 26, j + 68, k + 9, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 26, j + 68, k + 8, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 26, j + 68, k + 7, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 27, j + 68, k + 43, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 27, j + 68, k + 42, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 27, j + 68, k + 41, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 27, j + 68, k + 40, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 27, j + 68, k + 39, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 27, j + 68, k + 21, MTJT.mushroomStemmWhite.blockID, 0, 2);
        world.setBlock(i + 27, j + 68, k + 10, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 27, j + 68, k + 9, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 27, j + 68, k + 8, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 27, j + 68, k + 7, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 27, j + 68, k + 6, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 28, j + 68, k + 43, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 28, j + 68, k + 42, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 28, j + 68, k + 41, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 28, j + 68, k + 40, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 28, j + 68, k + 39, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 28, j + 68, k + 10, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 28, j + 68, k + 9, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 28, j + 68, k + 8, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 28, j + 68, k + 7, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 28, j + 68, k + 6, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 29, j + 68, k + 43, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 29, j + 68, k + 42, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 29, j + 68, k + 41, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 29, j + 68, k + 40, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 29, j + 68, k + 39, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 29, j + 68, k + 10, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 29, j + 68, k + 9, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 29, j + 68, k + 8, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 29, j + 68, k + 7, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 29, j + 68, k + 6, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 30, j + 68, k + 42, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 30, j + 68, k + 41, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 30, j + 68, k + 40, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 30, j + 68, k + 9, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 30, j + 68, k + 8, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 30, j + 68, k + 7, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 33, j + 68, k + 4, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 33, j + 68, k + 3, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 33, j + 68, k + 2, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 34, j + 68, k + 5, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 34, j + 68, k + 4, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 34, j + 68, k + 3, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 34, j + 68, k + 2, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 34, j + 68, k + 1, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 35, j + 68, k + 19, MTJT.mushroomStemmWhite.blockID, 0, 2);
        world.setBlock(i + 35, j + 68, k + 5, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 35, j + 68, k + 4, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 35, j + 68, k + 3, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 35, j + 68, k + 2, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 35, j + 68, k + 1, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 36, j + 68, k + 5, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 36, j + 68, k + 4, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 36, j + 68, k + 3, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 36, j + 68, k + 2, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 36, j + 68, k + 1, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 37, j + 68, k + 4, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 37, j + 68, k + 3, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 37, j + 68, k + 2, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 44, j + 68, k + 23, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 44, j + 68, k + 22, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 44, j + 68, k + 21, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 45, j + 68, k + 24, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 45, j + 68, k + 20, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 46, j + 68, k + 25, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 46, j + 68, k + 19, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 47, j + 68, k + 25, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 47, j + 68, k + 22, MTJT.mushroomStemmWhite.blockID, 0, 2);
        world.setBlock(i + 47, j + 68, k + 19, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 48, j + 68, k + 25, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 48, j + 68, k + 19, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 49, j + 68, k + 24, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 49, j + 68, k + 20, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 50, j + 68, k + 23, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 50, j + 68, k + 22, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 50, j + 68, k + 21, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 26, j + 69, k + 21, MTJT.mushroomStemmWhite.blockID, 0, 2);
        world.setBlock(i + 36, j + 69, k + 19, MTJT.mushroomStemmWhite.blockID, 0, 2);
        world.setBlock(i + 45, j + 69, k + 23, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 45, j + 69, k + 22, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 45, j + 69, k + 21, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 46, j + 69, k + 24, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 46, j + 69, k + 23, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 46, j + 69, k + 22, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 46, j + 69, k + 21, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 46, j + 69, k + 20, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 47, j + 69, k + 24, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 47, j + 69, k + 23, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 47, j + 69, k + 22, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 47, j + 69, k + 21, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 47, j + 69, k + 20, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 48, j + 69, k + 24, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 48, j + 69, k + 23, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 48, j + 69, k + 22, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 48, j + 69, k + 21, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 48, j + 69, k + 20, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 49, j + 69, k + 23, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 49, j + 69, k + 22, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 49, j + 69, k + 21, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 26, j + 70, k + 22, MTJT.mushroomStemmWhite.blockID, 0, 2);
        world.setBlock(i + 37, j + 70, k + 19, MTJT.mushroomStemmWhite.blockID, 0, 2);
        world.setBlock(i + 26, j + 71, k + 22, MTJT.mushroomStemmWhite.blockID, 0, 2);
        world.setBlock(i + 34, j + 71, k + 20, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 34, j + 71, k + 19, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 34, j + 71, k + 18, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 35, j + 71, k + 21, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 35, j + 71, k + 17, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 36, j + 71, k + 22, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 36, j + 71, k + 16, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 37, j + 71, k + 22, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 37, j + 71, k + 19, MTJT.mushroomStemmWhite.blockID, 0, 2);
        world.setBlock(i + 37, j + 71, k + 16, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 38, j + 71, k + 22, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 38, j + 71, k + 16, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 39, j + 71, k + 21, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 39, j + 71, k + 17, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 40, j + 71, k + 20, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 40, j + 71, k + 19, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 40, j + 71, k + 18, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 26, j + 72, k + 23, MTJT.mushroomStemmWhite.blockID, 0, 2);
        world.setBlock(i + 35, j + 72, k + 20, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 35, j + 72, k + 19, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 35, j + 72, k + 18, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 36, j + 72, k + 21, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 36, j + 72, k + 20, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 36, j + 72, k + 19, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 36, j + 72, k + 18, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 36, j + 72, k + 17, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 37, j + 72, k + 21, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 37, j + 72, k + 20, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 37, j + 72, k + 19, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 37, j + 72, k + 18, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 37, j + 72, k + 17, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 38, j + 72, k + 21, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 38, j + 72, k + 20, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 38, j + 72, k + 19, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 38, j + 72, k + 18, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 38, j + 72, k + 17, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 39, j + 72, k + 20, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 39, j + 72, k + 19, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 39, j + 72, k + 18, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 26, j + 73, k + 23, MTJT.mushroomStemmWhite.blockID, 0, 2);
        world.setBlock(i + 26, j + 74, k + 24, MTJT.mushroomStemmWhite.blockID, 0, 2);
        world.setBlock(i + 26, j + 75, k + 24, MTJT.mushroomStemmWhite.blockID, 0, 2);
        world.setBlock(i + 26, j + 76, k + 25, MTJT.mushroomStemmWhite.blockID, 0, 2);
        world.setBlock(i + 23, j + 77, k + 26, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 23, j + 77, k + 25, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 23, j + 77, k + 24, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 24, j + 77, k + 27, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 24, j + 77, k + 23, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 25, j + 77, k + 28, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 25, j + 77, k + 22, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 26, j + 77, k + 28, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 26, j + 77, k + 25, MTJT.mushroomStemmWhite.blockID, 0, 2);
        world.setBlock(i + 26, j + 77, k + 22, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 27, j + 77, k + 28, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 27, j + 77, k + 22, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 28, j + 77, k + 27, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 28, j + 77, k + 23, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 29, j + 77, k + 26, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 29, j + 77, k + 25, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 29, j + 77, k + 24, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 24, j + 78, k + 26, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 24, j + 78, k + 25, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 24, j + 78, k + 24, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 25, j + 78, k + 27, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 25, j + 78, k + 26, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 25, j + 78, k + 25, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 25, j + 78, k + 24, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 25, j + 78, k + 23, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 26, j + 78, k + 27, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 26, j + 78, k + 26, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 26, j + 78, k + 25, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 26, j + 78, k + 24, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 26, j + 78, k + 23, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 27, j + 78, k + 27, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 27, j + 78, k + 26, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 27, j + 78, k + 25, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 27, j + 78, k + 24, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 27, j + 78, k + 23, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 28, j + 78, k + 26, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 28, j + 78, k + 25, MTJT.mushroomTopRed.blockID, 0, 2);
        world.setBlock(i + 28, j + 78, k + 24, MTJT.mushroomTopRed.blockID, 0, 2);
        
        return true;
    }
}
