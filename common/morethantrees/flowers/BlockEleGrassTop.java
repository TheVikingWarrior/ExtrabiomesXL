package morethantrees.flowers;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.World;

public class BlockEleGrassTop extends Block
{

    public BlockEleGrassTop(int i)
    {
        super(i, Material.plants);
        //blockIndexInTexture = j;
    }
    
    //public int colorMultiplier(IBlockAccess iblockaccess, int i, int j, int k)
    //{
    //    iblockaccess.getWorldChunkManager().func_4069_a(i, k, 1, 1);
    //    double d = iblockaccess.getWorldChunkManager().temperature[0];
    //    double d1 = iblockaccess.getWorldChunkManager().humidity[0];
    //    return ColorizerGrass.getGrassColor(d, d1);
    //}

    public int idDropped(int i, Random random)
    {
        return -1;
    }

    public void onNeighborBlockChange(World world, int i, int j, int k, int l)
    {
        if(!canBlockStay(world, i, j, k))
        {
            dropBlockAsItem(world, i, j, k, world.getBlockMetadata(i, j, k), l);
            world.setBlock(i, j, k, 0);
        }
        if(world.getBlockId(i, j - 1, k) == 0)
        {
            world.setBlock(i, j, k, 0);
        }
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
	
	@Override
	public void registerIcons(IconRegister par1IconRegister)
	{
		this.blockIcon = par1IconRegister.registerIcon("MTJT:eleGrassTop");
	}
	
}
