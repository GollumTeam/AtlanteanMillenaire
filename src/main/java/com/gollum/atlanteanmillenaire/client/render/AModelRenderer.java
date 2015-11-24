package com.gollum.atlanteanmillenaire.client.render;

import java.util.HashMap;

import org.lwjgl.opengl.GL11;

import com.gollum.atlanteanmillenaire.ModAtlanteanMillenaire;
import com.gollum.atlanteanmillenaire.client.model.ModelArmChair;
import com.gollum.atlanteanmillenaire.client.model.ModelBase;
import com.gollum.atlanteanmillenaire.client.model.ModelLight;
import com.gollum.atlanteanmillenaire.client.model.ModelRenderer;
import com.gollum.atlanteanmillenaire.client.render.texture.TextureModel;
import com.gollum.atlanteanmillenaire.inits.ModBlocks;

import cpw.mods.fml.client.registry.ISimpleBlockRenderingHandler;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.RenderBlocks;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.util.IIcon;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.IBlockAccess;

public abstract class AModelRenderer implements ISimpleBlockRenderingHandler {
	
	private HashMap<String, ResourceLocation> textures = new HashMap<String, ResourceLocation>();
	protected boolean isInventory = false;
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
		return true;
	}
	
	protected void renderModel(ModelBase model, String textureName, int x, int y, int z, float rotation, RenderBlocks renderer) {
		
		Tessellator tessellator = Tessellator.instance;
		tessellator.addTranslation(x, y, z);
		
//		IIcon icon = ;
		renderer.setOverrideBlockTexture(ModBlocks.blockDemo.getIcon(0, 0));
//		renderer.setOverrideBlockTexture(new TextureModel(textureName));
		model.renderModel(1.f / ModelRenderer.MIN_BOX_WIDTH);
		
		tessellator.addTranslation(-x, -y, -z);
		
		renderer.clearOverrideBlockTexture();
	}
	
	@Override
	public boolean shouldRender3DInInventory(int modelId) {
		return true;
	}
}
