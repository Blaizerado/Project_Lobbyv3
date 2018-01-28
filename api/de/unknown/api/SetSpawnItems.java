package de.unknown.api;

import java.io.File;
import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.SkullMeta;

public class SetSpawnItems extends FileHasMap{

	public static void createItem(Player p) {
		File f = getFile("inv");
		YamlConfiguration cfg = YamlConfiguration.loadConfiguration(f);
		
		
		if(!f.exists()) {
			cfg.set("Config.Inventory.slot", 0);
			try {cfg.save(f);}catch(Exception e) {Bukkit.getConsoleSender().sendMessage("§cAchtung es wurde noch kein Inventory Slot gesetzt!");};
			
			Inventory inv = Bukkit.createInventory(null, 9, "§cInventory");
			
			ArrayList<String>Loren = new ArrayList<>();
			
			Loren.add("§cSetzt dein Lobby Inventory auf 54 Slot");
			ItemStack i = new ItemStack(Material.CHEST);
			ItemMeta im = (ItemMeta) i.getItemMeta();
			im.setDisplayName("§354 Slot Inventory");
			im.setLore(Loren);
			i.setItemMeta(im);
			inv.addItem(i);
			
			Loren.clear();
			Loren.add("§cSetzt dein Lobby Inventory auf 27");
			im.setDisplayName("§327 Slot Inventory");
			im.setLore(Loren);
			i.setItemMeta(im);
			inv.addItem(i);
			
			Loren.clear();
			Loren.add("§cSetzt dein Lobby Inventory auf 9");
			im.setDisplayName("§39 Slot Inventory");
			im.setLore(Loren);
			i.setItemMeta(im);
			
			inv.addItem(i);
			
			p.openInventory(inv);
		}else {

		}
	}
	
	public static void setInventoryItems(Player p) {
		File f = getFile("inv");
		YamlConfiguration cfg = YamlConfiguration.loadConfiguration(f);
		if(f.exists()) {
			if(cfg.getInt("Config.Inventory.slot") == 0) {
				
			}else {
				Bukkit.getConsoleSender().sendMessage("§cAchtung es können kein Lobby Items gesetzt werden, bitte nutze /install");
			}
		}
	}
	
	public static void SetRevergeItems(Player p) {
		File f = getFile("inv");
		YamlConfiguration cfg = YamlConfiguration.loadConfiguration(f);
		if(f.exists()) {
			if(cfg.getInt("Config.Inventory.slot") != 0) {
				ItemStack i = new ItemStack(Material.COMPASS);
				ItemMeta im = (ItemMeta) i.getItemMeta();
				im.setDisplayName("§cTeleporter§8(§3Rechtsklick§8)");
				i.setItemMeta(im);
				p.getInventory().setItem(0, i);
				
				i = new ItemStack(Material.CHEST);
				im = (ItemMeta) i.getItemMeta();
				im.setDisplayName("§cInventar§8(§eRechtsklick§8)");
				i.setItemMeta(im);
				p.getInventory().setItem(4, i);
				
				i = new ItemStack(Material.SKULL_ITEM, 1,(short)3);
				SkullMeta s = (SkullMeta) i.getItemMeta();
				s.setOwner(p.getName());
				s.setDisplayName("§cEinstellungen§8(§6Rechtsklick§8)");
				i.setItemMeta(s);
				
				p.getInventory().setItem(8, i);
			}
		}
	}
	
}
