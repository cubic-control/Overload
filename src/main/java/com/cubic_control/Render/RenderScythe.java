package com.cubic_control.Render;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.IItemRenderer;

import org.lwjgl.opengl.GL11;

import com.cubic_control.Models.ModelScythe;
import com.cubic_control.lib.RefStrings;

public class RenderScythe implements IItemRenderer {
	Minecraft mc = Minecraft.getMinecraft();
	
    //you'll need an instance of your model. you could also add it to the constructor as an argument to be able to reuse this class for
    //every model you add
    ModelScythe scythe;

    //constructor
    public RenderScythe() {
    	scythe = new ModelScythe();
    }


/*TIPS AND TRICKS N°1 : always rotate before translation*/
/*TIPS AND TRICKS N°2 : if you want your model to render as a texture in your inventory, or anywhere else, just do not add that case*/
/*TIPS AND TRICKS N°3 :
it might be better to start and stop the gl rendering before and after the switch, and add the texture before the switch : like so
GL11.pushMatrix
bindTexture
switch{
case rotate, translate, render
case rotate, translate, render
case rotate, translate, render
}
GL11.glpopmatrix
*/
/*TIPS AND TRICKS N°4 : as stated in the previous tutorial on armor, you could make your own rendermethid that only takes the size as an argument.*/

    @Override
    public void renderItem(ItemRenderType type, ItemStack item, Object... data) {
        float scale;
		switch (type) {

        case EQUIPPED: // render in third person
            GL11.glPushMatrix(); //start gl rendering for this section
            mc.renderEngine.bindTexture(new ResourceLocation(
                    "subaraki:weapons/Sword.png"));
            GL11.glRotatef(0F, 1.0f, 0.0f, 0.0f);	   //rotate 0 ° on X axis
            GL11.glRotatef(-5F, 0.0f, 1.0f, 0.0f);	  // rotate -5 ° on Y axis
            GL11.glRotatef(-150F, 0.0f, 0.0f, 1.0f);  // rotate -150 ° on Z axis
            GL11.glTranslatef(-0.8F, 0.6F, -0.1F);    //translate model to fit in the hand of the player
//the entity argument can/could be passed to as null.
            //scythe.render((Entity) data[1], 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F);
            GL11.glPopMatrix(); //Stop gl rendering for this section
            break;

        case EQUIPPED_FIRST_PERSON:

//rince and repeat the rendering. adjust axis' and translation as needed
            GL11.glPushMatrix();
            mc.renderEngine.bindTexture(new ResourceLocation(RefStrings.MODID + ":obj/scythe.png"));
            GL11.glRotatef(0F, 1.0f, 0.0f, 0.0f);
            GL11.glRotatef(-5F, 0.0f, 1.0f, 0.0f);
            GL11.glRotatef(-150F, 0.0f, 0.0f, 1.0f);
            GL11.glTranslatef(-0.8F, 0.9F, -0.1F);
            //scythe.render((Entity) data[1], 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F);
            GL11.glPopMatrix();
            break;

        case ENTITY:
            GL11.glPushMatrix();
            scale = 1.5F;
            GL11.glScalef(scale, scale, scale);
            mc.renderEngine.bindTexture(new ResourceLocation(RefStrings.MODID + ":obj/scythe.png"));
            GL11.glRotatef(90F, 1.0f, 0.0f, 0.0f);
            GL11.glRotatef(0F, 0.0f, 1.0f, 0.0f);
            GL11.glRotatef(45F, 0.0f, 0.0f, 1.0f);
            GL11.glTranslatef(-0.2F, 1F, 0F);
            //scythe.render((Entity) data[1], 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F);
            GL11.glPopMatrix();
            break;

        case INVENTORY:
            GL11.glPushMatrix();
            scale = 0.7F;
            GL11.glScalef(scale, scale, scale);
            mc.renderEngine.bindTexture(new ResourceLocation(RefStrings.MODID + ":obj/scythe.png"));

            GL11.glRotatef(200F, 1.0f, 0.0f, 0.0f);
            GL11.glRotatef(-80F, 0.0f, 1.0f, 0.0f);
            GL11.glTranslatef(0.0F, 1.2F, 0F);
//this is a method made by me in my model class to render only the modelparts, without an entity argument, because in your inventory, //the entity is always null.
            //scythe.render(0.0625F);
            GL11.glPopMatrix();
            break;

        default:
            break;
        }
    }
@Override
    public boolean handleRenderType(ItemStack item, ItemRenderType type) {
        return true;
    }

public boolean shouldUseRenderHelper(ItemRenderType type, ItemStack item,
            ItemRendererHelper helper) {

        switch (type) {
        case INVENTORY:
            return true;
        default:
            break;
        }
        return false;

    }

}