package me.kereswedhen.portalutils.listeners;

import me.kereswedhen.portalutils.PortalSettings;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.CrafterCraftEvent;
import org.bukkit.event.inventory.CraftItemEvent;
import org.bukkit.event.world.PortalCreateEvent;

public class PortalListener implements Listener {
    @EventHandler
    public void onPortalCreate(PortalCreateEvent event) {
        switch (event.getReason()) {
            case FIRE, NETHER_PAIR -> {
                if (!PortalSettings.isNetherEnabled()) {
                    event.setCancelled(true);
                }
            }
        }
    }
    @EventHandler
    public void onCrafterCraftEvent(CrafterCraftEvent event) {
            if(event.getRecipe().getResult().getType() == Material.ENDER_EYE) {
                if (!PortalSettings.isEndEnabled()) {
                    event.setCancelled(true);
                }
        }
    }
    @EventHandler
    public void onCraftEvent(CraftItemEvent event) {
        if (event.getRecipe().getResult().getType() == Material.ENDER_EYE) {
            if (!PortalSettings.isEndEnabled()) {
                event.setCancelled(true);
            }
        }
    }
}
