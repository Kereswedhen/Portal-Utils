package me.kereswedhen.portalutils;

import me.kereswedhen.portalutils.listeners.PortalListener;
import org.bukkit.plugin.java.JavaPlugin;

public final class PortalUtils extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new PortalListener(), this);
        getLogger().info(this + " is enabled!");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
