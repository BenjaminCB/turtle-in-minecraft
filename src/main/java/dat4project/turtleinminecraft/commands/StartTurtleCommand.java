package dat4project.turtleinminecraft.commands;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;

import dat4project.turtleinminecraft.Timc;
import dat4project.turtleinminecraft.TurtleBlockEntity;
import dat4project.turtleinminecraft.TurtleCommandBlock;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.server.command.CommandManager;
import net.minecraft.server.command.ServerCommandSource;
import net.minecraft.text.LiteralText;

public class StartTurtleCommand {
    public static void register(CommandDispatcher<ServerCommandSource> dispatcher, boolean dedicated) {
        dispatcher.register(CommandManager.literal("Start")
            .then(CommandManager.literal("turtle")
            .executes(StartTurtleCommand::run)));
    }

    private static int run(CommandContext<ServerCommandSource> context) throws CommandSyntaxException {
        context.getSource().sendFeedback(new LiteralText("Starting Turtle"), true);
        return 1;
    }
}
