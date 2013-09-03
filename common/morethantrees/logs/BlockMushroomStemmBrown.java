package morethantrees.logs;

import morethantrees.MTJT;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.util.Icon;

public class BlockMushroomStemmBrown extends Block
{
	public static final String[] woodType = new String[] {"stemm"};
    //private Icon[] blockIcon = new Icon[2];
	
    public BlockMushroomStemmBrown(int par1)
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
        //this.blockIcon[0] = var1.registerIcon("MTJT:ghostLogTop");
        this.blockIcon = var1.registerIcon("MTJT:brownside");
    }

    /**
     * From the specified side and block metadata retrieves the blocks texture. Args: side, metadata
     */
    public Icon getIcon(int var1, int var2)
    {
        return var1 != 0 && var1 != 1 ? this.blockIcon : this.blockIcon;
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

}