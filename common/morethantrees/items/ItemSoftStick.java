package morethantrees.items;

import morethantrees.MTJT;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;

public class ItemSoftStick extends Item
{

	public ItemSoftStick(int i)
	{
		
		super(i);
		this.setCreativeTab(MTJT.tabTreeItems);
		
	}
	
	@Override
	public void registerIcons(IconRegister iconRegister)
	{
		itemIcon = iconRegister.registerIcon("MTJT:softStick");
	}
	
}
