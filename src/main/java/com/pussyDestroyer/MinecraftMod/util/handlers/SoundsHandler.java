package com.pussyDestroyer.MinecraftMod.util.handlers;

import com.pussyDestroyer.MinecraftMod.util.Reference;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class SoundsHandler {
	public static SoundEvent BALA_USP,BALA_AK47,BALA_M4A4;
	
	public static void registerSounds() {
		BALA_USP = registerSound("usp");
		BALA_AK47 = registerSound("ak47");
		BALA_M4A4 = registerSound("m4a4");
	}
	
	private static SoundEvent registerSound(String name) {
		ResourceLocation location = new ResourceLocation(Reference.MOD_ID, name);
		SoundEvent event = new SoundEvent(location);
		event.setRegistryName(name);
		ForgeRegistries.SOUND_EVENTS.register(event);
		return event;
	}
}