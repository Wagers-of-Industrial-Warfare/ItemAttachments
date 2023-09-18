package rbasamoyai.itemattachments.fabric;

import rbasamoyai.itemattachments.ItemAttachmentsMod;
import net.fabricmc.api.ModInitializer;

public class ItemAttachmentsModFabric implements ModInitializer {

    @Override
    public void onInitialize() {
        ItemAttachmentsMod.init();
    }

}
