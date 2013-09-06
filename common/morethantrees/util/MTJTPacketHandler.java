package morethantrees.util;

import net.minecraft.network.INetworkManager;
import net.minecraft.network.packet.Packet250CustomPayload;
import cpw.mods.fml.common.network.IPacketHandler;
import cpw.mods.fml.common.network.Player;

public class MTJTPacketHandler implements IPacketHandler
{
    
    @Override
    public void onPacketData(INetworkManager manager, Packet250CustomPayload payload, Player player)
    {
        if (payload.channel.equals("SkyChicken"))
        {
            this.chicken(payload, player);
        }
        if (payload.channel.equals("Spider"))
        {
            this.spider(payload, player);
        }
    }
    
    private void chicken(Packet250CustomPayload payload, Player player)
    {
        //        DataInputStream inStream = new DataInputStream(new ByteArrayInputStream(payload.data));
        //        short data;
        //        try
        //        {
        //            data = inStream.readShort();
        //        }
        //        catch (IOException e)
        //        {
        //            e.printStackTrace();
        //            return;
        //        }
        //        Entity ent = ((EntityPlayer) player).ridingEntity;
        //        if (ent != null && ent instanceof EntitySkyChicken)
        //        {
        //            switch (data)
        //            {
        //                case 1:
        //                    ((EntitySkyChicken) ent).isGoingUp = true;
        //                    break;
        //                case 2:
        //                    ((EntitySkyChicken) ent).isGoingDown = true;
        //                    break;
        //                case 3:
        //                    ((EntitySkyChicken) ent).isIdle = true;
        //                    break;
        //                case 6:
        //                    ((EntitySkyChicken) ent).isGoingUp = false;
        //                    break;
        //                case 7:
        //                    ((EntitySkyChicken) ent).isGoingDown = false;
        //                    break;
        //                case 8:
        //                    ((EntitySkyChicken) ent).isIdle = true;
        //                    break;
        //            }
        //        }
    }
    
    private void spider(Packet250CustomPayload payload, Player player)
    {
        //        DataInputStream inStream = new DataInputStream(new ByteArrayInputStream(payload.data));
        //        short data;
        //        try
        //        {
        //            data = inStream.readShort();
        //        }
        //        catch (IOException e)
        //        {
        //            e.printStackTrace();
        //            return;
        //        }
        //        Entity ent = ((EntityPlayer) player).ridingEntity;
        //        if (ent != null && ent instanceof EntityEasySpider)
        //        {
        //            switch (data)
        //            {
        //                case 4:
        //                    ((EntityEasySpider) ent).isForward = true;
        //                    break;
        //                case 5:
        //                    ((EntityEasySpider) ent).isReverse = true;
        //                    break;
        //                case 9:
        //                    ((EntityEasySpider) ent).isForward = false;
        //                    break;
        //                case 10:
        //                    ((EntityEasySpider) ent).isReverse = false;
        //                    break;
        //            }
        //        }
    }
    
}