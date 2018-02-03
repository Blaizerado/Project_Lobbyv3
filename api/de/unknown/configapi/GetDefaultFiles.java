package de.unknown.configapi;

import java.io.File;

import de.unknown.api.FileHasMap;


public class GetDefaultFiles extends FileHasMap{
	
	
	public static void loadFiles() {
		File file = new File("plugins/Project_Lobby/MetaData","Spawndata.yml");
		File invs = new File("plugins/Project_Lobby/MetaData","Inventory.yml");
		
		File Owner = new File("plugins/Project_Lobby/Permission","Owner.yml");
		File Admin = new File("plugins/Project_Lobby/Permission","Admin.yml");
		File SrLeiter = new File("plugins/Project_Lobby/Permission","SrLeiter.yml");
		File SrModerator = new File("plugins/Project_Lobby/Permission","SrModerator.yml");
		File Moderator = new File("plugins/Project_Lobby/Permission","Moderator.yml");
		File SrSupporter = new File("plugins/Project_Lobby/Permission","SrSupporter.yml");
		File Support = new File("plugins/Project_Lobby/Permission","Support.yml");
		File SrBuilder= new File("plugins/Project_Lobby/Permission","SrBuilder.yml");
		File Builder = new File("plugins/Project_Lobby/Permission","Builder.yml");
		File Developa = new File("plugins/Project_Lobby/Permission","Developa.yml");
		File Spieler = new File("plugins/Project_Lobby/Permission","Spieler.yml");
		
		addFile("Owner", Owner);
		addFile("Admin", Admin);
		addFile("SrLeitung", SrLeiter);
		addFile("SrModerator", SrModerator);
		addFile("Moderator", Moderator);
		addFile("SrSupporter", SrSupporter);
		addFile("Supporter", Support);
		addFile("SrBuilder", SrBuilder);
		addFile("Builder", Builder);
		addFile("Dev", Developa);
		addFile("Spieler", Spieler);
		
		addFile("inv", invs);
		addFile("Spawn", file);
	}
}
