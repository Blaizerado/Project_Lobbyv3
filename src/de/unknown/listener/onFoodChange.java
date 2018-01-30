package de.unknown.listener;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.FoodLevelChangeEvent;

import de.unknown.main.main;

public class onFoodChange implements Listener {

	@EventHandler
	public void onFood(FoodLevelChangeEvent e) {
		if(main.FoodChange) {
			e.setCancelled(true);
		}
	}
}
