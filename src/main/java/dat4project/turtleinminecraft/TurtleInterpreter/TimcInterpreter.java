package dat4project.turtleinminecraft.TurtleInterpreter;

import dat4project.turtleinminecraft.TurtleCommandBlock;
import dat4project.turtleinminecraft.TurtleCommandBlockEntity;
import dat4project.turtleinminecraft.TurtleInterpreter.Exception.TimcException;
import dat4project.turtleinminecraft.antlr.timcLexer;
import dat4project.turtleinminecraft.antlr.timcParser;
import net.minecraft.client.MinecraftClient;
import net.minecraft.network.MessageType;
import net.minecraft.text.LiteralText;
import net.minecraft.util.Util;
import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CommonToken;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CodePointCharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.UnbufferedCharStream;
import net.minecraft.world.World;

import java.util.UUID;

public class TimcInterpreter {
    public final String prog;
    public final timcLexer lexer;
    public final timcParser parser;
    public final ExecutionVisitor executer;
    public final timcParser.StatementsContext tree;
    private final TurtleCommandBlockEntity tcbEntity;

    public TimcInterpreter(String prog, TurtleCommandBlockEntity tcbEntity) {
        this.prog = prog;

        // could not recognize without the whole thing
        CharStream stream = org.antlr.v4.runtime.CharStreams.fromString(prog);

        lexer = new timcLexer(stream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        parser = new timcParser(tokens);

        this.tcbEntity = tcbEntity;

        executer = new ExecutionVisitor(tcbEntity);
        tree = parser.statements();

    }

    public void execute() {
        try {
            executer.visit(tree);
        } catch (TimcException e) {
            MinecraftClient.getInstance().inGameHud.addChatMessage(
                    MessageType.CHAT,
                    new LiteralText(e.getMessage()),
                    Util.NIL_UUID
            );
        }
    }

}
