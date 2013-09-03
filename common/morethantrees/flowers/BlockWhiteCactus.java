package morethantrees.flowers;

import java.util.Random;

import morethantrees.MTJT;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IconRegister;

public class BlockWhiteCactus extends CTFlower
{
 
        public BlockWhiteCactus(int i) 
        {
                super(i);
                this.setCreativeTab(MTJT.tabTreeFlowers);
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
            return MTJT.whiteCactus.blockID;
        }
		
		@Override
		public void registerIcons(IconRegister par1IconRegister)
		{
			this.blockIcon = par1IconRegister.registerIcon("MTJT:whiteCactus");
		}
 
}
