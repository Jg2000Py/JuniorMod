package com.pussyDestroyer.MinecraftMod.items.tools;

import com.pussyDestroyer.MinecraftMod.Main;
import com.pussyDestroyer.MinecraftMod.init.ModItems;
import com.pussyDestroyer.MinecraftMod.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;

public class ToolSword extends ItemSword implements IHasModel{
	public ToolSword(String name, ToolMaterial material) {
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.MATERIALS);
		
		ModItems.ITEMS.add(this);
	}
	
	@Override
	public void registerModels() {
		Main.proxy.registerItemRenderer(this,0,"inventory");
		
	}
}
