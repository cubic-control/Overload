package com.cubic_control.overload.Dimensions;

import net.minecraft.entity.Entity;
import net.minecraft.util.ChunkCoordinates;
import net.minecraft.util.MathHelper;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;
import net.minecraft.world.WorldProvider;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraftforge.client.IRenderHandler;
import net.minecraftforge.common.DimensionManager;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class WorldProviderFire extends WorldProvider{
	
	public static String saveFolder;
	
	public WorldProviderFire() {
		setDimension(DimensionIDs.Realm_of_Fire);
		this.saveFolder = ("DIM" + DimensionIDs.Realm_of_Fire);
	}
	@Override
	/** tells Minecraft to use our new Terrain Generator */
	public IChunkProvider createChunkGenerator() {
		return new ChunkProviderFire(this.worldObj, this.worldObj.getSeed(), true);
	}
	@Override
	/** tells Minecraft to use our new WorldChunkManager **/
	public void registerWorldChunkManager() {
		this.worldChunkMgr = new WorldChunkManagerFire(worldObj.getSeed(), terrainType);
		this.dimensionId = DimensionIDs.Realm_of_Fire;
	}
	
	/** Get Provider for Dimension **/
	public static WorldProvider getProviderForDimension(int id) {
		return DimensionManager.createProviderFor(DimensionIDs.Realm_of_Fire);
	}
	@Override
	/** @return the name of the dimension */
	public String getDimensionName() {
		return "Realm of Fire";
	}
	@Override
	/** sets/creates the save folder */
	public String getSaveFolder() {
		return saveFolder;
	}
	
	@SideOnly(Side.CLIENT)
	/** should stars be rendered? */
	public boolean renderStars() {
		return true;
	}
	@Override
	@SideOnly(Side.CLIENT)
	/** @return the player speed */
	public double getMovementFactor() {
		return 0.1;
	}
	
	@SideOnly(Side.CLIENT)
	/** @return the light value of the stars*/
	public float getStarBrightness(World world, float f) {
		return 1.0F;
	}
	
	@SideOnly(Side.CLIENT)
	/** should clouds be rendered? */
	public boolean renderClouds() {
		return true;
	}
	
	@SideOnly(Side.CLIENT)
	public boolean renderVoidFog() {
		return false;
	}

	@SideOnly(Side.CLIENT)
	/** should the end sky be rendered or the overworld sky? */
	public boolean renderEndSky() {
		return false;
	}
	
	@SideOnly(Side.CLIENT)
	/** @return the size of the sun */
	public float setSunSize() {
		return 0.25F;
	}
	
	@SideOnly(Side.CLIENT)
	/** @return the size of the moon */
	public float setMoonSize() {
		return 4.0F;
	}
	@Override
	@SideOnly(Side.CLIENT)
	/** @return the sky color */
	public Vec3 getSkyColor(Entity cameraEntity, float partialTicks) {
		return worldObj.getSkyColorBody(cameraEntity, partialTicks);
	}
	@Override
	@SideOnly(Side.CLIENT)
	/** should a color for the sky be rendered? */
	public boolean isSkyColored() {
		return true;
	}
	@Override
	/** can the player respawn in this dimension? */
	public boolean canRespawnHere() {
		return false;
	}
	@Override
	/** is this a surface world or an underworld */
	public boolean isSurfaceWorld() {
		return true;
	}
	@Override
	@SideOnly(Side.CLIENT)
	/** @return the high of the clouds */
	public float getCloudHeight() {
		return this.terrainType.getCloudHeight();
	}
	/*
	@Override
	public ChunkCoordinates getEntrancePortalLocation()
	{
		return new ChunkCoordinates(50, 5, 0);
	}
	*/
	@Override
	/** the light value in this dimension */
	protected void generateLightBrightnessTable() {
		float f = 0.0F;

        for(int i = 0; i <= 15; ++i){
            float f1 = 1.0F - (float)i / 15.0F;
            this.lightBrightnessTable[i] = (1.0F - f1) / (f1 * 3.0F + 1.0F) * (1.0F - f) + f;
        }
	}
	@Override
	@SideOnly(Side.CLIENT)
	/** @return the dimension join message */
	public String getWelcomeMessage() {
		return "Entering the Realm";
	}
	@Override
	@SideOnly(Side.CLIENT)
	/** @return the dimension leave message */
	public String getDepartMessage() {
		return "Leaving the Realm";
	}
	@Override
	public Vec3 drawClouds(float partialTicks) {
		return super.drawClouds(partialTicks);
	}
	@Override
	@SideOnly(Side.CLIENT)
	public Vec3 getFogColor(float par1, float par2) {
		float f2 = MathHelper.cos(par1 * (float)Math.PI * 2.0F) * 2.0F + 0.5F;

		if(f2 < 0.0F){
			f2 = 0.0F;
		}
		if(f2 > 1.0F){
			f2 = 1.0F;
		}
		float f3 = 0.7529412F;
		float f4 = 0.84705883F;
		float f5 = 1.0F;
		f3 *= f2 * 0.94F + 0.06F;
		f4 *= f2 * 0.94F + 0.06F;
		f5 *= f2 * 0.91F + 0.09F;
		return Vec3.createVectorHelper((double)f3, (double)f4, (double)f5);
	}
}