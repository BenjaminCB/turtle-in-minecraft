package dat4project.turtleinminecraft.TurtleInterpreter;

import dat4project.turtleinminecraft.TurtleInterpreter.Excepton.UndefinedReferenceException;
import dat4project.turtleinminecraft.antlr.timcLexer;
import dat4project.turtleinminecraft.antlr.timcParser;
import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CommonToken;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CodePointCharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.UnbufferedCharStream;

import java.util.UUID;

public class TimcInterpreter {
    public final String prog;
    public final timcLexer lexer;
    public final timcParser parser;
    public final ExecutionVisitor executer;
    public final timcParser.StatementsContext tree;

    public TimcInterpreter(String prog) {
        this.prog = prog;

        // could not recognize without the whole thing
        CharStream stream = org.antlr.v4.runtime.CharStreams.fromString(prog);

        lexer = new timcLexer(stream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        parser = new timcParser(tokens);
        executer = new ExecutionVisitor();
        tree = parser.statements();
    }

    public void execute() {
        // TODO catch exceptions
        executer.visit(tree);
    }

}
