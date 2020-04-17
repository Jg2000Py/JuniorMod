package com.pussyDestroyer.MinecraftMod.entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;

public class Bullets extends EntityThrowable{
	public Bullets(World worldIn) 
	{
		super(worldIn);
	}
	
	public Bullets(World worldIn, EntityLivingBase throwerIn) 
	{
		super(worldIn, throwerIn);
	}
	
	public Bullets(World worldIn, double x, double y, double z) 
	{
		super(worldIn, x, y, z);
	}
	
	@Override
	protected void onImpact(RayTraceResult result) 
	{
		if(!this.world.isRemote)
		{
			setDead();
			if(result.entityHit instanceof EntityLivingBase)
			{
				EntityLivingBase entity = (EntityLivingBase)result.entityHit;
				entity.attackEntityFrom(DamageSource.causeThrownDamage(this, this.thrower), rand.nextFloat());
				entity.setHealth(entity.getHealth()-5.0F);
			}
		}
	}
}