package me.prouser123.kodicore.send;

import org.bukkit.plugin.Plugin;

import me.prouser123.kodicore.Main;

public class Console {
	
	public static Plugin plugin = null; // Plugin instance
	private static String prefix; 
	
	public Console(Plugin plugin) {
		Console.plugin = plugin;
		Console.prefix = "[" + plugin.getName() + " " + Main.version + "] ";
	}
	
	// Log Info Message
	public static void info(String message) {
		Main.inst().getLogger().info(prefix + message);
	}
	
	// Log Warning Message
	public static void warning(String message) {
		Main.inst().getLogger().warning(prefix + message);
	}
	
	// Log Severe Message
	public static void severe(String message) {
		Main.inst().getLogger().severe(prefix + message);
	}
	
}