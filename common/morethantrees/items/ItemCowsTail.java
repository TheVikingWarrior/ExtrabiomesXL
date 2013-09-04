package morethantrees.items;

import morethantrees.MTJT;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;

public class ItemCowsTail extends Item
{
    
    public ItemCowsTail(int i)
    {
        
        super(i);
        this.setMaxStackSize(16);
        this.setCreativeTab(MTJT.tabTreeItems);
        
    }
    
    @Override
    public void registerIcons(IconRegister iconRegister)
    {
        itemIcon = iconRegister.registerIcon("MTJT:cowsTail");
    }
    
}
