package de.unknown.permission;

import java.io.File;

import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.permissions.PermissionAttachment;

import de.unknown.api.FileHasMap;
import de.unknown.main.main;
import net.md_5.bungee.api.ChatColor;

public class setPermission extends FileHasMap{

	private static main main;

	@SuppressWarnings("static-access")
	public setPermission(main main) {
		this.main = main;
	}

	public static void set(Player p, String Group) {
		File f;
		YamlConfiguration cfg;
		String Name;
		switch(Group) {
			case "Spieler":
				 f = getFile("Spieler");
				 cfg = YamlConfiguration.loadConfiguration(f);
				Name = ChatColor.translateAlternateColorCodes('&', cfg.getString("Config.Prefix") + p.getName());
				p.setPlayerListName(Name);
				p.setDisplayName(Name);
				setPermissiontoPlayer(p, cfg);
			break;
			case "Owner":
				 f = getFile("Owner");
				 cfg = YamlConfiguration.loadConfiguration(f);
				Name = ChatColor.translateAlternateColorCodes('&', cfg.getString("Config.Prefix") + p.getName());
				p.setPlayerListName(Name);
				p.setDisplayName(Name);
				setPermissiontoPlayer(p, cfg);
			break;
			case "Admin":
				 f = getFile("Admin");
				 cfg = YamlConfiguration.loadConfiguration(f);
				Name = ChatColor.translateAlternateColorCodes('&', cfg.getString("Config.Prefix") + p.getName());
				p.setPlayerListName(Name);
				p.setDisplayName(Name);
				setPermissiontoPlayer(p, cfg);
			break;
			case "SrLeitung":
				 f = getFile("SrLeitung");
				 cfg = YamlConfiguration.loadConfiguration(f);
				Name = ChatColor.translateAlternateColorCodes('&', cfg.getString("Config.Prefix") + p.getName());
				p.setPlayerListName(Name);
				p.setDisplayName(Name);
				setPermissiontoPlayer(p, cfg);
			break;
			case "SrModerator":
				 f = getFile("SrModerator");
				 cfg = YamlConfiguration.loadConfiguration(f);
				Name = ChatColor.translateAlternateColorCodes('&', cfg.getString("Config.Prefix") + p.getName());
				p.setPlayerListName(Name);
				p.setDisplayName(Name);
				setPermissiontoPlayer(p, cfg);
			break;
			case "Moderator":
				 f = getFile("Moderator");
				 cfg = YamlConfiguration.loadConfiguration(f);
				Name = ChatColor.translateAlternateColorCodes('&', cfg.getString("Config.Prefix") + p.getName());
				p.setPlayerListName(Name);
				p.setDisplayName(Name);
				setPermissiontoPlayer(p, cfg);
			break;
			case "SrSupporter":
				 f = getFile("SrSupporter");
				 cfg = YamlConfiguration.loadConfiguration(f);
				Name = ChatColor.translateAlternateColorCodes('&', cfg.getString("Config.Prefix") + p.getName());
				p.setPlayerListName(Name);
				p.setDisplayName(Name);
				setPermissiontoPlayer(p, cfg);
			break;
			case "Supporter":
				 f = getFile("Supporter");
				 cfg = YamlConfiguration.loadConfiguration(f);
				Name = ChatColor.translateAlternateColorCodes('&', cfg.getString("Config.Prefix") + p.getName());
				p.setPlayerListName(Name);
				p.setDisplayName(Name);
				setPermissiontoPlayer(p, cfg);
			break;
			case "SrBuilder":
				 f = getFile("SrBuilder");
				 cfg = YamlConfiguration.loadConfiguration(f);
				Name = ChatColor.translateAlternateColorCodes('&', cfg.getString("Config.Prefix") + p.getName());
				p.setPlayerListName(Name);
				p.setDisplayName(Name);
				setPermissiontoPlayer(p, cfg);
			break;
			case "Builder":
				 f = getFile("Builder");
				 cfg = YamlConfiguration.loadConfiguration(f);
				Name = ChatColor.translateAlternateColorCodes('&', cfg.getString("Config.Prefix") + p.getName());
				p.setPlayerListName(Name);
				p.setDisplayName(Name);
				setPermissiontoPlayer(p, cfg);
			break;
			case "Dev":
				 f = getFile("Dev");
				 cfg = YamlConfiguration.loadConfiguration(f);
				Name = ChatColor.translateAlternateColorCodes('&', cfg.getString("Config.Prefix") + p.getName());
				p.setPlayerListName(Name);
				p.setDisplayName(Name);
				setPermissiontoPlayer(p, cfg);
			break;
		}
	}
	
	public static void setPermissiontoPlayer(Player p, YamlConfiguration cfg) {
		PermissionAttachment at = p.addAttachment(main);
		for(String perm : cfg.getStringList("Config.Permissions")) {
			at.setPermission(perm, true);
		}
	}
	
}
