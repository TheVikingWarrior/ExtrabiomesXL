package morethantrees.util;

import morethantrees.MTJT;
import morethantrees.saplings.BlockBalsamFirLargeSap;
import morethantrees.saplings.BlockBalsamFirSmallSap;
import morethantrees.saplings.BlockBlackSapling;
import morethantrees.saplings.BlockCalifornianRedFirLargeSap;
import morethantrees.saplings.BlockCalifornianRedFirSmallSap;
import morethantrees.saplings.BlockCantaloupeSapling;
import morethantrees.saplings.BlockCarrotSapling;
import morethantrees.saplings.BlockCucumberSapling;
import morethantrees.saplings.BlockDouglasFirLargeSap;
import morethantrees.saplings.BlockDouglasFirSmallSap;
import morethantrees.saplings.BlockDouglasFirXLargeSap;
import morethantrees.saplings.BlockEggSapling;
import morethantrees.saplings.BlockExplosiveSapling;
import morethantrees.saplings.BlockGiantSapling;
import morethantrees.saplings.BlockGrandFirLargeSap;
import morethantrees.saplings.BlockGrandFirSmallSap;
import morethantrees.saplings.BlockHardSapling;
import morethantrees.saplings.BlockIceSapling;
import morethantrees.saplings.BlockJungleSapling;
import morethantrees.saplings.BlockLifeSapling;
import morethantrees.saplings.BlockLoblollyPineLargeSap;
import morethantrees.saplings.BlockLoblollyPineSmallSap;
import morethantrees.saplings.BlockLodgepolePineLargeSap;
import morethantrees.saplings.BlockLodgepolePineSmallSap;
import morethantrees.saplings.BlockMaritimePineLargeSap;
import morethantrees.saplings.BlockMaritimePineSmallSap;
import morethantrees.saplings.BlockNetherSapling;
import morethantrees.saplings.BlockNeverSapling;
import morethantrees.saplings.BlockNorwaySpruceLargeSap;
import morethantrees.saplings.BlockNorwaySpruceSmallSap;
import morethantrees.saplings.BlockPainSapling;
import morethantrees.saplings.BlockPotatoSapling;
import morethantrees.saplings.BlockRedwoodSapling;
import morethantrees.saplings.BlockRubberSapling;
import morethantrees.saplings.BlockScotsPineLargeSap;
import morethantrees.saplings.BlockScotsPineSmallSap;
import morethantrees.saplings.BlockSmiteSapling;
import morethantrees.saplings.BlockSmokinSapling;
import morethantrees.saplings.BlockSoftSapling;
import morethantrees.saplings.BlockSquashSapling;
import morethantrees.saplings.BlockStoneSapling;
import morethantrees.saplings.BlockSunflowerSapling;
import morethantrees.saplings.BlockWalnutSapling;
import morethantrees.saplings.BlockWaterSapling;
import morethantrees.saplings.BlockWolfSapling;
import morethantrees.saplings.BlockjapaneseApricotSapling;
import morethantrees.saplings.BlockjapaneseMapleSapling;
import morethantrees.saplings.BlockjapanesecherryBlossomSapling;
import net.minecraftforge.event.Event;
import net.minecraftforge.event.ForgeSubscribe;
import net.minecraftforge.event.entity.player.BonemealEvent;

public class MTJTBonemealEvent
{
    @ForgeSubscribe
    public void onUseBonemeal(BonemealEvent event)
    {
        if (event.ID == MTJT.blackSapling.blockID)
        {
            event.setResult(Event.Result.ALLOW);
            
            if (!event.world.isRemote)
            {
                if (event.world.rand.nextFloat() < 0.45D)
                {
                    ((BlockBlackSapling) MTJT.blackSapling).generate(event.world, event.world.rand, event.X, event.Y, event.Z);
                }
            }
        }
        if (event.ID == MTJT.eggSapling.blockID)
        {
            event.setResult(Event.Result.ALLOW);
            
            if (!event.world.isRemote)
            {
                if (event.world.rand.nextFloat() < 0.45D)
                {
                    ((BlockEggSapling) MTJT.eggSapling).generate(event.world, event.world.rand, event.X, event.Y, event.Z);
                }
            }
        }
        if (event.ID == MTJT.hardSapling.blockID)
        {
            event.setResult(Event.Result.ALLOW);
            
            if (!event.world.isRemote)
            {
                if (event.world.rand.nextFloat() < 0.45D)
                {
                    ((BlockHardSapling) MTJT.hardSapling).generate(event.world, event.world.rand, event.X, event.Y, event.Z);
                }
            }
        }
        if (event.ID == MTJT.redwoodSapling.blockID)
        {
            event.setResult(Event.Result.ALLOW);
            
            if (!event.world.isRemote)
            {
                if (event.world.rand.nextFloat() < 0.45D)
                {
                    ((BlockRedwoodSapling) MTJT.redwoodSapling).generate(event.world, event.world.rand, event.X, event.Y, event.Z);
                }
            }
        }
        if (event.ID == MTJT.rubberSapling.blockID)
        {
            event.setResult(Event.Result.ALLOW);
            
            if (!event.world.isRemote)
            {
                if (event.world.rand.nextFloat() < 0.45D)
                {
                    ((BlockRubberSapling) MTJT.rubberSapling).generate(event.world, event.world.rand, event.X, event.Y, event.Z);
                }
            }
        }
        if (event.ID == MTJT.smokinSapling.blockID)
        {
            event.setResult(Event.Result.ALLOW);
            
            if (!event.world.isRemote)
            {
                if (event.world.rand.nextFloat() < 0.45D)
                {
                    ((BlockSmokinSapling) MTJT.smokinSapling).generate(event.world, event.world.rand, event.X, event.Y, event.Z);
                }
            }
        }
        if (event.ID == MTJT.softSapling.blockID)
        {
            event.setResult(Event.Result.ALLOW);
            
            if (!event.world.isRemote)
            {
                if (event.world.rand.nextFloat() < 0.45D)
                {
                    ((BlockSoftSapling) MTJT.softSapling).generate(event.world, event.world.rand, event.X, event.Y, event.Z);
                }
            }
        }
        if (event.ID == MTJT.stoneSapling.blockID)
        {
            event.setResult(Event.Result.ALLOW);
            
            if (!event.world.isRemote)
            {
                if (event.world.rand.nextFloat() < 0.45D)
                {
                    ((BlockStoneSapling) MTJT.stoneSapling).generate(event.world, event.world.rand, event.X, event.Y, event.Z);
                }
            }
        }
        if (event.ID == MTJT.sunflowerSapling.blockID)
        {
            event.setResult(Event.Result.ALLOW);
            
            if (!event.world.isRemote)
            {
                if (event.world.rand.nextFloat() < 0.45D)
                {
                    ((BlockSunflowerSapling) MTJT.sunflowerSapling).generate(event.world, event.world.rand, event.X, event.Y, event.Z);
                }
            }
        }
        if (event.ID == MTJT.walnutSapling.blockID)
        {
            event.setResult(Event.Result.ALLOW);
            
            if (!event.world.isRemote)
            {
                if (event.world.rand.nextFloat() < 0.45D)
                {
                    ((BlockWalnutSapling) MTJT.walnutSapling).generate(event.world, event.world.rand, event.X, event.Y, event.Z);
                }
            }
        }
        if (event.ID == MTJT.waterSapling.blockID)
        {
            event.setResult(Event.Result.ALLOW);
            
            if (!event.world.isRemote)
            {
                if (event.world.rand.nextFloat() < 0.45D)
                {
                    ((BlockWaterSapling) MTJT.waterSapling).generate(event.world, event.world.rand, event.X, event.Y, event.Z);
                }
            }
        }
        if (event.ID == MTJT.wolfSapling.blockID)
        {
            event.setResult(Event.Result.ALLOW);
            
            if (!event.world.isRemote)
            {
                if (event.world.rand.nextFloat() < 0.45D)
                {
                    ((BlockWolfSapling) MTJT.wolfSapling).generate(event.world, event.world.rand, event.X, event.Y, event.Z);
                }
            }
        }
        if (event.ID == MTJT.iceSapling.blockID)
        {
            event.setResult(Event.Result.ALLOW);
            
            if (!event.world.isRemote)
            {
                if (event.world.rand.nextFloat() < 0.45D)
                {
                    ((BlockIceSapling) MTJT.iceSapling).generate(event.world, event.world.rand, event.X, event.Y, event.Z);
                }
            }
        }
        if (event.ID == MTJT.jungleSapling.blockID)
        {
            event.setResult(Event.Result.ALLOW);
            
            if (!event.world.isRemote)
            {
                if (event.world.rand.nextFloat() < 0.45D)
                {
                    ((BlockJungleSapling) MTJT.jungleSapling).generate(event.world, event.world.rand, event.X, event.Y, event.Z);
                }
            }
        }
        if (event.ID == MTJT.smiteSapling.blockID)
        {
            event.setResult(Event.Result.ALLOW);
            
            if (!event.world.isRemote)
            {
                if (event.world.rand.nextFloat() < 0.45D)
                {
                    ((BlockSmiteSapling) MTJT.smiteSapling).generate(event.world, event.world.rand, event.X, event.Y, event.Z);
                }
            }
        }
        if (event.ID == MTJT.painSapling.blockID)
        {
            event.setResult(Event.Result.ALLOW);
            
            if (!event.world.isRemote)
            {
                if (event.world.rand.nextFloat() < 0.45D)
                {
                    ((BlockPainSapling) MTJT.painSapling).generate(event.world, event.world.rand, event.X, event.Y, event.Z);
                }
            }
        }
        if (event.ID == MTJT.lifeSapling.blockID)
        {
            event.setResult(Event.Result.ALLOW);
            
            if (!event.world.isRemote)
            {
                if (event.world.rand.nextFloat() < 0.45D)
                {
                    ((BlockLifeSapling) MTJT.lifeSapling).generate(event.world, event.world.rand, event.X, event.Y, event.Z);
                }
            }
        }
        if (event.ID == MTJT.giantSapling.blockID)
        {
            event.setResult(Event.Result.ALLOW);
            
            if (!event.world.isRemote)
            {
                if (event.world.rand.nextFloat() < 0.45D)
                {
                    ((BlockGiantSapling) MTJT.giantSapling).generate(event.world, event.world.rand, event.X, event.Y, event.Z);
                }
            }
        }
        if (event.ID == MTJT.netherSapling.blockID)
        {
            event.setResult(Event.Result.ALLOW);
            
            if (!event.world.isRemote)
            {
                if (event.world.rand.nextFloat() < 0.45D)
                {
                    ((BlockNetherSapling) MTJT.netherSapling).generate(event.world, event.world.rand, event.X, event.Y, event.Z);
                }
            }
        }
        if (event.ID == MTJT.neverSapling.blockID)
        {
            event.setResult(Event.Result.ALLOW);
            
            if (!event.world.isRemote)
            {
                if (event.world.rand.nextFloat() < 0.45D)
                {
                    ((BlockNeverSapling) MTJT.neverSapling).generate(event.world, event.world.rand, event.X, event.Y, event.Z);
                }
            }
        }
        if (event.ID == MTJT.explosiveSapling.blockID)
        {
            event.setResult(Event.Result.ALLOW);
            
            if (!event.world.isRemote)
            {
                if (event.world.rand.nextFloat() < 0.45D)
                {
                    ((BlockExplosiveSapling) MTJT.explosiveSapling).generate(event.world, event.world.rand, event.X, event.Y, event.Z);
                }
            }
        }
        if (event.ID == MTJT.potatoSapling.blockID)
        {
            event.setResult(Event.Result.ALLOW);
            
            if (!event.world.isRemote)
            {
                if (event.world.rand.nextFloat() < 0.45D)
                {
                    ((BlockPotatoSapling) MTJT.potatoSapling).generate(event.world, event.world.rand, event.X, event.Y, event.Z);
                }
            }
        }
        if (event.ID == MTJT.carrotSapling.blockID)
        {
            event.setResult(Event.Result.ALLOW);
            
            if (!event.world.isRemote)
            {
                if (event.world.rand.nextFloat() < 0.45D)
                {
                    ((BlockCarrotSapling) MTJT.carrotSapling).generate(event.world, event.world.rand, event.X, event.Y, event.Z);
                }
            }
        }
        if (event.ID == MTJT.cantaloupeSapling.blockID)
        {
            event.setResult(Event.Result.ALLOW);
            
            if (!event.world.isRemote)
            {
                if (event.world.rand.nextFloat() < 0.45D)
                {
                    ((BlockCantaloupeSapling) MTJT.cantaloupeSapling).generate(event.world, event.world.rand, event.X, event.Y, event.Z);
                }
            }
        }
        if (event.ID == MTJT.squashSapling.blockID)
        {
            event.setResult(Event.Result.ALLOW);
            
            if (!event.world.isRemote)
            {
                if (event.world.rand.nextFloat() < 0.45D)
                {
                    ((BlockSquashSapling) MTJT.squashSapling).generate(event.world, event.world.rand, event.X, event.Y, event.Z);
                }
            }
        }
        if (event.ID == MTJT.cucumberSapling.blockID)
        {
            event.setResult(Event.Result.ALLOW);
            
            if (!event.world.isRemote)
            {
                if (event.world.rand.nextFloat() < 0.45D)
                {
                    ((BlockCucumberSapling) MTJT.cucumberSapling).generate(event.world, event.world.rand, event.X, event.Y, event.Z);
                }
            }
        }
        if (event.ID == MTJT.japanesecherryBlossomSapling.blockID)
        {
            event.setResult(Event.Result.ALLOW);
            
            if (!event.world.isRemote)
            {
                if (event.world.rand.nextFloat() < 0.45D)
                {
                    ((BlockjapanesecherryBlossomSapling) MTJT.japanesecherryBlossomSapling).generate(event.world, event.world.rand, event.X, event.Y, event.Z);
                }
            }
        }
        if (event.ID == MTJT.japaneseApricotSapling.blockID)
        {
            event.setResult(Event.Result.ALLOW);
            
            if (!event.world.isRemote)
            {
                if (event.world.rand.nextFloat() < 0.45D)
                {
                    ((BlockjapaneseApricotSapling) MTJT.japaneseApricotSapling).generate(event.world, event.world.rand, event.X, event.Y, event.Z);
                }
            }
        }
        if (event.ID == MTJT.japaneseMapleSapling.blockID)
        {
            event.setResult(Event.Result.ALLOW);
            
            if (!event.world.isRemote)
            {
                if (event.world.rand.nextFloat() < 0.45D)
                {
                    ((BlockjapaneseMapleSapling) MTJT.japaneseMapleSapling).generate(event.world, event.world.rand, event.X, event.Y, event.Z);
                }
            }
        }
        if (event.ID == MTJT.balsamFirLargeSap.blockID)
        {
            event.setResult(Event.Result.ALLOW);
            
            if (!event.world.isRemote)
            {
                if (event.world.rand.nextFloat() < 0.45D)
                {
                    ((BlockBalsamFirLargeSap) MTJT.balsamFirLargeSap).generate(event.world, event.world.rand, event.X, event.Y, event.Z);
                }
            }
        }
        if (event.ID == MTJT.balsamFirSmallSap.blockID)
        {
            event.setResult(Event.Result.ALLOW);
            
            if (!event.world.isRemote)
            {
                if (event.world.rand.nextFloat() < 0.45D)
                {
                    ((BlockBalsamFirSmallSap) MTJT.balsamFirSmallSap).generate(event.world, event.world.rand, event.X, event.Y, event.Z);
                }
            }
        }
        if (event.ID == MTJT.californianRedFirLargeSap.blockID)
        {
            event.setResult(Event.Result.ALLOW);
            
            if (!event.world.isRemote)
            {
                if (event.world.rand.nextFloat() < 0.45D)
                {
                    ((BlockCalifornianRedFirLargeSap) MTJT.californianRedFirLargeSap).generate(event.world, event.world.rand, event.X, event.Y, event.Z);
                }
            }
        }
        if (event.ID == MTJT.californianRedFirSmallSap.blockID)
        {
            event.setResult(Event.Result.ALLOW);
            
            if (!event.world.isRemote)
            {
                if (event.world.rand.nextFloat() < 0.45D)
                {
                    ((BlockCalifornianRedFirSmallSap) MTJT.californianRedFirSmallSap).generate(event.world, event.world.rand, event.X, event.Y, event.Z);
                }
            }
        }
        if (event.ID == MTJT.douglasFirSmallSap.blockID)
        {
            event.setResult(Event.Result.ALLOW);
            
            if (!event.world.isRemote)
            {
                if (event.world.rand.nextFloat() < 0.45D)
                {
                    ((BlockDouglasFirSmallSap) MTJT.douglasFirSmallSap).generate(event.world, event.world.rand, event.X, event.Y, event.Z);
                }
            }
        }
        if (event.ID == MTJT.douglasFirLargeSap.blockID)
        {
            event.setResult(Event.Result.ALLOW);
            
            if (!event.world.isRemote)
            {
                if (event.world.rand.nextFloat() < 0.45D)
                {
                    ((BlockDouglasFirLargeSap) MTJT.douglasFirLargeSap).generate(event.world, event.world.rand, event.X, event.Y, event.Z);
                }
            }
        }
        if (event.ID == MTJT.douglasFirXLargeSap.blockID)
        {
            event.setResult(Event.Result.ALLOW);
            
            if (!event.world.isRemote)
            {
                if (event.world.rand.nextFloat() < 0.45D)
                {
                    ((BlockDouglasFirXLargeSap) MTJT.douglasFirXLargeSap).generate(event.world, event.world.rand, event.X, event.Y, event.Z);
                }
            }
        }
        if (event.ID == MTJT.grandFirLargeSap.blockID)
        {
            event.setResult(Event.Result.ALLOW);
            
            if (!event.world.isRemote)
            {
                if (event.world.rand.nextFloat() < 0.45D)
                {
                    ((BlockGrandFirLargeSap) MTJT.grandFirLargeSap).generate(event.world, event.world.rand, event.X, event.Y, event.Z);
                }
            }
        }
        if (event.ID == MTJT.grandFirSmallSap.blockID)
        {
            event.setResult(Event.Result.ALLOW);
            
            if (!event.world.isRemote)
            {
                if (event.world.rand.nextFloat() < 0.45D)
                {
                    ((BlockGrandFirSmallSap) MTJT.grandFirSmallSap).generate(event.world, event.world.rand, event.X, event.Y, event.Z);
                }
            }
        }
        if (event.ID == MTJT.loblollyPineLargeSap.blockID)
        {
            event.setResult(Event.Result.ALLOW);
            
            if (!event.world.isRemote)
            {
                if (event.world.rand.nextFloat() < 0.45D)
                {
                    ((BlockLoblollyPineLargeSap) MTJT.loblollyPineLargeSap).generate(event.world, event.world.rand, event.X, event.Y, event.Z);
                }
            }
        }
        if (event.ID == MTJT.loblollyPineSmallSap.blockID)
        {
            event.setResult(Event.Result.ALLOW);
            
            if (!event.world.isRemote)
            {
                if (event.world.rand.nextFloat() < 0.45D)
                {
                    ((BlockLoblollyPineSmallSap) MTJT.loblollyPineSmallSap).generate(event.world, event.world.rand, event.X, event.Y, event.Z);
                }
            }
        }
        if (event.ID == MTJT.lodgepolePineLargeSap.blockID)
        {
            event.setResult(Event.Result.ALLOW);
            
            if (!event.world.isRemote)
            {
                if (event.world.rand.nextFloat() < 0.45D)
                {
                    ((BlockLodgepolePineLargeSap) MTJT.lodgepolePineLargeSap).generate(event.world, event.world.rand, event.X, event.Y, event.Z);
                }
            }
        }
        if (event.ID == MTJT.lodgepolePineSmallSap.blockID)
        {
            event.setResult(Event.Result.ALLOW);
            
            if (!event.world.isRemote)
            {
                if (event.world.rand.nextFloat() < 0.45D)
                {
                    ((BlockLodgepolePineSmallSap) MTJT.lodgepolePineSmallSap).generate(event.world, event.world.rand, event.X, event.Y, event.Z);
                }
            }
        }
        if (event.ID == MTJT.maritimePineLargeSap.blockID)
        {
            event.setResult(Event.Result.ALLOW);
            
            if (!event.world.isRemote)
            {
                if (event.world.rand.nextFloat() < 0.45D)
                {
                    ((BlockMaritimePineLargeSap) MTJT.maritimePineLargeSap).generate(event.world, event.world.rand, event.X, event.Y, event.Z);
                }
            }
        }
        if (event.ID == MTJT.maritimePineSmallSap.blockID)
        {
            event.setResult(Event.Result.ALLOW);
            
            if (!event.world.isRemote)
            {
                if (event.world.rand.nextFloat() < 0.45D)
                {
                    ((BlockMaritimePineSmallSap) MTJT.maritimePineSmallSap).generate(event.world, event.world.rand, event.X, event.Y, event.Z);
                }
            }
        }
        if (event.ID == MTJT.norwaySpruceLargeSap.blockID)
        {
            event.setResult(Event.Result.ALLOW);
            
            if (!event.world.isRemote)
            {
                if (event.world.rand.nextFloat() < 0.45D)
                {
                    ((BlockNorwaySpruceLargeSap) MTJT.norwaySpruceLargeSap).generate(event.world, event.world.rand, event.X, event.Y, event.Z);
                }
            }
        }
        if (event.ID == MTJT.norwaySpruceSmallSap.blockID)
        {
            event.setResult(Event.Result.ALLOW);
            
            if (!event.world.isRemote)
            {
                if (event.world.rand.nextFloat() < 0.45D)
                {
                    ((BlockNorwaySpruceSmallSap) MTJT.norwaySpruceSmallSap).generate(event.world, event.world.rand, event.X, event.Y, event.Z);
                }
            }
        }
        if (event.ID == MTJT.scotsPineLargeSap.blockID)
        {
            event.setResult(Event.Result.ALLOW);
            
            if (!event.world.isRemote)
            {
                if (event.world.rand.nextFloat() < 0.45D)
                {
                    ((BlockScotsPineLargeSap) MTJT.scotsPineLargeSap).generate(event.world, event.world.rand, event.X, event.Y, event.Z);
                }
            }
        }
        if (event.ID == MTJT.scotsPineSmallSap.blockID)
        {
            event.setResult(Event.Result.ALLOW);
            
            if (!event.world.isRemote)
            {
                if (event.world.rand.nextFloat() < 0.45D)
                {
                    ((BlockScotsPineSmallSap) MTJT.scotsPineSmallSap).generate(event.world, event.world.rand, event.X, event.Y, event.Z);
                }
            }
        }
    }
    
}
