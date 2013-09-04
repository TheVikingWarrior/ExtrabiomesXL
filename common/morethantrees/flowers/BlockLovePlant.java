package morethantrees.flowers;

import java.util.Random;

import morethantrees.MTJT;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.world.World;

public class BlockLovePlant extends CTFlower
{
    
    public BlockLovePlant(int i)
    {
        super(i);
        this.setCreativeTab(MTJT.tabTreeFlowers);
    }
    
    public void randomDisplayTick(World world, int i, int j, int k, Random random)
    {
        int dist = 2;
        boolean isblocknear = false;
        for (int x0 = -dist; x0 <= dist; ++x0)
        {
            for (int y0 = -dist; y0 <= dist; ++y0)
            {
                for (int z0 = -dist; z0 <= dist; ++z0)
                {
                    if (world.getBlockId(i + x0, j + y0, k + z0) == MTJT.lovePlant.blockID && (x0 != 0 || y0 != 0 || z0 != 0))
                    {
                        isblocknear = true;
                        world.spawnParticle("heart", i + 0.5, j + 1.0, k + 0.5, 0.0D, 0.08D, 0.0D);
                        break;
                    }
                }
                if (isblocknear)
                    break;
            }
            if (isblocknear)
                break;
        }
        
    }
    
    /**
     * Returns the quantity of items to drop on block destruction.
     */
    public int quantityDropped(Random par1Random)
    {
        return 1;
    }
    
    /**
     * Returns the ID of the items to drop on destruction.
     */
    public int idDropped(int par1, Random par2Random, int par3)
    {
        return MTJT.lovePlant.blockID;
    }
    
    @Override
    public void registerIcons(IconRegister par1IconRegister)
    {
        this.blockIcon = par1IconRegister.registerIcon("MTJT:lovePlant");
    }
    
}
