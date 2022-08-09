package com.stevenpaw.moretosee;

import com.stevenpaw.moretosee.init.ModItems;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {

    public static final CreativeModeTab MORETOSEE_TAB = new CreativeModeTab("moretoseetab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.MORETOSEE_EYE.get());
        }
    };
}
