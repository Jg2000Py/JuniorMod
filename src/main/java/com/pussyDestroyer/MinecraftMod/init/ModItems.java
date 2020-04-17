package com.pussyDestroyer.MinecraftMod.init;

import java.util.List;

import com.pussyDestroyer.MinecraftMod.items.tools.ToolSword;
import com.pussyDestroyer.MinecraftMod.items.tools.USPBase;

import java.util.ArrayList;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems {
	public static final List<Item> ITEMS = new ArrayList<Item>();
	public static final Item USP = new USPBase("usp");
	public static final Item AK47 = new USPBase("ak47");
	public static final Item M4A4 = new USPBase("m4a4");
	
	public static final ToolMaterial MATERIAL_USP = EnumHelper.addToolMaterial("material_usp", 3, 1561, 8.0F, 3.0F, 10);
	public static final ItemSword USP_SWORD = new ToolSword("usp_sword",MATERIAL_USP);
}