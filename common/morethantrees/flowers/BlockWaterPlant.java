package morethantrees.flowers;

import java.util.Random;

import morethantrees.MTJT;
import morethantrees.flowers.flowergen.WorldGenWaterPond;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class BlockWaterPlant extends CTFlower
{
 
        private Random random;

		public BlockWaterPlant(int i) 
        {
                super(i);
                this.setCreativeTab(MTJT.tabTreeFlowers);
        }
 
        /**
         * Returns the quantity of items to drop on block destruction.
         */
        public int quantityDropped(Random par1Random)
        {
            return 1;
        }
        
        protected boolean canThisPlantGrowOnThisBlockID(int var1)
        {
            return var1 == Block.grass.blockID || var1 == Block.dirt.blockID || var1 == Block.tilledField.blockID || var1 == Block.sand.blockID;
        }

        public boolean onBlockActivated(World world, int i, int j, int k, EntityPlayer entityplayer, int par2, float par3, float par4, float par5)
        {
           ItemStack equipped = entityplayer.getCurrentEquippedItem();
           if (equipped == null)
           {
                return false;
           }
           if ((equipped.getItem() == Item.bucketEmpty))
           {
        	   	this.generate(world, random, i, j, k);
        	   	equipped.stackSize--;
   				return true;
   			}
           return false;
        }
   	
        public void generate(World world, Random rand, int i, int j, int k)
        {
        	world.setBlock(i, j, k, 0);
        	WorldGenWaterPond pond = new WorldGenWaterPond();
        	if (!pond.generate(world, rand, i, j, k))
        	{
        		world.setBlock(i, j, k, this.blockID);
        	}
   		
        }
		
		@Override
		public void registerIcons(IconRegister par1IconRegister)
		{
			this.blockIcon = par1IconRegister.registerIcon("MTJT:waterPlant");
		}
		
}
