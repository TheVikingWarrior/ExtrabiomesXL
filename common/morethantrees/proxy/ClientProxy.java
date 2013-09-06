package morethantrees.proxy;

import morethantrees.MTJT;
import morethantrees.entity.EntityFireBalls;
import morethantrees.entity.RenderFireBalls;
import morethantrees.items.EntityTnTStick;
import morethantrees.items.RenderTnTStick;
import morethantrees.util.MTJTKeyHandler;
import cpw.mods.fml.client.registry.KeyBindingRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;

public class ClientProxy extends CommonProxy
{
    @Override
    public void registerRenderThings()
    {
        //        RenderingRegistry.registerEntityRenderingHandler(EntityTallChicken.class, new RenderBiped(new ModelBiped(), 0.5f));
        //        RenderingRegistry.registerEntityRenderingHandler(EntityEasySpider.class, new RenderEasySpider());
        //        RenderingRegistry.registerEntityRenderingHandler(EntitySkyChicken.class, new RenderSkyChicken(new ModelSkyChicken(), 0.5f));
        //        RenderingRegistry.registerEntityRenderingHandler(EntityBlueCow.class, new RenderBlueCow(new ModelBlueCow(), 0.5f));
        //        RenderingRegistry.registerEntityRenderingHandler(EntityZombieCow.class, new RenderZombie());
        //        RenderingRegistry.registerEntityRenderingHandler(EntityGoat.class, new RenderGoat(new ModelGoat(), 0.5f));
        //        RenderingRegistry.registerEntityRenderingHandler(EntityPunSheep.class, new RenderPunSheep(new ModelPunSheep2(), new ModelPunSheep1(), 0.7F));
        RenderingRegistry.registerEntityRenderingHandler(EntityTnTStick.class, new RenderTnTStick(0));
        RenderingRegistry.registerEntityRenderingHandler(EntityFireBalls.class, new RenderFireBalls(0.5F));
        KeyBindingRegistry.registerKeyBinding(new MTJTKeyHandler(MTJT.instance.KEY_UP, MTJT.instance.KEY_DOWN, MTJT.instance.KEY_IDLE, MTJT.instance.KEY_FORWARD, MTJT.instance.KEY_BACKWARD));
    }
}
