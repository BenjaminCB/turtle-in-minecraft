package dat4project.turtleinminecraft;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.fabricmc.fabric.api.screenhandler.v1.ScreenHandlerRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.item.Item;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.screen.ScreenHandlerContext;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.sound.BlockSoundGroup;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Timc implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger("timc");

	public static final Block GraphicsTurtleBlock = new TurtleBlock(FabricBlockSettings.of(Material.METAL).strength(5.0F, 6.0F).sounds(BlockSoundGroup.METAL));
	public static BlockEntityType<TurtleBlockEntity> GraphicsTurtleBlockEntity;

	//public static ScreenHandlerType<TurtleScreenHandler> GraphicsTurtleScreenHandler;
	public static final Item TurtleBook = new Item(new FabricItemSettings().group(ItemGroup.MISC));
	public static final Block GraphicsTurtleCommandBlock = new TurtleCommandBlock(FabricBlockSettings.of(Material.METAL).strength(5.0f, 6.0f).sounds(BlockSoundGroup.METAL));
	public static BlockEntityType<TurtleBlockEntity> TurtleCommandBlockEntity;

	public static ScreenHandlerType<ExampleGUI> SCREEN_HANDLER_TYPE = ScreenHandlerRegistry.registerSimple(TurtleCommandBlock.ID, (syncId, inventory) -> new ExampleGUI(syncId, inventory, ScreenHandlerContext.EMPTY));


	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		// Creates turtle block inside minecraft
		GraphicsTurtleBlockEntity = Registry.register(Registry.BLOCK_ENTITY_TYPE, "timc:graphics_turtle_block_entity", FabricBlockEntityTypeBuilder.create(TurtleBlockEntity::new, GraphicsTurtleBlock).build(null));
		//GraphicsTurtleScreenHandler = ScreenHandlerRegistry.registerSimple(new Identifier("timc", "turtle"), TurtleScreenHandler::new);
		Registry.register(Registry.BLOCK, new Identifier("timc", "graphics_turtle_block"), GraphicsTurtleBlock);
		Registry.register(Registry.ITEM, new Identifier("timc", "graphics_turtle_block"), new BlockItem(GraphicsTurtleBlock, new Item.Settings().group(ItemGroup.MISC)));
		
		// Creates turtle command block
		TurtleCommandBlockEntity = Registry.register(Registry.BLOCK_ENTITY_TYPE, "timc:turtle_command_block", FabricBlockEntityTypeBuilder.create(TurtleBlockEntity::new, GraphicsTurtleCommandBlock).build(null));
		Registry.register(Registry.BLOCK, new Identifier("timc", "command_turtle_block"), GraphicsTurtleCommandBlock);
		Registry.register(Registry.ITEM, new Identifier("timc", "command_turtle_block"), new BlockItem(GraphicsTurtleCommandBlock, new Item.Settings().group(ItemGroup.MISC)));

		Registry.register(Registry.ITEM, new Identifier("timc", "turtle_book"), TurtleBook);

		LOGGER.info("Hello Fabric world!");
	}
}