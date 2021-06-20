package me.soapsuds.customcartesians.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import com.mojang.blaze3d.vertex.PoseStack;

import me.soapsuds.customcartesians.client.CartesianOverlay;
import me.soapsuds.customcartesians.client.ClientHandler;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;

@Mixin(Gui.class)
public class GuiMixin {
    private CartesianOverlay overlay;
    private Minecraft client;
    
    @Inject(method = "<init>(Lnet/minecraft/client/Minecraft;)V", at = @At(value = "RETURN"))
    private void construct(Minecraft client, CallbackInfo ci) {
        this.client = client;
        this.overlay = new CartesianOverlay(client);
    }
    
	@Inject(at = @At("HEAD"), method = "render")
	private void render(PoseStack poseStack, float f, CallbackInfo info) {
		if (this.overlay != null && !this.client.options.renderDebug) {
		    ClientHandler.handleOverlayRender(poseStack, f, overlay);
		}
	}
}
