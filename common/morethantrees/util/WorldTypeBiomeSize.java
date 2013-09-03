package morethantrees.util;

import morethantrees.MTJT;
import net.minecraftforge.event.ForgeSubscribe;
import net.minecraftforge.event.terraingen.WorldTypeEvent;


public class WorldTypeBiomeSize 
{

	@ForgeSubscribe
    public void BiomeSize(WorldTypeEvent.BiomeSize var1)
    {
        var1.newSize = (byte)MTJT.biomeSize;
    }
	
}
