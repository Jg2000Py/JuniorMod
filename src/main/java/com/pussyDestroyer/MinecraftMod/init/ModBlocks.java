package com.pussyDestroyer.MinecraftMod.init;

import java.util.ArrayList;
import java.util.List;

import com.pussyDestroyer.MinecraftMod.blocks.JuniorBlock;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;


public class ModBlocks {
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block JUNIOR_BLOCK = new JuniorBlock("junior_block",Material.IRON);
}
