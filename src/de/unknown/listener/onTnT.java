package de.unknown.listener;

import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityExplodeEvent;

public class onTnT implements Listener {

	@EventHandler
	public void onTnTChange(EntityExplodeEvent e) {
		if(e.getEntityType().equals(EntityType.PRIMED_TNT)) {
			e.setCancelled(true);
		}
	}
	
}
