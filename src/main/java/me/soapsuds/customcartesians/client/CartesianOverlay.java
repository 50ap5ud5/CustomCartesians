package me.soapsuds.customcartesians.client;

import java.util.ArrayList;
import java.util.List;

import com.mojang.blaze3d.vertex.PoseStack;

import me.soapsuds.customcartesians.CustomCartesians;
import net.minecraft.client.Minecraft;
import net.minecraft.core.BlockPos;

public class CartesianOverlay {
    
    private final Minecraft client;
    
    public CartesianOverlay(Minecraft client) {
        this.client = client;
    }
    
    public void drawInformation(PoseStack stack) {
        stack.pushPose();
        drawCartesionInformation(stack);
        stack.popPose();
    }
    
    private void drawCartesionInformation(PoseStack stack) {
        List<String> coordInfo = getCoordinateInfo();
        String renderString = "";
        if (!coordInfo.isEmpty() && CustomCartesians.CONFIG.client.toggleOverlay) {
            boolean xToggle = CustomCartesians.CONFIG.client.toggleXCoord;
            boolean yToggle = CustomCartesians.CONFIG.client.toggleYCoord;
            boolean zToggle = CustomCartesians.CONFIG.client.toggleZCoord;
            if (xToggle)
                renderString = renderString + " X: " + coordInfo.get(0);
            if (yToggle)
                renderString = renderString + " Y: " + coordInfo.get(1);
            if (zToggle)
                renderString = renderString + " Z: " + coordInfo.get(2);
            this.client.font.draw(stack, renderString, 10, 10, 0xFFFFFF);
        }
    }
    
    private List<String> getCoordinateInfo() {
        BlockPos pos = this.client.getCameraEntity().blockPosition();
        List<String> positions = new ArrayList<>();
        if (pos != null) {
            positions.add(Integer.toString(pos.getX()));
            positions.add(Integer.toString(pos.getY()));
            positions.add(Integer.toString(pos.getZ()));
            return positions;
        }
        return positions;
    }
}
