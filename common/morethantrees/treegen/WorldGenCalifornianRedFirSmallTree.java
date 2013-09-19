package morethantrees.treegen;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

public class WorldGenCalifornianRedFirSmallTree extends WorldGenerator
{
    @Override
    public boolean generate(World world, Random random, int x, int y, int z)
    {
        x -= 5;
        z -= 5;
        
        while ((world.isAirBlock(x + 10, y, z + 12)) && (y > 2))
        {
            y--;
        }
        
        int var6 = world.getBlockId(x + 10, y, z + 12);
        
        if (var6 != Block.grass.blockID)
        {
            return false;
        }
        
        for (int var7 = -2; var7 <= 2; var7++)
        {
            for (int var8 = -2; var8 <= 2; var8++)
            {
                if ((world.isAirBlock(x + var7 + 10, y - 1, z + var8 + 12)) && (world.isAirBlock(x + var7 + 10, y - 2, z + var8 + 12)))
                {
                    return false;
                }
            }
        }
        world.setBlock(x + 6, y + 10, z + 5, 17, 1, 2);
        world.setBlock(x + 5, y + 11, z + 4, 17, 1, 2);
        world.setBlock(x + 6, y + 18, z + 5, 17, 1, 2);
        world.setBlock(x + 6, y + 11, z + 5, 17, 1, 2);
        world.setBlock(x + 6, y + 12, z + 5, 17, 1, 2);
        world.setBlock(x + 5, y + 10, z + 4, 17, 1, 2);
        world.setBlock(x + 6, y + 13, z + 5, 17, 1, 2);
        world.setBlock(x + 6, y + 14, z + 5, 17, 1, 2);
        world.setBlock(x + 6, y + 17, z + 5, 17, 1, 2);
        world.setBlock(x + 6, y + 15, z + 5, 17, 1, 2);
        world.setBlock(x + 6, y + 16, z + 5, 17, 1, 2);
        world.setBlock(x + 5, y + 0, z + 5, 17, 1, 2);
        world.setBlock(x + 5, y + 0, z + 4, 17, 1, 2);
        world.setBlock(x + 5, y + 0, z + 3, 17, 1, 2);
        world.setBlock(x + 6, y + 0, z + 6, 17, 1, 2);
        world.setBlock(x + 6, y + 0, z + 5, 17, 1, 2);
        world.setBlock(x + 6, y + 0, z + 4, 17, 1, 2);
        world.setBlock(x + 7, y + 0, z + 4, 17, 1, 2);
        world.setBlock(x + 5, y + 1, z + 5, 17, 1, 2);
        world.setBlock(x + 5, y + 1, z + 4, 17, 1, 2);
        world.setBlock(x + 6, y + 1, z + 5, 17, 1, 2);
        world.setBlock(x + 5, y + 7, z + 4, 17, 1, 2);
        world.setBlock(x + 6, y + 1, z + 4, 17, 1, 2);
        world.setBlock(x + 5, y + 2, z + 5, 17, 1, 2);
        world.setBlock(x + 6, y + 7, z + 5, 17, 1, 2);
        world.setBlock(x + 6, y + 2, z + 5, 17, 1, 2);
        world.setBlock(x + 5, y + 3, z + 5, 17, 1, 2);
        world.setBlock(x + 5, y + 3, z + 4, 17, 1, 2);
        world.setBlock(x + 6, y + 3, z + 5, 17, 1, 2);
        world.setBlock(x + 5, y + 8, z + 4, 17, 1, 2);
        world.setBlock(x + 5, y + 4, z + 5, 17, 1, 2);
        world.setBlock(x + 5, y + 4, z + 4, 17, 1, 2);
        world.setBlock(x + 6, y + 8, z + 5, 17, 1, 2);
        world.setBlock(x + 6, y + 4, z + 5, 17, 1, 2);
        world.setBlock(x + 5, y + 5, z + 5, 17, 1, 2);
        world.setBlock(x + 5, y + 5, z + 4, 17, 1, 2);
        world.setBlock(x + 6, y + 5, z + 5, 17, 1, 2);
        world.setBlock(x + 4, y + 0, z + 5, 17, 1, 2);
        world.setBlock(x + 5, y + 6, z + 4, 17, 1, 2);
        world.setBlock(x + 5, y + 2, z + 4, 17, 1, 2);
        world.setBlock(x + 6, y + 6, z + 5, 17, 1, 2);
        world.setBlock(x + 6, y + 9, z + 5, 17, 1, 2);
        world.setBlock(x + 5, y + 9, z + 4, 17, 1, 2);
        world.setBlock(x + 8, y + 16, z + 6, 18, 1, 2);
        world.setBlock(x + 7, y + 16, z + 4, 18, 1, 2);
        world.setBlock(x + 8, y + 16, z + 4, 18, 1, 2);
        world.setBlock(x + 4, y + 16, z + 4, 18, 1, 2);
        world.setBlock(x + 4, y + 16, z + 5, 18, 1, 2);
        world.setBlock(x + 8, y + 15, z + 5, 18, 1, 2);
        world.setBlock(x + 7, y + 15, z + 3, 18, 1, 2);
        world.setBlock(x + 7, y + 15, z + 4, 18, 1, 2);
        world.setBlock(x + 7, y + 15, z + 6, 18, 1, 2);
        world.setBlock(x + 4, y + 17, z + 5, 18, 1, 2);
        world.setBlock(x + 5, y + 15, z + 3, 18, 1, 2);
        world.setBlock(x + 5, y + 15, z + 5, 18, 1, 2);
        world.setBlock(x + 5, y + 15, z + 7, 18, 1, 2);
        world.setBlock(x + 4, y + 15, z + 5, 18, 1, 2);
        world.setBlock(x + 7, y + 14, z + 7, 18, 1, 2);
        world.setBlock(x + 6, y + 14, z + 3, 18, 1, 2);
        world.setBlock(x + 6, y + 17, z + 4, 18, 1, 2);
        world.setBlock(x + 6, y + 14, z + 6, 18, 1, 2);
        world.setBlock(x + 6, y + 14, z + 8, 18, 1, 2);
        world.setBlock(x + 5, y + 14, z + 5, 18, 1, 2);
        world.setBlock(x + 8, y + 13, z + 6, 18, 1, 2);
        world.setBlock(x + 6, y + 13, z + 4, 18, 1, 2);
        world.setBlock(x + 6, y + 17, z + 3, 18, 1, 2);
        world.setBlock(x + 5, y + 13, z + 2, 18, 1, 2);
        world.setBlock(x + 5, y + 13, z + 7, 18, 1, 2);
        world.setBlock(x + 4, y + 13, z + 4, 18, 1, 2);
        world.setBlock(x + 4, y + 13, z + 5, 18, 1, 2);
        world.setBlock(x + 7, y + 17, z + 5, 18, 1, 2);
        world.setBlock(x + 8, y + 12, z + 6, 18, 1, 2);
        world.setBlock(x + 7, y + 12, z + 5, 18, 1, 2);
        world.setBlock(x + 7, y + 12, z + 8, 18, 1, 2);
        world.setBlock(x + 6, y + 12, z + 2, 18, 1, 2);
        world.setBlock(x + 8, y + 17, z + 6, 18, 1, 2);
        world.setBlock(x + 6, y + 12, z + 6, 18, 1, 2);
        world.setBlock(x + 5, y + 12, z + 2, 18, 1, 2);
        world.setBlock(x + 5, y + 5, z + 10, 18, 1, 2);
        world.setBlock(x + 5, y + 12, z + 6, 18, 1, 2);
        world.setBlock(x + 5, y + 12, z + 8, 18, 1, 2);
        world.setBlock(x + 6, y + 5, z + 10, 18, 1, 2);
        world.setBlock(x + 4, y + 12, z + 5, 18, 1, 2);
        world.setBlock(x + 4, y + 12, z + 7, 18, 1, 2);
        world.setBlock(x + 8, y + 11, z + 5, 18, 1, 2);
        world.setBlock(x + 8, y + 11, z + 7, 18, 1, 2);
        world.setBlock(x + 7, y + 11, z + 4, 18, 1, 2);
        world.setBlock(x + 6, y + 11, z + 3, 18, 1, 2);
        world.setBlock(x + 5, y + 18, z + 5, 18, 1, 2);
        world.setBlock(x + 10, y + 5, z + 5, 18, 1, 2);
        world.setBlock(x + 10, y + 5, z + 3, 18, 1, 2);
        world.setBlock(x + 6, y + 11, z + 6, 18, 1, 2);
        world.setBlock(x + 6, y + 11, z + 7, 18, 1, 2);
        world.setBlock(x + 6, y + 11, z + 8, 18, 1, 2);
        world.setBlock(x + 7, y + 18, z + 6, 18, 1, 2);
        world.setBlock(x + 5, y + 11, z + 5, 18, 1, 2);
        world.setBlock(x + 5, y + 11, z + 6, 18, 1, 2);
        world.setBlock(x + 4, y + 11, z + 3, 18, 1, 2);
        world.setBlock(x + 6, y + 6, z + 10, 18, 1, 2);
        world.setBlock(x + 4, y + 11, z + 5, 18, 1, 2);
        world.setBlock(x + 9, y + 10, z + 5, 18, 1, 2);
        world.setBlock(x + 8, y + 10, z + 2, 18, 1, 2);
        world.setBlock(x + 8, y + 10, z + 5, 18, 1, 2);
        world.setBlock(x + 7, y + 10, z + 5, 18, 1, 2);
        world.setBlock(x + 7, y + 10, z + 7, 18, 1, 2);
        world.setBlock(x + 7, y + 10, z + 8, 18, 1, 2);
        world.setBlock(x + 6, y + 10, z + 2, 18, 1, 2);
        world.setBlock(x + 7, y + 18, z + 4, 18, 1, 2);
        world.setBlock(x + 6, y + 10, z + 9, 18, 1, 2);
        world.setBlock(x + 4, y + 13, z + 6, 18, 1, 2);
        world.setBlock(x + 5, y + 10, z + 5, 18, 1, 2);
        world.setBlock(x + 4, y + 10, z + 5, 18, 1, 2);
        world.setBlock(x + 2, y + 10, z + 4, 18, 1, 2);
        world.setBlock(x + 10, y + 6, z + 6, 18, 1, 2);
        world.setBlock(x + 10, y + 6, z + 4, 18, 1, 2);
        world.setBlock(x + 10, y + 6, z + 2, 18, 1, 2);
        world.setBlock(x + 11, y + 6, z + 5, 18, 1, 2);
        world.setBlock(x + 11, y + 6, z + 4, 18, 1, 2);
        world.setBlock(x + 2, y + 10, z + 5, 18, 1, 2);
        world.setBlock(x + 2, y + 10, z + 6, 18, 1, 2);
        world.setBlock(x + 10, y + 9, z + 4, 18, 1, 2);
        world.setBlock(x + 10, y + 8, z + 3, 18, 1, 2);
        world.setBlock(x + 11, y + 7, z + 3, 18, 1, 2);
        world.setBlock(x + 10, y + 7, z + 4, 18, 1, 2);
        world.setBlock(x + 10, y + 7, z + 5, 18, 1, 2);
        world.setBlock(x + 6, y + 19, z + 4, 18, 1, 2);
        world.setBlock(x + 10, y + 10, z + 7, 18, 1, 2);
        world.setBlock(x + 5, y + 9, z + 3, 18, 1, 2);
        world.setBlock(x + 5, y + 9, z + 6, 18, 1, 2);
        world.setBlock(x + 7, y + 9, z + 9, 18, 1, 2);
        world.setBlock(x + 3, y + 7, z + 8, 18, 1, 2);
        world.setBlock(x + 2, y + 7, z + 3, 18, 1, 2);
        world.setBlock(x + 2, y + 7, z + 4, 18, 1, 2);
        world.setBlock(x + 9, y + 6, z + 2, 18, 1, 2);
        world.setBlock(x + 9, y + 6, z + 3, 18, 1, 2);
        world.setBlock(x + 8, y + 6, z + 0, 18, 1, 2);
        world.setBlock(x + 8, y + 6, z + 1, 18, 1, 2);
        world.setBlock(x + 8, y + 6, z + 5, 18, 1, 2);
        world.setBlock(x + 8, y + 6, z + 9, 18, 1, 2);
        world.setBlock(x + 7, y + 6, z + 2, 18, 1, 2);
        world.setBlock(x + 7, y + 6, z + 5, 18, 1, 2);
        world.setBlock(x + 7, y + 6, z + 7, 18, 1, 2);
        world.setBlock(x + 7, y + 6, z + 8, 18, 1, 2);
        world.setBlock(x + 6, y + 6, z + 1, 18, 1, 2);
        world.setBlock(x + 6, y + 6, z + 4, 18, 1, 2);
        world.setBlock(x + 4, y + 9, z + 2, 18, 1, 2);
        world.setBlock(x + 4, y + 9, z + 5, 18, 1, 2);
        world.setBlock(x + 6, y + 6, z + 9, 18, 1, 2);
        world.setBlock(x + 5, y + 6, z + 3, 18, 1, 2);
        world.setBlock(x + 3, y + 9, z + 3, 18, 1, 2);
        world.setBlock(x + 5, y + 6, z + 9, 18, 1, 2);
        world.setBlock(x + 3, y + 7, z + 7, 18, 1, 2);
        world.setBlock(x + 4, y + 6, z + 4, 18, 1, 2);
        world.setBlock(x + 4, y + 6, z + 5, 18, 1, 2);
        world.setBlock(x + 1, y + 6, z + 4, 18, 1, 2);
        world.setBlock(x + 9, y + 5, z + 5, 18, 1, 2);
        world.setBlock(x + 8, y + 5, z + 5, 18, 1, 2);
        world.setBlock(x + 8, y + 5, z + 6, 18, 1, 2);
        world.setBlock(x + 7, y + 5, z + 1, 18, 1, 2);
        world.setBlock(x + 6, y + 5, z + 3, 18, 1, 2);
        world.setBlock(x + 8, y + 8, z + 2, 18, 1, 2);
        world.setBlock(x + 6, y + 5, z + 8, 18, 1, 2);
        world.setBlock(x + 8, y + 8, z + 5, 18, 1, 2);
        world.setBlock(x + 7, y + 8, z + 8, 18, 1, 2);
        world.setBlock(x + 4, y + 5, z + 3, 18, 1, 2);
        world.setBlock(x + 4, y + 5, z + 5, 18, 1, 2);
        world.setBlock(x + 3, y + 5, z + 2, 18, 1, 2);
        world.setBlock(x + 3, y + 5, z + 5, 18, 1, 2);
        world.setBlock(x + 2, y + 5, z + 8, 18, 1, 2);
        world.setBlock(x + 1, y + 5, z + 5, 18, 1, 2);
        world.setBlock(x + 0, y + 5, z + 5, 18, 1, 2);
        world.setBlock(x + 0, y + 5, z + 6, 18, 1, 2);
        world.setBlock(x + 8, y + 4, z + 2, 18, 1, 2);
        world.setBlock(x + 7, y + 4, z + 3, 18, 1, 2);
        world.setBlock(x + 7, y + 4, z + 4, 18, 1, 2);
        world.setBlock(x + 7, y + 4, z + 5, 18, 1, 2);
        world.setBlock(x + 7, y + 4, z + 6, 18, 1, 2);
        world.setBlock(x + 6, y + 4, z + 4, 18, 1, 2);
        world.setBlock(x + 6, y + 8, z + 1, 18, 1, 2);
        world.setBlock(x + 6, y + 8, z + 6, 18, 1, 2);
        world.setBlock(x + 6, y + 8, z + 9, 18, 1, 2);
        world.setBlock(x + 5, y + 4, z + 6, 18, 1, 2);
        world.setBlock(x + 5, y + 4, z + 7, 18, 1, 2);
        world.setBlock(x + 4, y + 4, z + 5, 18, 1, 2);
        world.setBlock(x + 2, y + 4, z + 5, 18, 1, 2);
        world.setBlock(x + 2, y + 4, z + 8, 18, 1, 2);
        world.setBlock(x + 1, y + 4, z + 7, 18, 1, 2);
        world.setBlock(x + 8, y + 3, z + 6, 18, 1, 2);
        world.setBlock(x + 7, y + 3, z + 3, 18, 1, 2);
        world.setBlock(x + 7, y + 3, z + 5, 18, 1, 2);
        world.setBlock(x + 4, y + 8, z + 6, 18, 1, 2);
        world.setBlock(x + 5, y + 3, z + 2, 18, 1, 2);
        world.setBlock(x + 4, y + 8, z + 9, 18, 1, 2);
        world.setBlock(x + 3, y + 8, z + 5, 18, 1, 2);
        world.setBlock(x + 4, y + 3, z + 3, 18, 1, 2);
        world.setBlock(x + 3, y + 8, z + 8, 18, 1, 2);
        world.setBlock(x + 2, y + 8, z + 7, 18, 1, 2);
        world.setBlock(x + 4, y + 7, z + 6, 18, 1, 2);
        world.setBlock(x + 4, y + 7, z + 5, 18, 1, 2);
        world.setBlock(x + 9, y + 7, z + 4, 18, 1, 2);
        world.setBlock(x + 9, y + 7, z + 7, 18, 1, 2);
        world.setBlock(x + 8, y + 7, z + 0, 18, 1, 2);
        world.setBlock(x + 8, y + 7, z + 5, 18, 1, 2);
        world.setBlock(x + 8, y + 7, z + 9, 18, 1, 2);
        world.setBlock(x + 7, y + 7, z + 5, 18, 1, 2);
        world.setBlock(x + 7, y + 7, z + 9, 18, 1, 2);
        world.setBlock(x + 6, y + 7, z + 1, 18, 1, 2);
        world.setBlock(x + 6, y + 7, z + 3, 18, 1, 2);
        world.setBlock(x + 6, y + 7, z + 4, 18, 1, 2);
        world.setBlock(x + 4, y + 6, z + 1, 18, 1, 2);
        world.setBlock(x + 5, y + 7, z + 3, 18, 1, 2);
        
        return true;
    }
}
