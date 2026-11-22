package me.kereswedhen.portalutils.commands;

import com.mojang.brigadier.Command;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.tree.LiteralCommandNode;
import io.papermc.paper.command.brigadier.CommandSourceStack;
import io.papermc.paper.command.brigadier.Commands;

public class PortalsCommand {

    LiteralArgumentBuilder<CommandSourceStack> command = Commands.literal("portals")
           .then(Commands.literal("enable")
                   .executes(context -> {
                       context.getSource().getSender().sendMessage("<rainbow> Portals have been enabled!");

                       return Command.SINGLE_SUCCESS;
                   }))
           .then(Commands.literal("disable")
                   .executes(context -> {
                       context.getSource().getSender().sendMessage("<rainbow> Portals have been disabled!");

                       return Command.SINGLE_SUCCESS;
                   }));
}

