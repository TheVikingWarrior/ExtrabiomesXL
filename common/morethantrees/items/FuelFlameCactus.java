package morethantrees.items;

import morethantrees.MTJT;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.IFuelHandler;

public class FuelFlameCactus implements IFuelHandler
{
    @Override
    public int getBurnTime(ItemStack fuel)
    {
        if (fuel.itemID == MTJT.flameCactus.blockID)
            return 2000;
        else
            return 0;
    }
}
