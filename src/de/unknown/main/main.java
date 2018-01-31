package de.unknown.main;

import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import de.unknown.api.TimeLockAPI;
import de.unknown.commands.GameMode;
import de.unknown.commands.Install;
import de.unknown.commands.Settings;
import de.unknown.commands.Spawn;
import de.unknown.configapi.GetDefaultFiles;
import de.unknown.configapi.SpawnConfig;
import de.unknown.listener.onBuildEvent;
import de.unknown.listener.onDropEvent;
import de.unknown.listener.onFoodChange;
import de.unknown.listener.onInterAcct;
import de.unknown.listener.onInventoryClickDefault;
import de.unknown.listener.onInventoryClickSettings;
import de.unknown.listener.onInventoryClickSpawn;
import de.unknown.listener.onJoin;
import de.unknown.titleAPI.CraftTitleAPI;
import net.md_5.bungee.api.ChatColor;


public class main extends JavaPlugin{
	
	public static Boolean VIPSpawn = true;
	public static Boolean AdminSpawn = true;
	public static String Prefix;
	public static Boolean WeahterLock;
	public static Boolean Build = false;
	public static Boolean FoodChange;
	public static Boolean TimeLock;
	public static Long worldTime;
	public static String world;
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
			getConfig().set("Config.Weatherlock", false);
			getConfig().set("Config.BunngeCord", false);
			getConfig().set("Config.FoodLock", false);
			getConfig().set("Config.TimeLock", false);
			getConfig().set("Config.Prefix", "&3[&cProject_Lobby&3]&8:&6 ");
			getConfig().set("Config.Launge", "DE");
			getConfig().set("Config.Worldtime", "default");
			getConfig().set("Config.World", "default");
			saveConfig();
		}
	}

	private void loadInstance() {
		//Switch einbauen!
		VIPSpawn = getConfig().getBoolean("Config.VIPSpawn");
		AdminSpawn = getConfig().getBoolean("Config.AdminSpawn");
		Prefix = ChatColor.translateAlternateColorCodes('&', getConfig().getString("Config.Prefix"));
		WeahterLock = getConfig().getBoolean("Config.Weatherlock");
		FoodChange = getConfig().getBoolean("Config.FoodLock");
		TimeLock = getConfig().getBoolean("Config.TimeLock");
		worldTime = getConfig().getLong("Config.Worldtime");
		world = getConfig().getString("Config.World");
		
		GetDefaultFiles.loadFiles();
		SpawnConfig.loadSpawnLocation();
		TimeLockAPI.tick();
	}
	
	public void setConfig(String s) {
		switch(s) {
			case "WLock":
			 getConfig().set("Config.Weatherlock", WeahterLock);
			break;
			case "AdminSpawn":
			 getConfig().set("Config.AdminSpawn", AdminSpawn);
			break;
			case "VIPSpawn":
			 getConfig().set("Config.VIPSpawn", VIPSpawn);
			break;
			case "Food":
				 getConfig().set("Config.FoodLock", FoodChange);
			break;
			case "Time":
				 getConfig().set("Config.TimeLock", TimeLock);
			break;
			case "WorldTime":
				getConfig().set("Config.Worldtime", worldTime);
			break;
			case "World":
				getConfig().set("Config.World", world);
			break;
		}
		saveConfig();
	}
	
	private void loadListener(PluginManager pm) {
		//Listener
		pm.registerEvents(new onJoin(), this);
		pm.registerEvents(new onInventoryClickSpawn(), this);
		pm.registerEvents(new onInventoryClickInstall(), this);
		pm.registerEvents(new onInterAcct(), this);
		pm.registerEvents(new onInventoryClickSettings(this), this);
		pm.registerEvents(new onFoodChange(), this);
		pm.registerEvents(new CraftTitleAPI(this), this);
		pm.registerEvents(new onBuildEvent(), this);
		pm.registerEvents(new onDropEvent(), this);
		pm.registerEvents(new onInventoryClickDefault(), this);
		
		//Commands
		Settings cSettings = new Settings();
		getCommand("settings").setExecutor(cSettings);
		
		Spawn cSpawn = new Spawn();
		getCommand("spawn").setExecutor(cSpawn);
		
		Install cInstall = new Install(this);
		getCommand("install").setExecutor(cInstall);
		
		GameMode cGameMode = new GameMode();
		getCommand("gm").setExecutor(cGameMode);
		//Instancen
		new SpawnConfig(this);
		new TimeLockAPI(this);
	}
}
