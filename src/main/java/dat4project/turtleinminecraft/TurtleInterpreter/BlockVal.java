package dat4project.turtleinminecraft.TurtleInterpreter;

import net.minecraft.block.Block;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class BlockVal extends TimcVal {
    private Block val;

    public BlockVal(String blockString) {
        super(TimcType.BLOCK);
        val = Registry.BLOCK.get(new Identifier(blockString));
    }

    public BlockVal(Block block) {
        super(TimcType.BLOCK);
        val = block;
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
