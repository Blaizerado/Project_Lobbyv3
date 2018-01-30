package de.unknown.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;


import de.unknown.main.main;

public class GameMode implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command arg1, String arg2, String[] args) {
		Player p = (Player) sender;
		if(p instanceof Player) {
			if(args.length == 0) {
				if(!p.hasPermission("lobby.gamemode")) {p.sendMessage( main.Prefix + "§cAchtung der Zugriff auf diesen Command wurde verweigert!");return true;}
				p.sendMessage(main.Prefix + "/Gamemode{GM} 0:1:2:3 {Survival:Creative:Adventure:Spectator}");
				if(p.hasPermission("lobby.gamemode.*")) {
					p.sendMessage(main.Prefix + "/Gamemode{GM} 0:1:2:3 {Survival:Creative:Adventure:Spectator} [Player]");
					p.sendMessage(main.Prefix + "/Gamemode{GM}permission 0:1:2:3 §8{§cZeigt alle Permission´s für den Command /Gamemode!§8}");
				}
				
			}else if(args.length == 1) {
				switch(args[0]) {
					case "permission":
						if(args[0].equalsIgnoreCase("permission")) {
							if(!p.hasPermission("lobby.showPerms")) {p.sendMessage( main.Prefix + "§cAchtung der Zugriff auf diesen Command wurde verweigert!"); return true;}
							p.sendMessage("");
							p.sendMessage("");
							p.sendMessage("");
							p.sendMessage("");
							p.sendMessage(main.Prefix + "lobby.gamemode §8{§cZeigt alle Commands die für den Spieler wichtig sind, die in seine Permission liegen!§8}");
							p.sendMessage(main.Prefix + "lobby.gamemode.* §8{§cGibt den Spieler volle Permission´s auf den Gamemode Command!§8}");
							p.sendMessage(main.Prefix + "lobby.survival §8{§cSetzt die Permission für den Gamemode Survival(/gm 0)!§8}");
							p.sendMessage(main.Prefix + "lobby.creative §8{§cSetzt die Permission für den Gamemode Creative(/gm 1)!§8}");
							p.sendMessage(main.Prefix + "lobby.adventure §8{§cSetzt die Permission für den Gamemode Adventure(/gm 2)!§8}");
							p.sendMessage(main.Prefix + "lobby.spectator §8{§cSetzt die Permission für den Gamemode Spectator(/gm 3)!§8}");
						}
					break;
					//Survival
					case "0":
						if(!p.hasPermission("lobby.survival")) {p.sendMessage( main.Prefix + "§cAchtung der Zugriff auf diesen Command wurde verweigert!"); return true;}
						if(!main.Build) {p.sendMessage(main.Prefix + "§cDer Buildmode muss an sein!");return true;}
						p.setGameMode(org.bukkit.GameMode.SURVIVAL);
						p.sendMessage(main.Prefix + "Dein Gamemode ist nun Survival!");
					break;
					case "survival":
						if(!p.hasPermission("lobby.survival")) {p.sendMessage( main.Prefix + "§cAchtung der Zugriff auf diesen Command wurde verweigert!"); return true;}
						if(!main.Build) {p.sendMessage(main.Prefix + "§cDer Buildmode muss an sein!");return true;}
						p.setGameMode(org.bukkit.GameMode.SURVIVAL);
						p.sendMessage(main.Prefix + "Dein Gamemode ist nun Survival!");
					break;
					case "Survival":
						if(!p.hasPermission("lobby.survival")) {p.sendMessage( main.Prefix + "§cAchtung der Zugriff auf diesen Command wurde verweigert!"); return true;}
						if(!main.Build) {p.sendMessage(main.Prefix + "§cDer Buildmode muss an sein!");return true;}
						p.setGameMode(org.bukkit.GameMode.SURVIVAL);
						p.sendMessage(main.Prefix + "Dein Gamemode ist nun Survival!");
					break;
					//Creative
					case "1":
						if(!p.hasPermission("lobby.creative")) {p.sendMessage( main.Prefix + "§cAchtung der Zugriff auf diesen Command wurde verweigert!"); return true;}
						if(!main.Build) {p.sendMessage(main.Prefix + "§cDer Buildmode muss an sein!");return true;}
						p.setGameMode(org.bukkit.GameMode.CREATIVE);
						p.sendMessage(main.Prefix + "Dein Gamemode ist nun Creative!");
					break;
					
					case "creative":
						if(!p.hasPermission("lobby.creative")) {p.sendMessage( main.Prefix + "§cAchtung der Zugriff auf diesen Command wurde verweigert!"); return true;}
						if(!main.Build) {p.sendMessage(main.Prefix + "§cDer Buildmode muss an sein!");return true;}
						p.setGameMode(org.bukkit.GameMode.CREATIVE);
						p.sendMessage(main.Prefix + "Dein Gamemode ist nun Creative!");
					break;
					case "Creative":
						if(!p.hasPermission("lobby.creative")) {p.sendMessage( main.Prefix + "§cAchtung der Zugriff auf diesen Command wurde verweigert!"); return true;}
						if(!main.Build) {p.sendMessage(main.Prefix + "§cDer Buildmode muss an sein!");return true;}
						p.setGameMode(org.bukkit.GameMode.CREATIVE);
						p.sendMessage(main.Prefix + "Dein Gamemode ist nun Creative!");
					break;
					//Adventure
					case "2":
						if(!p.hasPermission("lobby.adventure")) {p.sendMessage( main.Prefix + "§cAchtung der Zugriff auf diesen Command wurde verweigert!"); return true;}
						if(!main.Build) {p.sendMessage(main.Prefix + "§cDer Buildmode muss an sein!");return true;}
						p.setGameMode(org.bukkit.GameMode.ADVENTURE);
						p.sendMessage(main.Prefix + "Dein Gamemode ist nun Adventure!");
					break;
					case "adventure":
						if(!p.hasPermission("lobby.adventure")) {p.sendMessage( main.Prefix + "§cAchtung der Zugriff auf diesen Command wurde verweigert!"); return true;}
						if(!main.Build) {p.sendMessage(main.Prefix + "§cDer Buildmode muss an sein!");return true;}
						p.setGameMode(org.bukkit.GameMode.ADVENTURE);
						p.sendMessage(main.Prefix + "Dein Gamemode ist nun Adventure!");
					break;
					case "Adventure":
						if(!p.hasPermission("lobby.adventure")) {p.sendMessage( main.Prefix + "§cAchtung der Zugriff auf diesen Command wurde verweigert!"); return true;}
						if(!main.Build) {p.sendMessage(main.Prefix + "§cDer Buildmode muss an sein!");return true;}
						p.setGameMode(org.bukkit.GameMode.ADVENTURE);
						p.sendMessage(main.Prefix + "Dein Gamemode ist nun Adventure!");
					break;
					//Spec
					case "3":
						if(!p.hasPermission("lobby.spectator")) {p.sendMessage( main.Prefix + "§cAchtung der Zugriff auf diesen Command wurde verweigert!"); return true;}
						if(!main.Build) {p.sendMessage(main.Prefix + "§cDer Buildmode muss an sein!");return true;}
						p.setGameMode(org.bukkit.GameMode.SPECTATOR);
						p.sendMessage(main.Prefix + "Dein Gamemode ist nun Spectator!");
					break;
					case "spectator":
						if(!p.hasPermission("lobby.spectator")) {p.sendMessage( main.Prefix + "§cAchtung der Zugriff auf diesen Command wurde verweigert!"); return true;}
						if(!main.Build) {p.sendMessage(main.Prefix + "§cDer Buildmode muss an sein!");return true;}
						p.setGameMode(org.bukkit.GameMode.SPECTATOR);
						p.sendMessage(main.Prefix + "Dein Gamemode ist nun Spectator!");
					break;
					case "Spectator":
						if(!p.hasPermission("lobby.spectator")) {p.sendMessage( main.Prefix + "§cAchtung der Zugriff auf diesen Command wurde verweigert!"); return true;}
						if(!main.Build) {p.sendMessage(main.Prefix + "§cDer Buildmode muss an sein!");return true;}
						p.setGameMode(org.bukkit.GameMode.SPECTATOR);
						p.sendMessage(main.Prefix + "Dein Gamemode ist nun Spectator!");
					break;
				}
			}
		}else {
			Bukkit.getConsoleSender().sendMessage("§cAchtung nur Spieler können den Command /gamemode");
		}
		return true;
	}

}
