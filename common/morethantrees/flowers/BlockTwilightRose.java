package morethantrees.flowers;

import java.util.Random;

import morethantrees.MTJT;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

//public class BlockTwilightRose extends CTFlower
//{
		
		/*public BlockTwilightRose(int i, int j) 
        {
                super(i, j);
                this.setCreativeTab(Trees.tabTreeDeco);
                this.setTickRandomly(true);
        }
 
        /*public int tickRate()
        {
            return 10;
        }*/
        /*public int onBlockPlaced(World par1World, int par2, int par3, int par4, int par5, float par6, float par7, float par8, int par9)
        {
        	if (!par1World.isRemote)
            {
                long var6 = par1World.getWorldTime();
        		if(par1World.getBlockLightValue_do(par2, par3, par4,true)<10.0F || (par1World.canBlockSeeTheSky(par2, par3, par4) && var6 > 12000))
        		{
        			//var1.setBlockWithNotify(var2, var3, var4, blockID);
        			this.setLightValue(1F);
        		}
        		else
        		{
        			//var1.setBlockWithNotify(var2, var3, var4, blockID);
        			this.setLightValue(0F);
        		}
            }
            return par9;
        }        
        @Override
        public void updateTick(World var1, int var2, int var3, int var4, Random var5)
        {
        	this.onBlockPlaced(var1, var2, var3, var4,0,0F,0F,0F,0);
        }
        
        //public void randomDisplayTick(World var1, int var2, int var3, int var4, Random var5)
        //{
        //    this.updateTick(var1, var2, var3, var4, var5);
        //}
        
        /**
         * Returns the quantity of items to drop on block destruction.
         */
        /*public int quantityDropped(Random par1Random)
        {
            return 1;
        }

        /**
         * Returns the ID of the items to drop on destruction.
         */
        //public int idDropped(int par1, Random par2Random, int par3)
        //{
        //    return Trees.twilightRose.blockID;
        //}
	public class BlockTwilightRose extends CTFlower 
	{
		protected static World theWorld;

		public BlockTwilightRose(int par1) 
		{
			super(par1);
			setTickRandomly(true);
	        float var4 = 0.2F;
	        setBlockBounds(0.5F - var4, 0.0F, 0.5F - var4, 0.5F + var4, var4 * 3.0F, 0.5F + var4);
	        this.setCreativeTab(MTJT.tabTreeFlowers);
		}
		
		public void onBlockAdded(World world, int x, int y, int z) 
		{
			if(theWorld == null)
			theWorld = world;
			world.scheduleBlockUpdate(x, y, z, blockID, 600);
		}
		
		public void updateTick(World world, int x, int y, int z, Random par5Random) 
		{
			if(theWorld == null)
			theWorld = world;  //make sure theWorld is not null
			getLightValue(null, x, y, z); //force recheck of light level, probably not needed
			world.scheduleBlockUpdate(x, y, z, blockID, 50);  //schedule another update
		}
		
		@Override
		public int getLightValue(IBlockAccess world, int x, int y, int z) 
		{
			if(theWorld != null) 
			{
				int a = theWorld.calculateSkylightSubtracted(0); //force calculation of current lighting levels
				if(a > 8)
					return 8;
				else
					return 0;
			}
			else
				return 8; //light level when the world is loaded (loading from save does not call onAdded, onPlaced, etc.)
		}
		
		public AxisAlignedBB getCollisionBoundingBoxFromPool(World par1World, int par2, int par3, int par4)
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
		
		public int idDropped(int par1, Random par2Random, int par3)
        {
            return MTJT.twilightRose.blockID;
        }
		
		@Override
		public void registerIcons(IconRegister par1IconRegister)
		{
			this.blockIcon = par1IconRegister.registerIcon("MTJT:twilightRose");
		}
		
}
