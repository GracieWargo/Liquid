package Commands;


import net.pravian.aero.command.CommandOptions;
import net.pravian.aero.command.SimpleCommand;
import org.apache.commons.lang.StringUtils;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;

import Listener.StaffChatListener;
import Project.Utils;

@CommandOptions(permission = "lc.sc", aliases = "sc")
public class Command_o extends SimpleCommand<Utils> {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

        if (args.length == 0) {
            sender.sendMessage(ChatColor.RED + "Please provide a message!");
            return true;
        }

        if (!sender.hasPermission("lc.o")) {
            sender.sendMessage("Referances.NO_PERMS");
            return true;
        }

        StaffChatListener.Chat(sender, StringUtils.join(args, " "));
        return true;
    }
}