package morethantrees.logs;

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
import net.minecraft.world.World;

public class BlockGhostLog extends Block
{
	public static final String[] woodType = new String[] {"ghost"};
    private Icon[] blockIcon = new Icon[2];
	
    public BlockGhostLog(int par1)
    {
        super(par1, Material.wood);
		this.setCreativeTab(MTJT.tabWood);
    }
	
	/**
     * When this method is called, your block should register all the icons it needs with the given IconRegister. This
     * is the only chance you get to register icons.
     */
    public void registerIcons(IconRegister var1)
    {
        this.blockIcon[0] = var1.registerIcon("MTJT:ghostLogTop");
        this.blockIcon[1] = var1.registerIcon("MTJT:ghostLogSide");
    }

    /**
     * From the specified side and block metadata retrieves the blocks texture. Args: side, metadata
     */
    public Icon getIcon(int var1, int var2)
    {
        return var1 != 0 && var1 != 1 ? this.blockIcon[1] : this.blockIcon[0];
    }
    
    public int getRenderBlockPass()
    {
        return 1;
    }
    
    public boolean isOpaqueCube()
    {
        return false;
    }
    
    public boolean renderAsNormalBlock()
    {
        return false;
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
	
	public Block setBlockUnbreakable()
    {
        this.setHardness(-1.0F);
        return this;
    }

}

