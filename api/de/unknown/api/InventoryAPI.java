package de.unknown.api;

import java.util.ArrayList;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import de.unknown.main.main;

public class InventoryAPI {

	public boolean isBuildActive() {return main.Build;}
	
	public boolean isWeatherLock() {return main.WeahterLock;}
	
	public boolean isTeamSpawnActive() {return main.AdminSpawn;}
	
	public  boolean isVIPSPawnActive() {return main.VIPSpawn;}
	
	public boolean isFoodChange(){return main.FoodChange;}
	
	public boolean isTimeLock() {return main.TimeLock;}
	public void creatInventory(Inventory inventory, Player p, int inter) {
		//1 create 2 update
		Inventory inv = inventory;
		ArrayList<String>Lore = new ArrayList<>();
		ItemStack i;
		ItemMeta im;
		switch(inter) {
			case 1:
				
				Lore.add("§3Aktivirt/Deaktivirt den Buildmodus, somit wird der Gamemode Command §cdeaktivirt§3!");
				i = new ItemStack(Material.DIAMOND_PICKAXE);
			    im = (ItemMeta)i.getItemMeta();
				im.setDisplayName("§cBuild");
				im.setLore(Lore);
				i.setItemMeta(im);
				inv.setItem(19, i);
				Lore.clear();
				
				Lore.add("§3Lockt dem Tag im diesen Zeitpunkt!");
				i = new ItemStack(Material.COMPASS);
				im = (ItemMeta) i.getItemMeta();
				im.setDisplayName("§cWeatherLock");
				im.setLore(Lore);
				i.setItemMeta(im);
				inv.setItem(20, i);
				Lore.clear();
				
				Lore.add("§3Lockt die Zeit im diesen Zeitpunkt!");
				i = new ItemStack(Material.COMPASS);
				im = (ItemMeta) i.getItemMeta();
				im.setDisplayName("§cWeatherLock");
				im.setLore(Lore);
				i.setItemMeta(im);
				inv.setItem(20, i);
				Lore.clear();
				
				Lore.add("§3Öffnet das Spawn Menü!");
				i = new ItemStack(Material.CHEST);
				im = (ItemMeta) i.getItemMeta();
				im.setDisplayName("§cSpawns");
				im.setLore(Lore);
				i.setItemMeta(im);
				Lore.clear();
				inv.setItem(22, i);
				
				Lore.add("§3Aktivirt/Deaktivirt den Hunger auf der Lobby!");
				i = new ItemStack(Material.COOKIE);
				im = (ItemMeta) i.getItemMeta();
				im.setDisplayName("§cFood");
				im.setLore(Lore);
				i.setItemMeta(im);
				Lore.clear();
				inv.setItem(24, i);
				
				Lore.add("§3Lockt die Zeit auf der Lobby!");
				i = new ItemStack(Material.WATCH);
				im = (ItemMeta) i.getItemMeta();
				im.setDisplayName("§cTimeLock");
				im.setLore(Lore);
				i.setItemMeta(im);
				Lore.clear();
				inv.setItem(25, i);
				
				inv.setItem(28, isBuild());
				inv.setItem(29, isWLock());
				inv.setItem(33, isFood());
				inv.setItem(34, isTime());
				
				p.openInventory(inv);
			break;
			case 2:
				Lore.add("§3Aktivirt/Deaktivirt den Buildmodus, somit wird der Gamemode Command §cdeaktivirt§3!");
				i = new ItemStack(Material.DIAMOND_PICKAXE);
				im = (ItemMeta)i.getItemMeta();
				im.setDisplayName("§cBuild");
				im.setLore(Lore);
				i.setItemMeta(im);
				inv.setItem(19, i);
				Lore.clear();
				
				Lore.add("§3Lockt dem Tag im diesen Zeitpunkt!");
				i = new ItemStack(Material.COMPASS);
				im = (ItemMeta) i.getItemMeta();
				im.setDisplayName("§cWeatherLock");
				im.setLore(Lore);
				i.setItemMeta(im);
				inv.setItem(20, i);
				Lore.clear();
				
				Lore.add("§3Öffnet das Spawn Menü!");
				i = new ItemStack(Material.CHEST);
				im = (ItemMeta) i.getItemMeta();
				im.setDisplayName("§cSpawns");
				im.setLore(Lore);
				i.setItemMeta(im);
				Lore.clear();
				inv.setItem(22, i);
				
				Lore.add("§3Aktivirt/Deaktivirt den Hunger auf der Lobby!");
				i = new ItemStack(Material.COOKIE);
				im = (ItemMeta) i.getItemMeta();
				im.setDisplayName("§cFood");
				im.setLore(Lore);
				i.setItemMeta(im);
				Lore.clear();
				inv.setItem(24, i);
				
				Lore.add("§3Lockt die Zeit auf der Lobby!");
				i = new ItemStack(Material.WATCH);
				im = (ItemMeta) i.getItemMeta();
				im.setDisplayName("§cTimeLock");
				im.setLore(Lore);
				i.setItemMeta(im);
				Lore.clear();
				inv.setItem(25, i);
				
				inv.setItem(28, isBuild());
				inv.setItem(29, isWLock());
				inv.setItem(33, isFood());
				inv.setItem(34, isTime());
			break;
			case 3:
				inv.clear();
				Lore.add("§3Aktivirt/Deaktivirt den Teamspawn!");
				i = new ItemStack(Material.DIAMOND_BLOCK);
				im = (ItemMeta) i.getItemMeta();
				im.setDisplayName("§cTeamspawn");
				im.setLore(Lore);
				i.setItemMeta(im);
				inv.setItem(20, i);
				Lore.clear();
				
				Lore.add("§3Aktivirt/Deaktivirt den VIPSpawn!");
				i = new ItemStack(Material.GOLD_BLOCK);
				im = (ItemMeta) i.getItemMeta();
				im.setDisplayName("§cVIPSpawn");
				im.setLore(Lore);
				i.setItemMeta(im);
				inv.setItem(24, i);
				Lore.clear();
				
				inv.setItem(29, isAdminSpawn());
				inv.setItem(33, isVIPSpawn());
			break;
		}
	}
	
	public ItemStack isTime() {
		ItemStack i;
		ItemMeta im;
		if(isTimeLock()) {
			i = new ItemStack(Material.STAINED_GLASS_PANE,1,(short)13);
			im = (ItemMeta)i.getItemMeta();
			im.setDisplayName("§2Aktivirt");
		}else {
			i = new ItemStack(Material.STAINED_GLASS_PANE,1,(short)14);
			im = (ItemMeta)i.getItemMeta();
			im.setDisplayName("§cDeaktivirt");
		}
		i.setItemMeta(im);
		return  i;
	}
	
	public ItemStack isFood() {
		ItemStack i;
		ItemMeta im;
		if(isFoodChange()) {
			i = new ItemStack(Material.STAINED_GLASS_PANE,1,(short)13);
			im = (ItemMeta)i.getItemMeta();
			im.setDisplayName("§2Aktivirt");
		}else {
			i = new ItemStack(Material.STAINED_GLASS_PANE,1,(short)14);
			im = (ItemMeta)i.getItemMeta();
			im.setDisplayName("§cDeaktivirt");
		}
		i.setItemMeta(im);
		return  i;
	}
	
	public ItemStack isBuild() {
		ItemStack i;
		ItemMeta im;
		if(isBuildActive()) {
			i = new ItemStack(Material.STAINED_GLASS_PANE,1,(short)13);
			im = (ItemMeta)i.getItemMeta();
			im.setDisplayName("§2Aktivirt");
		}else {
			i = new ItemStack(Material.STAINED_GLASS_PANE,1,(short)14);
			im = (ItemMeta)i.getItemMeta();
			im.setDisplayName("§cDeaktivirt");
		}
		i.setItemMeta(im);
		return  i;
	}
	
	public ItemStack isAdminSpawn() {
		ItemStack i;
		ItemMeta im;
		if(isTeamSpawnActive()) {
			i = new ItemStack(Material.STAINED_GLASS_PANE,1,(short)13);
			im = (ItemMeta)i.getItemMeta();
			im.setDisplayName("§2Aktivirt");
		}else {
			i = new ItemStack(Material.STAINED_GLASS_PANE,1,(short)14);
			im = (ItemMeta)i.getItemMeta();
			im.setDisplayName("§cDeaktivirt");
		}
		i.setItemMeta(im);
		return  i;
	}
	
	public ItemStack isVIPSpawn() {
		ItemStack i;
		ItemMeta im;
		if(isVIPSPawnActive()) {
			i = new ItemStack(Material.STAINED_GLASS_PANE,1,(short)13);
			im = (ItemMeta)i.getItemMeta();
			im.setDisplayName("§2Aktivirt");
		}else {
			i = new ItemStack(Material.STAINED_GLASS_PANE,1,(short)14);
			im = (ItemMeta)i.getItemMeta();
			im.setDisplayName("§cDeaktivirt");
		}
		i.setItemMeta(im);
		return  i;
	}
	
	public ItemStack isWLock() {
		ItemStack i;
		ItemMeta im;
		if(isWeatherLock()) {
			i = new ItemStack(Material.STAINED_GLASS_PANE,1,(short)13);
			im = (ItemMeta)i.getItemMeta();
			im.setDisplayName("§2Aktivirt");
		}else {
			i = new ItemStack(Material.STAINED_GLASS_PANE,1,(short)14);
			im = (ItemMeta)i.getItemMeta();
			im.setDisplayName("§cDeaktivirt");
		}
		i.setItemMeta(im);
		return i;
	}
	
	public void sendWeatherMessage(Player p) {if(isWeatherLock()) {p.sendMessage(main.Prefix + "Das Wetter wird nun gelockt!");}else{p.sendMessage(main.Prefix + "Das Wetter wird nun nicht mehr gelockt!");}}
	
	public void sendBuildMessage(Player p) {if(isBuildActive()) {p.sendMessage(main.Prefix + "Das Bauen wird nun Aktivirt!");}else{p.sendMessage(main.Prefix + "Das Bauen wird nun Deaktivirt!");}}
	
	public void sendFoodMessage(Player p) {if(isFoodChange()) {p.sendMessage(main.Prefix + "Der Hunger wird nun gelockt!");}else{p.sendMessage(main.Prefix + "Der Hunger wird nun nicht mehr gelockt!");}}
	
	public void sendTimeMessage(Player p) {if(isTimeLock()) {p.sendMessage(main.Prefix + "Die Zeit wird nun gelockt!");}else{p.sendMessage(main.Prefix + "Die Zeit wird nun nicht mehr gelockt!");}}
	
	public void setBuild(){if(isBuildActive()) {main.Build = false;}else {main.Build = true;}}
	
	public void setWLock(){if(isWeatherLock()) {main.WeahterLock = false;}else {main.WeahterLock = true;}}
	
	public void setAdminSpawn() {if(isTeamSpawnActive()) {main.AdminSpawn = false;}else{main.AdminSpawn = true;}}
	
	public void setVIPSpawn() {if(isVIPSPawnActive()) {main.VIPSpawn = false;}else{main.VIPSpawn = true;}}
	
	public void setFoodChange() {if(isFoodChange()) {main.FoodChange = false;}else{main.FoodChange = true;}}
	
	public void setTimeLock() {if(isTimeLock()) {main.TimeLock = false;}else{main.TimeLock = true;}}	
}
