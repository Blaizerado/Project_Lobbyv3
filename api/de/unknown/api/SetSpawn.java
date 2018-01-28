package de.unknown.api;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.entity.Player;

public class SetSpawn extends SpawnHasMap{

	public void setLocation(Player p) {
		Location loc = getLocation("Spawn");
		if(loc != null) {
			p.teleport(loc);
		}else {Bukkit.getConsoleSender().sendMessage("§cAchtung der Spieler kann nicht gespawnt werden, da keine Location fest stehen!");}
	}
	
	public void setVIPLocation(Player p) {
		Location loc = getLocation("VIPSpawn");
		if(loc != null) {
			p.teleport(loc);
		}else {Bukkit.getConsoleSender().sendMessage("§cAchtung der Spieler kann nicht gespawnt werden, da keine VIP Location fest stehen!");}
	}
	
	public void setAdminLocation(Player p) {
		Location loc = getLocation("AdminSpawn");
		if(loc != null) {
			p.teleport(loc);
		}else {Bukkit.getConsoleSender().sendMessage("§cAchtung der Spieler kann nicht gespawnt werden, da keine Team Location fest stehen!");}
	}
}
