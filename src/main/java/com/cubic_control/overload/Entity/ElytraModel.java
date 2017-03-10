package com.cubic_control.overload.Entity;

/**
* An accurate simulation of the elytra item as of Minecraft 15w41b
*/
public class ElytraModel
{	
	public static int glideTime;
	public static int damageTaken;
	
	public static double posX;
	public static double posY;
	public static double posZ;
	
	public static double velX;
	public static double velY;
	public static double velZ;
	
	/**
	* Simulates a Minecraft tick (20 per second).
	* The pitch and yaw are the look direction of the player.
	*/
	public void tick(boolean isCreative, double yaw, double pitch)
	{
		if (!isCreative && (this.glideTime + 1) % 20 == 0)
		{
			this.damageTaken++;
		}
		
		//I did some simplifing of the folowing to reduce the number of negatives and trig functions
		double yawcos = Math.cos(-yaw - Math.PI);
		double yawsin = Math.sin(-yaw - Math.PI);
		double pitchcos = Math.cos(pitch);
		double pitchsin = Math.sin(pitch);
		
		double lookX = yawsin * -pitchcos;
		double lookY = -pitchsin;
		double lookZ = yawcos * -pitchcos;
		
		double hvel = Math.sqrt(velX * velX + velZ * velZ);
		double hlook = pitchcos; //Math.sqrt(lookX * lookX + lookZ * lookZ)
		double sqrpitchcos = pitchcos * pitchcos; //In MC this is multiplied by Math.min(1.0, Math.sqrt(lookX * lookX + lookY * lookY + lookZ * lookZ) / 0.4), don't ask me why, it should always =1
		
		//From here on, the code is identical to the code found in net.minecraft.entity.EntityLivingBase.moveEntityWithHeading(float, float) or rq.g(float, float) in obfuscated 15w41b
		this.velY += -0.08 + sqrpitchcos * 0.06;
		
		if (this.velY < 0 && hlook > 0)
		{
			double yacc = this.velY * -0.1 * sqrpitchcos;
			this.velY += yacc;
			this.velX += lookX * yacc / hlook;
			this.velZ += lookZ * yacc / hlook;
		}
		if (pitch < 0)
		{
			double yacc = hvel * -pitchsin * 0.04;
			this.velY += yacc * 3.5;
			this.velX -= lookX * yacc / hlook;
			this.velZ -= lookZ * yacc / hlook;
		}
		if (hlook > 0)
		{
			this.velX += (lookX / hlook * hvel - this.velX) * 0.1;
			this.velZ += (lookZ / hlook * hvel - this.velZ) * 0.1;
		}
		
		this.velX *= 0.99;
		this.velY *= 0.98;
		this.velZ *= 0.99;
		
		this.posX += this.velX;
		this.posY += this.velY;
		this.posZ += this.velZ;
		
		this.glideTime++;
	}
	
	/** 
	* Checks if the player is currently in a gliding state.
	* As you can see, if the player is in creative, they will remain gliding even if on the ground. They will stop gliding once they move (but that functionality is not shown here).
	*/
	public boolean isGliding(boolean isCreative, boolean isOnGround, float fallDistance)
	{
		if (isCreative)
		{	
			return glideTime > 0;
		}
		else
		{
			return !isOnGround && fallDistance >= 1.0f;
		}
	}
}