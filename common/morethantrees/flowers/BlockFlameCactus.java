package morethantrees.flowers;

import java.util.Random;

import morethantrees.MTJT;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class BlockFlameCactus extends CTFlower
{
	private float height;

    public BlockFlameCactus(int i)
    {
        super(i, Material.plants);
        this.setTickRandomly(true);
        float f = 0.2F;
        this.setCreativeTab(MTJT.tabTreeFlowers);
        setBlockBounds(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, 1.0F, 0.5F + f);
    }
    
    public void onBlockClicked(World world, int i, int j, int k, EntityPlayer entityplayer)
    {
    	onEntityCollidedWithBlock(world, i, j, k, entityplayer);
    }

    public void onEntityCollidedWithBlock(World world, int i, int j, int k, EntityPlayer entityplayer)
    {
		entityplayer.attackEntityFrom(DamageSource.inFire, 4);
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
	
	// this sets the amount droped when broken.
    public int quantityDropped(Random par1Random)
    {
        return 1;
    }

    // this tells the game what to drop if the block is brocken with an explosion. an example of this would be creeper explosions
    // making stone drop cobblestone. 
    public int idDropped(int par1, Random par2Random, int par3)
    {
        return MTJT.flameCactus.blockID;
    }

    public boolean canPlaceBlockAt(World world, int i, int j, int k)
    {
        return super.canPlaceBlockAt(world, i, j, k) && canThisPlantGrowOnThisBlockID(world.getBlockId(i, j - 1, k));
    }

    public void onNeighborBlockChange(World world, int i, int j, int k, int l)
    {
        if(!canBlockStay(world, i, j, k))
        {
            dropBlockAsItem(world, i, j, k, world.getBlockMetadata(i, j, k), l);
            world.setBlock(i, j, k, 0);
        }
    }
	
	protected boolean canThisPlantGrowOnThisBlockID(int var1)
    {
        return var1 == Block.grass.blockID || var1 == Block.dirt.blockID || var1 == Block.sand.blockID || var1 == Block.sandStone.blockID;//|| var1 == MTJT.planter.blockID;
    }

    public boolean canBlockStay(World world, int i, int j, int k)
    {
        return canThisPlantGrowOnThisBlockID(world.getBlockId(i, j - 1, k));
    }

    public void randomDisplayTick(World world, int i, int j, int k, Random random)
    {
        world.spawnParticle("lava", i+0.5, j+1.0, k+0.5, 0.0D, 0.25D, 0.0D);
        world.spawnParticle("smoke", i+0.5, j+1.0, k+0.5, 0.0D, 0.25D, 0.0D);
        world.spawnParticle("flame", i+0.5, j+1.0, k+0.5, 0.0D, 0.25D, 0.0D);
    }
	
	@Override
	public void registerIcons(IconRegister par1IconRegister)
	{
		this.blockIcon = par1IconRegister.registerIcon("MTJT:flameCactus");
	}
		
}
