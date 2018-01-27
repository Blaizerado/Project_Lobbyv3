package de.unknown.api;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.entity.Player;

public class SetSpawn extends SpawnHasMap{

	public void setLocation(Player p) {
		if(getLocation("Spawn") != null) {
			Location loc = getLocation("Spawn");
			p.teleport(loc);
		}else {Bukkit.getConsoleSender().sendMessage("§cAchtung der Spieler kann nicht gespawnt werden, da keine Location fest stehen!");}
	}
	
}
