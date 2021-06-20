package me.soapsuds.customcartesians;

import me.soapsuds.customcartesians.client.ClientHandler;
import me.soapsuds.customcartesians.client.ModKeyMappings;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;

public class CustomCartesiansClient implements ClientModInitializer{

    @Override
    public void onInitializeClient() {
        ModKeyMappings.registerKeyMappings();
        ClientTickEvents.END_CLIENT_TICK.register(client -> {
            ClientHandler.handleKeyMappingInput(client);
        });
    }

}