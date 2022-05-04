package dat4project.turtleinminecraft.TurtleInterpreter;

import dat4project.turtleinminecraft.TurtleCommandBlockEntity;
import dat4project.turtleinminecraft.TurtleInterpreter.Exception.TimcException;
import dat4project.turtleinminecraft.antlr.timcLexer;
import dat4project.turtleinminecraft.antlr.timcParser;
import dat4project.turtleinminecraft.antlr.timcParser.StatementsContext;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;

public class TimcInterpreter {
    public final String prog;
    public final timcLexer lexer;
    public final timcParser parser;
    public final ExecutionVisitor executor;
    public final StatementsContext tree;
    private final TurtleCommandBlockEntity tcbEntity;

    public TimcInterpreter(String prog, TurtleCommandBlockEntity tcbEntity) {
        this.prog = prog;
        this.tcbEntity = tcbEntity;
        executor = new ExecutionVisitor(tcbEntity);

        // could not recognize without the whole thing
        CharStream stream = org.antlr.v4.runtime.CharStreams.fromString(prog);
        lexer = new timcLexer(stream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        parser = new timcParser(tokens);
        tree = parser.statements();
    }

    public void execute() {
        try {
            executor.visit(tree);
        } catch (TimcException e) {
            tcbEntity.print(e.getMessage());
        }
    }

}
