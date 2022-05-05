package dat4project.turtleinminecraft.TurtleInterpreter.Exception;

public class TimcException extends RuntimeException {
    public TimcException(String msg) {
        super("\n" + msg + "\n");
    }
}
