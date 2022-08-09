package com.stevenpaw.moretosee.item;

import com.stevenpaw.moretosee.init.ModEffects;
import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.stats.Stats;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.*;
import net.minecraft.world.level.Level;
import net.minecraftforge.client.gui.widget.ModListWidget;

import java.util.Collection;

public class Alcoholdrink extends Item {
    private static final int DRINK_DURATION = 32;
    private int drinkPower = 0;
    private int nauseaDuration = 0;

    public Alcoholdrink(Properties pProperties, int drinkPower, int nauseaDuration) {
        super(pProperties);
        this.drinkPower = drinkPower;
        this.nauseaDuration = nauseaDuration;
    }

    /**
     * Called when the player finishes using this Item (E.g. finishes eating.). Not called when the player stops using
     * the Item before the action is complete.
     */
    public ItemStack finishUsingItem(ItemStack pStack, Level pLevel, LivingEntity pEntityLiving) {
        if (!pLevel.isClientSide) {
            pEntityLiving.addEffect(new MobEffectInstance(MobEffect.byId(10), 200, drinkPower)); //Regeneration Effect
            int drunkModifier = 0;
            if(!pEntityLiving.getActiveEffects().isEmpty()){
                for (MobEffectInstance effect : (Collection<MobEffectInstance>) pEntityLiving.getActiveEffects()){
                    if(effect.getEffect().getRegistryName().equals(ModEffects.DRUNK.get().getRegistryName())){
                        drunkModifier = effect.getAmplifier() + 1;
                    }
                }
            }
            pEntityLiving.addEffect(new MobEffectInstance(ModEffects.DRUNK.get(), nauseaDuration, 0 + drunkModifier)); //Drunk Effect
        }
        if (pEntityLiving instanceof ServerPlayer) {
            ServerPlayer serverplayer = (ServerPlayer)pEntityLiving;
            CriteriaTriggers.CONSUME_ITEM.trigger(serverplayer, pStack);
            serverplayer.awardStat(Stats.ITEM_USED.get(this));
        }

        if (pEntityLiving instanceof Player && !((Player)pEntityLiving).getAbilities().instabuild) {
            pStack.shrink(1);
        }

        return pStack.isEmpty() ? new ItemStack(Items.BUCKET) : pStack;
    }

    /**
     * How long it takes to use or consume an item
     */
    public int getUseDuration(ItemStack pStack) {
        return 32;
    }

    /**
     * returns the action that specifies what animation to play when the items is being used
     */
    public UseAnim getUseAnimation(ItemStack pStack) {
        return UseAnim.DRINK;
    }

    /**
     * Called to trigger the item's "innate" right click behavior.
     */
    public InteractionResultHolder<ItemStack> use(Level pLevel, Player pPlayer, InteractionHand pHand) {
        return ItemUtils.startUsingInstantly(pLevel, pPlayer, pHand);
    }

    @Override
    public net.minecraftforge.common.capabilities.ICapabilityProvider initCapabilities(ItemStack stack, @javax.annotation.Nullable net.minecraft.nbt.CompoundTag nbt) {
        return new net.minecraftforge.fluids.capability.wrappers.FluidBucketWrapper(stack);
    }
}
