package morethantrees.blocks;

import java.util.Random;

import morethantrees.MTJT;
import net.minecraft.block.Block;
import net.minecraft.block.BlockStairs;
import net.minecraft.client.renderer.texture.IconRegister;

public class BlockWalnutWoodStairs extends BlockStairs
{
    private final Block modelBlock;
    
    public BlockWalnutWoodStairs(int var1, Block var2, int var3)
    {
        super(var1, var2, var3);
        //this.blockIndexInTexture = var3;
        this.modelBlock = var2;
        this.setLightOpacity(0);
        this.setCreativeTab(MTJT.tabTreeBlocks);
    }
    
    @Override
    public void registerIcons(IconRegister par1IconRegister)
    {
        this.blockIcon = par1IconRegister.registerIcon("MTJT:walnutPlanks");
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
