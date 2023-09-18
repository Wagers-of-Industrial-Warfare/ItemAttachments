package rbasamoyai.itemattachments.forge;

import rbasamoyai.itemattachments.ItemAttachmentsMod;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(ItemAttachmentsMod.MOD_ID)
public class ItemAttachmentsModForge {

    public ItemAttachmentsModForge() {
        IEventBus modBus = FMLJavaModLoadingContext.get().getModEventBus();
        IEventBus forgeBus = MinecraftForge.EVENT_BUS;

        ItemAttachmentsMod.init();

        DistExecutor.unsafeRunWhenOn(Dist.CLIENT, () -> () -> IAModClientForge.clientInit(modBus, forgeBus));
    }

}
