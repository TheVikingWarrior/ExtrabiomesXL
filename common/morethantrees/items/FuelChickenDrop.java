package morethantrees.items;

import morethantrees.MTJT;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.IFuelHandler;

public class FuelChickenDrop implements IFuelHandler
{
    public int getBurnTime(ItemStack fuel)
    {
        if (fuel.itemID == MTJT.chickenDrop.itemID)
            return 1000;
        else
            return 0;
    }
}
