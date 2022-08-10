package com.stevenpaw.moretosee.init;
import com.stevenpaw.moretosee.MoreToSee;
import com.stevenpaw.moretosee.block.CashRegister;
import com.stevenpaw.moretosee.block.Flag;
import com.stevenpaw.moretosee.ModCreativeModeTab;
import com.stevenpaw.moretosee.block.GraphicTablet;
import com.stevenpaw.moretosee.block.PCSetup;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, MoreToSee.MOD_ID);

    public static final RegistryObject<Block> BLACK_CONCRETE_PILLAR = registerBlock("black_concrete_pillar",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(9f)), ModCreativeModeTab.MORETOSEE_TAB);

    //Large Planks--
    public static final RegistryObject<Block> LARGE_ACACIA_PLANKS = registerBlock("large_planks/large_acacia_planks",
            () -> new Block(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2f)), ModCreativeModeTab.MORETOSEE_TAB);
    public static final RegistryObject<Block> LARGE_BIRCH_PLANKS = registerBlock("large_planks/large_birch_planks",
            () -> new Block(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2f)), ModCreativeModeTab.MORETOSEE_TAB);
    public static final RegistryObject<Block> LARGE_CRIMSON_PLANKS = registerBlock("large_planks/large_crimson_planks",
            () -> new Block(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2f)), ModCreativeModeTab.MORETOSEE_TAB);
    public static final RegistryObject<Block> LARGE_DARK_OAK_PLANKS = registerBlock("large_planks/large_dark_oak_planks",
            () -> new Block(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2f)), ModCreativeModeTab.MORETOSEE_TAB);
    public static final RegistryObject<Block> LARGE_JUNGLE_PLANKS = registerBlock("large_planks/large_jungle_planks",
            () -> new Block(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2f)), ModCreativeModeTab.MORETOSEE_TAB);
    public static final RegistryObject<Block> LARGE_OAK_PLANKS = registerBlock("large_planks/large_oak_planks",
            () -> new Block(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2f)), ModCreativeModeTab.MORETOSEE_TAB);
    public static final RegistryObject<Block> LARGE_SPRUCE_PLANKS = registerBlock("large_planks/large_spruce_planks",
            () -> new Block(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2f)), ModCreativeModeTab.MORETOSEE_TAB);
    public static final RegistryObject<Block> LARGE_WARPED_PLANKS = registerBlock("large_planks/large_warped_planks",
            () -> new Block(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2f)), ModCreativeModeTab.MORETOSEE_TAB);

    //Steel--
    public static final RegistryObject<Block> STEEL_BLOCK = registerBlock("steel/steel_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(10f)), ModCreativeModeTab.MORETOSEE_TAB);
    public static final RegistryObject<Block> STEEL_CASING = registerBlock("steel/steel_casing",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(10f)), ModCreativeModeTab.MORETOSEE_TAB);
    public static final RegistryObject<Block> STEEL_SLAB = registerBlock("steel/steel_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(10f)), ModCreativeModeTab.MORETOSEE_TAB);

    //Decoration Blocks--
    public static final RegistryObject<Block> CASH_REGISTER = registerBlock("cash_register",
            () -> new CashRegister(BlockBehaviour.Properties.of(Material.METAL).noOcclusion().strength(4f)), ModCreativeModeTab.MORETOSEE_TAB);
    public static final RegistryObject<Block> GRAPHIC_TABLET = registerBlock("graphic_tablet",
            () -> new GraphicTablet(BlockBehaviour.Properties.of(Material.METAL).noOcclusion().strength(2f)), ModCreativeModeTab.MORETOSEE_TAB);
    public static final RegistryObject<Block> PC_SETUP = registerBlock("pc_setup",
            () -> new PCSetup(BlockBehaviour.Properties.of(Material.METAL).noOcclusion().strength(5f)), ModCreativeModeTab.MORETOSEE_TAB);

    //FLAGS--
    public static final RegistryObject<Block> BI_FLAG = registerBlock("flags/bi_flag",
            () -> new Flag(BlockBehaviour.Properties.of(Material.WOOD).noOcclusion().strength(2f)), ModCreativeModeTab.MORETOSEE_TAB);
    public static final RegistryObject<Block> CHINA_FLAG = registerBlock("flags/china_flag",
            () -> new Flag(BlockBehaviour.Properties.of(Material.WOOD).noOcclusion().strength(2f)), ModCreativeModeTab.MORETOSEE_TAB);
    public static final RegistryObject<Block> CROATIA_FLAG = registerBlock("flags/croatia_flag",
            () -> new Flag(BlockBehaviour.Properties.of(Material.WOOD).noOcclusion().strength(2f)), ModCreativeModeTab.MORETOSEE_TAB);
    public static final RegistryObject<Block> DRUGAR_FLAG = registerBlock("flags/drugar_flag",
            () -> new Flag(BlockBehaviour.Properties.of(Material.WOOD).noOcclusion().strength(2f)), ModCreativeModeTab.MORETOSEE_TAB);
    public static final RegistryObject<Block> ENGLAND_FLAG = registerBlock("flags/england_flag",
            () -> new Flag(BlockBehaviour.Properties.of(Material.WOOD).noOcclusion().strength(2f)), ModCreativeModeTab.MORETOSEE_TAB);
    public static final RegistryObject<Block> GAY_FLAG = registerBlock("flags/gay_flag",
            () -> new Flag(BlockBehaviour.Properties.of(Material.WOOD).noOcclusion().strength(2f)), ModCreativeModeTab.MORETOSEE_TAB);
    public static final RegistryObject<Block> GERMAN_FLAG = registerBlock("flags/german_flag",
            () -> new Flag(BlockBehaviour.Properties.of(Material.WOOD).noOcclusion().strength(2f)), ModCreativeModeTab.MORETOSEE_TAB);
    public static final RegistryObject<Block> JAPAN_FLAG = registerBlock("flags/japan_flag",
            () -> new Flag(BlockBehaviour.Properties.of(Material.WOOD).noOcclusion().strength(2f)), ModCreativeModeTab.MORETOSEE_TAB);
    public static final RegistryObject<Block> PAN_FLAG = registerBlock("flags/pan_flag",
            () -> new Flag(BlockBehaviour.Properties.of(Material.WOOD).noOcclusion().strength(2f)), ModCreativeModeTab.MORETOSEE_TAB);
    public static final RegistryObject<Block> RUSSIA_FLAG = registerBlock("flags/russia_flag",
            () -> new Flag(BlockBehaviour.Properties.of(Material.WOOD).noOcclusion().strength(2f)), ModCreativeModeTab.MORETOSEE_TAB);
    public static final RegistryObject<Block> SWEDEN_FLAG = registerBlock("flags/sweden_flag",
            () -> new Flag(BlockBehaviour.Properties.of(Material.WOOD).noOcclusion().strength(2f)), ModCreativeModeTab.MORETOSEE_TAB);
    public static final RegistryObject<Block> USA_FLAG = registerBlock("flags/usa_flag",
            () -> new Flag(BlockBehaviour.Properties.of(Material.WOOD).noOcclusion().strength(2f)), ModCreativeModeTab.MORETOSEE_TAB);

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(tab)));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
