package morethantrees.blocks;

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

public class BlockNaucylium extends Block
{
    private Icon naucyliumBottom;
    private Icon naucyliumSides;
    private Icon naucyliumTop;
    
    public BlockNaucylium(int var1)
    {
        super(var1, Material.sand);
        this.setCreativeTab(MTJT.tabTreeBlocks);
        this.setHardness(1.0F);
    }
    
    @Override
    public void registerIcons(IconRegister par1IconRegister)
    {
        this.naucyliumBottom = par1IconRegister.registerIcon("MTJT:naucyliumTop");
        this.naucyliumSides = par1IconRegister.registerIcon("MTJT:naucyliumSides");
        this.naucyliumTop = par1IconRegister.registerIcon("MTJT:naucyliumTop");
    }
    
    public Icon getIcon(int side, int metadata)
    {
        if (side == 0)
        {
            return this.naucyliumBottom;
        }
        if (side == 1)
        {
            return this.naucyliumTop;
        }
        
        return this.naucyliumSides;
    }
    
    /**
     * Returns a bounding box from the pool of bounding boxes (this means this box can change after the pool has been cleared to be reused)
     */
    public AxisAlignedBB getCollisionBoundingBoxFromPool(World var1, int var2, int var3, int var4)
    {
        float var5 = 0.125F;
        return AxisAlignedBB.getAABBPool().getAABB((double) var2, (double) var3, (double) var4, (double) (var2 + 1), (double) ((float) (var3 + 1) - var5), (double) (var4 + 1));
    }
    
    /**
     * Triggered whenever an entity collides with this block (enters into the block). Args: world, x, y, z, entity
     */
    public void onEntityCollidedWithBlock(World par1World, int par2, int par3, int par4, Entity par5Entity)
    {
        if (par5Entity instanceof EntityLiving)
        {
            ((EntityLiving) par5Entity).addPotionEffect(new PotionEffect(Potion.confusion.getId(), 100, 1));
        }
    }
}
