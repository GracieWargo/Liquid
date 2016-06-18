package Commands;

import net.pravian.aero.command.CommandOptions;
import net.pravian.aero.command.SimpleCommand;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;

import Project.Utils;

@CommandOptions(aliases = "lc")
public class Command_perms extends SimpleCommand<Utils> {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

    	
    	if (args.length == 0) {
            sender.sendMessage(ChatColor.DARK_AQUA + "Server is running " + ChatColor.AQUA + "Liquid Craft " + ChatColor.DARK_AQUA + "v1.0 by " + ChatColor.AQUA + "dsate1" + ChatColor.DARK_AQUA + "\nCommands: " + ChatColor.AQUA + "/lc help");
            return true;
    	}
    	if (args[0].equals("help")) {
    		sender.sendMessage(ChatColor.DARK_AQUA + "" + ChatColor.BOLD + "----- Liquid Craft Commands -----");
    		sender.sendMessage(ChatColor.AQUA + "/staff");
    		sender.sendMessage(ChatColor.AQUA + "/smite <player> [reason]");
    		sender.sendMessage(ChatColor.AQUA + "/premium <player>");
    		sender.sendMessage(ChatColor.AQUA + "/ignite <player>");
    		sender.sendMessage(ChatColor.AQUA + "/o <message>");
    		sender.sendMessage(ChatColor.AQUA + " ");
    		sender.sendMessage(ChatColor.YELLOW + "" + ChatColor.BOLD + "NEWS " + ChatColor.GRAY + "There is still plently of commands to be added!");
    		
    }
		return false;
}
}