package com.yourname.smartvillager.ai;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ai.goal.Goal;
import net.minecraft.entity.passive.VillagerEntity;
import net.minecraft.entity.player.PlayerEntity;

import java.util.EnumSet;

public class DefendVillageGoal extends Goal {

    private final VillagerEntity villager;

    public DefendVillageGoal(VillagerEntity villager) {
        this.villager = villager;
        this.setControls(EnumSet.of(Control.TARGET));
    }

    @Override
    public boolean canStart() {
        LivingEntity attacker = villager.getAttacker();
        return attacker != null && attacker instanceof PlayerEntity == false;
    }

    @Override
    public void start() {
        villager.setAttacking(true);
    }

    @Override
    public void stop() {
        villager.setAttacking(false);
    }
}
