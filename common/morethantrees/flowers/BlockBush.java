package morethantrees.flowers;

import java.util.Random;

import morethantrees.MTJT;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IconRegister;

public class BlockBush extends CTFlower
{
    
    public BlockBush(int i)
    {
        super(i);
        float f = 0.4F;
        this.setTickRandomly(true);
        this.setCreativeTab(MTJT.tabTreeFlowers);
        setBlockBounds(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, 0.8F, 0.5F + f);
    }
    
    //public int colorMultiplier(IBlockAccess iblockaccess, int i, int j, int k)
    //{
    //    iblockaccess.getBiomeGenForCoords.func_4069_a(i, k, 1, 1);
    //    double d = iblockaccess.getWorldChunkManager().temperature[0];
    //    double d1 = iblockaccess.getWorldChunkManager().humidity[0];
    //    return ColorizerGrass.getGrassColor(d, d1);
    //}
    
    protected boolean canThisPlantGrowOnThisBlockID(int var1)
    {
        return var1 == Block.grass.blockID || var1 == Block.dirt.blockID || var1 == Block.tilledField.blockID || var1 == Block.sand.blockID;//|| var1 == MTJT.planter.blockID;
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
        return MTJT.bush.blockID;
    }
    
    @Override
    public void registerIcons(IconRegister par1IconRegister)
    {
        this.blockIcon = par1IconRegister.registerIcon("MTJT:bush");
    }
    
}
