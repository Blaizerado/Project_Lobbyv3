package de.unknown.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import de.unknown.api.InventoryAPI;
import de.unknown.main.main;

public class Settings extends InventoryAPI implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command arg1, String arg2, String[] args) {
		Player p = (Player) sender;
		if(args.length == 0) {
			if(!p.hasPermission("lobby.settings")) {p.sendMessage( main.Prefix + "§cAchtung der Zugriff auf diesen Command wurde verweigert!"); return true;}
			creatInventory(Bukkit.createInventory(null, 54,"§3Settings"), p,1);
			
		}else {p.sendMessage(main.Prefix + "§3Der Befehl ist leider nicht bekannt!");}
		return true;
	}

}
