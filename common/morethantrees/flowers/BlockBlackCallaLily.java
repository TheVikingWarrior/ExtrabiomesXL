package morethantrees.flowers;

import java.util.Random;

import morethantrees.MTJT;
import net.minecraft.client.renderer.texture.IconRegister;

public class BlockBlackCallaLily extends CTFlower
{
 
        public BlockBlackCallaLily(int i) 
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

        /**
         * Returns the ID of the items to drop on destruction.
         */
        //public int idDropped(int par1, Random par2Random, int par3)
        //{
        //    return MTJT.blackCallaLily.blockID;
        //}
		
		@Override
		public void registerIcons(IconRegister par1IconRegister)
		{
			this.blockIcon = par1IconRegister.registerIcon("MTJT:blackCallaLily");
		}
 
}
