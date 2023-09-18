package rbasamoyai.itemattachments.forge;

import rbasamoyai.itemattachments.IAModClient;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

public class IAModClientForge {

	public static void clientInit(IEventBus modBus, IEventBus forgeBus) {
		modBus.addListener(IAModClientForge::onClientSetup);
	}

	public static void onClientSetup(final FMLClientSetupEvent evt) {
		evt.enqueueWork(() -> {
			IAModClient.clientInit();
		});
	}

}
