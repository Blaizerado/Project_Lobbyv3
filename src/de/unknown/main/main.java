package de.unknown.main;

import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import de.unknown.configapi.GetDefaultFiles;
import de.unknown.configapi.SpawnConfig;
import de.unknown.listener.onJoin;


public class main extends JavaPlugin{
	
	public static Boolean VIPSpawn = true;
	public static Boolean AdminSpawn = true;
	
	@Override
	public void onEnable() {
		loadListener(getServer().getPluginManager());
		loadConfig();
		loadInstance();
		super.onEnable();
	}
	
	private void loadConfig() {
		if(!getConfig().getBoolean("Config.Create")) {
			getConfig().set("Config.Create", true);
			getConfig().set("Config.VIPSpawn", true);
			getConfig().set("Config.AdminSpawn", true);
			getConfig().set("Config.Prefix", "§3[§cProject_Lobby§3]§6: ");
			getConfig().set("Config.Launge", "DE");
			getConfig().set("Config.BunngeCord", false);
			saveConfig();
		}
	}

	private void loadInstance() {
		VIPSpawn = getConfig().getBoolean("Config.VIPSpawn");
		AdminSpawn = getConfig().getBoolean("Config.AdminSpawn");
		GetDefaultFiles.loadFiles();
		SpawnConfig.loadSpawnLocation();
	}
	
	private void loadListener(PluginManager pm) {
		pm.registerEvents(new onJoin(), this);
		
		new SpawnConfig(this);
	}
}
