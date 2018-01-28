package de.unknown.listener;

import java.io.File;

import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

import de.unknown.api.SpawnHasMap;
import de.unknown.configapi.GetDefaultFiles;
import de.unknown.configapi.SpawnConfig;
import de.unknown.main.main;

public class onInventoryClickSpawn extends GetDefaultFiles implements Listener {
	private SpawnHasMap hmap;
	private SpawnConfig scfg;
	@SuppressWarnings("static-access")
	@EventHandler
	public void onClick(InventoryClickEvent e) {
		Player p = (Player) e.getWhoClicked();
		try {
			if(e.getCurrentItem() == null) {
				return ;
			}
			if(e.getInventory() == null) {
				return;
			}
			if(e.getCurrentItem().getItemMeta() == null) {
				return;
			}
			if(e.getInventory().getName().equalsIgnoreCase("§6Spawns")) {
				e.setCancelled(true);
				if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§3Team") || e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§eVIP")
				|| e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§2Spieler")) {
					File f = getFile("Spawn");
					YamlConfiguration cfg = YamlConfiguration.loadConfiguration(f);
					switch(e.getCurrentItem().getItemMeta().getDisplayName()) {
						case "§3Team":
							cfg.set("Config.TeamSpawn", p.getLocation());
							p.sendMessage(main.Prefix + "Der Spawn für die §cTeammitglieder§6 wurde gesetzt!");
						break;
						case "§eVIP":
							cfg.set("Config.VIPSpawn", p.getLocation());
							p.sendMessage(main.Prefix + "Der Spawn für die §eVIP´s§6 wurde gesetzt!");
						break;
						case "§2Spieler":
							cfg.set("Config.Spawn", p.getLocation());
							p.sendMessage(main.Prefix + "Der Spawn für die §2Spieler§6 wurde gesetzt!");
						break;
					}
					hmap.serverLocation.clear();
					scfg.loadSpawnLocation();
					cfg.save(f);
				}
			}
		}catch(Exception a) {
			
		}
	}
}
