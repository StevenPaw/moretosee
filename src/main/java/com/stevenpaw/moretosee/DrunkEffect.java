package com.stevenpaw.moretosee;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;

public class DrunkEffect extends MobEffect {
    public DrunkEffect(MobEffectCategory pCategory, int pColor)
    {
        super(pCategory, pColor);
        this.addAttributeModifier(Attributes.ATTACK_DAMAGE, "9855509b-0900-48de-a4b0-82eefaa24d62", 0.1D, AttributeModifier.Operation.MULTIPLY_TOTAL);
    }

    @Override
    public boolean isDurationEffectTick(int duration, int amplifier)
    {
        this.addAttributeModifier(Attributes.MOVEMENT_SPEED, "1f8955f0-2985-4658-9dd8-0eb83fe32283", -0.02D * amplifier, AttributeModifier.Operation.MULTIPLY_TOTAL);
        this.addAttributeModifier(Attributes.ATTACK_SPEED, "490e03c0-319b-4b22-b094-a98636fa6a4a", -0.01D * amplifier, AttributeModifier.Operation.MULTIPLY_TOTAL);
        return false;
    }
}
