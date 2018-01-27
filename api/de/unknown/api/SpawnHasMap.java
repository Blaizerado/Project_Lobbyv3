package de.unknown.api;

import java.util.HashMap;

import org.bukkit.Location;

public class SpawnHasMap extends FileHasMap{
	public static HashMap<String, Location>serverLocation = new HashMap<>();
	
	public static void addLocation(String s, Location loc) {serverLocation.put(s, loc);}
	
	public void removeLocation(String s) {serverLocation.remove(s);}
	
	public Location getLocation(String s) {return serverLocation.get(s);}
	
	public Boolean isLocationCreate(String s) {if(serverLocation.containsKey(s)) {return true;}return false;}
}
