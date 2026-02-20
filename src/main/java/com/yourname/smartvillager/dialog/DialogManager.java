package com.yourname.smartvillager.dialog;

import net.minecraft.entity.passive.VillagerEntity;
import net.minecraft.text.Text;

import java.util.Random;

public class DialogManager {

    private static final String[] DIALOGS = {
        "Hari yang cerah!",
        "Jaga desa kita!",
        "Aku sedang bekerja.",
        "Waspada, ada bahaya."
    };

    private static final Random RANDOM = new Random();

    public static void sayRandom(VillagerEntity villager) {
        String msg = DIALOGS[RANDOM.nextInt(DIALOGS.length)];
        if (villager.getWorld() instanceof ServerWorld serverWorld) {
    serverWorld.getPlayers().forEach(player -> {
        if (player.squaredDistanceTo(villager) < 100) {
            player.sendMessage(Text.literal(msg), false);
        }
    });
}
