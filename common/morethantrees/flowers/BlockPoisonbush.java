package morethantrees.flowers;

import java.util.Random;

import morethantrees.MTJT;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class BlockPoisonbush extends CTFlower
{

    public BlockPoisonbush(int i)
    {
        super(i);
        float f = 0.4F;
        this.setCreativeTab(MTJT.tabTreeFlowers);
        setBlockBounds(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, 0.8F, 0.5F + f);
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
        return MTJT.poisonbush.blockID;
    }
	
	protected boolean canThisPlantGrowOnThisBlockID(int var1)
    {
        return var1 == Block.grass.blockID || var1 == Block.dirt.blockID || var1 == Block.sand.blockID;//|| var1 == MTJT.planter.blockID;
    }

    public void onEntityCollidedWithBlock(World world, int i, int j, int k, Entity entity)
    {
        if(entity instanceof EntityPlayer)
        {
            entity.attackEntityFrom(DamageSource.magic, 5);
        }
    }
	
	@Override
	public void registerIcons(IconRegister par1IconRegister)
	{
		this.blockIcon = par1IconRegister.registerIcon("MTJT:poisonbush");
	}

}
