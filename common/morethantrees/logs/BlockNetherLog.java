package morethantrees.logs;

import java.util.List;
import java.util.Random;

import morethantrees.MTJT;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockNetherLog extends Block
{
	public static final String[] woodType = new String[] {"nether"};
    private Icon[] blockIcon = new Icon[2];
	
    public BlockNetherLog(int par1)
    {
        super(par1, Material.wood);
        setBurnProperties(this.blockID, 5, 5);
        this.setCreativeTab(MTJT.tabWood);
    }
	
	/**
     * When this method is called, your block should register all the icons it needs with the given IconRegister. This
     * is the only chance you get to register icons.
     */
    public void registerIcons(IconRegister var1)
    {
        this.blockIcon[0] = var1.registerIcon("MTJT:netherLogTop");
        this.blockIcon[1] = var1.registerIcon("MTJT:netherLogSide");
    }

    /**
     * From the specified side and block metadata retrieves the blocks texture. Args: side, metadata
     */
    public Icon getIcon(int var1, int var2)
    {
        return var1 != 0 && var1 != 1 ? this.blockIcon[1] : this.blockIcon[0];
    }

    // this sets how the block is rendered. i recomend keeping it at 31. 
    public int getRenderType()
    {
        return 31;
    }
    
    public boolean isOpaqueCube()
    {
        return true;
    }
    
    public boolean renderAsNormalBlock()
    {
        return false;
    }

    // this sets the amount droped when broken.
    public int quantityDropped(Random par1Random)
    {
        return 1;
    }

    // this tells the game what to drop if the block is brocken with an explosion. an example of this would be creeper explosions
    // making stone drop cobblestone. 
    public int idDropped(int par1, Random par2Random, int par3)
    {
        return MTJT.netherLog.blockID;
    }

    // this essentially helps leaves to decay when they are not conected to wood. 
    public void breakBlock(World var1, int var2, int var3, int var4, int var5, int var6)
    {
        byte var7 = 4;
        int var8 = var7 + 1;

        if (var1.checkChunksExist(var2 - var8, var3 - var8, var4 - var8, var2 + var8, var3 + var8, var4 + var8))
        {
            for (int var9 = -var7; var9 <= var7; ++var9)
            {
                for (int var10 = -var7; var10 <= var7; ++var10)
                {
                    for (int var11 = -var7; var11 <= var7; ++var11)
                    {
                        int var12 = var1.getBlockId(var2 + var9, var3 + var10, var4 + var11);

                        if (var12 == MTJT.netherLeaves.blockID || var12 == MTJT.netherLeaves.blockID)
                        {
                            int var13 = var1.getBlockMetadata(var2 + var9, var3 + var10, var4 + var11);

                            if ((var13 & 8) == 0)
                            {
                                var1.setBlockMetadataWithNotify(var2 + var9, var3 + var10, var4 + var11, var13 | 8, 2);
                            }
                        }
                    }
                }
            }
        }
    }

    //this code is used for meta data. it is also used to get the mounted orientations
    public void updateBlockMetadata(World par1World, int par2, int par3, int par4, int par5, float par6, float par7, float par8)
    {
        int var9 = par1World.getBlockMetadata(par2, par3, par4) & 3;
        byte var10 = 0;

        switch (par5)
        {
            case 0:
            case 1:
                var10 = 0;
                break;
            case 2:
            case 3:
                var10 = 8;
                break;
            case 4:
            case 5:
                var10 = 4;
        }

        par1World.setBlock(par2, par3, par4, var9 | var10);
    }

    //this can be ignored
    public int damageDropped(int par1)
    {
        return par1 & 3;
    }

    //this can be ignored
    public static int limitToValidMetadata(int par0)
    {
        return par0 & 3;
    }

    @SideOnly(Side.CLIENT)

    // i dont think this is needed however i kept it. this adds metadata blocks to the creative inventory. as you can see this
    // one will only add the first metablock
    public void getSubBlocks(int par1, CreativeTabs par2CreativeTabs, List par3List)
    {
        par3List.add(new ItemStack(par1, 1, 0));

    }

    //best to just ignore this
    protected ItemStack createStackedBlock(int par1)
    {
        return new ItemStack(this.blockID, 1, limitToValidMetadata(par1));
    }

    @Override
    //sustains leaves
    public boolean canSustainLeaves(World world, int x, int y, int z)
    {
        return true;
    }

    @Override
    //tells minecraft that this block is wood. 
    public boolean isWood(World world, int x, int y, int z)
    {
        return true;
    }
    
}