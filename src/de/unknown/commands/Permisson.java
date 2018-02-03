package de.unknown.commands;

import java.io.File;
import java.util.List;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;

import de.unknown.api.FileHasMap;
import de.unknown.main.main;

public class Permisson extends FileHasMap implements CommandExecutor {

	private main main;

	public Permisson(main main) {
		this.main = main;
	}

	@SuppressWarnings("static-access")
	@Override
	public boolean onCommand(CommandSender sender, Command arg1, String arg2, String[] args) {
		Player p = (Player) sender;
		if(!p.hasPermission("permission.*")) {p.sendMessage(main.Prefix + "§cDer Zugriff auf diesen Command wurde verweigert!");return true;}
		if(args.length == 0) {
			p.sendMessage("§3/Team groups");
			p.sendMessage("§3/Team add group Permission");
			p.sendMessage("§3/Team remove group Permission");
			p.sendMessage("§3/Team settings");
		}else if(args.length == 1) {
				switch(args[0]) {
					case "groups":
						
					break;
					case "add":
						p.sendMessage("§3/Team add group Permission");
						break;
					case "remove":
						p.sendMessage("§3/Team remove group Permission");
						break;
					case "settings":
						
						break;
					default:
						p.sendMessage("§c Der Command ist nicht bekannt!");
						break;
					}
			}else if(args.length == 2) {
				switch(args[0]) {
				case "add":
					p.sendMessage("§3/Team add group Permission");
					break;
				case "remove":
					p.sendMessage("§3/Team remove group Permission");
					break;
				default:
					p.sendMessage("§c Der Command ist nicht bekannt!");
					break;
				}
			
			}else if(args.length == 3) {
				String permission = args[2];
				String Group = args[1];
				switch(args[0]) {
				case "add":
					setGroupPermission(Group, permission, p);
					break;
				case "remove":
					p.sendMessage("§3/Team remove group Permission");
					break;
				default:
					p.sendMessage("§c Der Command ist nicht bekannt!");
					break;
				}
			}
		return true;
	}

	@SuppressWarnings("static-access")
	public void setGroupPermission(String group, String Per, Player p) {
		File f;
		try {
			switch(group) {
			case "Owner":
				f = getFile("Owner");
				if(f.exists()) {
					YamlConfiguration cfg = YamlConfiguration.loadConfiguration(f);
					List<String>Permission = cfg.getStringList("Config.Permissions");
					if(!Permission.contains(Per)) {
						Permission.add(Per);
						cfg.set("Config.Permissions", Permission);
						cfg.save(f);
					}else {
						p.sendMessage(main.Prefix + "§cDie Permission ist bereits in der Gruppe!");
						return;
					}
				}
			break;
			case "Admin":
				f = getFile("Admin");
				if(f.exists()) {
					YamlConfiguration cfg = YamlConfiguration.loadConfiguration(f);
					List<String>Permission = cfg.getStringList("Config.Permissions");
					if(!Permission.contains(Per)) {
						Permission.add(Per);
						cfg.set("Config.Permissions", Permission);
						cfg.save(f);
					}else {
						p.sendMessage(main.Prefix + "§cDie Permission ist bereits in der Gruppe!");
						return;
					}
				}
			break;
			case "Leitung":
				f = getFile("SrLeitung");
				if(f.exists()) {
					YamlConfiguration cfg = YamlConfiguration.loadConfiguration(f);
					List<String>Permission = cfg.getStringList("Config.Permissions");
					if(!Permission.contains(Per)) {
						Permission.add(Per);
						cfg.set("Config.Permissions", Permission);
						cfg.save(f);
					}else {
						p.sendMessage(main.Prefix + "§cDie Permission ist bereits in der Gruppe!");
						return;
					}
				}
				break;
			case "SrModerator":
				f = getFile("SrModerator");
				if(f.exists()) {
					YamlConfiguration cfg = YamlConfiguration.loadConfiguration(f);
					List<String>Permission = cfg.getStringList("Config.Permissions");
					if(!Permission.contains(Per)) {
						Permission.add(Per);
						cfg.set("Config.Permissions", Permission);
						cfg.save(f);
					}else {
						p.sendMessage(main.Prefix + "§cDie Permission ist bereits in der Gruppe!");
						return;
					}
				}
				break;
			case "Moderator":
				f = getFile("Moderator");
				if(f.exists()) {
					YamlConfiguration cfg = YamlConfiguration.loadConfiguration(f);
					List<String>Permission = cfg.getStringList("Config.Permissions");
					if(!Permission.contains(Per)) {
						Permission.add(Per);
						cfg.set("Config.Permissions", Permission);
						cfg.save(f);
					}else {
						p.sendMessage(main.Prefix + "§cDie Permission ist bereits in der Gruppe!");
						return;
					}
				}
				break;
			case "SrSupporter":
				f = getFile("SrSupporter");
				if(f.exists()) {
					YamlConfiguration cfg = YamlConfiguration.loadConfiguration(f);
					List<String>Permission = cfg.getStringList("Config.Permissions");
					if(!Permission.contains(Per)) {
						Permission.add(Per);
						cfg.set("Config.Permissions", Permission);
						cfg.save(f);
					}else {
						p.sendMessage(main.Prefix + "§cDie Permission ist bereits in der Gruppe!");
						return;
					}
				}
				break;
			case "Supporter":
				f = getFile("Supporter");
				if(f.exists()) {
					YamlConfiguration cfg = YamlConfiguration.loadConfiguration(f);
					List<String>Permission = cfg.getStringList("Config.Permissions");
					if(!Permission.contains(Per)) {
						Permission.add(Per);
						cfg.set("Config.Permissions", Permission);
						cfg.save(f);
					}else {
						p.sendMessage(main.Prefix + "§cDie Permission ist bereits in der Gruppe!");
						return;
					}
				}
				break;
			case "SrBuilder":
				f = getFile("SrBuilder");
				if(f.exists()) {
					YamlConfiguration cfg = YamlConfiguration.loadConfiguration(f);
					List<String>Permission = cfg.getStringList("Config.Permissions");
					if(!Permission.contains(Per)) {
						Permission.add(Per);
						cfg.set("Config.Permissions", Permission);
						cfg.save(f);
					}else {
						p.sendMessage(main.Prefix + "§cDie Permission ist bereits in der Gruppe!");
						return;
					}
				}
				break;
			case "Builder":
				f = getFile("Builder");
				if(f.exists()) {
					YamlConfiguration cfg = YamlConfiguration.loadConfiguration(f);
					List<String>Permission = cfg.getStringList("Config.Permissions");
					if(!Permission.contains(Per)) {
						Permission.add(Per);
						cfg.set("Config.Permissions", Permission);
						cfg.save(f);
					}else {
						p.sendMessage(main.Prefix + "§cDie Permission ist bereits in der Gruppe!");
						return;
					}
				}
				break;
			case "Developa":
				f = getFile("Dev");
				if(f.exists()) {
					YamlConfiguration cfg = YamlConfiguration.loadConfiguration(f);
					List<String>Permission = cfg.getStringList("Config.Permissions");
					if(!Permission.contains(Per)) {
						Permission.add(Per);
						cfg.set("Config.Permissions", Permission);
						cfg.save(f);
					}else {
						p.sendMessage(main.Prefix + "§cDie Permission ist bereits in der Gruppe!");
						return;
					}
				}
				break;
			case "Spieler":
				f = getFile("Spieler");
				if(f.exists()) {
					YamlConfiguration cfg = YamlConfiguration.loadConfiguration(f);
					List<String>Permission = cfg.getStringList("Config.Permissions");
					if(!Permission.contains(Per)) {
						Permission.add(Per);
						cfg.set("Config.Permissions", Permission);
						cfg.save(f);
					}else {
						p.sendMessage(main.Prefix + "§cDie Permission ist bereits in der Gruppe!");
						return;
					}
				}
			break;
			default:
				p.sendMessage(main.Prefix + "§cDie angegeben Grupper ist nicht verfügbar!");
			break;
		}
			p.sendMessage(main.Prefix + "Die Permission " + Per + " wurde zur Gruppe " + group + " hinzugefügt!");
		}catch(Exception e) {	}
	}
	
}
