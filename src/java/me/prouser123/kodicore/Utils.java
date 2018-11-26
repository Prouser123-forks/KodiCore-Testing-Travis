package me.prouser123.kodicore;

import java.util.Arrays;
import java.util.Collection;

import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

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
		public static String getString(String path, FileConfiguration getConfig, String pluginName) {
			// Store String
			String destination = getConfig.getString(path);

			// Log to console
			Console.info("[" + pluginName + "] [getConfig] Loading: " + path + " = " + destination);
			
			// Return String
			return destination;
		}
		
		// Get Int
		public static int getInt(String path, FileConfiguration getConfig, String pluginName) {
			// Store Int
			int destination = getConfig.getInt(path);

			// Log to console
			Console.info("[" + pluginName + "] [getConfig] Loading: " + path + " = " + destination);
			
			// Return Int
			return destination;
		}
	}
	
	
	// Get World (by name)
	public static World getWorld(String world){
		return Main.inst().getServer().getWorld(world);
	}
	
	// Add item to inventory (using arguments)
		public static void addInventoryItem(Inventory inv, Material material, String displayName, String lore, int position) {
			// Create the ItemStack
			ItemStack stack = new ItemStack(material);

			// Get the item's meta
			ItemMeta meta = stack.getItemMeta();

			// Set the display name
			meta.setDisplayName(displayName);

			// Set the lore
			meta.setLore(Arrays.asList(lore));

			// Set the meta
			stack.setItemMeta(meta);
					
			// Add the item to the inventory
			inv.setItem(position, stack);
		}
}