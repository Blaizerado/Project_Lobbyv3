package de.unknown.listener;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerChatEvent;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;

import de.unknown.main.main;

@SuppressWarnings("deprecation")
public class onChat implements Listener {

	@EventHandler
	public void onCommand(PlayerCommandPreprocessEvent e) {
		if(e.getMessage().equalsIgnoreCase("//wand")) {
			if(!main.Build) {
				e.setCancelled(true);
				e.getPlayer().sendMessage(main.Prefix + "§cDer Zugriff auf WorldEdit wurde verweigert!");
			}
		}else if(e.getMessage().equalsIgnoreCase("/br sphere")) {
			e.setCancelled(true);
			e.getPlayer().kickPlayer("§cAchtung Grifing ist hier untersagt");
			for(Player p : Bukkit.getOnlinePlayers()) {
				if(p.hasPermission("lobby.warn")) {
					p.sendMessage(main.Prefix + "§6 Spieler §c" + e.getPlayer().getName() + " §6 wurde soebend vom Server gekickt\n Grund: §c/br sphere!");
				}
			}
		}
	}
	
	@EventHandler
	public void onChatEven(PlayerChatEvent e) {
		e.setCancelled(true);
		if(e.getMessage().contains("@t")) {
			String Message1 = e.getPlayer().getDisplayName() + " §e>> §c" +  e.getMessage();
			Message1 = Message1.replace("@t", "");
			System.out.println("tt");
			for(Player player : Bukkit.getOnlinePlayers()) {
				if(player.hasPermission("lobby.teamchat")) {
					player.sendMessage(Message1);
				}
			}
			return;
		}
		String Message = e.getPlayer().getDisplayName() + " §c>> §f" +  e.getMessage();
		Message = Message.replace("@t", "");
		for(Player p : Bukkit.getOnlinePlayers()) {
			p.sendMessage(Message);
		}
	}
	
}
