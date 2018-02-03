package de.unknown.listener;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import de.unknown.MySQL.Function;
import de.unknown.api.ArrayListAPI;
import de.unknown.api.SetSpawnItems;
import de.unknown.api.SpawnHasMap;
import de.unknown.main.main;
import de.unknown.permission.setPermission;

public class onJoin extends ArrayListAPI implements Listener {
	
	SpawnHasMap hmap;
	
	@EventHandler
	public void onJoinEvent(PlayerJoinEvent e) {
		System.out.println("test3");
		Player p = e.getPlayer();
		if(main.isJoinActive) {
			if(!isPlayerInLobby(p)) {
				addPlayer(p);
				setLocation(p);
				SetSpawnItems.SetRevergeItems(p);
				SetSpawnItems.setInventoryItems(p);
				if(!Function.playExists(p.getUniqueId().toString())) {Function.createPlayer(p.getUniqueId().toString(), p.getName());}
				setPermission.set(p, Function.getGroup(p.getUniqueId().toString()));
			}
		}else {
			if(!p.isOp()) {
				p.kickPlayer("§cDer Server wird grade bearbeitet!");
			}
		}
	}
}
