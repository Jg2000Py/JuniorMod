package com.pussyDestroyer.MinecraftMod.init;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes {
	public static void init() {
		GameRegistry.addSmelting(ModItems.USP, new ItemStack(ModBlocks.JUNIOR_BLOCK, 3), 5.0f);
	}
}