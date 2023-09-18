package rbasamoyai.itemattachments.fabric;

import rbasamoyai.itemattachments.IAModClient;
import net.fabricmc.api.ClientModInitializer;

public class IAModClientFabric implements ClientModInitializer {

	@Override
	public void onInitializeClient() {
		IAModClient.clientInit();
	}

}
