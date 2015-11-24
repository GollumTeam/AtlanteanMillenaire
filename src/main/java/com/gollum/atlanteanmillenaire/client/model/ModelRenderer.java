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
			
			public double x = 0.f;
			public double y = 0.f;
			public double z = 0.f;

			public Point3D() {
				this(0.f, 0.f, 0.f);
			}
			
			public Point3D(double x, double y, double z) {
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
				this.y = -this.y + 1.F;
			}

			public void mirrorZ() {
				this.y = -this.y;
			}
		}
		
		public ModelRenderer render;
		
		public double x = 0;
		public double y = 0;
		public double z = 0;
		
		public int w = 0;
		public int h = 0;
		public int l = 0;
		
		public Box (ModelRenderer render, double x, double y, double z, int w, int h, int l) {
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
			Point3D v = new Point3D((this.x + ((double) this.w)) * f5, (this.y + ((double) this.h)) * f5, (this.z + ((double) this.l)) * f5);
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
			
			double wBlock = Math.abs(p1.x - p2.x) / f5;
			double hBlock = Math.abs(p1.y - p2.y) / f5;
			double lBlock = Math.abs(p1.z - p2.z) / f5;
			
			double minU = c.getMinU();
			double minV = c.getMinV();
			double maxU = c.getMaxU();
			double maxV = c.getMaxV();
			
			double u, v, U, V;
			double pixelU, pixelV;
			double posX, posY;

			double dU = maxU - minU;
			double dV = maxV - minV;
			
			double unitU = dU / textureW;
			double unitV = dV / textureH;
			
			// Top
			
			maxU = minU + unitU*wBlock;
			maxV = minV + unitV*lBlock;
			dU = maxU - minU;
			dV = maxV - minV;
			pixelU = dU / wBlock;
			pixelV = dV / lBlock;
			
			posX = offsetX + lBlock;
			posY = offsetY + 0;
			
			u = minU + pixelU * posX;
			v = minV + pixelV * posY;
			U = maxU + pixelU * posX;
			V = maxV + pixelV * posY;
			
			tessellator.addVertexWithUV(p1.x, p2.y, p1.z, u, v);
			tessellator.addVertexWithUV(p1.x, p2.y, p2.z, u, V);
			tessellator.addVertexWithUV(p2.x, p2.y, p2.z, U, V);
			tessellator.addVertexWithUV(p2.x, p2.y, p1.z, U, v);
			
			// Bottom
			
			maxU = minU + unitU*wBlock;
			maxV = minV + unitV*lBlock;
			dU = maxU - minU;
			dV = maxV - minV;
			pixelU = dU / wBlock;
			pixelV = dV / lBlock;
			
			posX = offsetX + wBlock + lBlock;
			posY = offsetY + 0;
			
			u = minU + pixelU * posX;
			v = minV + pixelV * posY;
			U = maxU + pixelU * posX;
			V = maxV + pixelV * posY;
			
			tessellator.addVertexWithUV(p2.x, p1.y, p1.z, u, v);
			tessellator.addVertexWithUV(p2.x, p1.y, p2.z, u, V);
			tessellator.addVertexWithUV(p1.x, p1.y, p2.z, U, V);
			tessellator.addVertexWithUV(p1.x, p1.y, p1.z, U, v);
			
			// Front
			
			maxU = minU + unitU*wBlock;
			maxV = minV + unitV*hBlock;
			dU = maxU - minU;
			dV = maxV - minV;
			pixelU = dU / wBlock;
			pixelV = dV / hBlock;
			
			posX = offsetX + lBlock;
			posY = offsetY + lBlock;
			
			u = minU + pixelU * posX;
			v = minV + pixelV * posY;
			U = maxU + pixelU * posX;
			V = maxV + pixelV * posY;
			
			tessellator.addVertexWithUV(p1.x, p1.y, p2.z, u, V);
			tessellator.addVertexWithUV(p2.x, p1.y, p2.z, U, V);
			tessellator.addVertexWithUV(p2.x, p2.y, p2.z, U, v);
			tessellator.addVertexWithUV(p1.x, p2.y, p2.z, u, v);
			
			// Back
			
			maxU = minU + unitU*wBlock;
			maxV = minV + unitV*hBlock;
			dU = maxU - minU;
			dV = maxV - minV;
			pixelU = dU / wBlock;
			pixelV = dV / hBlock;
			
			posX = offsetX + wBlock + lBlock + lBlock;
			posY = offsetY + lBlock;
			
			u = minU + pixelU * posX;
			v = minV + pixelV * posY;
			U = maxU + pixelU * posX;
			V = maxV + pixelV * posY;
			
			tessellator.addVertexWithUV(p1.x, p2.y, p1.z, U, V);
			tessellator.addVertexWithUV(p2.x, p2.y, p1.z, u, V);
			tessellator.addVertexWithUV(p2.x, p1.y, p1.z, u, v);
			tessellator.addVertexWithUV(p1.x, p1.y, p1.z, U, v);
			
			// Left
			
			maxU = minU + unitU*lBlock;
			maxV = minV + unitV*hBlock;
			dU = maxU - minU;
			dV = maxV - minV;
			pixelU = dU / lBlock;
			pixelV = dV / hBlock;
			
			posX = offsetX + 0;
			posY = offsetY + lBlock;
			
			u = minU + pixelU * posX;
			v = minV + pixelV * posY;
			U = maxU + pixelU * posX;
			V = maxV + pixelV * posY;
			
			tessellator.addVertexWithUV(p1.x, p1.y, p1.z, u, V);
			tessellator.addVertexWithUV(p1.x, p1.y, p2.z, U, V);
			tessellator.addVertexWithUV(p1.x, p2.y, p2.z, U, v);
			tessellator.addVertexWithUV(p1.x, p2.y, p1.z, u, v);
			
			// Right
			
			maxU = minU + unitU*lBlock;
			maxV = minV + unitV*hBlock;
			dU = maxU - minU;
			dV = maxV - minV;
			pixelU = dU / lBlock;
			pixelV = dV / hBlock;
			
			posX = offsetX + lBlock + wBlock;
			posY = offsetY + lBlock;
			
			u = minU + pixelU * posX;
			v = minV + pixelV * posY;
			U = maxU + pixelU * posX;
			V = maxV + pixelV * posY;
			
			tessellator.addVertexWithUV(p2.x, p2.y, p1.z, U, v);
			tessellator.addVertexWithUV(p2.x, p2.y, p2.z, u, v);
			tessellator.addVertexWithUV(p2.x, p1.y, p2.z, u, V);
			tessellator.addVertexWithUV(p2.x, p1.y, p1.z, U, V);
		}
		
	}
	
	public boolean mirror;
	public float rotateAngleX;
	public float rotateAngleY;
	public float rotateAngleZ;
	
	public ArrayList<Box> boxs = new ArrayList<Box>();

	private int offsetX;
	private int offsetY;
	private int textureW;
	private int textureH;

	public ModelRenderer(ModelBase model, int U, int V) {
		this.offsetX = U;
		this.offsetY = V;
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
		
		p.translate(0.5F, 0.5F, 0.5F);
		
	}
	
	public void setRotationPoint(float f, float g, float h) {
		this.rotationPointX = f;
		this.rotationPointY = g;
		this.rotationPointZ = h;
	}

}
