package me.soapsuds.customcartesians.client;

import com.mojang.blaze3d.vertex.PoseStack;

import me.soapsuds.customcartesians.CustomCartesians;
import me.soapsuds.customcartesians.util.ModConstants;
import me.soapsuds.customcartesians.util.ModConstants.CoordType;
import net.minecraft.ChatFormatting;
import net.minecraft.client.Minecraft;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.entity.player.Player;

public class ClientHandler {
    
    public static void handleOverlayRender(PoseStack poseStack, float f, CartesianOverlay overlay) {
        overlay.drawInformation(poseStack);
    }

    public static void handleKeyMappingInput(Minecraft client) {
        if (client.player == null)
            return;
        if (ModKeyMappings.TOGGLE_SETTING_BASE.isDown()) {
            boolean overlayToggle = CustomCartesians.CONFIG.client.toggleOverlay;
            boolean xToggle = CustomCartesians.CONFIG.client.toggleXCoord;
            boolean yToggle = CustomCartesians.CONFIG.client.toggleYCoord;
            boolean zToggle = CustomCartesians.CONFIG.client.toggleZCoord;
            if (ModKeyMappings.TOGGLE_OVERLAY.consumeClick()) {
                CustomCartesians.CONFIG.client.setOverlayToggle(!overlayToggle);
                client.player.displayClientMessage(new TranslatableComponent(ModConstants.Translations.TOGGLE_OVERLAY_SCREEN).append(new TextComponent(Boolean.toString(CustomCartesians.CONFIG.client.toggleOverlay)).withStyle(ChatFormatting.LIGHT_PURPLE)), true);
            }
            if (ModKeyMappings.TOGGLE_X.consumeClick())
                handleCoordinateToggle(client.player, CoordType.X, !xToggle);
            if (ModKeyMappings.TOGGLE_Y.consumeClick())
                handleCoordinateToggle(client.player, CoordType.Y, !yToggle);
            if (ModKeyMappings.TOGGLE_Z.consumeClick())
                handleCoordinateToggle(client.player, CoordType.Z, !zToggle);
        }
    }
    
    private static void handleCoordinateToggle(Player player, CoordType type, boolean toggle) {
        switch(type) {
        case X:
            CustomCartesians.CONFIG.client.setXCoordToggle(toggle);
            break;
        case Y:
            CustomCartesians.CONFIG.client.setYCoordToggle(toggle);
            break;
        case Z:
            CustomCartesians.CONFIG.client.setZCoordToggle(toggle);
            break;
        default:
            CustomCartesians.CONFIG.client.setYCoordToggle(toggle);
            break;
        }
        player.displayClientMessage(new TranslatableComponent(ModConstants.Translations.TOGGLE_COORD_DISPLAY_SUCCESS, type).append(new TextComponent(Boolean.toString(toggle)).withStyle(ChatFormatting.LIGHT_PURPLE)), true);
    }
}
