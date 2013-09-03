package morethantrees.flowers;

import java.util.Random;

import morethantrees.MTJT;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.world.World;

public class BlockSwell extends CTFlower
{
 
        public BlockSwell(int i) 
        {
                super(i);
                this.setCreativeTab(MTJT.tabTreeFlowers);
        }
 
        public void onEntityCollidedWithBlock(World var1, int var2, int var3, int var4, Entity var5)
        {
            super.onEntityCollidedWithBlock(var1, var2, var3, var4, var5);

            if (var5 instanceof EntityLiving || var5 instanceof EntityArrow)
            {
                var1.setBlock(var2, var3, var4, 0);
                var1.createExplosion((Entity)null, (double)var2, (double)var3, (double)var4, 0.8F, true);
            }
        }
		
		protected boolean canThisPlantGrowOnThisBlockID(int var1)
		{
			return var1 == Block.grass.blockID || var1 == Block.dirt.blockID || var1 == Block.sand.blockID;//|| var1 == MTJT.planter.blockID;
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
            return MTJT.swell.blockID;
        }
		
		@Override
		public void registerIcons(IconRegister par1IconRegister)
		{
			this.blockIcon = par1IconRegister.registerIcon("MTJT:swell");
		}
 
}
