package morethantrees.flowers;

import java.util.Random;

import morethantrees.MTJT;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.world.World;

public class BlockGhostOrchid extends CTFlower
{
    
    public BlockGhostOrchid(int i)
    {
        super(i);
        this.setCreativeTab(MTJT.tabTreeFlowers);
    }
    
    protected boolean canThisPlantGrowOnThisBlockID(int var1)
    {
        return var1 == Block.dirt.blockID;//|| var1 == MTJT.planter.blockID;
    }
    
    public boolean canBlockStay(World var1, int var2, int var3, int var4)
    {
        return (var1.getFullBlockLightValue(var2, var3, var4) <= 8 || var1.canBlockSeeTheSky(var2, var3, var4)) && this.canThisPlantGrowOnThisBlockID(var1.getBlockId(var2, var3 - 1, var4));
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
        return MTJT.ghostOrchid.blockID;
    }
    
    @Override
    public void registerIcons(IconRegister par1IconRegister)
    {
        this.blockIcon = par1IconRegister.registerIcon("MTJT:ghostOrchid");
    }
    
}
