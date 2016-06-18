package Listener;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class StaffChatListener extends JavaPlugin{
	
	@Override
	public void onEnable(){
		getConfig().options().copyDefaults(true);
		saveDefaultConfig(); 
	}

    public static void Chat(CommandSender sender, String message) {
        String name = sender.getName();

        for (Player player : Bukkit.getOnlinePlayers()) {
            if (player.hasPermission("lc.o.see")) {
                player.sendMessage(ChatColor.RED + "[" + ChatColor.WHITE + "Staff Chat" + ChatColor.RED + "] " + ChatColor.WHITE + name + ": " + ChatColor.RED + message);
            }
        }
    }
}