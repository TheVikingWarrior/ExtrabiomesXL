package morethantrees.flowers;

import java.util.Random;

import morethantrees.MTJT;
import net.minecraft.block.BlockFlower;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.World;

public class BlockEleGrass extends BlockFlower
{

    public BlockEleGrass(int i)
    {
        super(i, Material.plants);
        this.setTickRandomly(true);
        this.setCreativeTab(MTJT.tabTreeFlowers);
    }
    
    //public int colorMultiplier(IBlockAccess iblockaccess, int i, int j, int k)
    //{
    //    iblockaccess.getWorldChunkManager().func_4069_a(i, k, 1, 1);
    //    double d = iblockaccess.getWorldChunkManager().temperature[0];
    //    double d1 = iblockaccess.getWorldChunkManager().humidity[0];
    //    return ColorizerGrass.getGrassColor(d, d1);
    //}

    public boolean canPlaceBlockAt(World world, int i, int j, int k)
    {
        return super.canPlaceBlockAt(world, i, j, k) && canThisPlantGrowOnThisBlockID(world.getBlockId(i, j - 1, k)) && world.getBlockId(i, j + 1, k) == 0;
    }

    public void onBlockPlacedBy(World world, int i, int j, int k, EntityLiving entityliving)
    {
        if(world.getBlockId(i, j + 1, k) == 0)
        {
            world.setBlock(i, j + 1, k, MTJT.eleGrassTop.blockID);
        }
    }

    public void onNeighborBlockChange(World world, int i, int j, int k, int l)
    {
        if(!canBlockStay(world, i, j, k))
        {
            dropBlockAsItem(world, i, j, k, world.getBlockMetadata(i, j, k), l);
            world.setBlock(i, j, k, 0);
        }
        if(world.getBlockId(i, j + 1, k) == 0)
        {
            dropBlockAsItem(world, i, j, k, world.getBlockMetadata(i, j, k), l);
            world.setBlock(i, j, k, 0);
        }
    }

    public boolean canBlockStay(World world, int i, int j, int k)
    {
        return canThisPlantGrowOnThisBlockID(world.getBlockId(i, j - 1, k));
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
        return MTJT.eleGrass.blockID;
    }

    public void updateTick(World world, int i, int j, int k, Random random)
    {
        if(random.nextInt(15) == 0)
        {
            int l = (i + random.nextInt(3)) - 1;
            int i1 = (j + random.nextInt(2)) - random.nextInt(2);
            int j1 = (k + random.nextInt(3)) - 1;
            if(world.isAirBlock(l, i1, j1) && canBlockStay(world, l, i1, j1))
            {
                i += random.nextInt(3) - 1;
                k += random.nextInt(3) - 1;
                if(world.isAirBlock(l, i1, j1) && canBlockStay(world, l, i1, j1))
                {
                    world.setBlock(l, i1, j1, MTJT.eleGrassTop.blockID);
                }
            }
        }
    }

    public void onEntityCollidedWithBlock(World world, int i, int j, int k, Entity entity)
    {
        if(entity instanceof EntityPlayer)
        {
            entity.motionX *= 0.40000000000000002D;
            entity.motionZ *= 0.40000000000000002D;
        }
    }
	
	@Override
		public void registerIcons(IconRegister par1IconRegister)
		{
			this.blockIcon = par1IconRegister.registerIcon("MTJT:eleGrass");
		}
	
}
