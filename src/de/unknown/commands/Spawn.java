package de.unknown.commands;


import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import de.unknown.api.SetSpawn;

public class Spawn extends SetSpawn implements CommandExecutor {


	@Override
	public boolean onCommand(CommandSender sender, Command arg1, String arg2, String[] args) {
		Player p = (Player) sender;
		if(args.length == 0) {
			if(p.hasPermission("Spawn.Player")) {
				setLocation(p);
				return true;
			}else if(p.hasPermission("Spawn.VIP")){
				setVIPLocation(p);
				return true;
			}else if(p.hasPermission("Spawn.Admin")){
				setAdminLocation(p);
				return true;
			}else {
				setLocation(p);
			}
		}else if(args.length == 1) {
			
			ArrayList<String>Loren = new ArrayList<>();
			Inventory inv = Bukkit.createInventory(null, 9,"§6Spawns");
			
			Loren.add("§3Setzt den Spawn für Spieler mit der Permission");
			Loren.add("§cSpawn.Admin");
			ItemStack i = new ItemStack(Material.DIAMOND_BLOCK);
			ItemMeta im = (ItemMeta) i.getItemMeta();
			im.setDisplayName("§3Team");
			im.setLore(Loren);
			i.setItemMeta(im);
			inv.addItem(i);
			Loren.clear();
			
			Loren.add("§eSetzt den Spawn für Spieler mit der Permission");
			Loren.add("§cSpawn.VIP");
			i = new ItemStack(Material.GOLD_BLOCK);
			im = (ItemMeta) i.getItemMeta();
			im.setDisplayName("§eVIP");
			im.setLore(Loren);
			i.setItemMeta(im);
			inv.addItem(i);
			Loren.clear();
			
			Loren.add("§2Setzt den Spawn für Spieler mit der Permission");
			Loren.add("§cSpawn.Player");
			i = new ItemStack(Material.IRON_BLOCK);
			im = (ItemMeta) i.getItemMeta();
			im.setDisplayName("§2Spieler");
			im.setLore(Loren);
			i.setItemMeta(im);
			inv.addItem(i);
			Loren.clear();
			
			p.openInventory(inv);
		}
		return true;
	}

}
