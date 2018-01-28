package de.unknown.configapi;



import java.io.File;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.configuration.file.YamlConfiguration;

import de.unknown.api.SpawnHasMap;
import de.unknown.main.main;

public class SpawnConfig extends SpawnHasMap{
	private static main main;

	@SuppressWarnings("static-access")
	public SpawnConfig(main main) {
		this.main = main;
	}

	@SuppressWarnings("static-access")
	public static void loadSpawnLocation() {
		File f = getFile("Spawn");
		YamlConfiguration cfg = YamlConfiguration.loadConfiguration(f);
		System.out.println(f);
		if(!f.exists()) {
			cfg.set("Config.Spawn", "default");
			cfg.set("Config.VIPSpawn", "default");
			cfg.set("Config.TeamSpawn", "default");
			try {cfg.save(f);}catch(Exception e) {};
		}else {
			if(!cfg.getString("Config.Spawn").equalsIgnoreCase("default")) {
				addLocation("Spawn", (Location)cfg.get("Config.Spawn"));
			}else {Bukkit.getConsoleSender().sendMessage("§cAchtung es wurde noch kein Spawn festgestellt!");}
			if(main.VIPSpawn) {
				if(!cfg.getString("Config.VIPSpawn").equalsIgnoreCase("default")) {
					addLocation("VIPSpawn", (Location)cfg.get("Config.VIPSpawn"));
				}else {Bukkit.getConsoleSender().sendMessage("§cAchtung es wurde noch kein VIPSpawn festgestellt!");}
			}
			if(main.AdminSpawn) {
				if(!cfg.getString("Config.TeamSpawn").equalsIgnoreCase("default")) {
					addLocation("AdminSpawn", (Location)cfg.get("Config.TeamSpawn"));
				}else {Bukkit.getConsoleSender().sendMessage("§cAchtung es wurde noch kein AdminSpawn festgestellt!");}
			}
		}
	}
}
