package dat4project.turtleinminecraft.TurtleInterpreter;

import net.minecraft.block.Block;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class BlockVal extends TimcVal {
    private Block block;

    public BlockVal(String blockString) {
        super(TimcType.BLOCK);
        // If no block exists with ID, get returns a default value (Blocks.AIR)
        block = Registry.BLOCK.get(new Identifier(blockString));
    }

    @Override
    protected boolean timcValEquals(TimcVal o) {
        // TODO: compare blockvals
        return false;
    }
}
