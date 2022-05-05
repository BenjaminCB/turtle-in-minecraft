package dat4project.turtleinminecraft.TurtleInterpreter;

import dat4project.turtleinminecraft.Timc;
import dat4project.turtleinminecraft.TurtleCommandBlockEntity;
import dat4project.turtleinminecraft.TurtleInterpreter.Exception.TimcException;
import dat4project.turtleinminecraft.antlr.timcLexer;
import dat4project.turtleinminecraft.antlr.timcParser;
import dat4project.turtleinminecraft.antlr.timcParser.StatementsContext;

import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

public class TimcInterpreter implements Runnable {
    private final String prog;
    private final TurtleCommandBlockEntity tcbEntity;
    private final ExecutionVisitor visitor;

    public TimcInterpreter(String prog, TurtleCommandBlockEntity tcbEntity) {
        this.tcbEntity = tcbEntity;
        this.prog = prog;
        this.visitor = new ExecutionVisitor(tcbEntity);
    }
    
    @Override
    public void run() {
        try {
            CharStream stream = CharStreams.fromString(prog);
            timcLexer lexer = new timcLexer(stream);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            Timc.LOGGER.info("LEXER DONE");
            timcParser parser = new timcParser(tokens);
            StatementsContext tree = parser.statements();
            Timc.LOGGER.info("PARSER DONE");
            visitor.visit(tree);
        } catch (TimcException e) {
            tcbEntity.print(e.getMessage());
        }
    }

}
