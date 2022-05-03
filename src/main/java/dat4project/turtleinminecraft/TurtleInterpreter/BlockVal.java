package dat4project.turtleinminecraft.TurtleInterpreter;

import net.minecraft.block.Block;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class BlockVal extends TimcVal {
    private Block val;

    public BlockVal(String blockString) {
        super(TimcType.BLOCK);
        // If no block exists with ID, get returns a default value (Blocks.AIR)
        val = Registry.BLOCK.get(new Identifier(blockString));
    }

    public BlockVal(Block val) {
        super(TimcType.BLOCK);
        this.val = val;
    }

    public Block getVal() {
        return val;
    }

    @Override
    protected boolean timcValEquals(TimcVal o) {
        // TODO: compare blockvals
        return false;
    }
}
