package morethantrees.blocks;

import java.util.Random;

import morethantrees.MTJT;
import net.minecraft.block.Block;
import net.minecraft.block.BlockStairs;
import net.minecraft.client.renderer.texture.IconRegister;

public class BlockBlackWoodStairs extends BlockStairs
{
    /** The block that is used as model for the stair. */
    private Block modelBlock;
    
    public BlockBlackWoodStairs(int par1, Block modelBlockx, int par2)
    {
        super(par1, modelBlockx, par2);
        //blockIndexInTexture = par2;
        this.modelBlock = modelBlockx;
        this.setLightOpacity(0);
        this.setCreativeTab(MTJT.tabTreeBlocks);
    }
    
    @Override
    public void registerIcons(IconRegister par1IconRegister)
    {
        this.blockIcon = par1IconRegister.registerIcon("MTJT:blackPlanks");
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
        return this.blockID;
    }
    
}
