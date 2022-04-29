package dat4project.turtleinminecraft.TurtleInterpreter.Exception;

public class TimcException extends RuntimeException {
    public final int start;
    public final int end;
    public TimcException(String msg, int start, int end) {
        super(msg);
        this.start = start;
        this.end = end;
    }

    public TimcException(String msg, int line) {
        this(msg, line, line);
    }
}
