package de.unknown.api;

import org.bukkit.Bukkit;

import de.unknown.main.main;

public class TimeLockAPI {

	static int i;
	private static main main;
	
	@SuppressWarnings("static-access")
	public TimeLockAPI(main main) {
		this.main = main;
	}
	public static void tick() {
		i = Bukkit.getScheduler().scheduleSyncRepeatingTask(main, new Runnable() {
			
			@SuppressWarnings("static-access")
			@Override
			public void run() {
				if(main.TimeLock) {
					Bukkit.getWorld(main.world).setFullTime(main.worldTime);
				}
			}
		}, 0L, 20*60);
	}
}
