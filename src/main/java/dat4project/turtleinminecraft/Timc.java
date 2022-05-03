package dat4project.turtleinminecraft;

import net.fabricmc.api.ModInitializer;
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
import net.minecraft.util.registry.Registry;

public class Timc implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger("timc");

	public static final Block GraphicsTurtleBlock = new TurtleBlock(FabricBlockSettings.of(Material.METAL).strength(5.0F, 6.0F).sounds(BlockSoundGroup.METAL));

	public static final Block GraphicsTurtleCommandBlock = new TurtleCommandBlock(FabricBlockSettings.of(Material.METAL).strength(5.0f, 6.0f).sounds(BlockSoundGroup.METAL));
	public static BlockEntityType<TurtleCommandBlockEntity> TurtleCommandBlockEntity;	

	public static ScreenHandlerType<TurtleCommandBlockGUI> SCREEN_HANDLER_TYPE = ScreenHandlerRegistry.registerSimple(TurtleCommandBlock.ID, (syncId, inventory) -> new TurtleCommandBlockGUI(syncId, inventory, ScreenHandlerContext.EMPTY));


	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		// Register the Turtle Block and Item
		Registry.register(Registry.BLOCK, TurtleBlock.ID, GraphicsTurtleBlock);
		Registry.register(Registry.ITEM, TurtleBlock.ID, new BlockItem(GraphicsTurtleBlock, new Item.Settings().group(ItemGroup.MISC)));
		
		// Register the Turtle Command Block, Entity and Item
		TurtleCommandBlockEntity = Registry.register(Registry.BLOCK_ENTITY_TYPE, "timc:turtle_command_block", FabricBlockEntityTypeBuilder.create(TurtleCommandBlockEntity::new, GraphicsTurtleCommandBlock).build(null));
		Registry.register(Registry.BLOCK, TurtleCommandBlock.ID, GraphicsTurtleCommandBlock);
		Registry.register(Registry.ITEM, TurtleCommandBlock.ID, new BlockItem(GraphicsTurtleCommandBlock, new Item.Settings().group(ItemGroup.MISC)));

		LOGGER.info("Hello Fabric world!");
	}
}