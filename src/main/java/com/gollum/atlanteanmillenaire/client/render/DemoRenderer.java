package com.gollum.atlanteanmillenaire.client.render;

import java.util.HashMap;

import org.lwjgl.opengl.GL11;

import com.gollum.atlanteanmillenaire.ModAtlanteanMillenaire;
import com.gollum.atlanteanmillenaire.client.ClientProxyAtlanteanMillenaire;
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

	@Override
	public void renderInventoryBlock(Block block, int metadata, int modelID, RenderBlocks renderer) {
		
	}
	
	public void defineQuad(double x, double y, double z, double X, double Y, double Z) {
		
		Tessellator tessellator = Tessellator.instance;
		
		tessellator.addVertex(x, Y, Z);
		tessellator.addVertex(X, Y, Z);
		tessellator.addVertex(X, y, z);
		tessellator.addVertex(x, y, z);
	}
	
	@Override
	public boolean renderWorldBlock(IBlockAccess world, int x, int y, int z, Block block, int modelId, RenderBlocks renderer) {
		
		renderer.setRenderBounds(0.5, 0, 0, 1, 1, 1);
		renderer.renderStandardBlock(block, x, y, z);
		renderer.setRenderBounds(0.375, 0.125, 0, 0.5, 1, 1);
		renderer.renderStandardBlock(block, x, y, z);
		renderer.setRenderBounds(0.25, 0.125, 0, 0.375, 0.875, 1);
		renderer.renderStandardBlock(block, x, y, z);
		renderer.setRenderBounds(0.125, 0.25, 0, 0.25, 0.75, 1);
		renderer.renderStandardBlock(block, x, y, z);
		
//		Tessellator tessellator = Tessellator.instance;
//		tessellator.addTranslation(x, y, z);
		
		//top
		
//		defineQuad(0, 1, 0.375, 1, 1, 1);
//		defineQuad(0, 0.875, 0.25, 1, 0.875, 0.375);
		//defineQuad(0, 0.75, 0.125, 1, 0.75, 0.25);
		
		
		
		
		//front
		
		//tessellator.addVertex(0, 1, 0.325);
		//tessellator.addVertex(1, 1, 0.325);
		//tessellator.addVertex(1, 0.875, 0.325);
		//tessellator.addVertex(0, 0.875, 0.325);
		
		//tessellator.addVertex(0, 0.875, 0.25);
		//tessellator.addVertex(1, 0.875, 0.25);
		//tessellator.addVertex(1, 0.75, 0.25);
		//tessellator.addVertex(0, 0.75, 0.25);
		
		//tessellator.addVertex(0, 0.75, 0.125);
		//tessellator.addVertex(1, 0.75, 0.125);
		//tessellator.addVertex(1, 0.25, 0.125);
		//tessellator.addVertex(0, 0.25, 0.125);
		
		//tessellator.addVertex(0, 0.25, 0.25);
		//tessellator.addVertex(1, 0.25, 0.25);
		//tessellator.addVertex(1, 0.125, 0.25);
		//tessellator.addVertex(0, 0.125, 0.25);
		
		//tessellator.addVertex(0, 0.125, 0.5);
		//tessellator.addVertex(1, 0.125, 0.5);
		//tessellator.addVertex(1, 0, 0.5);
		//tessellator.addVertex(0, 0, 0.5);
		
		//back

		//tessellator.addVertex(1, 1, 1);
		//tessellator.addVertex(0, 1, 1);
		//tessellator.addVertex(0, 0, 1);
		//tessellator.addVertex(1, 0, 1);
		
		//right

//		defineQuad(1, 0, 0.5, 1, 1, 1);
//		defineQuad(1, 0.125, 0.325, 1, 1, 0.5);
//		defineQuad(1, 0.125, 0.25, 1, 0.875, 0.375);
//		defineQuad(1, 0.25, 0.125, 1, 0.75, 0.25);
//		
		//left

		//tessellator.addVertex(0, 1, 1);
		//tessellator.addVertex(0, 1, 0.5);
		//tessellator.addVertex(0, 0, 0.5);
		//tessellator.addVertex(0, 0, 1);

		//tessellator.addVertex(0, 1, 0.5);
		//tessellator.addVertex(0, 1, 0.325);
		//tessellator.addVertex(0, 0.125, 0.325);
		//tessellator.addVertex(0, 0.125, 0.5);

		//tessellator.addVertex(0, 0.875, 0.325);
		//tessellator.addVertex(0, 0.875, 0.25);
		//tessellator.addVertex(0, 0.125, 0.25);
		//tessellator.addVertex(0, 0.125, 0.325);

		//tessellator.addVertex(0, 0.75, 0.25);
		//tessellator.addVertex(0, 0.75, 0.125);
		//tessellator.addVertex(0, 0.25, 0.125);
		//tessellator.addVertex(0, 0.25, 0.25);
		
		//bottom

		//tessellator.addVertex(0, 0.25, 0.125);
		//tessellator.addVertex(1, 0.25, 0.125);
		//tessellator.addVertex(1, 0.25, 0.25);
		//tessellator.addVertex(0, 0.25, 0.25);

		//tessellator.addVertex(0, 0.125, 0.25);
		//tessellator.addVertex(1, 0.125, 0.25);
		//tessellator.addVertex(1, 0.125, 0.5);
		//tessellator.addVertex(0, 0.125, 0.5);

		//tessellator.addVertex(0, 0, 0.5);
		//tessellator.addVertex(1, 0, 0.5);
		//tessellator.addVertex(1, 0, 1);
		//tessellator.addVertex(0, 0, 1);
		
		
		
		
		
		
//		tessellator.addTranslation(-x, -y, -z);
		
		return true;
	}
	
	@Override
	public boolean shouldRender3DInInventory(int modelId) {
		return true;
	}
	
	@Override
	public int getRenderId() {
		return ClientProxyAtlanteanMillenaire.demoRenderID;
	}
}
