package morethantrees.util;

import java.util.EnumSet;

import net.minecraft.client.settings.KeyBinding;
import cpw.mods.fml.client.registry.KeyBindingRegistry.KeyHandler;
import cpw.mods.fml.common.TickType;

public class MTJTKeyHandler extends KeyHandler
{
    
    public MTJTKeyHandler(int KEY_UP, int KEY_DOWN, int KEY_IDLE, int KEY_FORWARD, int KEY_BACKWARD)
    {
        super(new KeyBinding[] { new KeyBinding("GoUp", KEY_UP), new KeyBinding("GoDown", KEY_DOWN), new KeyBinding("Idle", KEY_IDLE), new KeyBinding("Forward", KEY_FORWARD), new KeyBinding("Reverse", KEY_BACKWARD) }, new boolean[] { false, false, false, false, false });
    }
    
    @Override
    public void keyDown(EnumSet<TickType> es, KeyBinding kb, boolean bln, boolean bln1)
    {
        //        Minecraft client = Minecraft.getMinecraft();
        //        if (client != null && client.thePlayer != null)
        //        {
        //            Entity ent = client.thePlayer.ridingEntity;
        //            if (ent != null && ent instanceof EntitySkyChicken)
        //            {
        //                if (kb.keyDescription == "GoUp")
        //                {
        //                    MTJT.instance.proxy.sendPacket(1, ent.riddenByEntity);
        //                }
        //                else if (kb.keyDescription == "GoDown")
        //                {
        //                    MTJT.instance.proxy.sendPacket(2, ent.riddenByEntity);
        //                }
        //                else if (kb.keyDescription == "Idle")
        //                {
        //                    MTJT.instance.proxy.sendPacket(3, ent.riddenByEntity);
        //                }
        //                else if (kb.keyDescription == "Forward")
        //                {
        //                    MTJT.instance.proxy.sendPacket(4, ent.riddenByEntity);
        //                }
        //                else if (kb.keyDescription == "Reverse")
        //                {
        //                    MTJT.instance.proxy.sendPacket(5, ent.riddenByEntity);
        //                }
        //            }
        //        }
    }
    
    @Override
    public void keyUp(EnumSet<TickType> es, KeyBinding kb, boolean bln)
    {
        //        Minecraft client = Minecraft.getMinecraft();
        //        if (client != null && client.thePlayer != null)
        //        {
        //            Entity ent = client.thePlayer.ridingEntity;
        //            if (ent != null && ent instanceof EntitySkyChicken)
        //            {
        //                if (kb.keyDescription == "GoUp")
        //                {
        //                    MTJT.instance.proxy.sendPacket(6, ent.riddenByEntity);
        //                }
        //                else if (kb.keyDescription == "GoDown")
        //                {
        //                    MTJT.instance.proxy.sendPacket(7, ent.riddenByEntity);
        //                }
        //                else if (kb.keyDescription == "Idle")
        //                {
        //                    MTJT.instance.proxy.sendPacket(8, ent.riddenByEntity);
        //                }
        //                else if (kb.keyDescription == "Forward")
        //                {
        //                    MTJT.instance.proxy.sendPacket(9, ent.riddenByEntity);
        //                }
        //                else if (kb.keyDescription == "Reverse")
        //                {
        //                    MTJT.instance.proxy.sendPacket(10, ent.riddenByEntity);
        //                }
        //            }
        //        }
    }
    
    @Override
    public EnumSet<TickType> ticks()
    {
        return EnumSet.of(TickType.CLIENT);
    }
    
    @Override
    public String getLabel()
    {
        return "MTJT KeyHandler";
    }
}