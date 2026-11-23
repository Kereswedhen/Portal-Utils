package me.kereswedhen.portalutils.commands;

import com.mojang.brigadier.Command;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import io.papermc.paper.command.brigadier.CommandSourceStack;
import io.papermc.paper.command.brigadier.Commands;
import me.kereswedhen.portalutils.PortalSettings;
import net.kyori.adventure.key.Key;
import net.kyori.adventure.sound.Sound;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.title.Title;
import org.bukkit.Bukkit;

public final class PortalsCommand {

    public static LiteralArgumentBuilder<CommandSourceStack> create() {
        return Commands.literal("portals")
                .requires(source -> source.getSender().isOp())
                .executes(context -> {
                    context.getSource().getSender().sendRichMessage("<#993233><italic>Nether<reset> Enabled: " + PortalSettings.isNetherEnabled());
                    context.getSource().getSender().sendRichMessage("<#EEF5B4><italic>End<reset> Enabled: " + PortalSettings.isEndEnabled());
                    context.getSource().getSender().sendRichMessage("<red><bold>To disable/enable: <reset>/portals  <reset><green><italic>enable <reset>|<red><italic> disable <#EEF5B4><italic>end <reset>| <#723233><italic>nether<reset>");
                  return Command.SINGLE_SUCCESS;
                })
                .then(Commands.literal("enable")
                        .then(Commands.literal("end")
                            .executes(context -> {
                                if (!PortalSettings.isEndEnabled()) {
                                    PortalSettings.setEndEnabled(true);
                                    // Title logic :D
                                    final Component endPortalsEnabledTitle = Component.text("<gradient:#8F648F:#EEF5B4><BOLD>THE <bold>END");
                                    final Component endPortalsEnabledSubtitle = Component.text("<bold>Has been <reset><obf>||<reset> <green><bold>ENABLED!<reset><obf> ||");
                                    final Title endPortalsEnabled = Title.title(endPortalsEnabledTitle, endPortalsEnabledSubtitle);
                                    Bukkit.getServer().showTitle(endPortalsEnabled);
                                    Bukkit.getServer().playSound(Sound.sound(Key.key("block.end_portal.spawn"), Sound.Source.MASTER, 1F, 1F),  Sound.Emitter.self());
                                    // Feedback
                                    context.getSource().getSender().sendRichMessage("<#EEF5B4>End<reset> Portals <green>Enabled!<reset>");
                                } else if (PortalSettings.isEndEnabled()) {
                                    context.getSource().getSender().sendRichMessage("<#EEF5B4>End<reset> Portals are already <green>Enabled!<reset>");
                                }
                                return Command.SINGLE_SUCCESS;
                            }))
                        .then(Commands.literal("nether")
                            .executes(context -> {
                                if (!PortalSettings.isNetherEnabled()) {
                                    PortalSettings.setNetherEnabled(true);
                                    // Title logic :D
                                    final Component netherPortalsEnabledTitle = Component.text("<gradient:#B72D34:#3D1975><BOLD>THE <bold>NETHER");
                                    final Component netherPortalsEnabledSubtitle = Component.text("<bold>Has been <reset><obf>||<reset> <green><bold>ENABLED!<reset><obf> ||");
                                    final Title netherPortalsEnabled = Title.title(netherPortalsEnabledTitle, netherPortalsEnabledSubtitle);
                                    Bukkit.getServer().showTitle(netherPortalsEnabled);
                                    context.getSource().getSender().sendRichMessage("<#993233>Nether<reset> Portals <green>Enabled!<reset>");
                                } else if (PortalSettings.isNetherEnabled()) {
                                    context.getSource().getSender().sendRichMessage("<#993233>Nether<reset> Portals are already <green>Enabled!<reset>");
                                }
                                return Command.SINGLE_SUCCESS;
                            })))

                .then(Commands.literal("disable")
                        .then(Commands.literal("end")
                                .executes(context -> {
                                    if (PortalSettings.isEndEnabled()) {
                                        PortalSettings.setEndEnabled(false);
                                        context.getSource().getSender().sendRichMessage("<#EEF5B4>End<reset> Portals <red>Disabled!<reset>");
                                    } else if (!PortalSettings.isEndEnabled()) {
                                        context.getSource().getSender().sendRichMessage("<#EEF5B4>End<reset> Portals are already <red>Disabled!<reset>");
                                    }
                                    return Command.SINGLE_SUCCESS;
                                }))
                        .then(Commands.literal("nether")
                                .executes(context -> {
                                    if (PortalSettings.isNetherEnabled()) {
                                        PortalSettings.setNetherEnabled(false);
                                        context.getSource().getSender().sendRichMessage("<#993233>Nether<reset> Portals <red>Disabled!<reset>");
                                    } else if (!PortalSettings.isNetherEnabled()) {
                                        context.getSource().getSender().sendRichMessage("<#993233>Nether<reset> Portals are already <red>Disabled!<reset>");
                                    }
                                    return Command.SINGLE_SUCCESS;
                                }))
                );
    }
}
