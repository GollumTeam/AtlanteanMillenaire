package com.gollum.atlanteanmillenaire.client.render;

import java.util.HashMap;

import org.lwjgl.opengl.GL11;

import com.gollum.atlanteanmillenaire.ModAtlanteanMillenaire;
import com.gollum.atlanteanmillenaire.client.ClientProxyAtlanteanMillenaire;
import com.gollum.atlanteanmillenaire.client.model.ModelArmChair;
import com.gollum.atlanteanmillenaire.client.model.ModelBase;
import com.gollum.atlanteanmillenaire.client.model.ModelLight;

import cpw.mods.fml.client.registry.ISimpleBlockRenderingHandler;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.RenderBlocks;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.IBlockAccess;

public class DemoRenderer extends AModelRenderer {

	private ModelArmChair modelDemo = new ModelArmChair();
	
	private HashMap<String, ResourceLocation> textures = new HashMap<String, ResourceLocation>();
	protected boolean isInventory;
	protected boolean light = false;
	protected boolean lightInventory = true;
	protected double scale = 1.0;
	protected double scaleInventory = 1.0;
	protected float alpha = 1.0F;
	
	
	@Override
	public void renderInventoryBlock(Block block, int metadata, int modelID, RenderBlocks renderer) {
		super.renderInventoryBlock(block, metadata, modelID, renderer);
	}
	
	@Override
	public boolean renderWorldBlock(IBlockAccess world, int x, int y, int z, Block block, int modelId, RenderBlocks renderer) {
		
		super.renderWorldBlock(world, x, y, z, block, modelId, renderer);
		this.renderModel(new ModelLight(), "armchair", x, y, z, 0);
//		this.renderModel(new ModelArmChair(), "armchair", x, y, z, 0);
		
		return true;
	}
	
	@Override
	public int getRenderId() {
		return ClientProxyAtlanteanMillenaire.DemoRenderID;
	}
}
