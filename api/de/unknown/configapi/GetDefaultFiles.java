package de.unknown.configapi;

import java.io.File;

import de.unknown.api.FileHasMap;


public class GetDefaultFiles extends FileHasMap{
	
	
	public static void loadFiles() {
		File file = new File("plugins/Project_Lobby/MetaData","DE.yml");
		
		addFile("Spawn", file);
	}
}