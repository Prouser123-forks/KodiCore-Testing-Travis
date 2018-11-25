package me.prouser123.kodicore;

import org.bukkit.plugin.java.JavaPlugin;

import me.prouser123.kodicore.send.Console;

public class Main extends JavaPlugin {

	// Instance
	private static Main instance;
	
    public static Main inst() {
    	  return instance;
    }
    
    public static String version;
    
    // On Enable
	@Override
	public void onEnable() {
		version = getDescription().getVersion();
		new Console(this);
		Console.info("Welcome to KodiCore! Initializing...");
	}
}