package Commands;

import net.pravian.aero.command.CommandOptions;
import net.pravian.aero.command.SimpleCommand;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;

import Project.Utils;

@CommandOptions(aliases = "")
public class Command_staff extends SimpleCommand<Utils> {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

        if (args.length == 0) {
            sender.sendMessage(ChatColor.AQUA + " Owner: dsate1 \n Co-Owner: \n Admin: \n Admin: \n Moderator: \n Moderator: \n Moderator: \n Developer: \n Developer: \n Developer:");
            return true;
        }
		return false;
    }
}