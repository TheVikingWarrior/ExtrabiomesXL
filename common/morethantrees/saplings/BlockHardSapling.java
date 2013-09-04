package morethantrees.saplings;

import java.util.Random;

import morethantrees.MTJT;
import morethantrees.treegen.WorldGenHardTrees;
import net.minecraft.block.BlockFlower;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import net.minecraft.world.World;

public class BlockHardSapling extends BlockFlower
{
    private Random               rand;
    public static final String[] WOOD_TYPES = new String[] { "hard" };
    
    //private Icon[] blockIcon = new Icon[1];
    
    public BlockHardSapling(int i)
    {
        super(i);
        float f = 0.4F;
        setBlockBounds(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, f * 2.0F, 0.5F + f);
        this.setCreativeTab(MTJT.tabLeaves);
    }
    
    /**
     * When this method is called, your block should register all the icons it needs with the given IconRegister. This is the only chance
     * you get to register icons.
     */
    public void registerIcons(IconRegister var1)
    {
        this.blockIcon = var1.registerIcon("MTJT:hardSapling");
    }
    
    /**
     * From the specified side and block metadata retrieves the blocks texture. Args: side, metadata
     */
    public Icon getBlockTextureFromSideAndMetadata(int var1, int var2)
    {
        return this.blockIcon;
    }
    
    /**
     * Ticks the block if it's been scheduled
     */
    public void updateTick(World world, int i, int j, int k, Random random)
    {
        super.updateTick(world, i, j, k, random);
        
        if ((world.getBlockLightValue(i, j + 1, k) >= 9) && (random.nextInt(30) == 0))
        {
            int l = world.getBlockMetadata(i, j, k);
            
            if (random.nextInt(3) == 0)
            {
                generateTree(world, i, j, k, random, l);
            }
        }
    }
    
    public void generateTree(World world, int i, int j, int k, Random random, int l)
    {
        world.setBlock(i, j, k, 0);
        
        WorldGenHardTrees hardtrees = new WorldGenHardTrees();
        
        if (!hardtrees.generate(world, random, i, j, k))
        {
            world.setBlock(i, j, k, this.blockID);
        }
    }
    
    public boolean onBlockActivated(World world, int i, int j, int k, EntityPlayer entityplayer, int par2, float par3, float par4, float par5)
    {
        ItemStack equipped = entityplayer.getCurrentEquippedItem();
        if (equipped == null)
        {
            return false;
        }
        if ((equipped.getItem() == MTJT.boPoo))
        {
            this.generate(world, rand, i, j, k);
            equipped.stackSize--;
            return true;
        }
        return false;
    }
    
    public void generate(World world, Random rand, int i, int j, int k)
    {
        world.setBlock(i, j, k, 0);
        WorldGenHardTrees hardtrees = new WorldGenHardTrees();
        if (!hardtrees.generate(world, rand, i, j, k))
        {
            world.setBlock(i, j, k, this.blockID);
        }
        
    }
    
}