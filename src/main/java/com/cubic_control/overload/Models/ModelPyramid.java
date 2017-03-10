package com.cubic_control.overload.Models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelPyramid extends ModelBase
{
  //fields
    ModelRenderer Layer1;
    ModelRenderer Layer2;
    ModelRenderer Layer3;
    ModelRenderer Layer4;
    ModelRenderer Layer5;
    ModelRenderer Layer6;
    ModelRenderer Layer7;
    ModelRenderer Layer8;
  
  public ModelPyramid()
  {
    textureWidth = 64;
    textureHeight = 128;
    
      Layer1 = new ModelRenderer(this, 0, 0);
      Layer1.addBox(0F, 0F, 0F, 16, 2, 16);
      Layer1.setRotationPoint(-8F, 22F, -8F);
      Layer1.setTextureSize(64, 128);
      Layer1.mirror = true;
      setRotation(Layer1, 0F, 0F, 0F);
      Layer2 = new ModelRenderer(this, 0, 18);
      Layer2.addBox(0F, 0F, 0F, 14, 2, 14);
      Layer2.setRotationPoint(-7F, 20F, -7F);
      Layer2.setTextureSize(64, 128);
      Layer2.mirror = true;
      setRotation(Layer2, 0F, 0F, 0F);
      Layer3 = new ModelRenderer(this, 0, 34);
      Layer3.addBox(0F, 0F, 0F, 12, 2, 12);
      Layer3.setRotationPoint(-6F, 18F, -6F);
      Layer3.setTextureSize(64, 128);
      Layer3.mirror = true;
      setRotation(Layer3, 0F, 0F, 0F);
      Layer4 = new ModelRenderer(this, 0, 48);
      Layer4.addBox(0F, 0F, 0F, 10, 2, 10);
      Layer4.setRotationPoint(-5F, 16F, -5F);
      Layer4.setTextureSize(64, 128);
      Layer4.mirror = true;
      setRotation(Layer4, 0F, 0F, 0F);
      Layer5 = new ModelRenderer(this, 0, 60);
      Layer5.addBox(0F, 0F, 0F, 8, 2, 8);
      Layer5.setRotationPoint(-4F, 14F, -4F);
      Layer5.setTextureSize(64, 128);
      Layer5.mirror = true;
      setRotation(Layer5, 0F, 0F, 0F);
      Layer6 = new ModelRenderer(this, 0, 70);
      Layer6.addBox(0F, 0F, 0F, 6, 2, 6);
      Layer6.setRotationPoint(-3F, 12F, -3F);
      Layer6.setTextureSize(64, 128);
      Layer6.mirror = true;
      setRotation(Layer6, 0F, 0F, 0F);
      Layer7 = new ModelRenderer(this, 0, 78);
      Layer7.addBox(0F, 0F, 0F, 4, 2, 4);
      Layer7.setRotationPoint(-2F, 10F, -2F);
      Layer7.setTextureSize(64, 128);
      Layer7.mirror = true;
      setRotation(Layer7, 0F, 0F, 0F);
      Layer8 = new ModelRenderer(this, 0, 84);
      Layer8.addBox(0F, 0F, 0F, 2, 2, 2);
      Layer8.setRotationPoint(-1F, 8F, -1F);
      Layer8.setTextureSize(64, 128);
      Layer8.mirror = true;
      setRotation(Layer8, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    Layer1.render(f5);
    Layer2.render(f5);
    Layer3.render(f5);
    Layer4.render(f5);
    Layer5.render(f5);
    Layer6.render(f5);
    Layer7.render(f5);
    Layer8.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
  }

}
