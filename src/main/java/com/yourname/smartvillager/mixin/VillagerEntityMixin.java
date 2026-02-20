package com.yourname.smartvillager.mixin;

import com.yourname.smartvillager.ai.DefendVillageGoal;
import net.minecraft.entity.ai.goal.GoalSelector;
import net.minecraft.entity.passive.VillagerEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(VillagerEntity.class)
public class VillagerEntityMixin {

    @Inject(method = "initGoals", at = @At("TAIL"))
    private void addSmartGoals(CallbackInfo ci) {
    VillagerEntity villager = (VillagerEntity)(Object)this;

    villager.goalSelector.add(1, new DefendVillageGoal(villager));
    }
}
