package de.unknown.configapi;

import java.io.File;

import org.bukkit.configuration.file.YamlConfiguration;

import de.unknown.api.FileHasMap;

public class LoadPermFile extends FileHasMap{

	public static  void LoadFiles() {
		File f;
		YamlConfiguration cfg;
		System.out.println("test");
		try {
			f=getFile("Owner");
			if(!f.exists()) {
				cfg = YamlConfiguration.loadConfiguration(f);
				cfg.set("Config.Permissions", "default");
				cfg.set("Config.Prefix", "&cOwner&8 : &f");
				cfg.set("Config.User", "default");
				cfg.save(f);
			}
			
			f=getFile("Admin");
			if(!f.exists()) {
				cfg = YamlConfiguration.loadConfiguration(f);
				cfg.set("Config.Permissions", "default");
				cfg.set("Config.Prefix", "&cOwner&8 : &f");
				cfg.set("Config.User", "default");
				cfg.save(f);
			}
			
			f=getFile("SrLeitung");
			if(!f.exists()) {
				cfg = YamlConfiguration.loadConfiguration(f);
				cfg.set("Config.Permissions", "default");
				cfg.set("Config.Prefix", "&4Admin§8 : &f");
				cfg.set("Config.User", "default");
				cfg.save(f);
			}
			
			f=getFile("SrModerator");
			if(!f.exists()) {
				cfg = YamlConfiguration.loadConfiguration(f);
				cfg.set("Config.Permissions", "default");
				cfg.set("Config.Prefix", "&9Sr-Moderator&8 : &f");
				cfg.set("Config.User", "default");
				cfg.save(f);
			}
			
			f=getFile("Moderator");
			if(!f.exists()) {
				cfg = YamlConfiguration.loadConfiguration(f);
				cfg.set("Config.Permissions", "default");
				cfg.set("Config.Prefix", "&bModerator&8 : &f");
				cfg.set("Config.User", "default");
				cfg.save(f);
			}
			
			f=getFile("SrSupporter");
			if(!f.exists()) {
				cfg = YamlConfiguration.loadConfiguration(f);
				cfg.set("Config.Permissions", "default");
				cfg.set("Config.Prefix", "&aSr-Supporter&8 : &f");
				cfg.set("Config.User", "default");
				cfg.save(f);
			}
			
			f=getFile("Supporter");
			if(!f.exists()) {
				cfg = YamlConfiguration.loadConfiguration(f);
				cfg.set("Config.Permissions", "default");
				cfg.set("Config.Prefix", "&eSupporter&8 : &f");
				cfg.set("Config.User", "default");
				cfg.save(f);
			}
			
			f=getFile("SrBuilder");
			if(!f.exists()) {
				cfg = YamlConfiguration.loadConfiguration(f);
				cfg.set("Config.Permissions", "default");
				cfg.set("Config.Prefix", "&6Sr-Builder&8 : &f");
				cfg.set("Config.User", "default");
				cfg.save(f);
			}
			
			f=getFile("Builder");
			if(!f.exists()) {
				cfg = YamlConfiguration.loadConfiguration(f);
				cfg.set("Config.Permissions", "default");
				cfg.set("Config.Prefix", "&5Builder&8 : &f");
				cfg.set("Config.User", "default");
				cfg.save(f);
			}
			
			f=getFile("Dev");
			if(!f.exists()) {
				cfg = YamlConfiguration.loadConfiguration(f);
				cfg.set("Config.Permissions", "default");
				cfg.set("Config.Prefix", "&3Developa&8 : &f");
				cfg.set("Config.User", "default");
				cfg.save(f);
			}
			
			f=getFile("Spieler");
			if(!f.exists()) {
				cfg = YamlConfiguration.loadConfiguration(f);
				cfg.set("Config.Permissions", "default");
				cfg.set("Config.Prefix", "&2Spieler&8 : &f");
				cfg.set("Config.User", "default");
				cfg.save(f);
			}
		}catch(Exception e) {
			
		}
	}
	
}
