package morethantrees.flowers;

import java.util.Random;

import morethantrees.MTJT;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.World;

public class BlockWinterbush extends CTFlower
{

    public BlockWinterbush(int i)
    {
        super(i, Material.plants);
        this.setCreativeTab(MTJT.tabTreeFlowers);
    }
    
    public AxisAlignedBB getCollisionBoundingBoxFromPool(World world, int i, int j, int k)
    {
        return null;
    }

    public boolean isOpaqueCube()
    {
        return false;
    }

    public boolean renderAsNormalBlock()
    {
        return false;
    }

    public int getRenderType()
    {
        return 1;
    }

    /**
     * Returns the quantity of items to drop on block destruction.
     */
    public int quantityDropped(Random par1Random)
    {
        return 1;
    }

    // this tells the game what to drop if the block is brocken with an explosion. an example of this would be creeper explosions
    // making stone drop cobblestone. 
    public int idDropped(int par1, Random par2Random, int par3)
    {
        return MTJT.winterbush.blockID;
    }
	
	@Override
	public void registerIcons(IconRegister par1IconRegister)
	{
		this.blockIcon = par1IconRegister.registerIcon("MTJT:winterbush");
	}
		
}
