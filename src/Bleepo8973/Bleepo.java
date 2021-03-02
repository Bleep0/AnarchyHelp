package Bleepo8973;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class Bleepo extends JavaPlugin {
    @Override
    public void onEnable() {
        getLogger().info("AnarchyHelp by Bleepo has been loaded and enabled!");
        getConfig().options().copyDefaults();
        saveDefaultConfig();
    }


    @Override
    public void onDisable() {
        getLogger().info("AnarchyHelp by Bleepo has been unloaded and disabled!");
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (command.getName().equals("help")) {
            if (sender instanceof Player) {
                Player player = (Player) sender;
                for (String line : getConfig().getStringList("help")) {
                    player.sendMessage(ChatColor.translateAlternateColorCodes('&', line));
                }

            } else {
                System.out.println("The console cant have help...");
            }
        }
        return true;
    }
}
