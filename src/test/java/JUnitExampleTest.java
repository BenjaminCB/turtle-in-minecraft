import dat4project.turtleinminecraft.TurtleBlock;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.registry.Registry;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import dat4project.turtleinminecraft.TurtleCommandBlockEntity;
import dat4project.turtleinminecraft.TurtleInterpreter.TimcInterpreter;
import dat4project.turtleinminecraft.TurtleInterpreter.SymbolTable;

class JUnit5ExampleTest {
    @Test
    void justAnExample() {
        System.out.println("This test method should be run");
    }

    @Test
    void testFail() {
        assertEquals(1,0);
    }

    @Test
    void testForward() {
        BlockPos oldPos = new BlockPos(100, 100, 100);
        TurtleCommandBlockEntity tcbe = new TurtleCommandBlockEntity(
                oldPos,
                Registry.BLOCK.get(TurtleBlock.ID).getDefaultState()
        );

        TimcInterpreter interpreter = new TimcInterpreter("forward()", tcbe);
        interpreter.run();

        assertEquals(oldPos, tcbe.position());
    }
}