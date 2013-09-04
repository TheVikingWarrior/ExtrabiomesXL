package morethantrees.items;

import morethantrees.MTJT;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;

public class ItemCantaloupe extends Item
{
    
    public ItemCantaloupe(int i)
    {
        
        super(i);
        this.setMaxStackSize(16);
        this.setCreativeTab(MTJT.tabTreeItems);
        
    }
    
    public int getTextureSize()
    {
        return 32;
    }
    
    @Override
    public void registerIcons(IconRegister iconRegister)
    {
        itemIcon = iconRegister.registerIcon("MTJT:cantaloupe");
    }
    
}
