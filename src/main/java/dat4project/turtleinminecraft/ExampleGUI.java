package dat4project.turtleinminecraft;

import io.github.cottonmc.cotton.gui.SyncedGuiDescription;
import io.github.cottonmc.cotton.gui.widget.WGridPanel;
import io.github.cottonmc.cotton.gui.widget.WItemSlot;
import io.github.cottonmc.cotton.gui.widget.data.Insets;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.screen.ScreenHandlerContext;


public class ExampleGUI extends SyncedGuiDescription {
    private static final int INV_SIZE = 1;

    public ExampleGUI(int syncId, PlayerInventory playerInventory, ScreenHandlerContext ctx) {
        super(Timc.SCREEN_HANDLER_TYPE, syncId, playerInventory, getBlockInventory(ctx, INV_SIZE), getBlockPropertyDelegate(ctx));
    
        WGridPanel root = new WGridPanel();
        setRootPanel(root);
        root.setSize(150, 150); // Create Gui size
        root.setInsets(Insets.ROOT_PANEL);

        WItemSlot itemSlot = WItemSlot.of(blockInventory, 0);
        root.add(itemSlot, 4, 1);
        root.add(this.createPlayerInventoryPanel(), 0, 3);
        root.validate(this);
    
    }
}
