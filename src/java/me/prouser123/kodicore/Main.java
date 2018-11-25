package me.prouser123.kodicore;

import org.bukkit.plugin.java.JavaPlugin;

import me.prouser123.kodicore.send.Console;

public class Main extends JavaPlugin {

	// Instancing
	private static Main instance;
	
    public static Main inst() {
    	  return instance;
    }
    
    public static String version;
    
    // On Enable
	@Override
	public void onEnable() {
		// Instancing
		instance = this;
		// Get version
		version = getDescription().getVersion();
		// Create a instance of Console
		new Console(this);
		// Send a message
		Console.info("Welcome to KodiCore! Initializing...");
	}
}