package dat4project.turtleinminecraft.TurtleInterpreter;

import net.minecraft.block.Block;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class BlockVal extends TimcVal {
    private Block block;

    public BlockVal(String blockString) {
        super(TimcType.BLOCK);
        block = Registry.BLOCK.get(new Identifier(blockString));
    }

    public BlockVal(Block block) {
        super(TimcType.BLOCK);
        this.block = block;
    }

    @Override
    protected boolean timcValEquals(TimcVal o) {
        // TODO: compare blockvals
        return false;
    }
}
