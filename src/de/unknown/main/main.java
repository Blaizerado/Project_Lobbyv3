package de.unknown.main;

import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import com.mysql.jdbc.MysqlParameterMetadata;

import de.unknown.MySQL.MySQL;
import de.unknown.api.TimeLockAPI;
import de.unknown.commands.GameMode;
import de.unknown.commands.Install;
import de.unknown.commands.Permisson;
import de.unknown.commands.Settings;
import de.unknown.commands.Spawn;
import de.unknown.configapi.GetDefaultFiles;
import de.unknown.configapi.LoadPermFile;
import de.unknown.configapi.SpawnConfig;
import de.unknown.listener.onBuildEvent;
import de.unknown.listener.onChat;
import de.unknown.listener.onDropEvent;
import de.unknown.listener.onFoodChange;
import de.unknown.listener.onInterAcct;
import de.unknown.listener.onInventoryCLickPermission;
import de.unknown.listener.onInventoryClickDefault;
import de.unknown.listener.onInventoryClickInstall;
import de.unknown.listener.onInventoryClickSettings;
import de.unknown.listener.onInventoryClickSpawn;
import de.unknown.listener.onJoin;
import de.unknown.listener.onPickItem;
import de.unknown.listener.onPvPEvent;
import de.unknown.listener.onSpawn;
import de.unknown.listener.onTnT;
import de.unknown.permission.setPermission;
import de.unknown.titleAPI.CraftTitleAPI;
import net.md_5.bungee.api.ChatColor;


public class main extends JavaPlugin{
	
	public static MySQL mysql;
	public static Boolean VIPSpawn = true;
	public static Boolean AdminSpawn = true;
	public static String Prefix;
	public static Boolean WeahterLock;
	public static Boolean Build = false;
	public static Boolean isPVPActive;
	public static Boolean FoodChange;
	public static Boolean TimeLock;
	public static Boolean isJoinActive;
	public static Long worldTime;
	public static String world;
	@Override
	public void onEnable() {
		loadListener(getServer().getPluginManager());
		loadConfig();
		loadInstance();
		loadMySQL();
		super.onEnable();
	}
	
	private void loadMySQL() {
		mysql = new MySQL("25.95.108.192", "lobby", "minecraft", "AAAA11cc");
		loadQuery();
	}

	private void loadQuery() {
		mysql.update("CREATE TABLE IF NOT EXISTS User(UUID varchar(64),Rang varchar(70),Name varchar(20));");
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
			getConfig().set("Config.PVP", false);
			getConfig().set("Config.Join", true);
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
		isPVPActive = getConfig().getBoolean("Config.PVP");
		isJoinActive = getConfig().getBoolean("Config.Join");
		worldTime = getConfig().getLong("Config.Worldtime");
		world = getConfig().getString("Config.World");
		
		GetDefaultFiles.loadFiles();
		SpawnConfig.loadSpawnLocation();
		TimeLockAPI.tick();
		LoadPermFile.LoadFiles();
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
			case "PvP":
				getConfig().set("Config.PVP", isPVPActive);
			break;
			case "Join":
				getConfig().set("Config.Join", isJoinActive);
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
		pm.registerEvents(new onSpawn(), this);
		pm.registerEvents(new onPvPEvent(), this);
		pm.registerEvents(new onPickItem(), this);
		pm.registerEvents(new onTnT(), this);
		pm.registerEvents(new onChat(), this);
		pm.registerEvents(new onInventoryCLickPermission(), this);
		//Commands
		Permisson cPermission = new Permisson(this);
		getCommand("team").setExecutor(cPermission);
		
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
		new setPermission(this);
	}
}
