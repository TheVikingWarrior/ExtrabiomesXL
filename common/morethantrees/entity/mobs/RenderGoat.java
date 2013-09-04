package morethantrees.entity.mobs;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class RenderGoat extends RenderLiving
{
    
    public RenderGoat(ModelBase modelbase, float f)
    {
        super(modelbase, f);
    }
    
    protected ResourceLocation func_110886_a(EntityGoat par1Entity)
    {
        return new ResourceLocation("mtjt:textures/mobs/goat.png");
    }
    
    @Override
    protected ResourceLocation func_110775_a(Entity par1Entity)
    {
        return this.func_110886_a((EntityGoat) par1Entity);
    }
}
