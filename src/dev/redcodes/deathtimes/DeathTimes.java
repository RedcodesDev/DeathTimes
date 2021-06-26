package dev.redcodes.deathtimes;

import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import dev.redcodes.deathtimes.data.ConfigCreator;
import dev.redcodes.deathtimes.data.FileConfig;

public class DeathTimes extends JavaPlugin {

	private static DeathTimes plugin;
	private static String prefix;

	public void onEnable() {

		plugin = this;

		ConfigCreator.createConfigs();

		FileConfig msgConfig = new FileConfig("DeathTimes", "messages.yml");

		prefix = msgConfig.getString("Prefix").replace("&", "§") + " ";

		FileConfig config = new FileConfig("DeathTimes", "config.yml");

		if (!config.getBoolean("enabled")) {
			Bukkit.getConsoleSender().sendMessage(prefix + "§cDeathTimes was disabled by the config.");
			this.setEnabled(false);
			return;
		}
		

		PluginManager pm = Bukkit.getPluginManager();

		Bukkit.getServer().getConsoleSender().sendMessage(prefix + "§cDeathTimes Plugin by §6§lRedi §c& §6§lCrayonGamer");
		Bukkit.getServer().getConsoleSender().sendMessage(prefix + "§aDeathTimes was started successfully");

	}

	public void onDisable() {

		Bukkit.getConsoleSender().sendMessage(prefix + "§cDeathTimes was disabled successfully");

	}

	public static DeathTimes getPlugin() {
		return plugin;
	}

	public static String getPrefix() {
		return prefix;
	}
}