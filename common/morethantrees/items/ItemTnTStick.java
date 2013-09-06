package morethantrees.items;

import morethantrees.MTJT;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemTnTStick extends Item
{
    
    public ItemTnTStick(int i)
    {
        
        super(i);
        maxStackSize = 16;
        this.setCreativeTab(MTJT.tabTreeItems);
        
    }
    
    @Override
    public ItemStack onItemRightClick(ItemStack var1, World var2, EntityPlayer var3)
    {
        if (!var3.capabilities.isCreativeMode)
        {
            --var1.stackSize;
        }
        var2.playSoundAtEntity(var3, "random.bow", 0.5F, 0.4F / (itemRand.nextFloat() * 0.4F + 0.8F));
        if (!var2.isRemote)
        {
            var2.spawnEntityInWorld(new EntityTnTStick(var2, var3));
        }
        return var1;
    }
    
    @Override
    public void registerIcons(IconRegister iconRegister)
    {
        itemIcon = iconRegister.registerIcon("mtjt:tntStick");
    }
    
}
