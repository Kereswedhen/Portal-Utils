package me.kereswedhen.portalutils.commands;

import com.mojang.brigadier.Command;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import io.papermc.paper.command.brigadier.CommandSourceStack;
import io.papermc.paper.command.brigadier.Commands;

public final class PortalsCommand {

    public static LiteralArgumentBuilder<CommandSourceStack> create() {
        return Commands.literal("portals")
                .then(Commands.literal("enable")
                        .executes(context -> {
                            context.getSource().getSender().sendMessage("Portals have been enabled!");
                            return Command.SINGLE_SUCCESS;
                        }))
                .then(Commands.literal("disable")
                        .executes(context -> {
                            context.getSource().getSender().sendMessage("Portals have been disabled!");
                            return Command.SINGLE_SUCCESS;
                        }));
    }
}

