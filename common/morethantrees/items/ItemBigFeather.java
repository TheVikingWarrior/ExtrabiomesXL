package morethantrees.items;

import morethantrees.MTJT;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;

public class ItemBigFeather extends Item
{
    
    public ItemBigFeather(int i)
    {
        
        super(i);
        maxStackSize = 16;
        lehfeatherID = itemID;
        this.setCreativeTab(MTJT.tabTreeItems);
        
    }
    
    @Override
    public void registerIcons(IconRegister iconRegister)
    {
        itemIcon = iconRegister.registerIcon("MTJT:bigFeather");
    }
    
    public static int lehfeatherID;
    
}
