package com.cubic_control.overload.Render;

import com.cubic_control.overload.Models.ModelPlayerSlim;
import com.cubic_control.overload.lib.RefStrings;
import com.google.common.collect.Maps;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import java.util.Map;

import net.minecraft.block.Block;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.RenderBlocks;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.tileentity.TileEntitySkullRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

import static net.minecraftforge.client.IItemRenderer.ItemRenderType.EQUIPPED;
import static net.minecraftforge.client.IItemRenderer.ItemRendererHelper.BLOCK_3D;
import net.minecraftforge.client.ForgeHooksClient;
import net.minecraftforge.client.IItemRenderer;
import net.minecraftforge.client.MinecraftForgeClient;

@SideOnly(Side.CLIENT)
public class RenderNightmareAlex extends RenderLiving
{
    public ModelPlayerSlim modelBipedMain;
    protected float field_77070_b;
    protected ModelPlayerSlim field_82423_g;
    protected ModelPlayerSlim field_82425_h;
    private static final Map field_110859_k = Maps.newHashMap();
    private static final ResourceLocation Resource = new ResourceLocation(RefStrings.MODID + ":textures/mobs/nightmare/nightmare_alex.png");
    /** List of armor texture filenames. */
    public static String[] bipedArmorFilenamePrefix = new String[] {"leather", "chainmail", "iron", "diamond", "gold"};
    private static final String __OBFID = "CL_00001001";

    public RenderNightmareAlex(ModelBase par1ModelBase, float par2)
    {
        this(par1ModelBase, par2, 1.0F);
    }

    public RenderNightmareAlex(ModelBase par1ModelBase, float par2, float par3)
    {
        super(par1ModelBase, par2);
        this.modelBipedMain = (ModelPlayerSlim) par1ModelBase;
        this.field_77070_b = par3;
        this.func_82421_b();
    }
    
    @Override
    protected ResourceLocation getEntityTexture(Entity var1) {
           
            return Resource;
    }

    protected void func_82421_b()
    {
        this.field_82423_g = new ModelPlayerSlim(1.0F);
        this.field_82425_h = new ModelPlayerSlim(0.5F);
    }

    @Deprecated //Use the more sensitive version getArmorResource below
    public static ResourceLocation func_110857_a(ItemArmor par0ItemArmor, int par1)
    {
        return func_110858_a(par0ItemArmor, par1, (String)null);
    }

    @Deprecated //Use the more sensitive version getArmorResource below
    public static ResourceLocation func_110858_a(ItemArmor par0ItemArmor, int par1, String par2Str)
    {
        String s1 = String.format("textures/models/armor/%s_layer_%d%s.png", new Object[] {bipedArmorFilenamePrefix[par0ItemArmor.renderIndex], Integer.valueOf(par1 == 2 ? 2 : 1), par2Str == null ? "" : String.format("_%s", new Object[]{par2Str})});
        ResourceLocation resourcelocation = (ResourceLocation)field_110859_k.get(s1);

        if (resourcelocation == null)
        {
            resourcelocation = new ResourceLocation(s1);
            field_110859_k.put(s1, resourcelocation);
        }

        return resourcelocation;
    }

    /**
     * Queries whether should render the specified pass or not.
     */
    protected int shouldRenderPass(EntityLiving par1EntityLiving, int par2, float par3)
    {
        ItemStack itemstack = par1EntityLiving.func_130225_q(3 - par2);

        if (itemstack != null)
        {
            Item item = itemstack.getItem();

            if (item instanceof ItemArmor)
            {
                ItemArmor itemarmor = (ItemArmor)item;
                this.bindTexture(getArmorResource(par1EntityLiving, itemstack, par2, null));
                ModelPlayerSlim ModelPlayerSlim = par2 == 2 ? this.field_82425_h : this.field_82423_g;
                ModelPlayerSlim.bipedHead.showModel = par2 == 0;
                ModelPlayerSlim.bipedHeadwear.showModel = par2 == 0;
                ModelPlayerSlim.bipedBody.showModel = par2 == 1 || par2 == 2;
                ModelPlayerSlim.bipedRightArm.showModel = par2 == 1;
                ModelPlayerSlim.bipedLeftArm.showModel = par2 == 1;
                ModelPlayerSlim.bipedRightLeg.showModel = par2 == 2 || par2 == 3;
                ModelPlayerSlim.bipedLeftLeg.showModel = par2 == 2 || par2 == 3;
                this.setRenderPassModel(ModelPlayerSlim);
                ModelPlayerSlim.onGround = this.mainModel.onGround;
                ModelPlayerSlim.isRiding = this.mainModel.isRiding;
                ModelPlayerSlim.isChild = this.mainModel.isChild;

                //Move out of if to allow for more then just CLOTH to have color
                int j = itemarmor.getColor(itemstack);
                if (j != -1)
                {
                    float f1 = (float)(j >> 16 & 255) / 255.0F;
                    float f2 = (float)(j >> 8 & 255) / 255.0F;
                    float f3 = (float)(j & 255) / 255.0F;
                    GL11.glColor3f(f1, f2, f3);

                    if (itemstack.isItemEnchanted())
                    {
                        return 31;
                    }

                    return 16;
                }

                GL11.glColor3f(1.0F, 1.0F, 1.0F);

                if (itemstack.isItemEnchanted())
                {
                    return 15;
                }

                return 1;
            }
        }

        return -1;
    }

    protected void func_82408_c(EntityLiving par1EntityLivingBase, int par2, float par3)
    {
        ItemStack itemstack = par1EntityLivingBase.func_130225_q(3 - par2);

        if (itemstack != null)
        {
            Item item = itemstack.getItem();

            if (item instanceof ItemArmor)
            {
                this.bindTexture(getArmorResource(par1EntityLivingBase, itemstack, par2, "overlay"));
                float f1 = 1.0F;
                GL11.glColor3f(1.0F, 1.0F, 1.0F);
            }
        }
    }

    /**
     * Actually renders the given argument. This is a synthetic bridge method, always casting down its argument and then
     * handing it off to a worker function which does the actual work. In all probabilty, the class Render is generic
     * (Render<T extends Entity) and this method has signature public void func_76986_a(T entity, double d, double d1,
     * double d2, float f, float f1). But JAD is pre 1.5 so doesn't do that.
     */
    public void doRender(EntityLiving par1EntityLiving, double par2, double par4, double par6, float par8, float par9)
    {
        GL11.glColor3f(1.0F, 1.0F, 1.0F);
        ItemStack itemstack = par1EntityLiving.getHeldItem();
        this.func_82420_a(par1EntityLiving, itemstack);
        double d3 = par4 - (double)par1EntityLiving.yOffset;

        if (par1EntityLiving.isSneaking())
        {
            d3 -= 0.125D;
        }

        super.doRender(par1EntityLiving, par2, d3, par6, par8, par9);
        this.field_82423_g.aimedBow = this.field_82425_h.aimedBow = this.modelBipedMain.aimedBow = false;
        this.field_82423_g.isSneak = this.field_82425_h.isSneak = this.modelBipedMain.isSneak = false;
        this.field_82423_g.heldItemRight = this.field_82425_h.heldItemRight = this.modelBipedMain.heldItemRight = 0;
    }

    protected void func_82420_a(EntityLiving par1EntityLiving, ItemStack par2ItemStack)
    {
        this.field_82423_g.heldItemRight = this.field_82425_h.heldItemRight = this.modelBipedMain.heldItemRight = par2ItemStack != null ? 1 : 0;
        this.field_82423_g.isSneak = this.field_82425_h.isSneak = this.modelBipedMain.isSneak = par1EntityLiving.isSneaking();
    }

    protected void renderEquippedItems(EntityLiving par1EntityLiving, float par2)
    {
        GL11.glColor3f(1.0F, 1.0F, 1.0F);
        super.renderEquippedItems(par1EntityLiving, par2);
        ItemStack itemstack = par1EntityLiving.getHeldItem();
        ItemStack itemstack1 = par1EntityLiving.func_130225_q(3);
        Item item;
        float f1;

        if (itemstack1 != null)
        {
            GL11.glPushMatrix();
            this.modelBipedMain.bipedHead.postRender(0.0625F);
            item = itemstack1.getItem();

            IItemRenderer customRenderer = MinecraftForgeClient.getItemRenderer(itemstack1, EQUIPPED);
            boolean is3D = (customRenderer != null && customRenderer.shouldUseRenderHelper(EQUIPPED, itemstack1, BLOCK_3D));

            if (item instanceof ItemBlock)
            {
                if (is3D || RenderBlocks.renderItemIn3d(Block.getBlockFromItem(item).getRenderType()))
                {
                    f1 = 0.625F;
                    GL11.glTranslatef(0.0F, -0.25F, 0.0F);
                    GL11.glRotatef(90.0F, 0.0F, 1.0F, 0.0F);
                    GL11.glScalef(f1, -f1, -f1);
                }

                this.renderManager.itemRenderer.renderItem(par1EntityLiving, itemstack1, 0);
            }
            else if (item == Items.skull)
            {
                f1 = 1.0625F;
                GL11.glScalef(f1, -f1, -f1);
                String s = "";

                if (itemstack1.hasTagCompound() && itemstack1.getTagCompound().hasKey("SkullOwner", 8))
                {
                    s = itemstack1.getTagCompound().getString("SkullOwner");
                }

                TileEntitySkullRenderer.field_147536_b.func_147530_a(-0.5F, 0.0F, -0.5F, 1, 180.0F, itemstack1.getItemDamage(), s);
            }

            GL11.glPopMatrix();
        }

        if (itemstack != null && itemstack.getItem() != null)
        {
            item = itemstack.getItem();
            GL11.glPushMatrix();

            if (this.mainModel.isChild)
            {
                f1 = 0.5F;
                GL11.glTranslatef(0.0F, 0.625F, 0.0F);
                GL11.glRotatef(-20.0F, -1.0F, 0.0F, 0.0F);
                GL11.glScalef(f1, f1, f1);
            }

            this.modelBipedMain.bipedRightArm.postRender(0.0625F);
            GL11.glTranslatef(-0.0625F, 0.4375F, 0.0625F);

            IItemRenderer customRenderer = MinecraftForgeClient.getItemRenderer(itemstack, EQUIPPED);
            boolean is3D = (customRenderer != null && customRenderer.shouldUseRenderHelper(EQUIPPED, itemstack, BLOCK_3D));

            if (item instanceof ItemBlock && (is3D || RenderBlocks.renderItemIn3d(Block.getBlockFromItem(item).getRenderType())))
            {
                f1 = 0.5F;
                GL11.glTranslatef(0.0F, 0.1875F, -0.3125F);
                f1 *= 0.75F;
                GL11.glRotatef(20.0F, 1.0F, 0.0F, 0.0F);
                GL11.glRotatef(45.0F, 0.0F, 1.0F, 0.0F);
                GL11.glScalef(-f1, -f1, f1);
            }
            else if (item == Items.bow)
            {
                f1 = 0.625F;
                GL11.glTranslatef(0.0F, 0.125F, 0.3125F);
                GL11.glRotatef(-20.0F, 0.0F, 1.0F, 0.0F);
                GL11.glScalef(f1, -f1, f1);
                GL11.glRotatef(-100.0F, 1.0F, 0.0F, 0.0F);
                GL11.glRotatef(45.0F, 0.0F, 1.0F, 0.0F);
            }
            else if (item.isFull3D())
            {
                f1 = 0.625F;

                if (item.shouldRotateAroundWhenRendering())
                {
                    GL11.glRotatef(180.0F, 0.0F, 0.0F, 1.0F);
                    GL11.glTranslatef(0.0F, -0.125F, 0.0F);
                }

                this.func_82422_c();
                GL11.glScalef(f1, -f1, f1);
                GL11.glRotatef(-100.0F, 1.0F, 0.0F, 0.0F);
                GL11.glRotatef(45.0F, 0.0F, 1.0F, 0.0F);
            }
            else
            {
                f1 = 0.375F;
                GL11.glTranslatef(0.25F, 0.1875F, -0.1875F);
                GL11.glScalef(f1, f1, f1);
                GL11.glRotatef(60.0F, 0.0F, 0.0F, 1.0F);
                GL11.glRotatef(-90.0F, 1.0F, 0.0F, 0.0F);
                GL11.glRotatef(20.0F, 0.0F, 0.0F, 1.0F);
            }

            float f2;
            float f3;
            int i;

            if (itemstack.getItem().requiresMultipleRenderPasses())
            {
                for (i = 0; i < itemstack.getItem().getRenderPasses(itemstack.getItemDamage()); ++i)
                {
                    int j = itemstack.getItem().getColorFromItemStack(itemstack, i);
                    f2 = (float)(j >> 16 & 255) / 255.0F;
                    f3 = (float)(j >> 8 & 255) / 255.0F;
                    float f4 = (float)(j & 255) / 255.0F;
                    GL11.glColor4f(f2, f3, f4, 1.0F);
                    this.renderManager.itemRenderer.renderItem(par1EntityLiving, itemstack, i);
                }
            }
            else
            {
                i = itemstack.getItem().getColorFromItemStack(itemstack, 0);
                float f5 = (float)(i >> 16 & 255) / 255.0F;
                f2 = (float)(i >> 8 & 255) / 255.0F;
                f3 = (float)(i & 255) / 255.0F;
                GL11.glColor4f(f5, f2, f3, 1.0F);
                this.renderManager.itemRenderer.renderItem(par1EntityLiving, itemstack, 0);
            }

            GL11.glPopMatrix();
        }
    }

    protected void func_82422_c()
    {
        GL11.glTranslatef(0.0F, 0.1875F, 0.0F);
    }

    protected void func_82408_c(EntityLivingBase par1EntityLivingBase, int par2, float par3)
    {
        this.func_82408_c((EntityLiving)par1EntityLivingBase, par2, par3);
    }

    /**
     * Queries whether should render the specified pass or not.
     */
    protected int shouldRenderPass(EntityLivingBase par1EntityLivingBase, int par2, float par3)
    {
        return this.shouldRenderPass((EntityLiving)par1EntityLivingBase, par2, par3);
    }

    protected void renderEquippedItems(EntityLivingBase par1EntityLivingBase, float par2)
    {
        this.renderEquippedItems((EntityLiving)par1EntityLivingBase, par2);
    }

    /**
     * Actually renders the given argument. This is a synthetic bridge method, always casting down its argument and then
     * handing it off to a worker function which does the actual work. In all probabilty, the class Render is generic
     * (Render<T extends Entity) and this method has signature public void func_76986_a(T entity, double d, double d1,
     * double d2, float f, float f1). But JAD is pre 1.5 so doesn't do that.
     */
    public void doRender(EntityLivingBase par1Entity, double par2, double par4, double par6, float par8, float par9)
    {
        this.doRender((EntityLiving)par1Entity, par2, par4, par6, par8, par9);
    }

    /**
     * Actually renders the given argument. This is a synthetic bridge method, always casting down its argument and then
     * handing it off to a worker function which does the actual work. In all probabilty, the class Render is generic
     * (Render<T extends Entity) and this method has signature public void func_76986_a(T entity, double d, double d1,
     * double d2, float f, float f1). But JAD is pre 1.5 so doesn't do that.
     */
    public void doRender(Entity par1Entity, double par2, double par4, double par6, float par8, float par9)
    {
        this.doRender((EntityLiving)par1Entity, par2, par4, par6, par8, par9);
    }

    /*=================================== FORGE START =========================================*/
    /**
     * More generic ForgeHook version of the above function, it allows for Items to have more control over what texture they provide.
     *
     * @param entity Entity wearing the armor
     * @param stack ItemStack for the armor
     * @param slot Slot ID that the item is in
     * @param type Subtype, can be null or "overlay"
     * @return ResourceLocation pointing at the armor's texture
     */
    public static ResourceLocation getArmorResource(Entity entity, ItemStack stack, int slot, String type)
    {
        ItemArmor item = (ItemArmor)stack.getItem();
        String s1 = String.format("textures/models/armor/%s_layer_%d%s.png",
                bipedArmorFilenamePrefix[item.renderIndex], (slot == 2 ? 2 : 1), type == null ? "" : String.format("_%s", type));

        s1 = ForgeHooksClient.getArmorTexture(entity, stack, s1, slot, type);
        ResourceLocation resourcelocation = (ResourceLocation)field_110859_k.get(s1);

        if (resourcelocation == null)
        {
            resourcelocation = new ResourceLocation(s1);
            field_110859_k.put(s1, resourcelocation);
        }

        return resourcelocation;
    }
    /*=================================== FORGE END ===========================================*/
}