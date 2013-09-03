package morethantrees.leaves;

import java.util.Random;

import morethantrees.MTJT;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.util.Icon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockJapaneseMapleLeaves extends Block
{
	private int baseIndexInPNG;
    public static final String[] LEAF_TYPES = new String[] {"japaneseMapleLeaves"};
    int[] adjacentTreeBlocks;
    private Icon[] blockIcon = new Icon[1];

    public BlockJapaneseMapleLeaves(int par1)
    {
        super(par1, Material.leaves);
        this.setTickRandomly(true);
        this.setCreativeTab(MTJT.tabLeaves);
    }
	
	/**
     * When this method is called, your block should register all the icons it needs with the given IconRegister. This
     * is the only chance you get to register icons.
     */
    @Override
    public void registerIcons(IconRegister var1)
    {
        this.blockIcon[0] = var1.registerIcon("MTJT:mapleLeaves");
    }

    /**
     * From the specified side and block metadata retrieves the blocks texture. Args: side, metadata
     */
    public Icon getIcon(int var1, int var2)
    {
        return this.blockIcon[!this.isOpaqueCube() ? 0 : 1];
    }

	@SideOnly(Side.CLIENT)

    //essentialy this code makes the block leak when it is rained on. 
    public void randomDisplayTick(World par1World, int par2, int par3, int par4, Random par5Random)
    {
        if (par1World.canLightningStrikeAt(par2, par3 + 1, par4) && !par1World.doesBlockHaveSolidTopSurface(par2, par3 - 1, par4) && par5Random.nextInt(15) == 1)
        {
            double var6 = (double)((float)par2 + par5Random.nextFloat());
            double var8 = (double)par3 - 0.05D;
            double var10 = (double)((float)par4 + par5Random.nextFloat());
            par1World.spawnParticle("dripWater", var6, var8, var10, 0.0D, 0.0D, 0.0D);
        }
    }
	
	public int quantityDropped(Random par1Random)
    {
		return par1Random.nextInt(15) == 0 ? 1 : 0;
    }

    public int idDropped(int par1, Random par2Random, int par3)
    {
            //return Trees.japanesecherryBlossomLeaves.blockID;
    	if(par2Random.nextInt(10) == 0)
            return MTJT.japaneseMapleSapling.blockID;
            return MTJT.japaneseMapleLeaves.blockID;
    }

    //this makes the block render correctly
    public boolean isOpaqueCube()
    {
        return false;
    }
    
    public boolean renderAsNormalBlock()
    {
        return false;
    }
    
    public int getRenderBlockPass()
    {
        return 0;
    }
    
    public boolean shouldSideBeRendered(IBlockAccess var1, int var2, int var3, int var4, int var5)
    {
        return true;
    }

}
