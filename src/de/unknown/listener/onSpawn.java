package de.unknown.listener;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;
import org.bukkit.event.entity.CreatureSpawnEvent.SpawnReason;

public class onSpawn implements Listener {

	@EventHandler
	public void onSpawnCreat(CreatureSpawnEvent e) {
		if(e.getSpawnReason().equals(SpawnReason.NATURAL)) {
			e.setCancelled(true);
		}
	}
	
}
