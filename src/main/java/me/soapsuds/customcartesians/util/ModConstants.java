package me.soapsuds.customcartesians.util;

public class ModConstants {
    
    public static final String CLOTH_CONFIG_MODID = "cloth-config2";
    
    public static class Translations {
        public static final String KEY_TOGGLE_SETTING_BASE = "key.customcartesians.toggle_setting_base";
        public static final String KEY_TOGGLE_OVERLAY = "key.customcartesians.toggle_overlay_screen";
        public static final String KEY_TOGGLE_X = "key.customcartesians.toggle_x";
        public static final String KEY_TOGGLE_Y = "key.customcartesians.toggle_y";
        public static final String KEY_TOGGLE_Z = "key.customcartesians.toggle_z";
        public static final String KEY_CYCLE_OVERLAY_POS = "key.customcartesians.cycle_overlay_position";
        
        public static final String KEYMAPPING_CATEGORY = "key.categories.customcartesians";
        
        public static final String TOGGLE_OVERLAY_SCREEN = "message.customcartesians.toggle_overlay_screen";
        public static final String TOGGLE_COORD_DISPLAY_SUCCESS = "message.customcartesians.toggle_coord_display";
        public static final String TOGGLE_OVERLAY_POS_SUCCESS = "message.customcartesians.cycle_overlay_pos";
    }
    
    public enum OverlayLocation {
        TOP_LEFT,
        TOP_CENTRE,
        TOP_RIGHT,
        MIDDLE_LEFT,
        MIDDLE_CENTRE,
        MIDDLE_RIGHT,
        BOTTOM_LEFT,
        BOTTOM_CENTRE,
        BOTTOM_RIGHT
    }
    
    public enum CoordType {
        X,
        Y,
        Z
    }

}
