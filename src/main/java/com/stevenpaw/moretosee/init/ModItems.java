package com.stevenpaw.moretosee.init;

import com.stevenpaw.moretosee.MoreToSee;
import com.stevenpaw.moretosee.ModCreativeModeTab;
import com.stevenpaw.moretosee.item.Alcoholdrink;
import com.stevenpaw.moretosee.item.Softdrink;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    //Create DeferredRegister
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MoreToSee.MOD_ID);

    //Registering
    public static final RegistryObject<Item> MORETOSEE_EYE = ITEMS.register("moretosee_eye",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MORETOSEE_TAB)));

    //Registering
    public static final RegistryObject<Item> MINEDUDLER = ITEMS.register("drinks/minedudler",
            () -> new Softdrink(new Item.Properties().tab(ModCreativeModeTab.MORETOSEE_TAB), 2));
    public static final RegistryObject<Item> CREEPERCOLA = ITEMS.register("drinks/creepercola",
            () -> new Softdrink(new Item.Properties().tab(ModCreativeModeTab.MORETOSEE_TAB), 3));
    public static final RegistryObject<Item> LEMONSMITE = ITEMS.register("drinks/lemonsmite",
            () -> new Softdrink(new Item.Properties().tab(ModCreativeModeTab.MORETOSEE_TAB), 1));
    public static final RegistryObject<Item> CRAFTYCOFFEE = ITEMS.register("drinks/craftycoffee",
            () -> new Softdrink(new Item.Properties().tab(ModCreativeModeTab.MORETOSEE_TAB), 5));
    public static final RegistryObject<Item> ENDERTEA = ITEMS.register("drinks/endertea",
            () -> new Softdrink(new Item.Properties().tab(ModCreativeModeTab.MORETOSEE_TAB), 4));

    public static final RegistryObject<Item> BLOCKBREW = ITEMS.register("drinks/blockbrew",
            () -> new Alcoholdrink(new Item.Properties().tab(ModCreativeModeTab.MORETOSEE_TAB), 1, 400));
    public static final RegistryObject<Item> LAVAMEAD = ITEMS.register("drinks/lavamead",
            () -> new Alcoholdrink(new Item.Properties().tab(ModCreativeModeTab.MORETOSEE_TAB), 2, 200));



    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
