package me.kereswedhen.portalutils;

import org.bukkit.plugin.java.JavaPlugin;

public final class PortalUtils extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getLogger().info( this + " is enabled!");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
