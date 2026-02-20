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
        villager.sendMessage(Text.literal(msg), false);
    }
}
