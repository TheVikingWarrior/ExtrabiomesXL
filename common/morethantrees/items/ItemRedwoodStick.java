package morethantrees.items;

import morethantrees.MTJT;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;

public class ItemRedwoodStick extends Item
{
    
    public ItemRedwoodStick(int i)
    {
        
        super(i);
        this.setCreativeTab(MTJT.tabTreeItems);
        
    }
    
    @Override
    public void registerIcons(IconRegister iconRegister)
    {
        itemIcon = iconRegister.registerIcon("MTJT:redwoodStick");
    }
    
}