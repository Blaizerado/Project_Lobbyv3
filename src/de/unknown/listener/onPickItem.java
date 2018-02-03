package de.unknown.listener;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerPickupItemEvent;

public class onPickItem implements Listener {

	@EventHandler
	public void onPickUp(PlayerPickupItemEvent e) {
		Player p = e.getPlayer();
		if(!p.hasPermission("lobby.pickup.ignore")) {
			e.setCancelled(true);
		}
	}
	
}
