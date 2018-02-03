package de.unknown.listener;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;

import de.unknown.main.main;

public class onPvPEvent implements Listener {

	@EventHandler
	public void onPvP(EntityDamageByEntityEvent e) {
		if(!main.isPVPActive) {
			if(e.getDamager() instanceof Player) {
				e.setCancelled(true);
			}
		}
	}
	
}
