package morethantrees.blocks;

import morethantrees.MTJT;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;

public class BlockBalckIce extends Block
{
    
    public BlockBalckIce(int i)
    {
        
        super(i, Material.ice);
        setLightOpacity(0);
        slipperiness = 1.5F;
        this.setCreativeTab(MTJT.tabTreeBlocks);
        
    }
    
    public int getRenderBlockPass()
    {
        return 0;
    }
    
    public boolean isOpaqueCube()
    {
        return false;
    }
    
    public boolean renderAsNormalBlock()
    {
        return false;
    }
    
    @Override
    public void registerIcons(IconRegister par1IconRegister)
    {
        this.blockIcon = par1IconRegister.registerIcon("MTJT:blackIce"); //adding in a texture, 1.5.1 style!
    }
    
}
