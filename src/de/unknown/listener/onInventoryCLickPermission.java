package de.unknown.listener;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.SkullMeta;

import de.unknown.permission.PermissionUtils;

public class onInventoryCLickPermission implements Listener {
	
	@EventHandler
	public void onInv(InventoryClickEvent e) {
		Player p = (Player) e.getWhoClicked();
		if(e.getCurrentItem() == null) {return;}
		if(e.getInventory() == null) {return;}
		if(e.getCurrentItem().getItemMeta() == null) {return;}
		
		if(e.getInventory().getName().equalsIgnoreCase("§cGroups")) {
			e.setCancelled(true);
			switch(e.getCurrentItem().getItemMeta().getDisplayName()) {
				case "§cOwner":
					Inventory inv = Bukkit.createInventory(null, 54, "§cOwner");
					for(String s : PermissionUtils.groupPlayer("Owner")) {
						ItemStack i = new ItemStack(Material.SKULL_ITEM,1,(short)3);
						SkullMeta im = (SkullMeta) i.getItemMeta();
						im.setOwner(s);
						im.setDisplayName("§cOwner " + s);
						i.setItemMeta(im);
						inv.addItem(i);
					}
					p.openInventory(inv);
				break;
				case "§3Developa":
					Inventory inv1 = Bukkit.createInventory(null, 54, "§3Developa");
					for(String s : PermissionUtils.groupPlayer("Dev")) {
						ItemStack i = new ItemStack(Material.SKULL_ITEM,1,(short)3);
						SkullMeta im = (SkullMeta) i.getItemMeta();
						im.setOwner(s);
						im.setDisplayName("§cOwner " + s);
						i.setItemMeta(im);
						inv1.addItem(i);
					}
					p.openInventory(inv1);
				break;
				case "§cAdmin":
					Inventory inv11 = Bukkit.createInventory(null, 54, "§cAdmin");
					for(String s : PermissionUtils.groupPlayer("Admin")) {
						ItemStack i = new ItemStack(Material.SKULL_ITEM,1,(short)3);
						SkullMeta im = (SkullMeta) i.getItemMeta();
						im.setOwner(s);
						im.setDisplayName("§cOwner " + s);
						i.setItemMeta(im);
						inv11.addItem(i);
					}
					p.openInventory(inv11);
				break;
				case "§eLeitung":
					Inventory inv111 = Bukkit.createInventory(null, 54, "§eLeitung");
					for(String s : PermissionUtils.groupPlayer("SrLeitung")) {
						ItemStack i = new ItemStack(Material.SKULL_ITEM,1,(short)3);
						SkullMeta im = (SkullMeta) i.getItemMeta();
						im.setOwner(s);
						im.setDisplayName("§cOwner " + s);
						i.setItemMeta(im);
						inv111.addItem(i);
					}
					p.openInventory(inv111);
				break;
				case "§bSrModerator":
					Inventory inv1111 = Bukkit.createInventory(null, 54, "§bSrModerator");
					for(String s : PermissionUtils.groupPlayer("SrModerator")) {
						ItemStack i = new ItemStack(Material.SKULL_ITEM,1,(short)3);
						SkullMeta im = (SkullMeta) i.getItemMeta();
						im.setOwner(s);
						im.setDisplayName("§cOwner " + s);
						i.setItemMeta(im);
						inv1111.addItem(i);
					}
					p.openInventory(inv1111);
				break;
				case "§aModerator":
					Inventory inv11111 = Bukkit.createInventory(null, 54, "§aModerator");
					for(String s : PermissionUtils.groupPlayer("Moderator")) {
						ItemStack i = new ItemStack(Material.SKULL_ITEM,1,(short)3);
						SkullMeta im = (SkullMeta) i.getItemMeta();
						im.setOwner(s);
						im.setDisplayName("§cOwner " + s);
						i.setItemMeta(im);
						inv11111.addItem(i);
					}
					p.openInventory(inv11111);
				break;
				case "§9SrSupporter":
					Inventory inv111111 = Bukkit.createInventory(null, 54, "§9SrSupporter");
					for(String s : PermissionUtils.groupPlayer("SrSupporter")) {
						ItemStack i = new ItemStack(Material.SKULL_ITEM,1,(short)3);
						SkullMeta im = (SkullMeta) i.getItemMeta();
						im.setOwner(s);
						im.setDisplayName("§cOwner " + s);
						i.setItemMeta(im);
						inv111111.addItem(i);
					}
					p.openInventory(inv111111);
				break;
				case "§9Supporter":
					Inventory inv1111111 = Bukkit.createInventory(null, 54, "§9Supporter");
					for(String s : PermissionUtils.groupPlayer("Supporter")) {
						ItemStack i = new ItemStack(Material.SKULL_ITEM,1,(short)3);
						SkullMeta im = (SkullMeta) i.getItemMeta();
						im.setOwner(s);
						im.setDisplayName("§cOwner " + s);
						i.setItemMeta(im);
						inv1111111.addItem(i);
					}
					p.openInventory(inv1111111);
				break;
				case "§6SrBuilder":
					Inventory inv11111111 = Bukkit.createInventory(null, 54, "§6SrBuilder");
					for(String s : PermissionUtils.groupPlayer("SrBuilder")) {
						ItemStack i = new ItemStack(Material.SKULL_ITEM,1,(short)3);
						SkullMeta im = (SkullMeta) i.getItemMeta();
						im.setOwner(s);
						im.setDisplayName("§cOwner " + s);
						i.setItemMeta(im);
						inv11111111.addItem(i);
					}
					p.openInventory(inv11111111);
			
				break;
				case "§5Builder":
					Inventory inv111111111 = Bukkit.createInventory(null, 54, "§5Builder");
					for(String s : PermissionUtils.groupPlayer("Builder")) {
						ItemStack i = new ItemStack(Material.SKULL_ITEM,1,(short)3);
						SkullMeta im = (SkullMeta) i.getItemMeta();
						im.setOwner(s);
						im.setDisplayName("§cOwner " + s);
						i.setItemMeta(im);
						inv111111111.addItem(i);
					}
					p.openInventory(inv111111111);
				break;
				}
			}else if(e.getInventory().getName().equalsIgnoreCase("§cOwner")||e.getInventory().getName().equalsIgnoreCase("§3Developa") || e.getInventory().getName().equalsIgnoreCase("§cAdmin")
					|| e.getInventory().getName().equalsIgnoreCase("§eLeitung") || e.getInventory().getName().equalsIgnoreCase("§bSrModerator") || e.getInventory().getName().equalsIgnoreCase("§aModerator")
					|| e.getInventory().getName().equalsIgnoreCase("§9SrSupporter") || e.getInventory().getName().equalsIgnoreCase("§9Supporter") || e.getInventory().getName().equalsIgnoreCase("§6SrBuilder")
					|| e.getInventory().getName().equalsIgnoreCase("§5Builder")) {
				e.setCancelled(true);
			}
		}
}
