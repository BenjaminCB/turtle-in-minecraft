package dat4project.turtleinminecraft;

import dat4project.turtleinminecraft.TurtleInterpreter.AbsDirVal.AbsDir;
import dat4project.turtleinminecraft.TurtleInterpreter.RelDirVal.RelDir;
import net.minecraft.util.math.Direction;

public class TimcUtil {

    /**
     * Converts an ANTLR relative direction to a absolute minecraft direction
     * @param dir The base direction related by @param relDir
     * @param relDir The relative direction of @param dir
     * @return Absolute minecraft direction
     */
    public static Direction relDirToMcDir(Direction dir, RelDir relDir) {
        return switch (relDir) {
            case UP     -> Direction.UP;
            case DOWN   -> Direction.DOWN;
            case LEFT   -> dir.rotateYCounterclockwise();
            case RIGHT  -> dir.rotateYClockwise();
            case FRONT  -> dir;
            case BACK   -> dir.getOpposite();
        };
    }

    /**
     * Converts an ANTLR absolute direction to a absolute minecraft direction
     * @param absDir Absolute direction to convert
     * @return Absolute minecraft direction
     */
    public static Direction absDirToMcDir(AbsDir absDir){
        return switch (absDir){
            case EAST   -> Direction.EAST;
            case WEST   -> Direction.WEST;
            case NORTH  -> Direction.NORTH;
            case SOUTH  -> Direction.SOUTH;
        };
    }
    
}
