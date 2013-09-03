package morethantrees.util;

import java.util.Random;

import morethantrees.MTJT;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.entity.passive.EntityOcelot;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.entity.passive.EntitySquid;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;
import net.minecraftforge.event.ForgeSubscribe;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import net.minecraftforge.event.entity.living.LivingEvent;

public class TreeEventHooks
{
	private Object dataWatcher;
	private World worldObj;
	public Random rand;
	public int timeUntilNextPoo;
	private Entity riddenByEntity;
	public boolean stationary;
	private Entity EntityCow;
	private double speedMultiplier;
	
	int jumpTicks;
    double prevMotionX;
    double prevMotionZ;
	private boolean isInWeb;
	public double motionX;
	public double motionY;
	public double motionZ;
	private int KEY_F;
	private boolean isCollidedHorizontally;
	
    @ForgeSubscribe
    public void entityDrops(LivingDropsEvent var1)
    {
        EntityLiving var2 = (EntityLiving) var1.entityLiving;
        DamageSource var3 = var1.source;
        boolean var4 = var1.recentlyHit;

        if (var4 && var3.getEntity() instanceof EntityPlayer)
        {
            if (var2 instanceof EntitySquid)
            {
                var1.drops.add(new EntityItem(var2.worldObj, var2.posX, var2.posY, var2.posZ, new ItemStack(MTJT.pearl, 1)));
            }
            if (var2 instanceof EntityOcelot)
            {
                var1.drops.add(new EntityItem(var2.worldObj, var2.posX, var2.posY, var2.posZ, new ItemStack(MTJT.catseye, 1)));
            }
            if (var2 instanceof EntitySheep)
            {
                var1.drops.add(new EntityItem(var2.worldObj, var2.posX, var2.posY, var2.posZ, new ItemStack(MTJT.lambfriesraw, 1)));
            }
            if (var2 instanceof EntityCow)
            {
                var1.drops.add(new EntityItem(var2.worldObj, var2.posX, var2.posY, var2.posZ, new ItemStack(MTJT.cowsTail, 1)));
            }
        }
    }
    @ForgeSubscribe
    public void onLivingUpdate(LivingEvent.LivingUpdateEvent event)
    {
    	if ((event.entity instanceof EntityCow)) 
    	{
    	      EntityCow cow = (EntityCow)event.entity;
    	}
    	if (event.entity instanceof EntityCow && !event.entity.worldObj.isRemote && --this.timeUntilNextPoo <= 0)
        {
    		event.entity.playSound("mob.chicken.plop", 1.0F, timeUntilNextPoo);//, (this.rand.nextFloat() - this.rand.nextFloat()) * 0.2F + 1.0F);
    		event.entity.dropItem(MTJT.cowDrop.itemID, 1);
    		this.timeUntilNextPoo = 2500;//this.rand.nextInt(6000) + 6000;
        }
    }
}
