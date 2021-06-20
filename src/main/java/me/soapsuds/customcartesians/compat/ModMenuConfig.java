package me.soapsuds.customcartesians.compat;

import com.terraformersmc.modmenu.api.ConfigScreenFactory;
import com.terraformersmc.modmenu.api.ModMenuApi;

import me.shedaniel.autoconfig.AutoConfig;
import me.soapsuds.customcartesians.config.ModConfig;
import me.soapsuds.customcartesians.util.ModConstants;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.loader.api.FabricLoader;

@Environment(EnvType.CLIENT)
public class ModMenuConfig implements ModMenuApi{

	@Override
    public ConfigScreenFactory<?> getModConfigScreenFactory() {
        return parent -> FabricLoader.getInstance().isModLoaded(ModConstants.CLOTH_CONFIG_MODID)
    		    ? AutoConfig.getConfigScreen(ModConfig.class, parent).get()
    				    : null;
    }
	
}
