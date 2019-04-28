package me.savagecreeper28.main;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    public static String prefix = "§6[§eFly§6]§7 ";

    @Override
    public void onEnable() {

        // Register the onLoadCommands method.
        onLoadCommands();

        // Prints a line into the console.
        Bukkit.getLogger().info(this.prefix + "§aPlugin was enabled!");
    }

    @Override
    public void onDisable() {
        Bukkit.getLogger().info(this.prefix + "§cPlugin was disabled!");
    }

    // A method to load the commands.
    public void onLoadCommands(){

        // Register the fly command.
        this.getCommand("fly").setExecutor(this);

    }
}
