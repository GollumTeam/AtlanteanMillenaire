package com.gollum.atlanteanmillenaire.client.model;

import java.util.ArrayList;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.renderer.Tessellator;

public class ModelRenderer {
	
	public float rotationPointX = 0.0f;
	public float rotationPointY = 0.0f;
	public float rotationPointZ = 0.0f;
	
	public class Box {
		
		public ModelRenderer render;
		
		public float x1 = 0;
		public float y1 = 0;
		public float z1 = 0;
		public int x2 = 0;
		public int y2 = 0;
		public int z2 = 0;
		
		public Box (ModelRenderer render, float x1, float y1, float z1, int x2, int y2, int z2) {
			this.render = render;
			this.x1 = x1;
			this.y1 = y1;
			this.z1 = z1;
			this.x2 = x2;
			this.y2 = y2;
			this.z2 = z2;
		}
		
		public void render (float f5) {
			
			Tessellator tessellator = Tessellator.instance;

			float sX = this.x1;
			float sY = this.y1;
			float sZ = this.z1;
			
			float fX = sX + ((float) x2) / 10.f;
			float fY = sY + ((float) y2) / 10.f;
			float fZ = sZ + ((float) z2) / 10.f;
			
			f5 = 0.1f;
			
			sX += this.render.rotationPointX * f5;
			sY += this.render.rotationPointY * f5;
			sZ += this.render.rotationPointZ * f5;
			fX += this.render.rotationPointX * f5;
			fY += this.render.rotationPointY * f5;
			fZ += this.render.rotationPointZ * f5;
			
			// Back
			tessellator.addVertexWithUV(sX, fY, sZ, 0, 32);
			tessellator.addVertexWithUV(fX, fY, sZ, 0, 32);
			tessellator.addVertexWithUV(fX, sY, sZ, 0, 32);
			tessellator.addVertexWithUV(sX, sY, sZ, 0, 32);
			
			// Left
			tessellator.addVertexWithUV(sX, sY, sZ, 0, 32);
			tessellator.addVertexWithUV(sX, sY, fZ, 0, 32);
			tessellator.addVertexWithUV(sX, fY, fZ, 0, 32);
			tessellator.addVertexWithUV(sX, fY, sZ, 0, 32);
			
			// Right
			tessellator.addVertexWithUV(fX, fY, sZ, 0, 32);
			tessellator.addVertexWithUV(fX, fY, fZ, 0, 32);
			tessellator.addVertexWithUV(fX, sY, fZ, 0, 32);
			tessellator.addVertexWithUV(fX, sY, sZ, 0, 32);
			
			// Front
			tessellator.addVertexWithUV(sX, sY, fZ, 0, 32);
			tessellator.addVertexWithUV(fX, sY, fZ, 0, 32);
			tessellator.addVertexWithUV(fX, fY, fZ, 0, 32);
			tessellator.addVertexWithUV(sX, fY, fZ, 0, 32);
			
			// Bottom
			tessellator.addVertexWithUV(fX, sY, sZ, 0, 32);
			tessellator.addVertexWithUV(fX, sY, fZ, 0, 32);
			tessellator.addVertexWithUV(sX, sY, fZ, 0, 32);
			tessellator.addVertexWithUV(sX, sY, sZ, 0, 32);
			
			// Top
			tessellator.addVertexWithUV(sX, fY, sZ, 0, 32);
			tessellator.addVertexWithUV(sX, fY, fZ, 0, 32);
			tessellator.addVertexWithUV(fX, fY, fZ, 0, 32);
			tessellator.addVertexWithUV(fX, fY, sZ, 0, 32);
		}
		
	}
	
	public boolean mirror;
	public float rotateAngleX;
	public float rotateAngleY;
	public float rotateAngleZ;
	
	public ArrayList<Box> boxs = new ArrayList<Box>();

	public ModelRenderer(ModelBase model, int i, int j) {
		// TODO Auto-generated constructor stub
	}

	public void addBox(float x1, float y1, float z1, int x2, int y2, int z2) {
		this.boxs.add(new Box(this, x1, y1, z1, x2, y2, z2));
	}

	public void setTextureSize(int i, int j) {
		// TODO Auto-generated method stub
	}

	public void render(float f5) {
		for (Box box: this.boxs) {
			box.render(f5);
		}
	}

	public void setRotationPoint(float f, float g, float h) {
		this.rotationPointX = f;
		this.rotationPointY = g;
		this.rotationPointZ = h;
	}

}
