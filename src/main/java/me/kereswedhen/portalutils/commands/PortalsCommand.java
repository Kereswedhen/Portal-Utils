package me.kereswedhen.portalutils.commands;

import com.mojang.brigadier.Command;
import com.mojang.brigadier.arguments.BoolArgumentType;
import com.mojang.brigadier.tree.LiteralCommandNode;
import io.papermc.paper.command.brigadier.CommandSourceStack;
import io.papermc.paper.command.brigadier.Commands;
import org.bukkit.command.CommandSender;

public class PortalsCommand {

    public static LiteralCommandNode<CommandSourceStack> createCommand(final String commandName) {
        return Commands.literal(commandName)
                .then(Commands.argument("disable", BoolArgumentType.bool())
                        .executes(context -> {
                            final BoolArgumentType bool = context.getArgument("disable", BoolArgumentType.class);
                            final CommandSender sender = context.getSource().getSender();;

                            sender.sendRichMessage("<rainbow:!>Portals are now " + bool);

                            return Command.SINGLE_SUCCESS;
                        }))
                .build();
    }

}
