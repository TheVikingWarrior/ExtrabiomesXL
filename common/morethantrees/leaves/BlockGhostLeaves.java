package morethantrees.leaves;

import morethantrees.MTJT;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.Icon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockGhostLeaves extends Block
{
	private int baseIndexInPNG;
    public static final String[] LEAF_TYPES = new String[] {"ghost"};
    int[] adjacentTreeBlocks;
    private Icon[] blockIcon = new Icon[1];

    public BlockGhostLeaves(int par1)
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
        this.blockIcon[0] = var1.registerIcon("MTJT:ghostLeaves");
    }

    /**
     * From the specified side and block metadata retrieves the blocks texture. Args: side, metadata
     */
    public Icon getIcon(int var1, int var2)
    {
        return this.blockIcon[0];
    }
    
    public int getRenderBlockPass()
    {
        return 1;
    }
    
    public AxisAlignedBB getCollisionBoundingBoxFromPool(World par1World, int par2, int par3, int par4)
    {
        return null;
    }
    
    public void onEntityCollidedWithBlock(World par1World, int par2, int par3, int par4, Entity par5Entity)
    {
    		 if (par5Entity instanceof EntityLiving) 
    		 {
    		 ((EntityLiving) par5Entity).addPotionEffect(new PotionEffect(Potion.confusion.getId(), 100, 1));
    		 }
    }

    //this makes the block render correctly
    public boolean isOpaqueCube()
    {
        return false;
    }
    
    public boolean shouldSideBeRendered(IBlockAccess var1, int var2, int var3, int var4, int var5)
    {
        return true;
    }
	
	public Block setBlockUnbreakable()
    {
        this.setHardness(-1.0F);
        return this;
    }

}