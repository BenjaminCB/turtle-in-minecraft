package dat4project.turtleinminecraft.TurtleInterpreter;

import dat4project.turtleinminecraft.TurtleCommandBlockEntity;
import dat4project.turtleinminecraft.TurtleInterpreter.Exception.TimcException;
import dat4project.turtleinminecraft.antlr.timcLexer;
import dat4project.turtleinminecraft.antlr.timcParser;
import dat4project.turtleinminecraft.antlr.timcParser.StatementsContext;
import org.antlr.v4.runtime.ANTLRErrorListener;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStreamRewriter;

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
            ANTLRErrorListener listener = new TimcErrorListener();
            CharStream stream = CharStreams.fromString(prog);
            timcLexer lexer = new timcLexer(stream);
            lexer.removeErrorListeners();
            lexer.addErrorListener(listener);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            timcParser parser = new timcParser(tokens);
            parser.removeErrorListeners();
            parser.addErrorListener(listener);
            StatementsContext tree = parser.statements();

            if(lexer.errors.isEmpty()) {
                visitor.visit(tree);
            }
            else {
                tcbEntity.print("Parser failed due to " + lexer.errors.size() + " syntax errors!");
                for (String string : lexer.errors) {
                    tcbEntity.print(string);
                }
            }

        } catch (TimcException e) {
            tcbEntity.print(e.getMessage());
        }
    }

}
