package Listener;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import Project.Utils;

public class PlayerJoinMessage implements Listener {
	
	public PlayerJoinMessage(Utils plugin) {
		plugin.getServer().getPluginManager().registerEvents(this, plugin);
	}
	
	@EventHandler
	public void onPlayerJoin(PlayerJoinEvent e) {
		
		Player player = e.getPlayer();
		
		if (player.getName().equals("MrLiquid")) {
			Bukkit.broadcastMessage(ChatColor.YELLOW + "MrLiquid joined the game! ;)");
			Bukkit.broadcastMessage(ChatColor.YELLOW + "MrLiquid is the " + ChatColor.LIGHT_PURPLE + "Server Owner");
		}
		else if (player.hasPermission("lc.mod")) {
			Bukkit.broadcastMessage(ChatColor.YELLOW + "" + player.getName() + " joined the game!");
			Bukkit.broadcastMessage(ChatColor.YELLOW + "" + player.getName() + " is a " + ChatColor.RED + "Moderator");
		}
		else if (player.hasPermission("lc.admin")) {
			Bukkit.broadcastMessage(ChatColor.YELLOW + "" + player.getName() + " joined the game!");
			Bukkit.broadcastMessage(ChatColor.YELLOW + "" + player.getName() + " is a " + ChatColor.BLUE + "Admin");

		
		} else {
			e.setJoinMessage(ChatColor.AQUA + "Welcome, " + player.getName() + ", to the server!");
		}
		
	}

}
