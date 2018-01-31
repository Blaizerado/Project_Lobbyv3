package de.unknown.listener;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerDropItemEvent;

public class onDropEvent implements Listener {

	@EventHandler
	public void onDrop(PlayerDropItemEvent e) {
		Player p = e.getPlayer();
		switch(p.getInventory().getHeldItemSlot()) {
			case 0:
				e.setCancelled(true);
			break;
			case 4:
				e.setCancelled(true);
			break;
			case 8:
				e.setCancelled(true);
			break;	
		}
	}
}
