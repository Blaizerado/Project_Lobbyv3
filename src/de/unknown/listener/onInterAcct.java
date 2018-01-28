package de.unknown.listener;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.Inventory;

public class onInterAcct implements Listener {
	
	@EventHandler
	public void onInterAcc(PlayerInteractEvent e) {
		Player p = e.getPlayer();
		if(e.getAction().equals(Action.RIGHT_CLICK_AIR) || e.getAction().equals(Action.RIGHT_CLICK_BLOCK)) {
			if(p.getItemInHand().getType().equals(Material.SKULL_ITEM)) {
				if(p.getItemInHand().getItemMeta().getDisplayName().equalsIgnoreCase("§cEinstellungen§8(§6Rechtsklick§8)")) {
					Inventory inv = Bukkit.createInventory(null, 54, "§3Einstellungen");
					
					p.openInventory(inv);
				}
			}
		}
	}
}
