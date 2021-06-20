package me.soapsuds.customcartesians.config;

import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.autoconfig.annotation.ConfigEntry;
import me.shedaniel.autoconfig.serializer.PartitioningSerializer;
import me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.Comment;
import me.soapsuds.customcartesians.CustomCartesians;

@Config(name = CustomCartesians.MODID)
public class ModConfig extends PartitioningSerializer.GlobalData {

	@ConfigEntry.Category("client")
	@ConfigEntry.Gui.TransitiveObject
	public ClientConfig client = new ClientConfig();
	
	@Config(name = "client")
    public static class ClientConfig implements ConfigData{
	    @Comment("Toggle the visibility of the Overlay Screen")
	    public boolean toggleOverlay = true;
    	@Comment("Toggle the visibility of X Coordinate Display")
		public boolean toggleXCoord = false;
        @Comment("Toggle the visibility of Y Coordinate Display")
    	public boolean toggleYCoord = true;
        @Comment("Toggle the visibility of Z Coordinate Display")
    	public boolean toggleZCoord = false;
    	
        public ClientConfig() {

        }
        
        public void setOverlayToggle(boolean toggle) {
            this.toggleOverlay = toggle;
        }
        
        public void setXCoordToggle(boolean toggle) {
            this.toggleXCoord = toggle;
        }
        
        public void setYCoordToggle(boolean toggle) {
            this.toggleYCoord = toggle;
        }
        
        public void setZCoordToggle(boolean toggle) {
            this.toggleZCoord = toggle;
        }
	}
}

