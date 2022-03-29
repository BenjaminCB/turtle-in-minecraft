import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class Test {
    public static void main(String[] args) throws Exception {
        ANTLRInputStream input = new ANTLRInputStream(System.in);
        timcLexer lexer = new timcLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        timcParser parser = new timcParser(tokens);
        ParseTree tree = parser.statements();
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(new CountIf(), tree);
    }
}
