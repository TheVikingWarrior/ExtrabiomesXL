package morethantrees.flowers;

import java.util.Random;

import morethantrees.MTJT;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.world.World;

public class BlockMarshMarigold extends CTFlower
{
    
    public BlockMarshMarigold(int i)
    {
        super(i);
        this.setCreativeTab(MTJT.tabTreeFlowers);
    }
    
    /**
     * Returns the quantity of items to drop on block destruction.
     */
    public int quantityDropped(Random par1Random)
    {
        return 1;
    }
    
    public void onBlockAdded(World par1World, int par2, int par3, int par4)
    {
        int dist = 2;
        boolean isblocknear = false;
        for (int x0 = -dist; x0 <= dist; ++x0)
        {
            for (int y0 = -dist; y0 <= dist; ++y0)
            {
                for (int z0 = -dist; z0 <= dist; ++z0)
                {
                    if (par1World.getBlockId(par2 + x0, par3 + y0, par4 + z0) == Block.waterStill.blockID && (x0 != 0 || y0 != 0 || z0 != 0))
                    {
                        isblocknear = true;
                        par1World.setBlock(par2, par3, par4, MTJT.marshMarigold.blockID, 0, 2);
                        //break;
                    }
                    
                }
                //if(isblocknear)
                //break;
            }
            //if(isblocknear)
            //break;
        }
    }
    
    /**
     * Returns the ID of the items to drop on destruction.
     */
    public int idDropped(int par1, Random par2Random, int par3)
    {
        return MTJT.marshMarigold.blockID;
    }
    
    @Override
    public void registerIcons(IconRegister par1IconRegister)
    {
        this.blockIcon = par1IconRegister.registerIcon("MTJT:marshMarigold");
    }
    
}