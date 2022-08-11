package com.stevenpaw.moretosee.init;
import com.stevenpaw.moretosee.MoreToSee;
import com.stevenpaw.moretosee.block.*;
import com.stevenpaw.moretosee.ModCreativeModeTab;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DoorBlock;
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

    //BigScreen--
    public static final RegistryObject<Block> BIG_SCREEN_1 = registerBlock("big_screen/big_screen1",
            () -> new BigScreen(BlockBehaviour.Properties.of(Material.METAL).noOcclusion().strength(4f)), ModCreativeModeTab.MORETOSEE_TAB);
    public static final RegistryObject<Block> BIG_SCREEN_2 = registerBlock("big_screen/big_screen2",
            () -> new BigScreen(BlockBehaviour.Properties.of(Material.METAL).noOcclusion().strength(4f)), ModCreativeModeTab.MORETOSEE_TAB);
    public static final RegistryObject<Block> BIG_SCREEN_3 = registerBlock("big_screen/big_screen3",
            () -> new BigScreen(BlockBehaviour.Properties.of(Material.METAL).noOcclusion().strength(4f)), ModCreativeModeTab.MORETOSEE_TAB);
    public static final RegistryObject<Block> BIG_SCREEN_4 = registerBlock("big_screen/big_screen4",
            () -> new BigScreen(BlockBehaviour.Properties.of(Material.METAL).noOcclusion().strength(4f)), ModCreativeModeTab.MORETOSEE_TAB);
    public static final RegistryObject<Block> BIG_SCREEN_5 = registerBlock("big_screen/big_screen5",
            () -> new BigScreen(BlockBehaviour.Properties.of(Material.METAL).noOcclusion().strength(4f)), ModCreativeModeTab.MORETOSEE_TAB);
    public static final RegistryObject<Block> BIG_SCREEN_6 = registerBlock("big_screen/big_screen6",
            () -> new BigScreen(BlockBehaviour.Properties.of(Material.METAL).noOcclusion().strength(4f)), ModCreativeModeTab.MORETOSEE_TAB);
    public static final RegistryObject<Block> BIG_SCREEN_7 = registerBlock("big_screen/big_screen7",
            () -> new BigScreen(BlockBehaviour.Properties.of(Material.METAL).noOcclusion().strength(4f)), ModCreativeModeTab.MORETOSEE_TAB);
    public static final RegistryObject<Block> BIG_SCREEN_8 = registerBlock("big_screen/big_screen8",
            () -> new BigScreen(BlockBehaviour.Properties.of(Material.METAL).noOcclusion().strength(4f)), ModCreativeModeTab.MORETOSEE_TAB);
    public static final RegistryObject<Block> BIG_SCREEN_9 = registerBlock("big_screen/big_screen9",
            () -> new BigScreen(BlockBehaviour.Properties.of(Material.METAL).noOcclusion().strength(4f)), ModCreativeModeTab.MORETOSEE_TAB);
    public static final RegistryObject<Block> BIG_SCREEN_10 = registerBlock("big_screen/big_screen10",
            () -> new BigScreen(BlockBehaviour.Properties.of(Material.METAL).noOcclusion().strength(4f)), ModCreativeModeTab.MORETOSEE_TAB);

    //Doors--
    public static final RegistryObject<Block> AWESOME_DOOR = registerBlock("doors/awesome_door",
            () -> new DoorBlock(BlockBehaviour.Properties.of(Material.METAL).noOcclusion().strength(4f)), ModCreativeModeTab.MORETOSEE_TAB);
    public static final RegistryObject<Block> CHAIN_DOOR = registerBlock("doors/chain_door",
            () -> new DoorBlock(BlockBehaviour.Properties.of(Material.METAL).noOcclusion().strength(4f)), ModCreativeModeTab.MORETOSEE_TAB);
    public static final RegistryObject<Block> CHURCH_DOOR = registerBlock("doors/church_door",
            () -> new DoorBlock(BlockBehaviour.Properties.of(Material.METAL).noOcclusion().strength(4f)), ModCreativeModeTab.MORETOSEE_TAB);
    public static final RegistryObject<Block> CLASSICAL_DOOR = registerBlock("doors/classical_door",
            () -> new DoorBlock(BlockBehaviour.Properties.of(Material.METAL).noOcclusion().strength(4f)), ModCreativeModeTab.MORETOSEE_TAB);
    public static final RegistryObject<Block> MODERN_DOOR = registerBlock("doors/modern_door",
            () -> new DoorBlock(BlockBehaviour.Properties.of(Material.METAL).noOcclusion().strength(4f)), ModCreativeModeTab.MORETOSEE_TAB);
    public static final RegistryObject<Block> MODERN_GLASS_DOOR = registerBlock("doors/modern_glass_door",
            () -> new DoorBlock(BlockBehaviour.Properties.of(Material.METAL).noOcclusion().strength(4f)), ModCreativeModeTab.MORETOSEE_TAB);
    public static final RegistryObject<Block> SPOOKY_DOOR = registerBlock("doors/spooky_door",
            () -> new DoorBlock(BlockBehaviour.Properties.of(Material.METAL).noOcclusion().strength(4f)), ModCreativeModeTab.MORETOSEE_TAB);

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

    //Pillars
    public static final RegistryObject<Block> QUARTZ_PILLAR = registerBlock("pillars/quartz_pillar",
            () -> new PillarBlock(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().strength(6f)), ModCreativeModeTab.MORETOSEE_TAB);
    public static final RegistryObject<Block> STONE_PILLAR = registerBlock("pillars/stone_pillar",
            () -> new PillarBlock(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().strength(6f)), ModCreativeModeTab.MORETOSEE_TAB);
    public static final RegistryObject<Block> BLACK_CONCRETE_PILLAR = registerBlock("pillars/black_concrete_pillar",
            () -> new PillarBlock(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().strength(6f)), ModCreativeModeTab.MORETOSEE_TAB);
    public static final RegistryObject<Block> BLUE_CONCRETE_PILLAR = registerBlock("pillars/blue_concrete_pillar",
            () -> new PillarBlock(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().strength(6f)), ModCreativeModeTab.MORETOSEE_TAB);
    public static final RegistryObject<Block> BROWN_CONCRETE_PILLAR = registerBlock("pillars/brown_concrete_pillar",
            () -> new PillarBlock(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().strength(6f)), ModCreativeModeTab.MORETOSEE_TAB);
    public static final RegistryObject<Block> CYAN_CONCRETE_PILLAR = registerBlock("pillars/cyan_concrete_pillar",
            () -> new PillarBlock(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().strength(6f)), ModCreativeModeTab.MORETOSEE_TAB);
    public static final RegistryObject<Block> GRAY_CONCRETE_PILLAR = registerBlock("pillars/gray_concrete_pillar",
            () -> new PillarBlock(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().strength(6f)), ModCreativeModeTab.MORETOSEE_TAB);
    public static final RegistryObject<Block> GREEN_CONCRETE_PILLAR = registerBlock("pillars/green_concrete_pillar",
            () -> new PillarBlock(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().strength(6f)), ModCreativeModeTab.MORETOSEE_TAB);
    public static final RegistryObject<Block> LIGHT_BLUE_CONCRETE_PILLAR = registerBlock("pillars/light_blue_concrete_pillar",
            () -> new PillarBlock(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().strength(6f)), ModCreativeModeTab.MORETOSEE_TAB);
    public static final RegistryObject<Block> LIGHT_GRAY_CONCRETE_PILLAR = registerBlock("pillars/light_gray_concrete_pillar",
            () -> new PillarBlock(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().strength(6f)), ModCreativeModeTab.MORETOSEE_TAB);
    public static final RegistryObject<Block> LIME_CONCRETE_PILLAR = registerBlock("pillars/lime_concrete_pillar",
            () -> new PillarBlock(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().strength(6f)), ModCreativeModeTab.MORETOSEE_TAB);
    public static final RegistryObject<Block> MAGENTA_CONCRETE_PILLAR = registerBlock("pillars/magenta_concrete_pillar",
            () -> new PillarBlock(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().strength(6f)), ModCreativeModeTab.MORETOSEE_TAB);
    public static final RegistryObject<Block> ORANGE_CONCRETE_PILLAR = registerBlock("pillars/orange_concrete_pillar",
            () -> new PillarBlock(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().strength(6f)), ModCreativeModeTab.MORETOSEE_TAB);
    public static final RegistryObject<Block> PINK_CONCRETE_PILLAR = registerBlock("pillars/pink_concrete_pillar",
            () -> new PillarBlock(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().strength(6f)), ModCreativeModeTab.MORETOSEE_TAB);
    public static final RegistryObject<Block> PURPLE_CONCRETE_PILLAR = registerBlock("pillars/purple_concrete_pillar",
            () -> new PillarBlock(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().strength(6f)), ModCreativeModeTab.MORETOSEE_TAB);
    public static final RegistryObject<Block> RED_CONCRETE_PILLAR = registerBlock("pillars/red_concrete_pillar",
            () -> new PillarBlock(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().strength(6f)), ModCreativeModeTab.MORETOSEE_TAB);
    public static final RegistryObject<Block> WHITE_CONCRETE_PILLAR = registerBlock("pillars/white_concrete_pillar",
            () -> new PillarBlock(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().strength(6f)), ModCreativeModeTab.MORETOSEE_TAB);
    public static final RegistryObject<Block> YELLOW_CONCRETE_PILLAR = registerBlock("pillars/yellow_concrete_pillar",
            () -> new PillarBlock(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().strength(6f)), ModCreativeModeTab.MORETOSEE_TAB);
    public static final RegistryObject<Block> NETHERRACK_PILLAR = registerBlock("pillars/netherrack_pillar",
            () -> new PillarBlock(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().strength(6f)), ModCreativeModeTab.MORETOSEE_TAB);
    public static final RegistryObject<Block> OAK_PLANKS_PILLAR = registerBlock("pillars/oak_planks_pillar",
            () -> new PillarBlock(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().strength(6f)), ModCreativeModeTab.MORETOSEE_TAB);
    public static final RegistryObject<Block> DARK_OAK_PLANKS_PILLAR = registerBlock("pillars/dark_oak_planks_pillar",
            () -> new PillarBlock(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().strength(6f)), ModCreativeModeTab.MORETOSEE_TAB);
    public static final RegistryObject<Block> ACACIA_PLANKS_PILLAR = registerBlock("pillars/acacia_planks_pillar",
            () -> new PillarBlock(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().strength(6f)), ModCreativeModeTab.MORETOSEE_TAB);
    public static final RegistryObject<Block> BIRCH_PLANKS_PILLAR = registerBlock("pillars/birch_planks_pillar",
            () -> new PillarBlock(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().strength(6f)), ModCreativeModeTab.MORETOSEE_TAB);
    public static final RegistryObject<Block> CRIMSON_PLANKS_PILLAR = registerBlock("pillars/crimson_planks_pillar",
            () -> new PillarBlock(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().strength(6f)), ModCreativeModeTab.MORETOSEE_TAB);
    public static final RegistryObject<Block> JUNGLE_PLANKS_PILLAR = registerBlock("pillars/jungle_planks_pillar",
            () -> new PillarBlock(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().strength(6f)), ModCreativeModeTab.MORETOSEE_TAB);
    public static final RegistryObject<Block> SPRUCE_PLANKS_PILLAR = registerBlock("pillars/spruce_planks_pillar",
            () -> new PillarBlock(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().strength(6f)), ModCreativeModeTab.MORETOSEE_TAB);
    public static final RegistryObject<Block> WARPED_PLANKS_PILLAR = registerBlock("pillars/warped_planks_pillar",
            () -> new PillarBlock(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().strength(6f)), ModCreativeModeTab.MORETOSEE_TAB);
    public static final RegistryObject<Block> COBBLESTONE_PILLAR = registerBlock("pillars/cobblestone_pillar",
            () -> new PillarBlock(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().strength(6f)), ModCreativeModeTab.MORETOSEE_TAB);
    public static final RegistryObject<Block> STONE_BRICKS_PILLAR = registerBlock("pillars/stone_bricks_pillar",
            () -> new PillarBlock(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().strength(6f)), ModCreativeModeTab.MORETOSEE_TAB);
    public static final RegistryObject<Block> ANDESITE_PILLAR = registerBlock("pillars/andesite_pillar",
            () -> new PillarBlock(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().strength(6f)), ModCreativeModeTab.MORETOSEE_TAB);
    public static final RegistryObject<Block> DIORITE_PILLAR = registerBlock("pillars/diorite_pillar",
            () -> new PillarBlock(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().strength(6f)), ModCreativeModeTab.MORETOSEE_TAB);
    public static final RegistryObject<Block> GRANITE_PILLAR = registerBlock("pillars/granite_pillar",
            () -> new PillarBlock(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().strength(6f)), ModCreativeModeTab.MORETOSEE_TAB);
    public static final RegistryObject<Block> POLISHED_ANDESITE_PILLAR = registerBlock("pillars/polished_andesite_pillar",
            () -> new PillarBlock(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().strength(6f)), ModCreativeModeTab.MORETOSEE_TAB);
    public static final RegistryObject<Block> POLISHED_DIORITE_PILLAR = registerBlock("pillars/polished_diorite_pillar",
            () -> new PillarBlock(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().strength(6f)), ModCreativeModeTab.MORETOSEE_TAB);
    public static final RegistryObject<Block> POLISHED_GRANITE_PILLAR = registerBlock("pillars/polished_granite_pillar",
            () -> new PillarBlock(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().strength(6f)), ModCreativeModeTab.MORETOSEE_TAB);
    public static final RegistryObject<Block> GLASS_PILLAR = registerBlock("pillars/glass_pillar",
            () -> new PillarBlock(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().strength(6f)), ModCreativeModeTab.MORETOSEE_TAB);
    public static final RegistryObject<Block> SANDSTONE_PILLAR = registerBlock("pillars/sandstone_pillar",
            () -> new PillarBlock(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().strength(6f)), ModCreativeModeTab.MORETOSEE_TAB);
    public static final RegistryObject<Block> REDSTONE_BLOCK_PILLAR = registerBlock("pillars/redstone_block_pillar",
            () -> new PillarBlock(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().strength(6f)), ModCreativeModeTab.MORETOSEE_TAB);
    public static final RegistryObject<Block> IRON_BLOCK_PILLAR = registerBlock("pillars/iron_block_pillar",
            () -> new PillarBlock(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().strength(6f)), ModCreativeModeTab.MORETOSEE_TAB);
    public static final RegistryObject<Block> EMERALD_BLOCK_PILLAR = registerBlock("pillars/emerald_block_pillar",
            () -> new PillarBlock(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().strength(6f)), ModCreativeModeTab.MORETOSEE_TAB);
    public static final RegistryObject<Block> DIAMOND_BLOCK_PILLAR = registerBlock("pillars/diamond_block_pillar",
            () -> new PillarBlock(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().strength(6f)), ModCreativeModeTab.MORETOSEE_TAB);
    public static final RegistryObject<Block> GOLD_BLOCK_PILLAR = registerBlock("pillars/gold_block_pillar",
            () -> new PillarBlock(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().strength(6f)), ModCreativeModeTab.MORETOSEE_TAB);

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
