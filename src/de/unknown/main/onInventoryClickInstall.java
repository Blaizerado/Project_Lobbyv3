package de.unknown.main;

import java.io.File;

import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

import de.unknown.api.FileHasMap;
import de.unknown.api.SetSpawnItems;

public class onInventoryClickInstall extends FileHasMap implements Listener {

	@EventHandler
	public void onInventoryClick(InventoryClickEvent e) {
		Player p = (Player) e.getWhoClicked();
		if(e.getCurrentItem() == null) {return;}
		if(e.getInventory() == null) {return;}
		if(e.getCurrentItem().getItemMeta() == null) {return;}
		
		File f = getFile("inv");
		YamlConfiguration cfg = YamlConfiguration.loadConfiguration(f);
		if(e.getInventory().getName().equalsIgnoreCase("§cInventory")) {
			e.setCancelled(true);
			//switch()
			if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§354 Slot Inventory") || e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§327 Slot Inventory")
			|| e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§39 Slot Inventory")) {
			 	
				switch(p.getItemInHand().getItemMeta().getDisplayName()) {
					case "§354 Slot Inventory":
						cfg.set("Config.Inventory.slot", 54);
						p.sendMessage(main.Prefix + "Deine Inventory größe für den Spawn Teleporter beträgt nun 54 Slots!");
					break;
					case "§327 Slot Inventory":
						cfg.set("Config.Inventory.slot", 27);
						p.sendMessage(main.Prefix + "Deine Inventory größe für den Spawn Teleporter beträgt nun 27 Slots!");
					break;
					case "§39 Slot Inventory":
						cfg.set("Config.Inventory.slot", 9);
						p.sendMessage(main.Prefix + "Deine Inventory größe für den Spawn Teleporter beträgt nun 9 Slots!");
					break;
				}
				
			}
			try {cfg.save(f);}catch(Exception a) {}
			p.closeInventory();
			SetSpawnItems.SetRevergeItems(p);
		}
	}
	
}
