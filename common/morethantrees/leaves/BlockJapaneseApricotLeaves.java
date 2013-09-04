package morethantrees.leaves;

import java.util.Random;

import morethantrees.MTJT;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockJapaneseApricotLeaves extends Block
{
    private int                  baseIndexInPNG;
    public static final String[] LEAF_TYPES = new String[] { "japaneseApricotLeaves" };
    int[]                        adjacentTreeBlocks;
    private Icon[]               cQ         = new Icon[2];
    
    public BlockJapaneseApricotLeaves(int par1)
    {
        super(par1, Material.leaves);
        this.setTickRandomly(true);
        this.setCreativeTab(MTJT.tabLeaves);
    }
    
    /**
     * When this method is called, your block should register all the icons it needs with the given IconRegister. This is the only chance
     * you get to register icons.
     */
    @Override
    public void registerIcons(IconRegister var1)
    {
        this.cQ[0] = var1.registerIcon("MTJT:apricot_leaves");
        this.cQ[1] = var1.registerIcon("MTJT:apricot_leaves");
    }
    
    /**
     * From the specified side and block metadata retrieves the blocks texture. Args: side, metadata
     */
    @SideOnly(Side.CLIENT)
    public Icon getIcon(int par1, int par2)
    {
        return this.cQ[1];
    }
    
    @SideOnly(Side.CLIENT)
    //essentialy this code makes the block leak when it is rained on. 
    public void randomDisplayTick(World par1World, int par2, int par3, int par4, Random par5Random)
    {
        if (par1World.canLightningStrikeAt(par2, par3 + 1, par4) && !par1World.doesBlockHaveSolidTopSurface(par2, par3 - 1, par4) && par5Random.nextInt(15) == 1)
        {
            double var6 = (double) ((float) par2 + par5Random.nextFloat());
            double var8 = (double) par3 - 0.05D;
            double var10 = (double) ((float) par4 + par5Random.nextFloat());
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
        if (par2Random.nextInt(10) == 0)
            return MTJT.japaneseApricotSapling.blockID;
        return MTJT.japaneseApricotLeaves.blockID;
    }
    
    public void dropBlockAsItemWithChance(World par1World, int par2, int par3, int par4, int par5, float par6, int par7)
    {
        if (!par1World.isRemote)
        {
            byte var8 = 20;
            
            if ((par5 & 3) == 3)
            {
                var8 = 20;
            }
            
            if (par1World.rand.nextInt(var8) == 0)
            {
                int var9 = this.idDropped(par5, par1World.rand, par7);
                this.dropBlockAsItem_do(par1World, par2, par3, par4, new ItemStack(var9, 1, this.damageDropped(par5)));
            }
            
            if ((par5 & 3) == 0 && par1World.rand.nextInt(20) == 0)
            {
                this.dropBlockAsItem_do(par1World, par2, par3, par4, new ItemStack(MTJT.japaneseApricotSapling, 1, 0));
            }
        }
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
