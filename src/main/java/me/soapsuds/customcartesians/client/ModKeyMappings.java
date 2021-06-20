package me.soapsuds.customcartesians.client;

import com.mojang.blaze3d.platform.InputConstants;

import me.soapsuds.customcartesians.util.ModConstants;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.minecraft.client.KeyMapping;

public class ModKeyMappings {

    public static KeyMapping TOGGLE_SETTING_BASE;
    public static KeyMapping TOGGLE_OVERLAY;
    public static KeyMapping TOGGLE_X;
    public static KeyMapping TOGGLE_Y;
    public static KeyMapping TOGGLE_Z;
//    public static KeyMapping CYCLE_OVERLAY_POS;
    
    public static void registerKeyMappings() {
    	TOGGLE_SETTING_BASE = KeyBindingHelper.registerKeyBinding(new KeyMapping(ModConstants.Translations.KEY_TOGGLE_SETTING_BASE, InputConstants.KEY_LALT, ModConstants.Translations.KEYMAPPING_CATEGORY));
    	TOGGLE_OVERLAY = KeyBindingHelper.registerKeyBinding(new KeyMapping(ModConstants.Translations.KEY_TOGGLE_OVERLAY, InputConstants.KEY_LBRACKET, ModConstants.Translations.KEYMAPPING_CATEGORY));
    	TOGGLE_X = KeyBindingHelper.registerKeyBinding(new KeyMapping(ModConstants.Translations.KEY_TOGGLE_X, InputConstants.KEY_H, ModConstants.Translations.KEYMAPPING_CATEGORY));
    	TOGGLE_Y = KeyBindingHelper.registerKeyBinding(new KeyMapping(ModConstants.Translations.KEY_TOGGLE_Y, InputConstants.KEY_J, ModConstants.Translations.KEYMAPPING_CATEGORY));
    	TOGGLE_Z = KeyBindingHelper.registerKeyBinding(new KeyMapping(ModConstants.Translations.KEY_TOGGLE_Z, InputConstants.KEY_K, ModConstants.Translations.KEYMAPPING_CATEGORY));
//    	CYCLE_OVERLAY_POS = KeyBindingHelper.registerKeyBinding(new KeyMapping(ModConstants.Translations.CYCLE_OVERLAY_POS, InputConstants.KEY_EQUALS, ModConstants.Translations.KEYMAPPING_CATEGORY));
    }

}
