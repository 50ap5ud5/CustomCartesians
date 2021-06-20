package me.soapsuds.customcartesians;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import me.shedaniel.autoconfig.AutoConfig;
import me.shedaniel.autoconfig.serializer.PartitioningSerializer;
import me.shedaniel.autoconfig.serializer.Toml4jConfigSerializer;
import me.soapsuds.customcartesians.config.ModConfig;
import net.fabricmc.api.ModInitializer;

public class CustomCartesians implements ModInitializer {
	
	public static final String MODID = "customcartesians";
	
	public static Logger LOGGER = LogManager.getLogger(MODID);
	
	public static ModConfig CONFIG = null;
	
	@Override
	public void onInitialize() {
		AutoConfig.register(ModConfig.class, PartitioningSerializer.wrap(Toml4jConfigSerializer::new));
		CONFIG = AutoConfig.getConfigHolder(ModConfig.class).getConfig();
	}
}
