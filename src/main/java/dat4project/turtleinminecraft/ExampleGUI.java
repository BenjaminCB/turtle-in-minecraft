package dat4project.turtleinminecraft;

import io.github.cottonmc.cotton.gui.SyncedGuiDescription;
import io.github.cottonmc.cotton.gui.widget.WButton;
import io.github.cottonmc.cotton.gui.widget.WGridPanel;
import io.github.cottonmc.cotton.gui.widget.WItemSlot;
import io.github.cottonmc.cotton.gui.widget.data.Insets;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.screen.ScreenHandlerContext;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.text.LiteralText;
import net.minecraft.util.Util;
import net.minecraft.util.math.BlockPos;


public class ExampleGUI extends SyncedGuiDescription {
    private static final int INV_SIZE = 1;

    public ExampleGUI(int syncId, PlayerInventory playerInventory, ScreenHandlerContext ctx) {
        super(Timc.SCREEN_HANDLER_TYPE, syncId, playerInventory, getBlockInventory(ctx, INV_SIZE), getBlockPropertyDelegate(ctx));
    
        WGridPanel root = new WGridPanel();
        setRootPanel(root);
        root.setSize(150, 150); // Create Gui size
        root.setInsets(Insets.ROOT_PANEL);

        WItemSlot itemSlot = WItemSlot.of(blockInventory, 0);
        root.add(itemSlot, 2, 1);
        root.add(this.createPlayerInventoryPanel(), 0, 3);
        root.validate(this);

        // button
        WButton button = new WButton(new LiteralText("Start turtle"));
        button.setOnClick(() -> {
            //player.sendMessage(new LiteralText("Starting Turtle"));
            System.out.println("Button clicked at " );
        });
        root.add(button, 4, 1, 5, 7);
    
    }
}
