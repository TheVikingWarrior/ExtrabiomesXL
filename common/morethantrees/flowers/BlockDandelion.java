package morethantrees.flowers;

import java.util.Random;

import morethantrees.MTJT;
import morethantrees.util.MTJTFX;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.world.World;

public class BlockDandelion extends CTFlower
{
    
    public BlockDandelion(int i)
    {
        super(i);
        this.setCreativeTab(MTJT.tabTreeFlowers);
    }
    
    public void onBlockDestroyedByPlayer(World world, int i, int j, int k, int l)
    {
        MTJTFX.spawnParticle("dandelion", i + 0.5, j + 1.0, k + 0.5, 0.0D, 0.20D, 0.0D);
        MTJTFX.spawnParticle("dandelion", i, j + 1.0, k + 1.0, 0.0D, 0.08D, 0.0D);
        MTJTFX.spawnParticle("dandelion", i, j + 1.0, k + 1.3, 0.0D, 0.16D, 0.0D);
        MTJTFX.spawnParticle("dandelion", i, j + 1.0, k + 1.6, 0.0D, 0.22D, 0.0D);
        MTJTFX.spawnParticle("dandelion", i, j + 1.0, k + 2.0, 0.0D, 0.25D, 0.0D);
        //MTJTFX.spawnParticle("dandelion", i+0.5, j+1.0, k+0.5, 0.0D, 1.5D, 0.0D);
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
        return MTJT.dandelion.blockID;
    }
    
    @Override
    public void registerIcons(IconRegister par1IconRegister)
    {
        this.blockIcon = par1IconRegister.registerIcon("MTJT:dandelion");
    }
    
}