package me.savagecreeper28.commands;

import me.savagecreeper28.main.Main;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Fly implements CommandExecutor {

    // A method to create the fly command.
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

        // Checks if the command is "fly".
        if(cmd.getName().equalsIgnoreCase("fly")){

            // Defines the player.
            Player player = (Player)sender;

            // Checks if the sender is the player. If not, send a message to the sender.
            if(sender instanceof Player){

                // Checks if the player has the permission to execute the command. If not, send a error message to the player.
                if(player.hasPermission("system.fly.execute")){

                    // Checks if the player has already fly enabled. If not, do it with a else statement.
                    if(player.getAllowFlight()){

                        // Set the flying off and send a message to the player.
                        player.setAllowFlight(false);
                        player.sendMessage(Main.prefix + "§cYou can no longer fly!");

                    }else{

                        // Set the flying on and send a message to the player.
                        player.setAllowFlight(true);
                        player.sendMessage(Main.prefix + "§aYou can now fly.");

                    }

                }else{
                    // Send a error to the Player
                    player.sendMessage(Main.prefix + "§cYou have not the permissions to execute this command.");
                }

            }else{
                // Send the sender a message.
                sender.sendMessage(Main.prefix + "§cYou must be a player to execute this command.");
            }
        }
        return true;
    }
}
