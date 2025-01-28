package me.naulbimix.fCMIEInjector;

import com.Zrips.Economy_CMI;
import net.milkbowl.vault.economy.Economy;
import org.bukkit.plugin.ServicePriority;
import org.bukkit.plugin.java.JavaPlugin;

public class Bootstrap extends JavaPlugin {

    @Override
    public void onEnable() {
        try {
            Economy econ = new Economy_CMI(); // trash talk
            getServer().getServicesManager().register(Economy.class, econ, this, ServicePriority.Normal);
            getLogger().info("§fЭкономика §e" + econ.getName() + " §fнаходится в статусе: " + (econ.isEnabled() ? "§2загружена" : "§eв ожидании"));
        }catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
