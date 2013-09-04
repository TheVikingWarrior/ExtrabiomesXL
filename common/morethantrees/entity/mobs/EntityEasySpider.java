package morethantrees.entity.mobs;

import net.minecraft.block.Block;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.ai.EntityAIControlledByPlayer;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class EntityEasySpider extends EntityAnimal
{
    double                                   prevMotionX;
    double                                   prevMotionZ;
    public boolean                           isForward;
    public boolean                           isReverse;
    private final EntityAIControlledByPlayer aiControlledByPlayer;
    
    public EntityEasySpider(World par1World)
    {
        super(par1World);
        this.setSize(1.4F, 0.9F);
        this.setAIMoveSpeed(0.8F);
        this.getNavigator().setAvoidsWater(true);
        this.tasks.addTask(0, this.aiControlledByPlayer = new EntityAIControlledByPlayer(this, 0.34F));
    }
    
    /**
     * Returns true if the newer Entity AI code should be run
     */
    @Override
    public boolean isAIEnabled()
    {
        return true;
    }
    
    @Override
    protected void entityInit()
    {
        super.entityInit();
        this.dataWatcher.addObject(16, new Byte((byte) 0));
    }
    
    @Override
    protected void updateAITasks()
    {
        super.updateAITasks();
    }
    
    /**
     * Called to update the entity's position/logic.
     */
    @Override
    public void onUpdate()
    {
        super.onUpdate();
        
        if (!this.worldObj.isRemote)
        {
            this.setBesideClimbableBlock(this.isCollidedHorizontally);
        }
    }
    
    public int getMaxHealth()
    {
        return 16;
    }
    
    /**
     * Returns the Y offset from the entity's position for any entity riding this one.
     */
    @Override
    public double getMountedYOffset()
    {
        return this.height * 0.75D - 0.5D;
    }
    
    /**
     * Returns the sound this mob makes while it's alive.
     */
    @Override
    protected String getLivingSound()
    {
        return "mob.spider.say";
    }
    
    /**
     * Returns the sound this mob makes when it is hurt.
     */
    @Override
    protected String getHurtSound()
    {
        return "mob.spider.say";
    }
    
    /**
     * Returns the sound this mob makes on death.
     */
    @Override
    protected String getDeathSound()
    {
        return "mob.spider.death";
    }
    
    /**
     * Plays step sound at given x, y, z for the entity
     */
    @Override
    protected void playStepSound(int par1, int par2, int par3, int par4)
    {
        this.playSound("mob.spider.step", 0.15F, 1.0F);
    }
    
    /**
     * Returns the item ID for the item the mob drops on death.
     */
    @Override
    protected int getDropItemId()
    {
        return Item.silk.itemID;
    }
    
    /**
     * Drop 0-2 items of this living's type. @param par1 - Whether this entity has recently been hit by a player. @param par2 - Level of
     * Looting used to kill this mob.
     */
    @Override
    protected void dropFewItems(boolean par1, int par2)
    {
        super.dropFewItems(par1, par2);
        
        if (par1 && (this.rand.nextInt(3) == 0 || this.rand.nextInt(1 + par2) > 0))
        {
            this.dropItem(Item.spiderEye.itemID, 1);
        }
    }
    
    /**
     * returns true if this entity is by a ladder, false otherwise
     */
    @Override
    public boolean isOnLadder()
    {
        return this.isBesideClimbableBlock();
    }
    
    /**
     * Sets the Entity inside a web block.
     */
    @Override
    public void setInWeb()
    {}
    
    @SideOnly(Side.CLIENT)
    /**
     * How large the spider should be scaled.
     */
    public float spiderScaleAmount()
    {
        return 1.0F;
    }
    
    /**
     * Get this Entity's EnumCreatureAttribute
     */
    @Override
    public EnumCreatureAttribute getCreatureAttribute()
    {
        return EnumCreatureAttribute.ARTHROPOD;
    }
    
    /**
     * Returns true if the WatchableObject (Byte) is 0x01 otherwise returns false. The WatchableObject is updated using
     * setBesideClimableBlock.
     */
    public boolean isBesideClimbableBlock()
    {
        return (this.dataWatcher.getWatchableObjectByte(16) & 1) != 0;
    }
    
    /**
     * Updates the WatchableObject (Byte) created in entityInit(), setting it to 0x01 if par1 is true or 0x00 if it is false.
     */
    public void setBesideClimbableBlock(boolean par1)
    {
        byte var2 = this.dataWatcher.getWatchableObjectByte(16);
        
        if (par1)
        {
            var2 = (byte) (var2 | 1);
        }
        else
        {
            var2 &= -2;
        }
        
        this.dataWatcher.updateObject(16, Byte.valueOf(var2));
    }
    
    /**
     * (abstract) Protected helper method to write subclass entity data to NBT.
     */
    @Override
    public void writeEntityToNBT(NBTTagCompound par1NBTTagCompound)
    {
        super.writeEntityToNBT(par1NBTTagCompound);
    }
    
    /**
     * (abstract) Protected helper method to read subclass entity data from NBT.
     */
    @Override
    public void readEntityFromNBT(NBTTagCompound par1NBTTagCompound)
    {
        super.readEntityFromNBT(par1NBTTagCompound);
    }
    
    /**
     * Tries to moves the entity by the passed in displacement. Args: x, y, z
     */
    @Override
    public void moveEntity(double var1, double var3, double var5)
    {
        if (this.riddenByEntity != null)
        {
            boolean var7 = true;
            boolean var8 = false;
            
            if (this.onGround && !var7 && !this.isSprinting() && !this.isInWeb)
            {
                this.setSprinting(true);
            }
            
            int var9 = this.worldObj.getBlockId(MathHelper.floor_double(this.posX), MathHelper.floor_double(this.boundingBox.minY) - 1, MathHelper.floor_double(this.posZ));
            float var10 = 1.0F;
            
            if (this.onGround)
            {
                //this.motionY = 0.1D;
                this.motionX = this.prevMotionX * 1.5D;
                this.motionZ = this.prevMotionZ * 1.5D;
                super.moveEntity(this.motionX, this.motionY, this.motionZ);
                //super.jump();
            }
            
            if (var9 == Block.ice.blockID)
            {
                var10 = Block.blocksList[var9].slipperiness * 0.3F;
            }
            else if (!this.onGround && !this.isInWeb)
            {
                this.motionX += this.riddenByEntity.motionX;
                this.motionZ += this.riddenByEntity.motionZ;
            }
            else
            {
                this.isInWeb = false;
                this.motionX += this.riddenByEntity.motionX * 7.0D * var10;
                this.motionZ += this.riddenByEntity.motionZ * 7.0D * var10;
            }
            
            EntityPlayer var11 = (EntityPlayer) this.riddenByEntity;
            this.rotationYaw = this.prevRotationYaw = var11.rotationYaw;
            this.prevMotionX = this.motionX * 0.6000000000000001D;
            this.prevMotionZ = this.motionZ * 0.6000000000000001D;
            super.moveEntity(this.motionX, this.motionY, this.motionZ);
            this.motionX = this.prevMotionX * 1.5D;
            this.motionZ = this.prevMotionZ * 1.5D;
            super.moveEntity(this.motionX, this.motionY, this.motionZ);
        }
        else
        {
            super.moveEntity(var1, var3, var5);
        }
    }
    
    @Override
    public boolean interact(EntityPlayer var1)
    {
        if (super.interact(var1))
        {
            return true;
        }
        else if (!this.worldObj.isRemote && (this.riddenByEntity == null || this.riddenByEntity == var1))
        {
            var1.mountEntity(this);
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public EntityAIControlledByPlayer getAIControlledByPlayer()
    {
        return this.aiControlledByPlayer;
    }
    
    @Override
    public EntityAgeable createChild(EntityAgeable par1EntityAgeable)
    {
        return null;
    }
}
