package de.unknown.listener;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

import de.unknown.api.InventoryAPI;
import de.unknown.main.main;

public class onInventoryClickSettings extends InventoryAPI implements Listener {
	private main main;

	public onInventoryClickSettings(main main) {
		this.main = main;
	}

	
	
	@SuppressWarnings("static-access")
	@EventHandler
	public void OnInventoryClick(InventoryClickEvent e) {
		Player p = (Player) e.getWhoClicked();
		if(e.getCurrentItem() == null) {return;}
		if(e.getInventory() == null) {return;}
		if(e.getCurrentItem().getItemMeta() == null);
		
		if(e.getInventory().getName().equalsIgnoreCase("§3Settings")) {
			e.setCancelled(true);
			switch(e.getCurrentItem().getItemMeta().getDisplayName()) {
				case "§cBuild":
					setBuild();
					creatInventory(e.getInventory(), p, 2);
					p.updateInventory();
					sendBuildMessage(p);
				break;
				case "§cWeatherLock":
					setWLock();
					creatInventory(e.getInventory(), p, 2);
					p.updateInventory();
					main.setConfig("WLock");
					sendWeatherMessage(p);
				break;
				case "§cSpawns":
					creatInventory(e.getInventory(), p, 3);
				break;
				case "§cTeamspawn":
					setAdminSpawn();
					creatInventory(e.getInventory(), p, 3);
					p.updateInventory();
					main.setConfig("AdminSpawn");
				break;
				case "§cVIPSpawn":
					setVIPSpawn();
					creatInventory(e.getInventory(), p, 3);
					p.updateInventory();
					main.setConfig("VIPSpawn");
				break;
				case "§cFood":
					setFoodChange();
					creatInventory(e.getInventory(), p, 2);
					p.updateInventory();
					main.setConfig("Food");
					sendFoodMessage(p);
				break;
				case "§cTimeLock":
					setTimeLock();
					creatInventory(e.getInventory(), p, 2);
					p.updateInventory();
					main.worldTime = p.getWorld().getTime();
					main.world = p.getWorld().getName();
					main.setConfig("WorldTime");
					main.setConfig("World");
					main.setConfig("Time");
					sendTimeMessage(p);
				break;
				case "§2Weiter":
					creatInventory(e.getInventory(), p, 4);
					p.updateInventory();
				break;
				case "§cZurück":
					creatInventory(e.getInventory(), p, 2);
					p.updateInventory();
				break;
				case "§3PVP":
					setPvP();
					sendPVPMessage(p);
					creatInventory(e.getInventory(), p, 4);
					p.updateInventory();
					main.setConfig("PvP");
				break;
				case "§3Joinen":
					setJoin();
					sendJoinMessage(p);
					creatInventory(e.getInventory(), p, 4);
					p.updateInventory();
					main.setConfig("Join");
				break;
			}
		}
	}
}
