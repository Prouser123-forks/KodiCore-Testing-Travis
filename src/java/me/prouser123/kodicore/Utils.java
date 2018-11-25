package me.prouser123.kodicore;

import java.util.Collection;

import org.bukkit.World;
import org.bukkit.configuration.file.FileConfiguration;

import me.prouser123.kodicore.Main;
import me.prouser123.kodicore.send.Console;

public class Utils {
	
	public static class Player {
		
		// Return online players (List of usernames)
		public static Collection<? extends org.bukkit.entity.Player> getOnlinePlayersByNames() {
			return Main.inst().getServer().getOnlinePlayers();
		}
		
		// Return online players (amount of players as an int)
		public static int getOnlinePlayersByAmount() {
			return Main.inst().getServer().getOnlinePlayers().size();
		}
	}
	
	
	public static class Broadcast {
		
		// Broadcast to permission (message, permission node)
		public static int toPermission(String message, String permission) {
			return Main.inst().getServer().broadcast(message, permission);
		}
		
		// Broadcast to server (message)
		public static int global (String message) {
			return Main.inst().getServer().broadcastMessage(message);
		}
	}
	
	
	public static class Config {
		
		// Get String
		public static void getString(String destination, String path, FileConfiguration getConfig, String pluginName) {
			destination = getConfig.getString(path);
			// Log to console
			Console.info("[" + pluginName + "] [getConfig] Loading: " + path);
		}
		
		// Get Int
		public static void getInt(int destination, String path, FileConfiguration getConfig, String pluginName) {
			destination = getConfig.getInt(path);
			// Log to console
			Console.info("[" + pluginName + "] [getConfig] Loading: " + path);
		}
	}
	
	
	// Get World (by name)
	public static World getWorld(String world){
		return Main.inst().getServer().getWorld(world);
	}
}