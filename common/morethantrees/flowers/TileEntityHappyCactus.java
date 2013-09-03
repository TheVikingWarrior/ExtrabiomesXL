package morethantrees.flowers;

import morethantrees.entity.EntityFireBalls;
import net.minecraft.entity.monster.EntityBlaze;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;

public class TileEntityHappyCactus extends TileEntity
{
	private int shoottime;
	private String Owner;
	public int interval;
	public int knockbacklevel;
	public int firetime;
	public int distance;
	public double damagebonus;
	public float arrowspeed;
	public float arrowscatter;

    public TileEntityHappyCactus()
    {
    	shoottime=0;
    	this.Owner="";
    	this.interval=10;//Interval in which the cactus shoots						(Standard 25)
    	this.knockbacklevel=0;//Knockbacklevel of the arrows						(Standard 0)
    	this.firetime=10;//time in secons that a player hit will burn				(Standard 0)
    	this.damagebonus=1.5D;//Damage that is added to the standard arrow damage	(Standard 1.5)
    	this.arrowspeed=0.01F;//Defines the Speed of the arrows shot					(Standard 1.6)
    	//BEWARE!!! This is Important for the damage, too! Quadratically!
    	//Arrows with speed 10 and bonus 4 deal on full diamond armor a damage of 9.5 Hearts!!!
    	this.arrowscatter=12F;//Defines the scattering strength of the arrows shot	(Standard 12)
    	this.distance=10;//Defines the Radius in which the Cactus shoots
    }
    public void setOwner(String Own0)
    {
    	this.Owner=Own0;
    }

    /**
     * Returns the name of the inventory.
     */
    public String getInvName()
    {
        return "Analyzer";
    }

    /**
     * Reads a tile entity from NBT.
     */
    public void readFromNBT(NBTTagCompound var1)
    {
        super.readFromNBT(var1);
        this.Owner = var1.getString("Owner");
        this.shoottime = var1.getInteger("ShootTime");
        this.interval = var1.getInteger("Interval");
        this.knockbacklevel = var1.getInteger("KnockBack");
        this.firetime = var1.getInteger("FireTime");
        this.damagebonus = var1.getDouble("DamageBonus");
        this.arrowscatter = var1.getFloat("Scatter");
        this.arrowspeed = var1.getFloat("Speed");
        this.distance = var1.getInteger("Distance");
    }

    /**
     * Writes a tile entity to NBT.
     */
    public void writeToNBT(NBTTagCompound var1)
    {
        super.writeToNBT(var1);
        var1.setInteger("ShootTime", this.shoottime);
        var1.setString("Owner", this.Owner);
        var1.setInteger("Interval",this.interval);
        var1.setInteger("KnockBack",this.knockbacklevel);
        var1.setInteger("FireTime",this.firetime);
        var1.setDouble("DamageBonus",this.damagebonus);
        var1.setFloat("Scatter",this.arrowscatter);
        var1.setFloat("Speed",this.arrowspeed);
        var1.setInteger("Distance",this.distance);
    }

    /**
     * Allows the entity to update its state. Overridden in most subclasses, e.g. the mob spawner uses this to count
     * ticks and creates a new spawn inside its implementation.
     */
    public void updateEntity()
    {
    	EntityPlayer PL1;
    	if(this.shoottime++%this.interval==(this.interval-1) && (PL1=this.worldObj.getClosestPlayer(this.xCoord, this.yCoord, this.zCoord, (float)this.distance))!=null)
    	{
    		if(PL1.username==this.Owner)//dont shoot if its the owner!   			
    			return;
    		this.shoottime=0;
    		EntityBlaze blaze=new EntityBlaze(this.worldObj);
    		blaze.setPosition(this.xCoord, this.yCoord, this.zCoord);
    		EntityFireBalls fballs = new EntityFireBalls(this.worldObj);
    		fballs.setPosition(PL1.posX, PL1.posY, PL1.posZ);
    		//small.setDamage(small. + this.damagebonus);
    		//small.setKnockbackStrength(this.knockbacklevel);
    		fballs.setFire(this.firetime);
    		blaze.playSound("random.bow", 1.0F, 1.0F);
            this.worldObj.spawnEntityInWorld(fballs);
            blaze.setDead();
    	}
    }

    /**
     * Do not make give this method the name canInteractWith because it clashes with Container
     */
    public boolean isUseableByPlayer(EntityPlayer var1)
    {
        return false;
    }
}
