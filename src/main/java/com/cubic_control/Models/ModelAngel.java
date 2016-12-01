// Date: 5/11/2016 4:03:44 PM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX






package com.cubic_control.Models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelAngel extends ModelBase
{
  //fields
    ModelRenderer head;
    ModelRenderer Demon_Wing_R;
    ModelRenderer Demon_Wing_L;
    ModelRenderer body;
    public ModelRenderer bipedRightArm;
    public ModelRenderer bipedLeftArm;
    public ModelRenderer bipedRightLeg;
    public ModelRenderer bipedLeftLeg;
  
  public ModelAngel()
  {
    textureWidth = 128;
    textureHeight = 128;
    
      head = new ModelRenderer(this, 0, 0);
      head.addBox(-4F, -8F, -4F, 8, 8, 8);
      head.setRotationPoint(0F, 0F, 0F);
      head.setTextureSize(128, 128);
      head.mirror = true;
      setRotation(head, 0F, 0F, 0F);
      Demon_Wing_R = new ModelRenderer(this, 1, 36);
      Demon_Wing_R.addBox(-26F, 0F, -0.5F, 26, 17, 0);
      Demon_Wing_R.setRotationPoint(-2F, 1F, 1F);
      Demon_Wing_R.setTextureSize(128, 128);
      Demon_Wing_R.mirror = true;
      setRotation(Demon_Wing_R, 0F, 0F, 1.06083F);
      Demon_Wing_L = new ModelRenderer(this, 72, 37);
      Demon_Wing_L.addBox(0F, 0F, -0.5F, 26, 17, 0);
      Demon_Wing_L.setRotationPoint(2F, 1F, 2F);
      Demon_Wing_L.setTextureSize(128, 128);
      Demon_Wing_L.mirror = true;
      setRotation(Demon_Wing_L, 0F, 0F, -1.047198F);
      body = new ModelRenderer(this, 16, 16);
      body.addBox(-4F, 0F, -2F, 8, 12, 4);
      body.setRotationPoint(0F, 0F, 0F);
      body.setTextureSize(128, 128);
      body.mirror = true;
      setRotation(body, 0F, 0F, 0F);
      this.bipedRightArm = new ModelRenderer(this, 40, 16);
      this.bipedRightArm.addBox(-3.0F, -2.0F, -2.0F, 4, 12, 4);
      this.bipedRightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
      bipedRightArm.setTextureSize(128, 128);
      this.bipedLeftArm = new ModelRenderer(this, 40, 16);
      this.bipedLeftArm.mirror = true;
      this.bipedLeftArm.addBox(-1.0F, -2.0F, -2.0F, 4, 12, 4);
      this.bipedLeftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
      bipedLeftArm.setTextureSize(128, 128);
      this.bipedRightLeg = new ModelRenderer(this, 0, 16);
      this.bipedRightLeg.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4);
      this.bipedRightLeg.setRotationPoint(-1.9F, 12.0F, 0.0F);
      bipedRightLeg.setTextureSize(128, 128);
      this.bipedLeftLeg = new ModelRenderer(this, 0, 16);
      this.bipedLeftLeg.mirror = true;
      this.bipedLeftLeg.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4);
      this.bipedLeftLeg.setRotationPoint(1.9F, 12.0F, 0.0F);
      bipedLeftLeg.setTextureSize(128, 128);
  }
  
  public void render(Entity par1Entity, float par2, float par3, float par4, float par5, float par6, float par7)
  {
	  this.setRotationAngles(par2, par3, par4, par5, par6, par7, par1Entity);
    head.render(par7);
    Demon_Wing_R.render(par7);
    Demon_Wing_L.render(par7);
    body.render(par7);
    this.bipedRightArm.render(par7);
    this.bipedLeftArm.render(par7);
    this.bipedRightLeg.render(par7);
    this.bipedLeftLeg.render(par7);
    
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float par1, float par2, float par3, float par4, float par5, float par6, Entity par7Entity)
  {
	  head.rotateAngleY = par4 / (180F / (float)Math.PI);
      head.rotateAngleX = par5 / (180F / (float)Math.PI);
      this.bipedRightArm.rotateAngleX = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 2.0F * par2 * 0.5F;
      this.bipedLeftArm.rotateAngleX = MathHelper.cos(par1 * 0.6662F) * 2.0F * par2 * 0.5F;
      this.bipedRightArm.rotateAngleZ = 0.0F;
      this.bipedLeftArm.rotateAngleZ = 0.0F;
      this.bipedRightLeg.rotateAngleX = MathHelper.cos(par1 * 0.6662F) * 1.4F * par2;
      this.bipedLeftLeg.rotateAngleX = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 1.4F * par2;
      this.bipedRightLeg.rotateAngleY = 0.0F;
      this.bipedLeftLeg.rotateAngleY = 0.0F;
      //Constant spinning motion
      //this.Demon_Wing_R.rotateAngleZ = par3;
      //this.Demon_Wing_L.rotateAngleZ = -par3;
  }

}
