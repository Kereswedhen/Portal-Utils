package me.kereswedhen.portalutils.commands;

import com.mojang.brigadier.Command;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import io.papermc.paper.command.brigadier.CommandSourceStack;
import io.papermc.paper.command.brigadier.Commands;
import me.kereswedhen.portalutils.PortalSettings;

public final class PortalsCommand {

    public static LiteralArgumentBuilder<CommandSourceStack> create() {
        return Commands.literal("portals")
                .executes(context -> {
                    context.getSource().getSender().sendRichMessage("<red><bold>incorrect Usage: <reset>/portals <#EEF5B4><italic>end <reset>| <#723233><italic>nether <reset><green><italic>enable <reset>|<red><italic> disable");
                  return Command.SINGLE_SUCCESS;
                })
                .then(Commands.literal("enable")
                        .then(Commands.literal("end")
                            .executes(context -> {
                                if (!PortalSettings.isEndEnabled()) {
                                    PortalSettings.setEndEnabled(true);
                                    context.getSource().getSender().sendRichMessage("<#EEF5B4>End<reset> Portals <green>Enabled!<reset>!");
                                } else if (PortalSettings.isEndEnabled()) {
                                    context.getSource().getSender().sendRichMessage("<#EEF5B4>End<reset> Portals are already <green>Enabled!<reset>!");
                                }
                                return Command.SINGLE_SUCCESS;
                            }))
                        .then(Commands.literal("nether")
                            .executes(context -> {
                                if (!PortalSettings.isNetherEnabled()) {
                                    PortalSettings.setNetherEnabled(true);
                                    context.getSource().getSender().sendRichMessage("<#723233>Nether<reset> Portals <green>Enabled<reset>!");
                                } else if (PortalSettings.isNetherEnabled()) {
                                    context.getSource().getSender().sendRichMessage("<#723233>Nether<reset> Portals are already <green>Enabled<reset>!");
                                }
                                return Command.SINGLE_SUCCESS;
                            })))

                .then(Commands.literal("disable")
                        .then(Commands.literal("end")
                                .executes(context -> {
                                    if (PortalSettings.isEndEnabled()) {
                                        PortalSettings.setEndEnabled(false);
                                        context.getSource().getSender().sendRichMessage("<#EEF5B4>End<reset> Portals <red>Disabled<reset>!");
                                    } else if (!PortalSettings.isEndEnabled()) {
                                        context.getSource().getSender().sendRichMessage("<#EEF5B4>End<reset> Portals are already <red>Disabled<reset>!");
                                    }
                                    return Command.SINGLE_SUCCESS;
                                }))
                        .then(Commands.literal("nether")
                                .executes(context -> {
                                    if (PortalSettings.isNetherEnabled()) {
                                        PortalSettings.setNetherEnabled(false);
                                        context.getSource().getSender().sendRichMessage("<#723233>Nether<reset> Portals <red>Disabled<reset>!");
                                    } else if (PortalSettings.isNetherEnabled()) {
                                        context.getSource().getSender().sendRichMessage("<#723233>Nether<reset> Portals are already <red>Disabled<reset>!");
                                    }
                                    return Command.SINGLE_SUCCESS;
                                }))
                );
    }
}
