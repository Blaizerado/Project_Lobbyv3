package de.unknown.listener;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;

import de.unknown.main.main;

public class onBuildEvent implements Listener {

	@EventHandler
	public void OnBreak(BlockBreakEvent e) {
		Player p = e.getPlayer();
		if(!p.hasPermission("lobby.build.*")) {
			e.setCancelled(true); 
			return;
		}
		if(!main.Build) {
			e.setCancelled(true);
			p.sendMessage(main.Prefix + "§cAchtung der Buildmode ist nicht an!");
			return;
		}
	}
	
	@EventHandler
	public void onPlace(BlockPlaceEvent e) {
		Player p = e.getPlayer();
		if(!p.hasPermission("lobby.build.*")) {
			e.setCancelled(true); 
			return;
		}
		if(!main.Build) {
			e.setCancelled(true);
			p.sendMessage(main.Prefix + "§cAchtung der Buildmode ist nicht an!");
			return;
		}
	}
}
