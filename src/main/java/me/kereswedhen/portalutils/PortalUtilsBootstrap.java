package me.kereswedhen.portalutils;

import io.papermc.paper.plugin.bootstrap.BootstrapContext;
import io.papermc.paper.plugin.bootstrap.PluginBootstrap;
import io.papermc.paper.plugin.lifecycle.event.types.LifecycleEvents;
import me.kereswedhen.portalutils.commands.PortalsCommand;

class PortalUtilsBootstrap implements PluginBootstrap {

    @Override
    public void bootstrap(final BootstrapContext context) {
        context.getLifecycleManager().registerEventHandler(LifecycleEvents.COMMANDS, event -> event.registrar().register(
                PortalsCommand.create().build(), "Enable or disable portals")
        );
        /*
        context.getLifecycleManager().registerEventHandler(LifecycleEvents.COMMANDS, event -> event.registrar().register(
                CommandClass.create().build(), "Description")
        );
        */
    }
}
