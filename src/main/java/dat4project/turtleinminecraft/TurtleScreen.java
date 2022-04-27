package dat4project.turtleinminecraft;

import io.github.cottonmc.cotton.gui.client.CottonInventoryScreen;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.text.Text;

/*
public class TurtleScreen extends HandledScreen<TurtleScreenHandler> {
    private static final Identifier texture =
            new Identifier("timc", "textures/turtle_gui.png");

    public TurtleScreen(TurtleScreenHandler handler, PlayerInventory inventory, Text title) {
        super(handler, inventory, title);
    }

    @Override
    protected void drawBackground(MatrixStack matrices, float delta, int mouseX, int mouseY) {
        RenderSystem.setShader(GameRenderer::getPositionTexShader);
        RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
        RenderSystem.setShaderTexture(0, texture);
        int x = (width - backgroundWidth) / 2;
        int y = (height - backgroundHeight) / 2;
        drawTexture(matrices, x, y, 0, 0, backgroundWidth, backgroundHeight);
    }

    @Override
    public void render(MatrixStack matrices, int mouseX, int mouseY, float delta) {
        renderBackground(matrices);
        super.render(matrices, mouseX, mouseY, delta);
        drawMouseoverTooltip(matrices, mouseX, mouseY);
    }
}*/

// cotton GUI
public class TurtleScreen extends CottonInventoryScreen<ExampleGUI> {
    public TurtleScreen(ExampleGUI gui, PlayerEntity player, Text title) {
        super(gui, player, title);
    }
}
