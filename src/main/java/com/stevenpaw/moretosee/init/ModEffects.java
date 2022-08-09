package com.stevenpaw.moretosee.init;

import com.stevenpaw.moretosee.DrunkEffect;
import com.stevenpaw.moretosee.ModCreativeModeTab;
import com.stevenpaw.moretosee.MoreToSee;
import com.stevenpaw.moretosee.item.Softdrink;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEffects {
    public static final DeferredRegister<MobEffect> MOB_EFFECTS =
            DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, MoreToSee.MOD_ID);


    public static final RegistryObject<MobEffect> DRUNK = MOB_EFFECTS.register("drunk",
            () -> new DrunkEffect(MobEffectCategory.BENEFICIAL, 7871001));


    public static void register(IEventBus eventBus){
        MOB_EFFECTS.register(eventBus);
    }
}
