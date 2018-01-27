package de.unknown.api;

import java.io.File;
import java.util.HashMap;

public class FileHasMap {
	public static HashMap<String, File>getFiles = new HashMap<>();
	
	public static void addFile(String s, File file){getFiles.put(s, file);}
	
	public void addNewFile(String s, File fiel) {}
	
	public void removeFile(String s) {getFiles.remove(s);}
	
	public static File getFile(String s){return getFiles.get(s);}
	
	public void clearFiles() {getFiles.clear();}
}
