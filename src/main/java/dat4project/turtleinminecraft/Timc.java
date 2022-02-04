package dat4project.turtleinminecraft;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.Item;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
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

	public static final Item GraphicsTurtleItem = new Item(new Item.Settings().group(ItemGroup.MISC));

	public static final Block GraphicsTurtleBlock = new Block(FabricBlockSettings.of(Material.METAL)
																				 .strength(5.0F, 6.0F)
																				 .sounds(BlockSoundGroup.METAL)
			                                                                     .breakByTool(FabricToolTags.PICKAXES));

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		Registry.register(Registry.ITEM, new Identifier("timc", "graphics_turtle_item"), GraphicsTurtleItem);
		Registry.register(Registry.BLOCK, new Identifier("timc", "graphics_turtle_block"), GraphicsTurtleBlock);
		Registry.register(Registry.ITEM, new Identifier("timc", "graphics_turtle_block"), new BlockItem(GraphicsTurtleBlock, new Item.Settings().group(ItemGroup.MISC)));

		LOGGER.info("Hello Fabric world!");
	}
}