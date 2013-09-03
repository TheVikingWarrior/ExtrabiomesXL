package morethantrees.flowers;

import java.util.Random;

import morethantrees.MTJT;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class BlockSpikebush extends CTFlower
{

    public BlockSpikebush(int i)
    {
        super(i);
        float f = 0.4F;
        this.setCreativeTab(MTJT.tabTreeFlowers);
        setBlockBounds(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, 0.8F, 0.5F + f);
    }
    
    public AxisAlignedBB getCollisionBoundingBoxFromPool(World world, int i, int j, int k)
    {
        float f = 0.0625F;
        return AxisAlignedBB.getBoundingBox((float)i + f, j, (float)k + f, (float)(i + 1) - f, (float)(j + 1) - f, (float)(k + 1) - f);
    }

    //public int colorMultiplier(IBlockAccess iblockaccess, int i, int j, int k)
    //{
    //    iblockaccess.getWorldChunkManager().func_4069_a(i, k, 1, 1);
    //    double d = iblockaccess.getWorldChunkManager().temperature[0];
    //    double d1 = iblockaccess.getWorldChunkManager().humidity[0];
    //    return ColorizerGrass.getGrassColor(d, d1);
    //}
	
	public void onEntityCollidedWithBlock(World world, int i, int j, int k, Entity entity)
    {
        if(entity instanceof EntityPlayer)
        {
            entity.attackEntityFrom(DamageSource.cactus, 1);
        }
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
        return MTJT.spikebush.blockID;
    }
	
	@Override
	public void registerIcons(IconRegister par1IconRegister)
	{
		this.blockIcon = par1IconRegister.registerIcon("MTJT:spikebush");
	}
    
}
