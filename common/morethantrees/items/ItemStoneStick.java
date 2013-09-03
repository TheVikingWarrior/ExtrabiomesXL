package morethantrees.items;

import morethantrees.MTJT;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;

public class ItemStoneStick extends Item
{

	public ItemStoneStick(int i)
	{
		
		super(i);
		this.setCreativeTab(MTJT.tabTreeItems);
		
	}
	
	@Override
	public void registerIcons(IconRegister iconRegister)
	{
		itemIcon = iconRegister.registerIcon("MTJT:stoneStick");
	}
	
}
