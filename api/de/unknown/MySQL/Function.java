package de.unknown.MySQL;

import java.sql.ResultSet;
import java.sql.SQLException;
import de.unknown.main.main;


public class Function {
	
	public static boolean playExists(String UUID) {
		try {
			ResultSet rs = main.mysql.query("SELECT * FROM User WHERE UUID= '" + UUID +"'");
			if(rs.next()) {
				return rs.getString("UUID") !=null;
			}
			return false;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	
	public static void createPlayer(String UUID, String Name) {
		if(!playExists(UUID)) {
			//mysql.update("CREATE TABLE IF NOT EXISTS Team(UUID varchar(100), rang varchar(100), Server varchar(100),Vanisch varchar(7), Chat varchar(7));");
			main.mysql.update("INSERT INTO User(UUID,Name,Rang) VALUES ('" + UUID +"','"+Name+"','Dev');");
		}
	}
	
	public static String getGroup(String UUID) {
		String Lau = null;
		if(playExists(UUID)) {
			try {
				ResultSet rs = main.mysql.query("SELECT * FROM User WHERE UUID= '" + UUID +"'");
				if((!rs.next()) || (String.valueOf(rs.getString("Rang")) == null));
				Lau = rs.getString("Rang");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else {
			
		}
		return Lau;
	}
	
}
