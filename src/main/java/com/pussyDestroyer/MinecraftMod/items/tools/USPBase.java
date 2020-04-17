package com.pussyDestroyer.MinecraftMod.items.tools;

import com.pussyDestroyer.MinecraftMod.entity.Bullets;
import com.pussyDestroyer.MinecraftMod.items.ItemBase;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
//import com.pussyDestroyer.MinecraftMod.util.handlers.SoundsHandler;

public class USPBase extends ItemBase{

	public USPBase(String name) {
		super(name);
	}
	
	@Override
	public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn) 
	{
		ItemStack stack = playerIn.getHeldItem(handIn);
		Vec3d look = playerIn.getLookVec();
		Bullets magiball = new Bullets(worldIn, 1.0D, 1.0D, 1.0D);
		magiball.setPosition(playerIn.posX + look.x* 1.5D, playerIn.posY + look.y*1.5D + 2.0D, playerIn.posZ + look.z*1.5D);
		magiball.shoot(playerIn, playerIn.rotationPitch,playerIn.rotationYaw, 0.0F, 9999.0F, 0.0F);
		System.out.println("Lanzamiento: ");
		System.out.println(look.x);
		System.out.println(look.y);
		System.out.println(look.z);
		System.out.println(playerIn.posX+look.x);
		System.out.println(playerIn.posY+look.y);
		System.out.println(playerIn.posZ+look.z);
		System.out.println(playerIn.rotationYaw+" "+playerIn.rotationPitch);
		if(!worldIn.isRemote)
		{
			worldIn.spawnEntity(magiball);
		}
		//SoundsHandler.registerSounds();
		worldIn.playSound(null, playerIn.getPosition(),/*SoundsHandler.BALA_USP*/ SoundEvents.ENTITY_ARROW_SHOOT , SoundCategory.PLAYERS, 1.0F, 1.0F);
		/*if(!playerIn.capabilities.isCreativeMode)
		{
			stack.shrink(1);
		}*/
		return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, stack);
	}
}