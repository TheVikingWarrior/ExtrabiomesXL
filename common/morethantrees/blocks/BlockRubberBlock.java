package morethantrees.blocks;

import java.util.Random;

import morethantrees.MTJT;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.world.World;

public class BlockRubberBlock extends Block
{
    
    public BlockRubberBlock(int i)
    {
        
        super(i, Material.rock);
        this.setCreativeTab(MTJT.tabTreeBlocks);
        
    }
    
    @Override
    public void registerIcons(IconRegister par1IconRegister)
    {
        this.blockIcon = par1IconRegister.registerIcon("MTJT:rubberBlock");
    }
    
    public void onEntityWalking(World world, int x, int y, int z, Entity entity)
    {
        
        entity.motionY += 1.7;
        
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