package dev.redcodes.deathtimes.data;

public class ConfigCreator {

	public static void createConfigs() {
		
		FileConfig config = new FileConfig("DeathTimes", "config.yml");
		config.addDefault("enabled", true);
		config.options().copyDefaults(true);
		config.saveConfig();
		
		FileConfig msgConfig = new FileConfig("DeathTimes", "messages.yml");
		msgConfig.options().header("Here you can edit all the Messages for the Plugin\n\nYou can also use Color Codes (https://www.spigotmc.org/attachments/example2-png.323205/)");
		msgConfig.addDefault("Prefix", "[&aDeathTimes&r]");
		msgConfig.options().copyDefaults(true);
		msgConfig.options().copyHeader(true);
		msgConfig.saveConfig();
		
		
	}
	
}
