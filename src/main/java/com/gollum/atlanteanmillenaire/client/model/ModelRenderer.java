package com.gollum.atlanteanmillenaire.client.model;

import java.util.ArrayList;

import com.gollum.atlanteanmillenaire.client.model.ModelRenderer.Box.Point3D;
import com.gollum.atlanteanmillenaire.inits.ModBlocks;

import net.minecraft.client.renderer.Tessellator;
import net.minecraft.util.IIcon;

public class ModelRenderer {
	
	public static final float MIN_BOX_WIDTH = 16.f;
	
	public float rotationPointX = 0.0f;
	public float rotationPointY = 0.0f;
	public float rotationPointZ = 0.0f;
	
	public class Box {
		
		public class Point3D {
			
			public float x = 0.f;
			public float y = 0.f;
			public float z = 0.f;

			public Point3D() {
				this(0.f, 0.f, 0.f);
			}
			
			public Point3D(float x, float y, float z) {
				super();
				this.x = x;
				this.y = y;
				this.z = z;
			}

			public void translate(float x, float y, float z) {
				this.x += x;
				this.y += y;
				this.z += z;
			}

			public void mirrorX() {
				this.y = -this.y;
			}

			public void mirrorY() {
				this.y = -this.y;
			}

			public void mirrorZ() {
				this.y = -this.y;
			}
		}
		
		public ModelRenderer render;
		
		public float x = 0;
		public float y = 0;
		public float z = 0;
		
		public int w = 0;
		public int h = 0;
		public int l = 0;
		
		public Box (ModelRenderer render, float x, float y, float z, int w, int h, int l) {
			this.render = render;
			this.x = x;
			this.y = y;
			this.z = z;
			this.w = w;
			this.h = h;
			this.l = l;
		}
		
		protected Point3D getP2 (float f5) {
			Point3D v = new Point3D(this.x*f5, this.y*f5, this.z*f5);
			return v;
		}
		protected Point3D getP1 (float f5) {
			Point3D v = new Point3D((this.x + ((float) this.w)) * f5, (this.y + ((float) this.h)) * f5, (this.z + ((float) this.l)) * f5);
			return v;
		}
		
		protected Point3D transformPoint (Point3D p) {
			
			this.render.beforeTransformBox(p);
			
			return p;
		}
		
		public void render (float f5) {
			Tessellator tessellator = Tessellator.instance;
			
			Point3D p1 = getP1(f5);
			Point3D p2 = getP2(f5);
			
			p1 = this.transformPoint(p1);
			p2 = this.transformPoint(p2);
			
			IIcon c = ModBlocks.blockDemo.getIcon(0, 0);
			
			float minU = c.getMinU();
			float minV = c.getMinV();
			float maxU = c.getMaxU();
			float maxV = c.getMaxV();
			
			float u, v, U, V;
			
			u = minU + textureY / textureH;
			v = minV + textureX / textureW;
			
			u = minU;
			v = minV;
			
			U = maxU;
			V = maxV;
			
			u = 0;
			v = 0;
			
			U = 1;
			V = 1;

			
			// Back
			tessellator.addVertexWithUV(p1.x, p2.y, p1.z, u, v);
			tessellator.addVertexWithUV(p2.x, p2.y, p1.z, u, V);
			tessellator.addVertexWithUV(p2.x, p1.y, p1.z, U, V);
			tessellator.addVertexWithUV(p1.x, p1.y, p1.z, U, v);
			
			// Left
			tessellator.addVertexWithUV(p1.x, p1.y, p1.z, u, v);
			tessellator.addVertexWithUV(p1.x, p1.y, p2.z, u, V);
			tessellator.addVertexWithUV(p1.x, p2.y, p2.z, U, V);
			tessellator.addVertexWithUV(p1.x, p2.y, p1.z, U, v);
			
			// Right
			tessellator.addVertexWithUV(p2.x, p2.y, p1.z, u, v);
			tessellator.addVertexWithUV(p2.x, p2.y, p2.z, u, V);
			tessellator.addVertexWithUV(p2.x, p1.y, p2.z, U, V);
			tessellator.addVertexWithUV(p2.x, p1.y, p1.z, U, v);
			
			// Front
			tessellator.addVertexWithUV(p1.x, p1.y, p2.z, u, v);
			tessellator.addVertexWithUV(p2.x, p1.y, p2.z, u, V);
			tessellator.addVertexWithUV(p2.x, p2.y, p2.z, U, V);
			tessellator.addVertexWithUV(p1.x, p2.y, p2.z, U, v);
			
			// Bottom
			tessellator.addVertexWithUV(p2.x, p1.y, p1.z, u, v);
			tessellator.addVertexWithUV(p2.x, p1.y, p2.z, u, V);
			tessellator.addVertexWithUV(p1.x, p1.y, p2.z, U, V);
			tessellator.addVertexWithUV(p1.x, p1.y, p1.z, U, v);
			
			// Top
			tessellator.addVertexWithUV(p1.x, p2.y, p1.z, u, v);
			tessellator.addVertexWithUV(p1.x, p2.y, p2.z, u, V);
			tessellator.addVertexWithUV(p2.x, p2.y, p2.z, U, V);
			tessellator.addVertexWithUV(p2.x, p2.y, p1.z, U, v);
		}
		
	}
	
	public boolean mirror;
	public float rotateAngleX;
	public float rotateAngleY;
	public float rotateAngleZ;
	
	public ArrayList<Box> boxs = new ArrayList<Box>();

	private int textureX;
	private int textureY;
	private int textureW;
	private int textureH;

	public ModelRenderer(ModelBase model, int U, int V) {
		this.textureX = U;
		this.textureY = V;
	}

	public void addBox(float x1, float y1, float z1, int x2, int y2, int z2) {
		this.boxs.add(new Box(this, x1, y1, z1, x2, y2, z2));
	}

	public void setTextureSize(int w, int h) {
		this.textureW = w;
		this.textureH = w;
	}

	public void render(float f5) {
		for (Box box: this.boxs) {
			box.render(f5);
		}
	}
	
	public void beforeTransformBox(Point3D p) {
		p.translate(this.rotationPointX / MIN_BOX_WIDTH, this.rotationPointY / MIN_BOX_WIDTH, this.rotationPointZ / MIN_BOX_WIDTH);
		
		if (this.mirror) {
			p.mirrorY ();
		}
		
	}

	public void setRotationPoint(float f, float g, float h) {
		this.rotationPointX = f;
		this.rotationPointY = g;
		this.rotationPointZ = h;
	}

}
