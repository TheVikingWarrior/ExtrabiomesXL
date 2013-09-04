package morethantrees.items;

import morethantrees.MTJT;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;

public class ItemCatsEye extends Item
{
    
    public ItemCatsEye(int i)
    {
        
        super(i);
        maxStackSize = 16;
        this.setCreativeTab(MTJT.tabTreeItems);
        
    }
    
    @Override
    public void registerIcons(IconRegister iconRegister)
    {
        itemIcon = iconRegister.registerIcon("MTJT:catseye");
    }
    
}
