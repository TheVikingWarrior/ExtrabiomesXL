package morethantrees.flowers;

import java.util.Random;

import morethantrees.MTJT;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BlockHappyCactus extends CTFlower
{
 
        public BlockHappyCactus(int i) 
        {
                super(i);
                this.setCreativeTab(MTJT.tabTreeFlowers);
                this.isBlockContainer = true;
        }
 
        public void onBlockAdded(World par1World, int par2, int par3, int par4)
        {
            super.onBlockAdded(par1World, par2, par3, par4);
            TileEntityHappyCactus Shooter=new TileEntityHappyCactus();
            par1World.setBlockTileEntity(par2, par3, par4,Shooter);
            par1World.setBlockTileEntity(par2, par3, par4, this.createTileEntity(par1World, par1World.getBlockMetadata(par2, par3, par4)));
            
            if(par1World.getClosestPlayer(par2, par3, par4, 6.0F)!=null)
            	Shooter.setOwner(par1World.getClosestPlayer(par2, par3, par4, 6.0F).username);
        }
        
        public TileEntity createNewTileEntity(World var1)
        {
            return new TileEntityHappyCactus();
        }
        public void breakBlock(World var1, int var2, int var3, int var4, int var5, int var6)
        {
            super.breakBlock(var1, var2, var3, var4, var5, var6);
            var1.removeBlockTileEntity(var2, var3, var4);
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
			return var1 == Block.grass.blockID || var1 == Block.dirt.blockID || var1 == Block.sand.blockID || var1 == Block.tilledField.blockID;//|| var1 == MTJT.planter.blockID;
		}

        /**
         * Returns the ID of the items to drop on destruction.
         */
        public int idDropped(int par1, Random par2Random, int par3)
        {
            return MTJT.happyCactus.blockID;
        }
		
		@Override
		public void registerIcons(IconRegister par1IconRegister)
		{
			this.blockIcon = par1IconRegister.registerIcon("MTJT:biter");
		}
 
}