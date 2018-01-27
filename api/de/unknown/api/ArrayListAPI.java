package de.unknown.api;

import java.util.ArrayList;

import org.bukkit.entity.Player;

public class ArrayListAPI extends SetSpawn{
	ArrayList<Player>getLobbyPlayer= new ArrayList<>();
	
	public void addPlayer(Player p) {getLobbyPlayer.add(p);}
	
	public void removePlayer(Player p) {getLobbyPlayer.remove(p);}
	
	public void clearLobbyPlayer(Player p) {getLobbyPlayer.clear();}
	
	public Boolean isPlayerInLobby(Player p) {if(getLobbyPlayer.contains(p)) {return true;}return false;}
	
	public ArrayList<Player>getPlayer(){return getLobbyPlayer;}
}
