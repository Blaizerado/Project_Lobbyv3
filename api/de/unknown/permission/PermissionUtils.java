package de.unknown.permission;

import java.io.File;
import java.util.List;

import org.bukkit.configuration.file.YamlConfiguration;

import de.unknown.api.FileHasMap;

public class PermissionUtils extends FileHasMap{

	public static int getPermissions(String Group) {
		int i = 0;
		File f;
		YamlConfiguration cfg;
		List<String>Perms;
		switch (Group) {
			case "Owner":
				f = getFile("Owner");
				cfg = YamlConfiguration.loadConfiguration(f);
				Perms = cfg.getStringList("Config.Permissions");
				i = Perms.size();
			break;
			case "Admin":
				f = getFile("Admin");
				cfg = YamlConfiguration.loadConfiguration(f);
				Perms = cfg.getStringList("Config.Permissions");
				i = Perms.size();
			break;
			case "SrLeitung":
				f = getFile("SrLeitung");
				cfg = YamlConfiguration.loadConfiguration(f);
				Perms = cfg.getStringList("Config.Permissions");
				i = Perms.size();
			break;
			case "SrModerator":
				f = getFile("SrModerator");
				cfg = YamlConfiguration.loadConfiguration(f);
				Perms = cfg.getStringList("Config.Permissions");
				i = Perms.size();
			break;
			case "Moderator":
				f = getFile("Moderator");
				cfg = YamlConfiguration.loadConfiguration(f);
				Perms = cfg.getStringList("Config.Permissions");
				i = Perms.size();
			break;
			case "SrSupporter":
				f = getFile("SrSupporter");
				cfg = YamlConfiguration.loadConfiguration(f);
				Perms = cfg.getStringList("Config.Permissions");
				i = Perms.size();
			break;
			case "Supporter":
				f = getFile("Supporter");
				cfg = YamlConfiguration.loadConfiguration(f);
				Perms = cfg.getStringList("Config.Permissions");
				i = Perms.size();
			break;
			case "SrBuilder":
				f = getFile("SrBuilder");
				cfg = YamlConfiguration.loadConfiguration(f);
				Perms = cfg.getStringList("Config.Permissions");
				i = Perms.size();
			break;
			case "Builder":
				f = getFile("Builder");
				cfg = YamlConfiguration.loadConfiguration(f);
				Perms = cfg.getStringList("Config.Permissions");
				i = Perms.size();
			break;
			case "Dev":
				f = getFile("Dev");
				cfg = YamlConfiguration.loadConfiguration(f);
				Perms = cfg.getStringList("Config.Permissions");
				i = Perms.size();
			break;
		default:
			break;
		}
		return i;
	}
	
	public static int getUser(String group) {
		int i = 0;
		File f;
		YamlConfiguration cfg;
		List<String>Perms;
			switch (group) {
			case "Owner":
				f = getFile("Owner");
				cfg = YamlConfiguration.loadConfiguration(f);
				Perms = cfg.getStringList("Config.User");
				i = Perms.size();
			break;
			case "Admin":
				f = getFile("Admin");
				cfg = YamlConfiguration.loadConfiguration(f);
				Perms = cfg.getStringList("Config.User");
				i = Perms.size();
			break;
			case "SrLeitung":
				f = getFile("SrLeitung");
				cfg = YamlConfiguration.loadConfiguration(f);
				Perms = cfg.getStringList("Config.User");
				i = Perms.size();
			break;
			case "SrModerator":
				f = getFile("SrModerator");
				cfg = YamlConfiguration.loadConfiguration(f);
				Perms = cfg.getStringList("Config.User");
				i = Perms.size();
			break;
			case "Moderator":
				f = getFile("Moderator");
				cfg = YamlConfiguration.loadConfiguration(f);
				Perms = cfg.getStringList("Config.User");
				i = Perms.size();
			break;
			case "SrSupporter":
				f = getFile("SrSupporter");
				cfg = YamlConfiguration.loadConfiguration(f);
				Perms = cfg.getStringList("Config.User");
				i = Perms.size();
			break;
			case "Supporter":
				f = getFile("Supporter");
				cfg = YamlConfiguration.loadConfiguration(f);
				Perms = cfg.getStringList("Config.User");
				i = Perms.size();
			break;
			case "SrBuilder":
				f = getFile("SrBuilder");
				cfg = YamlConfiguration.loadConfiguration(f);
				Perms = cfg.getStringList("Config.User");
				i = Perms.size();
			break;
			case "Builder":
				f = getFile("Builder");
				cfg = YamlConfiguration.loadConfiguration(f);
				Perms = cfg.getStringList("Config.User");
				i = Perms.size();
			break;
			case "Dev":
				f = getFile("Dev");
				cfg = YamlConfiguration.loadConfiguration(f);
				Perms = cfg.getStringList("Config.User");
				i = Perms.size();
			break;
		default:
			break;
		}
		return i;
	}
	
	public static List<String> groupPlayer(String group){
		File f;
		YamlConfiguration cfg;
		List<String>Perms = null;
			switch (group) {
			case "Owner":
				f = getFile("Owner");
				cfg = YamlConfiguration.loadConfiguration(f);
				Perms = cfg.getStringList("Config.User");
			break;
			case "Admin":
				f = getFile("Admin");
				cfg = YamlConfiguration.loadConfiguration(f);
				Perms = cfg.getStringList("Config.User");
			break;
			case "SrLeitung":
				f = getFile("SrLeitung");
				cfg = YamlConfiguration.loadConfiguration(f);
				Perms = cfg.getStringList("Config.User");
			break;
			case "SrModerator":
				f = getFile("SrModerator");
				cfg = YamlConfiguration.loadConfiguration(f);
				Perms = cfg.getStringList("Config.User");
			break;
			case "Moderator":
				f = getFile("Moderator");
				cfg = YamlConfiguration.loadConfiguration(f);
				Perms = cfg.getStringList("Config.User");
			break;
			case "SrSupporter":
				f = getFile("SrSupporter");
				cfg = YamlConfiguration.loadConfiguration(f);
				Perms = cfg.getStringList("Config.User");
			break;
			case "Supporter":
				f = getFile("Supporter");
				cfg = YamlConfiguration.loadConfiguration(f);
				Perms = cfg.getStringList("Config.User");
			break;
			case "SrBuilder":
				f = getFile("SrBuilder");
				cfg = YamlConfiguration.loadConfiguration(f);
				Perms = cfg.getStringList("Config.User");
			break;
			case "Builder":
				f = getFile("Builder");
				cfg = YamlConfiguration.loadConfiguration(f);
				Perms = cfg.getStringList("Config.User");
			break;
			case "Dev":
				f = getFile("Dev");
				cfg = YamlConfiguration.loadConfiguration(f);
				Perms = cfg.getStringList("Config.User");
			break;
		default:
			break;
		}
		return Perms;
	}
	
}
