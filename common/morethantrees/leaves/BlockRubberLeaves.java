package morethantrees.leaves;

import java.util.ArrayList;
import java.util.Random;

import morethantrees.MTJT;
import net.minecraft.block.Block;
import net.minecraft.block.BlockLeavesBase;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.IShearable;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockRubberLeaves extends BlockLeavesBase implements IShearable
{
    private int                  baseIndexInPNG;
    public static final String[] LEAF_TYPES = { "rubber" };
    int[]                        adjacentTreeBlocks;
    private Icon[]               cQ         = new Icon[2];
    
    public BlockRubberLeaves(int par1)
    {
        super(par1, Material.leaves, false);
        setBurnProperties(this.blockID, 30, 60);
        setTickRandomly(true);
        setCreativeTab(MTJT.tabLeaves);
    }
    
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister par1IconRegister)
    {
        this.cQ[0] = par1IconRegister.registerIcon("MTJT:rubberLeaves");
        this.cQ[1] = par1IconRegister.registerIcon("MTJT:rubberLeaves");
    }
    
    @SideOnly(Side.CLIENT)
    public Icon getIcon(int par1, int par2)
    {
        return this.cQ[1];
    }
    
    /*@SideOnly(Side.CLIENT)
    public int getBlockColor()
    {
    	double var1 = 0.5D;
    	double var3 = 1.0D;
    	return ColorizerFoliage.getFoliageColor(var1, var3);
    }

    @SideOnly(Side.CLIENT)
    public int getRenderColor(int par1)
    {
    	return (par1 & 0x3) == 2 ? ColorizerFoliage.getFoliageColorBirch() : (par1 & 0x3) == 1 ? ColorizerFoliage.getFoliageColorPine() : ColorizerFoliage.getFoliageColorBasic();
    }

    @SideOnly(Side.CLIENT)
    public int colorMultiplier(IBlockAccess par1IBlockAccess, int par2, int par3, int par4)
    {
    	int var6 = 0;
    	int var7 = 0;
    	int var8 = 0;

    	for (int var9 = -1; var9 <= 1; var9++)
    	{
    		for (int var10 = -1; var10 <= 1; var10++)
    		{
    			int var11 = par1IBlockAccess.getBiomeGenForCoords(par2 + var10, par4 + var9).getBiomeFoliageColor();
    			var6 += ((var11 & 0xFF0000) >> 16);
    			var7 += ((var11 & 0xFF00) >> 8);
    			var8 += (var11 & 0xFF);
    		}
    	}

    	return (var6 / 9 & 0xFF) << 16 | (var7 / 9 & 0xFF) << 8 | var8 / 9 & 0xFF;
    }*/
    
    public void breakBlock(World par1World, int par2, int par3, int par4, int par5, int par6)
    {
        byte var7 = 1;
        int var8 = var7 + 1;
        
        if (par1World.checkChunksExist(par2 - var8, par3 - var8, par4 - var8, par2 + var8, par3 + var8, par4 + var8))
        {
            for (int var9 = -var7; var9 <= var7; var9++)
            {
                for (int var10 = -var7; var10 <= var7; var10++)
                {
                    for (int var11 = -var7; var11 <= var7; var11++)
                    {
                        int var12 = par1World.getBlockId(par2 + var9, par3 + var10, par4 + var11);
                        
                        if (var12 == MTJT.rubberLeaves.blockID)
                        {
                            int var13 = par1World.getBlockMetadata(par2 + var9, par3 + var10, par4 + var11);
                            par1World.setBlockMetadataWithNotify(par2 + var9, par3 + var10, par4 + var11, var13 | 0x8, 2);
                        }
                    }
                }
            }
        }
    }
    
    public void updateTick(World par1World, int par2, int par3, int par4, Random par5Random)
    {
        if (!par1World.isRemote)
        {
            int var6 = par1World.getBlockMetadata(par2, par3, par4);
            
            if (((var6 & 0x8) != 0) && ((var6 & 0x4) == 0))
            {
                byte var7 = 4;
                int var8 = var7 + 1;
                byte var9 = 32;
                int var10 = var9 * var9;
                int var11 = var9 / 2;
                
                if (this.adjacentTreeBlocks == null)
                {
                    this.adjacentTreeBlocks = new int[var9 * var9 * var9];
                }
                
                if (par1World.checkChunksExist(par2 - var8, par3 - var8, par4 - var8, par2 + var8, par3 + var8, par4 + var8))
                {
                    for (int var12 = -var7; var12 <= var7; var12++)
                    {
                        for (int var13 = -var7; var13 <= var7; var13++)
                        {
                            for (int var14 = -var7; var14 <= var7; var14++)
                            {
                                int var15 = par1World.getBlockId(par2 + var12, par3 + var13, par4 + var14);
                                
                                if (var15 == MTJT.rubberLog.blockID)
                                {
                                    this.adjacentTreeBlocks[((var12 + var11) * var10 + (var13 + var11) * var9 + var14 + var11)] = 0;
                                }
                                else if (var15 == MTJT.rubberLeaves.blockID)
                                {
                                    this.adjacentTreeBlocks[((var12 + var11) * var10 + (var13 + var11) * var9 + var14 + var11)] = -2;
                                }
                                else
                                {
                                    this.adjacentTreeBlocks[((var12 + var11) * var10 + (var13 + var11) * var9 + var14 + var11)] = -1;
                                }
                            }
                        }
                    }
                    
                    for (int var12 = 1; var12 <= 4; var12++)
                    {
                        for (int var13 = -var7; var13 <= var7; var13++)
                        {
                            for (int var14 = -var7; var14 <= var7; var14++)
                            {
                                for (int var15 = -var7; var15 <= var7; var15++)
                                {
                                    if (this.adjacentTreeBlocks[((var13 + var11) * var10 + (var14 + var11) * var9 + var15 + var11)] == var12 - 1)
                                    {
                                        if (this.adjacentTreeBlocks[((var13 + var11 - 1) * var10 + (var14 + var11) * var9 + var15 + var11)] == -2)
                                        {
                                            this.adjacentTreeBlocks[((var13 + var11 - 1) * var10 + (var14 + var11) * var9 + var15 + var11)] = var12;
                                        }
                                        
                                        if (this.adjacentTreeBlocks[((var13 + var11 + 1) * var10 + (var14 + var11) * var9 + var15 + var11)] == -2)
                                        {
                                            this.adjacentTreeBlocks[((var13 + var11 + 1) * var10 + (var14 + var11) * var9 + var15 + var11)] = var12;
                                        }
                                        
                                        if (this.adjacentTreeBlocks[((var13 + var11) * var10 + (var14 + var11 - 1) * var9 + var15 + var11)] == -2)
                                        {
                                            this.adjacentTreeBlocks[((var13 + var11) * var10 + (var14 + var11 - 1) * var9 + var15 + var11)] = var12;
                                        }
                                        
                                        if (this.adjacentTreeBlocks[((var13 + var11) * var10 + (var14 + var11 + 1) * var9 + var15 + var11)] == -2)
                                        {
                                            this.adjacentTreeBlocks[((var13 + var11) * var10 + (var14 + var11 + 1) * var9 + var15 + var11)] = var12;
                                        }
                                        
                                        if (this.adjacentTreeBlocks[((var13 + var11) * var10 + (var14 + var11) * var9 + (var15 + var11 - 1))] == -2)
                                        {
                                            this.adjacentTreeBlocks[((var13 + var11) * var10 + (var14 + var11) * var9 + (var15 + var11 - 1))] = var12;
                                        }
                                        
                                        if (this.adjacentTreeBlocks[((var13 + var11) * var10 + (var14 + var11) * var9 + var15 + var11 + 1)] == -2)
                                        {
                                            this.adjacentTreeBlocks[((var13 + var11) * var10 + (var14 + var11) * var9 + var15 + var11 + 1)] = var12;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                
                int var12 = this.adjacentTreeBlocks[(var11 * var10 + var11 * var9 + var11)];
                
                if (var12 >= 0)
                {
                    par1World.setBlockMetadataWithNotify(par2, par3, par4, var6 & 0xFFFFFFF7, 2);
                }
                else
                {
                    removeLeaves(par1World, par2, par3, par4);
                }
            }
        }
    }
    
    @SideOnly(Side.CLIENT)
    public void randomDisplayTick(World par1World, int par2, int par3, int par4, Random par5Random)
    {
        if ((par1World.canLightningStrikeAt(par2, par3 + 1, par4)) && (!par1World.doesBlockHaveSolidTopSurface(par2, par3 - 1, par4)) && (par5Random.nextInt(15) == 1))
        {
            double var6 = par2 + par5Random.nextFloat();
            double var8 = par3 - 0.05D;
            double var10 = par4 + par5Random.nextFloat();
            par1World.spawnParticle("dripWater", var6, var8, var10, 0.0D, 0.0D, 0.0D);
        }
    }
    
    private void removeLeaves(World par1World, int par2, int par3, int par4)
    {
        dropBlockAsItem(par1World, par2, par3, par4, par1World.getBlockMetadata(par2, par3, par4), 0);
        par1World.setBlockToAir(par2, par3, par4);
    }
    
    public int quantityDropped(Random par1Random)
    {
        return par1Random.nextInt(20) == 0 ? 1 : 0;
    }
    
    public int idDropped(int par1, Random par2Random, int par3)
    {
        //if(par2Random.nextInt(10) == 0)
        return MTJT.rubberSapling.blockID;
        //return MTJT.icicle.itemID;
    }
    
    public void dropBlockAsItemWithChance(World par1World, int par2, int par3, int par4, int par5, float par6, int par7)
    {
        if (!par1World.isRemote)
        {
            byte var8 = 20;
            
            if ((par5 & 0x3) == 3)
            {
                var8 = 40;
            }
            
            if (par1World.rand.nextInt(var8) == 0)
            {
                int var9 = idDropped(par5, par1World.rand, par7);
                dropBlockAsItem_do(par1World, par2, par3, par4, new ItemStack(var9, 1, damageDropped(par5)));
            }
        }
    }
    
    public void harvestBlock(World par1World, EntityPlayer par2EntityPlayer, int par3, int par4, int par5, int par6)
    {
        super.harvestBlock(par1World, par2EntityPlayer, par3, par4, par5, par6);
    }
    
    public int damageDropped(int par1)
    {
        return par1 & 0x3;
    }
    
    public boolean isOpaqueCube()
    {
        return Block.leaves.isOpaqueCube();
    }
    
    public boolean shouldSideBeRendered(IBlockAccess par1IBlockAccess, int par2, int par3, int par4, int par5)
    {
        return true;
    }
    
    @SideOnly(Side.CLIENT)
    public void setGraphicsLevel(boolean par1)
    {
        this.graphicsLevel = par1;
    }
    
    public boolean isShearable(ItemStack item, World world, int x, int y, int z)
    {
        return true;
    }
    
    public ArrayList onSheared(ItemStack item, World world, int x, int y, int z, int fortune)
    {
        ArrayList ret = new ArrayList();
        ret.add(new ItemStack(this, 1, world.getBlockMetadata(x, y, z) & 0x3));
        return ret;
    }
}