package de.unknown.listener;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import de.unknown.api.ArrayListAPI;
import de.unknown.api.SpawnHasMap;

public class onJoin extends ArrayListAPI implements Listener {
	
	SpawnHasMap hmap;
	
	@EventHandler
	public void onJoinEvent(PlayerJoinEvent e) {
		System.out.println("test3");
		Player p = e.getPlayer();
		if(!isPlayerInLobby(p)) {
			addPlayer(p);
			setLocation(p);
		}
	}
}
