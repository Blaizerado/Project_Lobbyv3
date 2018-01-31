package de.unknown.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import de.unknown.api.SetSpawnItems;
import de.unknown.main.main;
import de.unknown.titleAPI.CraftTitleAPI;

public class Install implements CommandExecutor {

	private main main;

	public Install(main main) {
		this.main = main;
	}

	@SuppressWarnings({ "deprecation", "static-access" })
	@Override
	public boolean onCommand(CommandSender sender, Command arg1, String arg2, String[] args) {
		final Player p = (Player) sender;
		if(!p.hasPermission("lobby.install")) {p.sendMessage( main.Prefix + "§cAchtung der Zugriff auf diesen Command wurde verweigert!"); return true;}
		if(args.length == 0) {
			CraftTitleAPI.sendFullTitle(p, 40, 40, 40, "§c§k[§6Project_Lobby§c§k]", "§cDanke das du Project_Lobby nutzt!");
			Bukkit.getScheduler().runTaskLater(main, new Runnable() {
				@Override
				public void run() {
					SetSpawnItems.createItem(p);
					p.sendMessage(main.Prefix + "Die Installation wurde gestartet!");
				}
			}, 20*4);
		}
		return true;
	}	
}
