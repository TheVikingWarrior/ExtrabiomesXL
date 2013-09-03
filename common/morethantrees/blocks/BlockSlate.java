package morethantrees.blocks;

import java.util.Random;

import morethantrees.MTJT;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;

public class BlockSlate extends Block
{

	public BlockSlate(int i)
	{
		
		super(i, Material.rock);
		this.setCreativeTab(MTJT.tabTreeBlocks);
		this.setStepSound(soundStoneFootstep);
		this.setHardness(3F);
		this.setResistance(1F);
		
	}
	
	@Override
	public void registerIcons(IconRegister par1IconRegister)
	{
		this.blockIcon = par1IconRegister.registerIcon("MTJT:slate");
	}
	
	/**
     * Returns the quantity of items to drop on block destruction.
     */
    public int quantityDropped(Random par1Random)
    {
        return 1;
    }

    /**
     * Returns the ID of the items to drop on destruction.
     */
    public int idDropped(int par1, Random par2Random, int par3)
    {
        return this.blockID;
    }
	
}
