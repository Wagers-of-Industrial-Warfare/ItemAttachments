package rbasamoyai.itemattachments;

import net.minecraft.resources.ResourceLocation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ItemAttachmentsMod {
    public static final String MOD_ID = "itemattachments";
    public static final String NAME = "Item Attachments";
    public static final Logger LOGGER = LoggerFactory.getLogger(NAME);


    public static void init() {
    }

    public static ResourceLocation resource(String path) {
        return new ResourceLocation(MOD_ID, path);
    }

}
