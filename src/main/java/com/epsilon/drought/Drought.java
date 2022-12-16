package com.epsilon.drought;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.material.Material;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.InterModComms;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.event.lifecycle.InterModProcessEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.stream.Collectors;

// The value here should match an entry in the META-INF/mods.toml file
@Mod("drought")
public class Drought
{
    // Directly reference a log4j logger.
    private static final Logger LOGGER = LogManager.getLogger();

    public static final String MODID = "drought";


    public static DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MODID);

    public static DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MODID);

    public static RegistryObject<Block> OBSIDIAN_GLASS = BLOCKS.register("obsidian_glass", () -> new Block(AbstractBlock.Properties.of(Material.GLASS)));

    public static RegistryObject<BlockItem> OBSIDIAN_GLASS_ITEM = ITEMS.register("obsidian_glass", () -> new BlockItem(OBSIDIAN_GLASS.get(), new Item.Properties()));

    public static RegistryObject<ArmorItem> HEATPROOF_HELMET = ITEMS.register("heatproof_helmet", () -> new ArmorItem(ArmorMaterial.IRON, EquipmentSlotType.HEAD, (new Item.Properties()).tab(ItemGroup.TAB_COMBAT)));

    public static RegistryObject<ArmorItem> HEATPROOF_CHESTPLATE = ITEMS.register("heatproof_chestplate", () -> new ArmorItem(ArmorMaterial.IRON, EquipmentSlotType.HEAD, (new Item.Properties()).tab(ItemGroup.TAB_COMBAT)));

    public static RegistryObject<ArmorItem> HEATPROOF_LEGGINGS = ITEMS.register("heatproof_leggings", () -> new ArmorItem(ArmorMaterial.IRON, EquipmentSlotType.HEAD, (new Item.Properties()).tab(ItemGroup.TAB_COMBAT)));

    public static RegistryObject<ArmorItem> HEATPROOF_BOOTS = ITEMS.register("heatproof_boots", () -> new ArmorItem(ArmorMaterial.IRON, EquipmentSlotType.HEAD, (new Item.Properties()).tab(ItemGroup.TAB_COMBAT)));


    public Drought() {
        // Register the setup method for modloading
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        ITEMS.register(bus);
        BLOCKS.register(bus);
    }

}
