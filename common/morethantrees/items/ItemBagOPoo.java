package morethantrees.items;

import morethantrees.MTJT;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;

public class ItemBagOPoo extends Item
{
	public ItemBagOPoo(int var1)
	{
		
		super(var1);
		maxStackSize = 8;
		this.setMaxDamage(32);
		this.setCreativeTab(MTJT.tabTreeItems);
		
	}
	
	@Override
	public void registerIcons(IconRegister iconRegister)
	{
		itemIcon = iconRegister.registerIcon("MTJT:boPoo");
	}
	
}
