package com.gollum.atlanteanmillenaire.client.model;

import java.util.ArrayList;

import com.gollum.atlanteanmillenaire.client.model.ModelRenderer.Box.Point3D;
import com.gollum.atlanteanmillenaire.inits.ModBlocks;

import javafx.scene.transform.Transform;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.util.MathHelper;
import net.minecraft.util.Tuple;

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
		
		protected Point3D getP2 () {
			Point3D v = new Point3D(this.x, this.y, this.z);
			return v;
		}
		protected Point3D getP1 () {
			Point3D v = new Point3D(this.x + ((float) this.w) / MIN_BOX_WIDTH, this.y + ((float) this.h) / MIN_BOX_WIDTH, this.z + ((float) this.l) / MIN_BOX_WIDTH);
			return v;
		}
		
		protected Point3D transformPoint (Point3D p) {
			
			this.render.beforeTransformBox(p);
			
			return p;
		}
		
		public void render (float f5) {
			Tessellator tessellator = Tessellator.instance;
			
			Point3D p1 = getP1();
			Point3D p2 = getP2();
			
			p1 = this.transformPoint(p1);
			p2 = this.transformPoint(p2);
			
			// Back
			tessellator.addVertexWithUV(p1.x, p2.y, p1.z, 0, 0);
			tessellator.addVertexWithUV(p2.x, p2.y, p1.z, 0, 1);
			tessellator.addVertexWithUV(p2.x, p1.y, p1.z, 1, 1);
			tessellator.addVertexWithUV(p1.x, p1.y, p1.z, 1, 0);
			
			// Left
			tessellator.addVertexWithUV(p1.x, p1.y, p1.z, 0, 0);
			tessellator.addVertexWithUV(p1.x, p1.y, p2.z, 0, 1);
			tessellator.addVertexWithUV(p1.x, p2.y, p2.z, 1, 1);
			tessellator.addVertexWithUV(p1.x, p2.y, p1.z, 1, 0);
			
			// Right
			tessellator.addVertexWithUV(p2.x, p2.y, p1.z, 0, 0);
			tessellator.addVertexWithUV(p2.x, p2.y, p2.z, 0, 1);
			tessellator.addVertexWithUV(p2.x, p1.y, p2.z, 1, 1);
			tessellator.addVertexWithUV(p2.x, p1.y, p1.z, 1, 0);
			
			// Front
			tessellator.addVertexWithUV(p1.x, p1.y, p2.z, 0, 0);
			tessellator.addVertexWithUV(p2.x, p1.y, p2.z, 0, 1);
			tessellator.addVertexWithUV(p2.x, p2.y, p2.z, 1, 1);
			tessellator.addVertexWithUV(p1.x, p2.y, p2.z, 1, 0);
			
			// Bottom
			tessellator.addVertexWithUV(p2.x, p1.y, p1.z, 0, 0);
			tessellator.addVertexWithUV(p2.x, p1.y, p2.z, 0, 1);
			tessellator.addVertexWithUV(p1.x, p1.y, p2.z, 1, 1);
			tessellator.addVertexWithUV(p1.x, p1.y, p1.z, 1, 0);
			
			// Top
			tessellator.addVertexWithUV(p1.x, p2.y, p1.z, 0, 0);
			tessellator.addVertexWithUV(p1.x, p2.y, p2.z, 0, 1);
			tessellator.addVertexWithUV(p2.x, p2.y, p2.z, 1, 1);
			tessellator.addVertexWithUV(p2.x, p2.y, p1.z, 1, 0);
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
