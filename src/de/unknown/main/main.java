package de.unknown.main;

import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import de.unknown.commands.Install;
import de.unknown.commands.Spawn;
import de.unknown.configapi.GetDefaultFiles;
import de.unknown.configapi.SpawnConfig;
import de.unknown.listener.onInterAcct;
import de.unknown.listener.onInventoryClickSpawn;
import de.unknown.listener.onJoin;


public class main extends JavaPlugin{
	
	public static Boolean VIPSpawn = true;
	public static Boolean AdminSpawn = true;
	public static String Prefix;
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
			getConfig().set("Config.Prefix", "§3[§cProject_Lobby§3]§8:§6 ");
			getConfig().set("Config.Launge", "DE");
			getConfig().set("Config.BunngeCord", false);
			saveConfig();
		}
	}

	private void loadInstance() {
		VIPSpawn = getConfig().getBoolean("Config.VIPSpawn");
		AdminSpawn = getConfig().getBoolean("Config.AdminSpawn");
		Prefix = getConfig().getString("Config.Prefix");
		
		GetDefaultFiles.loadFiles();
		SpawnConfig.loadSpawnLocation();
	}
	
	private void loadListener(PluginManager pm) {
		//Listener
		pm.registerEvents(new onJoin(), this);
		pm.registerEvents(new onInventoryClickSpawn(), this);
		pm.registerEvents(new onInventoryClickInstall(), this);
		pm.registerEvents(new onInterAcct(), this);
		//Commands
		Spawn cSpawn = new Spawn();
		getCommand("spawn").setExecutor(cSpawn);
		
		Install cInstall = new Install(this);
		getCommand("install").setExecutor(cInstall);
		//Instancen
		new SpawnConfig(this);
	}
}
