package me.prouser123.kodicore;

import java.util.Collection;

import org.bukkit.World;

import me.prouser123.kodicore.Main;

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
	
	
	// Get World (by name)
	public static World getWorld(String world){
		return Main.inst().getServer().getWorld(world);
	}
}