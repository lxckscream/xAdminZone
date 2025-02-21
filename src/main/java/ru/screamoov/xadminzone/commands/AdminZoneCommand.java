package ru.screamoov.xadminzone.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import static ru.screamoov.xadminzone.utils.Hex.color;

public class AdminZoneCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if (strings.length==0) {
            commandSender.sendMessage(color(""));
        }
        return true;
    }
}
