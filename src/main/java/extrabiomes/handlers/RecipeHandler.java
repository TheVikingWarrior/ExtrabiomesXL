package extrabiomes.handlers;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;
import extrabiomes.Extrabiomes;
import extrabiomes.api.Stuff;
import extrabiomes.lib.Element;
import extrabiomes.module.fabrica.block.BlockCustomWood;
import extrabiomes.proxy.CommonProxy;

public abstract class RecipeHandler
{
    
    public static void init()
    {
        writeLogTurnerRecipe();
        
        writeCrackedSandRecipes();
        writeLogRecipes();
        
        writeLogConversionRecipes();
        
        writeFlowerRecipes();
        writeLeafPileRecipes();
    }
    
    private static void writeCrackedSandRecipes()
    {
        if (!Element.CRACKEDSAND.isPresent())
            return;
        
        // crackedSand + water = sand
        final IRecipe recipe = new ShapelessOreRecipe(Block.sand, Element.CRACKEDSAND.get(),
                Item.bucketWater);
        Extrabiomes.proxy.addRecipe(recipe);
    }
    
    private static void writeFlowerRecipes()
    {
        final CommonProxy proxy = Extrabiomes.proxy;
        
        if (Element.HYDRANGEA.isPresent())
        {
            // hydrangea = lightBlueDye
            final ItemStack dye = new ItemStack(Item.dyePowder, 1, 12);
            final IRecipe recipe = new ShapelessOreRecipe(dye, Element.HYDRANGEA.get());
            proxy.addRecipe(recipe);
        }
        
        if (Element.FLOWER_ORANGE.isPresent())
        {
            // orangeFlower = orangeDye
            final ItemStack dye = new ItemStack(Item.dyePowder, 1, 14);
            final IRecipe recipe = new ShapelessOreRecipe(dye, Element.FLOWER_ORANGE.get());
            proxy.addRecipe(recipe);
        }
        
        if (Element.FLOWER_PURPLE.isPresent())
        {
            // purpleFlower = purpleDye
            final ItemStack dye = new ItemStack(Item.dyePowder, 1, 5);
            final IRecipe recipe = new ShapelessOreRecipe(dye, Element.FLOWER_PURPLE.get());
            proxy.addRecipe(recipe);
        }
        
        if (Element.FLOWER_WHITE.isPresent())
        {
            // whiteFlower = lightGreyDye
            final ItemStack dye = new ItemStack(Item.dyePowder, 1, 7);
            final IRecipe recipe = new ShapelessOreRecipe(dye, Element.FLOWER_WHITE.get());
            proxy.addRecipe(recipe);
        }
        
        if (Element.TOADSTOOL.isPresent())
        {
            
            final ItemStack toadstool = Element.TOADSTOOL.get();
            
            // emptyBowl + redMushroom + 2 toadstools = soup
            IRecipe recipe = new ShapelessOreRecipe(Item.bowlSoup, Block.mushroomBrown, toadstool, toadstool, Item.bowlEmpty);
            proxy.addRecipe(recipe);
            
            // emptyBowl + brownMushroom + 2 toadstools = soup
            recipe = new ShapelessOreRecipe(Item.bowlSoup, Block.mushroomRed, toadstool, toadstool, Item.bowlEmpty);
            proxy.addRecipe(recipe);
        }
    }
    
    private static void writeLeafPileRecipes()
    {
        if (!Element.LEAFPILE.isPresent())
            return;
        
        // leafPile x 9 = leafBlock
        final IRecipe recipe = new ShapedOreRecipe(Block.leaves,
                new String[] { "lll", "lll", "lll" }, 'l', Element.LEAFPILE.get());
        Extrabiomes.proxy.addRecipe(recipe);
    }
    
    private static void writeLogConversionRecipes() {
        final CommonProxy proxy = Extrabiomes.proxy;
        
    	if(Element.LOG_QUARTER_BALD_CYPRESS.isPresent() && Element.LOG_BALD_CYPRESS.isPresent()) {
    		proxy.addRecipe(new ShapedOreRecipe(new ItemStack(Element.LOG_BALD_CYPRESS.get().getItem().itemID, 4, Element.LOG_BALD_CYPRESS.get().getItemDamage()),new String[] { "ll","ll" }, 'l', Element.LOG_QUARTER_BALD_CYPRESS.get()));
    		proxy.addRecipe(new ShapedOreRecipe(new ItemStack(Element.LOG_QUARTER_BALD_CYPRESS.get().getItem().itemID, 4, 0), new String[] { "ll","ll" }, 'l', Element.LOG_BALD_CYPRESS.get()));
    	}
    	
    	if(Element.LOG_QUARTER_RAINBOW_EUCALYPTUS.isPresent() && Element.LOG_RAINBOW_EUCALYPTUS.isPresent()) {
    		proxy.addRecipe(new ShapedOreRecipe(new ItemStack(Element.LOG_RAINBOW_EUCALYPTUS.get().getItem().itemID, 4, Element.LOG_RAINBOW_EUCALYPTUS.get().getItemDamage()),new String[] { "ll","ll" }, 'l', Element.LOG_QUARTER_RAINBOW_EUCALYPTUS.get()));
    		proxy.addRecipe(new ShapedOreRecipe(new ItemStack(Element.LOG_QUARTER_RAINBOW_EUCALYPTUS.get().getItem().itemID, 4, 0), new String[] { "ll","ll" }, 'l', Element.LOG_RAINBOW_EUCALYPTUS.get()));
    	}
    	
    	if(Element.LOG_QUARTER_FIR.isPresent() && Element.LOG_FIR.isPresent()) {
    		proxy.addRecipe(new ShapedOreRecipe(new ItemStack(Element.LOG_FIR.get().getItem().itemID, 4, Element.LOG_FIR.get().getItemDamage()),new String[] { "ll","ll" }, 'l', Element.LOG_QUARTER_FIR.get()));
    		proxy.addRecipe(new ShapedOreRecipe(new ItemStack(Element.LOG_QUARTER_FIR.get().getItem().itemID, 4, 0), new String[] { "ll","ll" }, 'l', Element.LOG_FIR.get()));
    	}
    	if(Element.LOG_QUARTER_FIR.isPresent() && Element.LOG_HUGE_FIR_SE.isPresent()) {
            proxy.addRecipe(new ShapelessOreRecipe(new ItemStack(Element.LOG_QUARTER_FIR.get().getItem().itemID, 1, 0), Element.LOG_HUGE_FIR_SE.get()));
        }
    	
    	if(Element.LOG_REDWOOD.isPresent() && Element.LOG_REDWOOD.isPresent()) {
    		proxy.addRecipe(new ShapedOreRecipe(new ItemStack(Element.LOG_REDWOOD.get().getItem().itemID, 4, Element.LOG_REDWOOD.get().getItemDamage()),new String[] { "ll","ll" }, 'l', Element.LOG_QUARTER_REDWOOD.get()));
    		proxy.addRecipe(new ShapedOreRecipe(new ItemStack(Element.LOG_QUARTER_REDWOOD.get().getItem().itemID, 4, 0), new String[] { "ll","ll" }, 'l', Element.LOG_REDWOOD.get()));
    	}
    	if(Element.LOG_QUARTER_REDWOOD.isPresent() && Element.LOG_HUGE_REDWOOD_SE.isPresent()) {
            proxy.addRecipe(new ShapelessOreRecipe(new ItemStack(Element.LOG_QUARTER_REDWOOD.get().getItem().itemID, 1, 0), Element.LOG_HUGE_REDWOOD_SE.get()));
    	}
    	
    	if(Element.LOG_HUGE_OAK_SE.isPresent() && Element.LOG_QUARTER_OAK.isPresent()) {
            proxy.addRecipe(new ShapelessOreRecipe(new ItemStack(Element.LOG_QUARTER_OAK.get().getItem().itemID, 1, 0), Element.LOG_HUGE_OAK_SE.get()));
    	}
    	if(Element.LOG_QUARTER_OAK.isPresent()) {
    		proxy.addRecipe(new ShapedOreRecipe(new ItemStack(Block.wood, 4, 0), new String[] { "ll","ll" }, 'l', Element.LOG_QUARTER_OAK.get()));
    		proxy.addRecipe(new ShapedOreRecipe(new ItemStack(Element.LOG_QUARTER_OAK.get().getItem().itemID, 4, 0), new String[] { "ll","ll" }, 'l', new ItemStack(Block.wood, 1, 0)));
    	}
    	

    	
    }
    
    private static void writeLogRecipes()
    {
        if (!Stuff.planks.isPresent())
            return;
        
        final CommonProxy proxy = Extrabiomes.proxy;
        final Block block = Stuff.planks.get();
        final ItemStack charcoal = new ItemStack(Item.coal, 1, 1);
        
        if (Element.LOG_ACACIA.isPresent())
        {
            final ItemStack logAcacia = Element.LOG_ACACIA.get();
            final ItemStack acaciaPlanks = new ItemStack(block, 4, BlockCustomWood.BlockType.ACACIA.metadata());
            
            // acaciaLog  = acaciaPlanks
            final IRecipe recipe = new ShapelessOreRecipe(acaciaPlanks, logAcacia);
            proxy.addRecipe(recipe);
            
            // acaciaLog ==> charcoal
            proxy.addSmelting(logAcacia, charcoal, 0.15F);
        }
        
        if (Element.LOG_JAPANESE_MAPLE.isPresent())
        {
            final ItemStack logMaple = Element.LOG_JAPANESE_MAPLE.get();
            final ItemStack maplePlanks = new ItemStack(block, 4, BlockCustomWood.BlockType.JAPANESE_MAPLE.metadata());
            
            // acaciaLog  = acaciaPlanks
            final IRecipe recipe = new ShapelessOreRecipe(maplePlanks, logMaple);
            proxy.addRecipe(recipe);
            
            // acaciaLog ==> charcoal
            proxy.addSmelting(logMaple, charcoal, 0.15F);
        }
        
        if (Element.LOG_AUTUMN.isPresent())
        {
            final ItemStack logAutumn = Element.LOG_AUTUMN.get();
            final ItemStack autumnPlanks = new ItemStack(block, 4, BlockCustomWood.BlockType.AUTUMN.metadata());
            
            // acaciaLog  = acaciaPlanks
            final IRecipe recipe = new ShapelessOreRecipe(autumnPlanks, logAutumn);
            proxy.addRecipe(recipe);
            
            // acaciaLog ==> charcoal
            proxy.addSmelting(logAutumn, charcoal, 0.15F);
        }
        
        for (final Element logCypress : new Element[] { Element.LOG_CYPRESS })
        {
            if (logCypress.isPresent())
            {
                final ItemStack cypressPlanks = new ItemStack(block, 4, BlockCustomWood.BlockType.CYPRESS.metadata());
                
                // cypressLog  = cypressPlanks
                final IRecipe recipe = new ShapelessOreRecipe(cypressPlanks, logCypress.get());
                proxy.addRecipe(recipe);
                
                // cypressLog ==> charcoal
                proxy.addSmelting(logCypress.get(), charcoal, 0.15F);
            }
        }
        
        for (final Element logSakura : new Element[] { Element.LOG_SAKURA_BLOSSOM })
        {
            if (logSakura.isPresent())
            {
                final ItemStack sakuraPlanks = new ItemStack(block, 2, BlockCustomWood.BlockType.SAKURA_BLOSSOM.metadata());
                
                // cypressLog  = cypressPlanks
                final IRecipe recipe = new ShapelessOreRecipe(sakuraPlanks, logSakura.get());
                proxy.addRecipe(recipe);
                
                // cypressLog ==> charcoal
                proxy.addSmelting(logSakura.get(), charcoal, 0.15F);
            }
        }
        
        for (final Element logBaldCypress : new Element[] { Element.LOG_BALD_CYPRESS, Element.LOG_QUARTER_BALD_CYPRESS, Element.LOG_KNEE_BALD_CYPRESS })
        {
            if (logBaldCypress.isPresent())
            {
                final ItemStack cypressPlanks = new ItemStack(block, 4, BlockCustomWood.BlockType.BALD_CYPRESS.metadata());
                
                // cypressLog  = cypressPlanks
                final IRecipe recipe = new ShapelessOreRecipe(cypressPlanks, logBaldCypress.get());
                proxy.addRecipe(recipe);
                
                // cypressLog ==> charcoal
                proxy.addSmelting(logBaldCypress.get(), charcoal, 0.15F);
            }
        }
        
        for (final Element logRainbow : new Element[] { Element.LOG_RAINBOW_EUCALYPTUS, Element.LOG_QUARTER_RAINBOW_EUCALYPTUS, Element.LOG_KNEE_RAINBOW_EUCALYPTUS })
        {
            if (logRainbow.isPresent())
            {
                final ItemStack rainbowPlanks = new ItemStack(block, 4, BlockCustomWood.BlockType.RAINBOW_EUCALYPTUS.metadata());
                
                // rainbowLog  = rainbowPlanks
                final IRecipe recipe = new ShapelessOreRecipe(rainbowPlanks, logRainbow.get());
                proxy.addRecipe(recipe);
                
                // rainbowLog ==> charcoal
                proxy.addSmelting(logRainbow.get(), charcoal, 0.15F);
            }
        }
        
        for (final Element firLog : new Element[] { Element.LOG_FIR, Element.LOG_QUARTER_FIR })
        {
            if (firLog.isPresent())
            {
                final ItemStack firPlanks = new ItemStack(block, 4, BlockCustomWood.BlockType.FIR.metadata());
                
                // firLog  = firPlanks
                final IRecipe recipe = new ShapelessOreRecipe(firPlanks, firLog.get());
                proxy.addRecipe(recipe);
                
                // firLog ==> charcoal
                proxy.addSmelting(firLog.get(), charcoal, 0.15F);
            }
        }
        
        for (final Element redwoodLog : new Element[] { Element.LOG_QUARTER_REDWOOD })
        {
            if (redwoodLog.isPresent())
            {
                final ItemStack redwoodPlanks = new ItemStack(block, 4, BlockCustomWood.BlockType.REDWOOD.metadata());
                
                // redwoodLog  = redwoodPlanks
                final IRecipe recipe = new ShapelessOreRecipe(redwoodPlanks, redwoodLog.get());
                proxy.addRecipe(recipe);
                
                // redwoodLog ==> charcoal
                proxy.addSmelting(redwoodLog.get(), charcoal, 0.15F);
            }
        }
        
        for (final Element oakLog : new Element[] { Element.LOG_QUARTER_OAK })
        {
            if (oakLog.isPresent())
            {
                final ItemStack oakPlanks = new ItemStack(Block.planks, 4);
                
                // oakLog  = oakPlanks
                final IRecipe recipe = new ShapelessOreRecipe(oakPlanks, oakLog.get());
                proxy.addRecipe(recipe);
                
                // oakLog ==> charcoal
                proxy.addSmelting(oakLog.get(), charcoal, 0.15F);
            }
        }
    }
    
    private static void writeLogTurnerRecipe()
    {
        if (!Element.LOGTURNER.isPresent())
            return;
        
        final IRecipe recipe = new ShapedOreRecipe(Element.LOGTURNER.get(), new String[] { "ss",
                " s", "ss" }, 's', "stickWood");
        Extrabiomes.proxy.addRecipe(recipe);
    }
    
}
