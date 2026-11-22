package me.kereswedhen.portalutils;

import io.papermc.paper.plugin.lifecycle.event.types.LifecycleEvents;
import org.bukkit.plugin.java.JavaPlugin;

public final class PortalUtils extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getLogger().info(this + " is enabled!");
        // Register Commands
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
