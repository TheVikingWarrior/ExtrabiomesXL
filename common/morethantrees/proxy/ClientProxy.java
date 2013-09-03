package morethantrees.proxy;


import morethantrees.MTJT;
import morethantrees.entity.EntityFireBalls;
import morethantrees.entity.RenderFireBalls;
import morethantrees.entity.mobs.EntityBlueCow;
import morethantrees.entity.mobs.EntityEasySpider;
import morethantrees.entity.mobs.EntityGoat;
import morethantrees.entity.mobs.EntityPunSheep;
import morethantrees.entity.mobs.EntitySkyChicken;
import morethantrees.entity.mobs.EntityTallChicken;
import morethantrees.entity.mobs.EntityZombieCow;
import morethantrees.entity.mobs.ModelBlueCow;
import morethantrees.entity.mobs.ModelGoat;
import morethantrees.entity.mobs.ModelPunSheep1;
import morethantrees.entity.mobs.ModelPunSheep2;
import morethantrees.entity.mobs.ModelSkyChicken;
import morethantrees.entity.mobs.RenderBlueCow;
import morethantrees.entity.mobs.RenderEasySpider;
import morethantrees.entity.mobs.RenderGoat;
import morethantrees.entity.mobs.RenderPunSheep;
import morethantrees.entity.mobs.RenderSkyChicken;
import morethantrees.items.EntityTnTStick;
import morethantrees.items.RenderTnTStick;
import morethantrees.util.MTJTKeyHandler;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderZombie;
import cpw.mods.fml.client.registry.KeyBindingRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;

public class ClientProxy extends CommonProxy
{
	@Override
	public void registerRenderThings()
	{
		RenderingRegistry.registerEntityRenderingHandler(EntityTallChicken.class, new RenderLiving(new ModelBiped(), 0.5f));
		RenderingRegistry.registerEntityRenderingHandler(EntityEasySpider.class, new RenderEasySpider());
		RenderingRegistry.registerEntityRenderingHandler(EntitySkyChicken.class, new RenderSkyChicken(new ModelSkyChicken(), 0.5f));
		RenderingRegistry.registerEntityRenderingHandler(EntityBlueCow.class, new RenderBlueCow(new ModelBlueCow(), 0.5f));
		RenderingRegistry.registerEntityRenderingHandler(EntityZombieCow.class, new RenderZombie());
		RenderingRegistry.registerEntityRenderingHandler(EntityGoat.class, new RenderGoat(new ModelGoat(), 0.5f));
		RenderingRegistry.registerEntityRenderingHandler(EntityPunSheep.class, new RenderPunSheep(new ModelPunSheep2(), new ModelPunSheep1(), 0.7F));
		RenderingRegistry.registerEntityRenderingHandler(EntityTnTStick.class, new RenderTnTStick(0));
		RenderingRegistry.registerEntityRenderingHandler(EntityFireBalls.class, new RenderFireBalls(0.5F));
		KeyBindingRegistry.registerKeyBinding(new MTJTKeyHandler(MTJT.instance.KEY_UP, MTJT.instance.KEY_DOWN, MTJT.instance.KEY_IDLE, MTJT.instance.KEY_FORWARD, MTJT.instance.KEY_BACKWARD));
	}
}
