package dat4project.turtleinminecraft;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.screenhandler.v1.ScreenRegistry;

public class TimcClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ScreenRegistry.register(Timc.GraphicsTurtleScreenHandler, TurtleScreen::new);
    }
}
