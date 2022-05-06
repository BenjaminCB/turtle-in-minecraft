package dat4project.turtleinminecraft.TurtleInterpreter;

import dat4project.turtleinminecraft.TurtleCommandBlockEntity;
import dat4project.turtleinminecraft.TurtleInterpreter.Exception.TimcException;
import dat4project.turtleinminecraft.antlr.timcLexer;
import dat4project.turtleinminecraft.antlr.timcParser;
import dat4project.turtleinminecraft.antlr.timcParser.StatementsContext;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;

public class TimcInterpreter implements Runnable {
    private final StatementsContext tree;
    private final ExecutionVisitor executor;
    private final TurtleCommandBlockEntity tcbEntity;

    public TimcInterpreter(String prog, TurtleCommandBlockEntity tcbEntity) {
        this.tcbEntity = tcbEntity;
        executor = new ExecutionVisitor(tcbEntity);

        // could not recognize without the whole thing
        CharStream stream = org.antlr.v4.runtime.CharStreams.fromString(prog);
        timcLexer lexer = new timcLexer(stream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        timcParser parser = new timcParser(tokens);
        tree = parser.statements();
    }

    @Override
    public void run() {
        try {
            executor.visit(tree);
        } catch (TimcException e) {
            tcbEntity.print(e.getMessage());
        }
    }

}
