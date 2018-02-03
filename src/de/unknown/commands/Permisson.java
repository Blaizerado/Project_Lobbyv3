package de.unknown.commands;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import de.unknown.api.FileHasMap;
import de.unknown.main.main;
import de.unknown.permission.PermissionUtils;

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
			p.sendMessage("§3/team add player group");
			p.sendMessage("§3/team remove player group");
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
						Inventory inv = Bukkit.createInventory(null, 27, "§cGroups");
						ItemStack i; 
						ItemMeta im;
						ArrayList<String>Lore = new ArrayList<>();
						
						Lore.add("§cDiese Gruppe hat " + PermissionUtils.getPermissions("Owner") + " Permission");
						Lore.add("§cDiese Gruppe hat " + PermissionUtils.getUser("Owner") + " User");
						i = new ItemStack(Material.DIAMOND_BLOCK);
						im = (ItemMeta) i.getItemMeta();
						im.setDisplayName("§cOwner");
						im.setLore(Lore);
						i.setItemMeta(im);
						Lore.clear();
						inv.addItem(i);
						
						Lore.add("§cDiese Gruppe hat " + PermissionUtils.getPermissions("Dev") + " Permission");
						Lore.add("§cDiese Gruppe hat " + PermissionUtils.getUser("Dev") + " User");
						i = new ItemStack(Material.EMERALD_BLOCK);
						im = (ItemMeta) i.getItemMeta();
						im.setDisplayName("§3Developa");
						im.setLore(Lore);
						i.setItemMeta(im);
						inv.addItem(i);
						Lore.clear();
						
						Lore.add("§cDiese Gruppe hat " + PermissionUtils.getPermissions("Admin") + " Permission");
						Lore.add("§cDiese Gruppe hat " + PermissionUtils.getUser("Admin") + " User");
						i = new ItemStack(Material.GOLD_BLOCK);
						im = (ItemMeta) i.getItemMeta();
						im.setDisplayName("§cAdmin");
						im.setLore(Lore);
						i.setItemMeta(im);
						inv.addItem(i);
						Lore.clear();
						
						Lore.add("§cDiese Gruppe hat " + PermissionUtils.getPermissions("SrLeitung") + " Permission");
						Lore.add("§cDiese Gruppe hat " + PermissionUtils.getUser("SrLeitung") + " User");
						i = new ItemStack(Material.LAPIS_BLOCK);
						im = (ItemMeta) i.getItemMeta();
						im.setDisplayName("§eLeitung");
						im.setLore(Lore);
						i.setItemMeta(im);
						inv.addItem(i);
						Lore.clear();
						
						Lore.add("§cDiese Gruppe hat " + PermissionUtils.getPermissions("SrModerator") + " Permission");
						Lore.add("§cDiese Gruppe hat " + PermissionUtils.getUser("SrModerator") + " User");
						i = new ItemStack(Material.IRON_BLOCK);
						im = (ItemMeta)i.getItemMeta();
						im.setDisplayName("§bSrModerator");
						im.setLore(Lore);
						i.setItemMeta(im);
						inv.addItem(i);
						Lore.clear();
						
						Lore.add("§cDiese Gruppe hat " + PermissionUtils.getPermissions("Moderator") + " Permission");
						Lore.add("§cDiese Gruppe hat " + PermissionUtils.getUser("Moderator") + " User");
						i = new ItemStack(Material.QUARTZ_BLOCK);
						im = (ItemMeta)i.getItemMeta();
						im.setDisplayName("§aModerator");
						im.setLore(Lore);
						i.setItemMeta(im);
						inv.addItem(i);
						Lore.clear();
						
						Lore.add("§cDiese Gruppe hat " + PermissionUtils.getPermissions("SrSupporter") + " Permission");
						Lore.add("§cDiese Gruppe hat " + PermissionUtils.getUser("SrSupporter") + " User");
						i = new ItemStack(Material.REDSTONE_BLOCK);
						im = (ItemMeta) i.getItemMeta();
						im.setDisplayName("§9SrSupporter");
						im.setLore(Lore);
						i.setItemMeta(im);
						inv.addItem(i);
						Lore.clear();
						
						Lore.add("§cDiese Gruppe hat " + PermissionUtils.getPermissions("Supporter") + " Permission");
						Lore.add("§cDiese Gruppe hat " + PermissionUtils.getUser("Supporter") + " User");
						i = new ItemStack(Material.QUARTZ_ORE);
						im = (ItemMeta) i.getItemMeta();
						im.setDisplayName("§9Supporter");
						im.setLore(Lore);
						i.setItemMeta(im);
						inv.addItem(i);
						Lore.clear();
						
						Lore.add("§cDiese Gruppe hat " + PermissionUtils.getPermissions("SrBuilder") + " Permission");
						Lore.add("§cDiese Gruppe hat " + PermissionUtils.getUser("SrBuilder") + " User");
						i = new ItemStack(Material.SEA_LANTERN);
						im = (ItemMeta) i.getItemMeta();
						im.setDisplayName("§6SrBuilder");
						im.setLore(Lore);
						i.setItemMeta(im);
						inv.addItem(i);
						Lore.clear();
						
						Lore.add("§cDiese Gruppe hat " + PermissionUtils.getPermissions("Builder") + " Permission");
						Lore.add("§cDiese Gruppe hat " + PermissionUtils.getUser("Builder") + " User");
						i = new ItemStack(Material.TNT);
						im = (ItemMeta) i.getItemMeta();
						im.setDisplayName("§5Builder");
						im.setLore(Lore);
						i.setItemMeta(im);
						inv.addItem(i);
						p.openInventory(inv);
						Lore.clear();
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
