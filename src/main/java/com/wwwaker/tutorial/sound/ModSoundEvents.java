package com.wwwaker.tutorial.sound;

import com.wwwaker.tutorial.TutorialMod;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;


public class ModSoundEvents {
    private static SoundEvent register(String name){
        Identifier id = new Identifier(TutorialMod.MOD_ID, name);
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }

    public static final SoundEvent TEST = register("test");

    public static final SoundEvent BLOCK_BREAK = register("block_break");
    public static final SoundEvent BLOCK_PLACE = register("block_place");
    public static final SoundEvent BLOCK_STEP = register("block_step");
    public static final SoundEvent BLOCK_FALL = register("block_fall");
    public static final SoundEvent BLOCK_HIT = register("block_hit");

    public static final BlockSoundGroup BLOCK_SOUND_GROUP = new BlockSoundGroup(1.0f, 1.0f,
            BLOCK_BREAK, BLOCK_STEP, BLOCK_PLACE, BLOCK_HIT, BLOCK_FALL);

    public static void registerSounds(){}
}
