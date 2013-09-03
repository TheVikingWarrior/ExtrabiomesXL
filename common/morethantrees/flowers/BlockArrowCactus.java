package morethantrees.flowers;

import java.util.Random;

import morethantrees.MTJT;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BlockArrowCactus extends CTFlower
{
 
        public BlockArrowCactus(int i) 
        {
                super(i);
                this.setCreativeTab(MTJT.tabTreeFlowers);
                this.isBlockContainer = true;
        }
        
        protected boolean canThisPlantGrowOnThisBlockID(int var1)
        {
            return var1 == Block.grass.blockID || var1 == Block.dirt.blockID || var1 == Block.sand.blockID;
        }
        
        /**
         * Called whenever the block is added into the world. Args: world, x, y, z
         */
        public void onBlockAdded(World par1World, int par2, int par3, int par4)
        {
            //super.onBlockAdded(par1World, par2, par3, par4);
            TileEntityArrowCactus Shooter=new TileEntityArrowCactus();
            par1World.setBlockTileEntity(par2, par3, par4,Shooter);
            par1World.setBlockTileEntity(par2, par3, par4, this.createTileEntity(par1World, par1World.getBlockMetadata(par2, par3, par4)));
            //TileEntityArrowCactus Shooter=(TileEntityArrowCactus)par1World.getBlockTileEntity(par2, par3, par4);
            if(par1World.getClosestPlayer(par2, par3, par4, 6.0F)!=null)
            	Shooter.setOwner(par1World.getClosestPlayer(par2, par3, par4, 6.0F).username);
        }
        
        public int quantityDropped(Random par1Random)
        {
            return 1;
        }

        /**
         * Returns the ID of the items to drop on destruction.
         */
        public int idDropped(int par1, Random par2Random, int par3)
        {
            return MTJT.arrowCactus.blockID;
        }
        
        /**
         * Returns a new instance of a block's tile entity class. Called on placing the block.
         */
        public TileEntity createNewTileEntity(World var1)
        {
            return new TileEntityArrowCactus();
        }
        public void breakBlock(World var1, int var2, int var3, int var4, int var5, int var6)
        {
            super.breakBlock(var1, var2, var3, var4, var5, var6);
            var1.removeBlockTileEntity(var2, var3, var4);
        }
		
		@Override
		public void registerIcons(IconRegister par1IconRegister)
		{
			this.blockIcon = par1IconRegister.registerIcon("MTJT:arrowcactus");
		}
        
}
