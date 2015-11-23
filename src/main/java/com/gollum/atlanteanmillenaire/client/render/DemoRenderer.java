package com.gollum.atlanteanmillenaire.client.render;

import java.util.HashMap;

import org.lwjgl.opengl.GL11;

import com.gollum.atlanteanmillenaire.ModAtlanteanMillenaire;
import com.gollum.atlanteanmillenaire.client.model.JFIModel;
import com.gollum.atlanteanmillenaire.client.model.lights.ModelLight;

import cpw.mods.fml.client.registry.ISimpleBlockRenderingHandler;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.RenderBlocks;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.IBlockAccess;

public class DemoRenderer implements ISimpleBlockRenderingHandler {

	private ModelLight modelLight = new ModelLight();
	
	private HashMap<String, ResourceLocation> textures = new HashMap<String, ResourceLocation>();
	protected boolean isInventory;
	protected boolean light = false;
	protected boolean lightInventory = true;
	protected double scale = 1.0;
	protected double scaleInventory = 1.0;
	protected float alpha = 1.0F;
	
	
	@Override
	public void renderInventoryBlock(Block block, int metadata, int modelID, RenderBlocks renderer) {
		this.isInventory = true;
	}
	
	@Override
	public boolean renderWorldBlock(IBlockAccess world, int x, int y, int z, Block block, int modelId, RenderBlocks renderer) {
		
		this.isInventory = false;
		this.renderModel(this.modelLight, "lightbulb_on", x, y, z, 0);
		
		return true;
	}
	
	protected ResourceLocation getTexture (String name) {
		if (this.textures.containsKey(name)) {
			return this.textures.get (name);
		}
		ResourceLocation texture = new ResourceLocation(ModAtlanteanMillenaire.MODID.toLowerCase()+":textures/models/"+name+".png");
		this.textures.put(name, texture);
		return texture;
	}
	
	protected void renderModel(JFIModel model, String textureName, double x, double y, double z, float rotation) {
		Tessellator tessellator = Tessellator.instance;
		tessellator.draw();
		this.beforeRender(textureName, x, y, z, rotation);
		model.renderModel(0.0625F);
		this.endRender();
		tessellator.startDrawing(5);
	}
	
	protected void beforeRender(String textureName, double x, double y, double z, float rotation) {
		
		//this.bindTexture(this.getTexture(textureName));
		
		if (this.isInventory && this.lightInventory) {
			RenderHelper.enableGUIStandardItemLighting();
		} else {
			if (this.light) {
				RenderHelper.disableStandardItemLighting();
			} else {
				RenderHelper.enableStandardItemLighting();
			}
		}
		
		GL11.glPushMatrix();
		GL11.glPushMatrix();
		GL11.glTranslatef((float) x + 0.5F, (float) y + 0.5F + (float)(this.isInventory ? this.scaleInventory : 1.0), (float) z + 0.5F);
		GL11.glRotatef((float) rotation, 0.0F, 1.0F, 0.0F);
		GL11.glRotatef(180.0F, 0.0F, 0.0F, 1.0F);
		GL11.glScaled(
			this.scale * (this.isInventory ? this.scaleInventory : 1.0),
			this.scale * (this.isInventory ? this.scaleInventory : 1.0), 
			this.scale * (this.isInventory ? this.scaleInventory : 1.0)
		);
		
		if (this.alpha != 1.0F && !this.isInventory) {
			GL11.glEnable(GL11.GL_BLEND);
			GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
			GL11.glColor4f(1F, 1F, 1F, this.alpha);
		}
	}
	
	protected void endRender() {
		RenderHelper.enableGUIStandardItemLighting();
		GL11.glPopMatrix();
		if (this.alpha != 1.0F && !this.isInventory) {
			GL11.glDisable(GL11.GL_BLEND);
			GL11.glColor4f(1f, 1f, 1f, 1f);
		}
		GL11.glPopMatrix();
	}
	
	@Override
	public boolean shouldRender3DInInventory(int modelId) {
		return true;
	}
	
	@Override
	public int getRenderId() {
		return 0;
	}
}
