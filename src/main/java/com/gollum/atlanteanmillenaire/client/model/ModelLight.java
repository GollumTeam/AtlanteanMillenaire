package com.gollum.atlanteanmillenaire.client.model;

import net.minecraft.entity.Entity;

public class ModelLight extends ModelBase {
	
	ModelRenderer lightWire;
	ModelRenderer lightBulb;
	ModelRenderer topBack;
	ModelRenderer topRight;
	ModelRenderer topLeft;
	ModelRenderer topFront;
	ModelRenderer midRight;
	ModelRenderer midFront;
	ModelRenderer midBack;
	ModelRenderer midLeft;

	public ModelLight() {
		this.textureWidth = 64;
		this.textureHeight = 32;
		this.lightWire = new ModelRenderer(this, 0, 0);
		this.lightWire.addBox(0.0F, 0.0F, 0.0F, 1, 5, 1);
		this.lightWire.setRotationPoint(0.0F, 8.0F, 0.0F);
		this.lightWire.setTextureSize(64, 32);
		this.lightWire.mirror = true;
		this.setRotation(this.lightWire, 0.0F, 0.0F, 0.0F);
		this.lightBulb = new ModelRenderer(this, 6, 0);
		this.lightBulb.addBox(0.0F, 0.0F, 0.0F, 3, 3, 3);
		this.lightBulb.setRotationPoint(-1.0F, 13.0F, -1.0F);
		this.lightBulb.setTextureSize(64, 32);
		this.lightBulb.mirror = true;
		this.setRotation(this.lightBulb, 0.0F, 0.0F, 0.0F);
		this.topBack = new ModelRenderer(this, 0, 22);
		this.topBack.addBox(0.0F, 0.0F, 0.0F, 5, 1, 1);
		this.topBack.setRotationPoint(-2.0F, 11.0F, 2.0F);
		this.topBack.setTextureSize(64, 32);
		this.topBack.mirror = true;
		this.setRotation(this.topBack, 0.0F, 0.0F, 0.0F);
		this.topRight = new ModelRenderer(this, 0, 12);
		this.topRight.addBox(0.0F, 0.0F, 0.0F, 1, 1, 3);
		this.topRight.setRotationPoint(2.0F, 11.0F, -1.0F);
		this.topRight.setTextureSize(64, 32);
		this.topRight.mirror = true;
		this.setRotation(this.topRight, 0.0F, 0.0F, 0.0F);
		this.topLeft = new ModelRenderer(this, 0, 7);
		this.topLeft.addBox(0.0F, 0.0F, 0.0F, 1, 1, 3);
		this.topLeft.setRotationPoint(-2.0F, 11.0F, -1.0F);
		this.topLeft.setTextureSize(64, 32);
		this.topLeft.mirror = true;
		this.setRotation(this.topLeft, 0.0F, 0.0F, 0.0F);
		this.topFront = new ModelRenderer(this, 0, 19);
		this.topFront.addBox(0.0F, 0.0F, 0.0F, 5, 1, 1);
		this.topFront.setRotationPoint(-2.0F, 11.0F, -2.0F);
		this.topFront.setTextureSize(64, 32);
		this.topFront.mirror = true;
		this.setRotation(this.topFront, 0.0F, 0.0F, 0.0F);
		this.midRight = new ModelRenderer(this, 10, 7);
		this.midRight.addBox(0.0F, 0.0F, 0.0F, 1, 6, 5);
		this.midRight.setRotationPoint(3.0F, 12.0F, -2.0F);
		this.midRight.setTextureSize(64, 32);
		this.midRight.mirror = true;
		this.setRotation(this.midRight, 0.0F, 0.0F, 0.0F);
		this.midFront = new ModelRenderer(this, 14, 19);
		this.midFront.addBox(0.0F, 0.0F, 0.0F, 7, 6, 1);
		this.midFront.setRotationPoint(-3.0F, 12.0F, -3.0F);
		this.midFront.setTextureSize(64, 32);
		this.midFront.mirror = true;
		this.setRotation(this.midFront, 0.0F, 0.0F, 0.0F);
		this.midBack = new ModelRenderer(this, 31, 19);
		this.midBack.addBox(0.0F, 0.0F, 0.0F, 7, 6, 1);
		this.midBack.setRotationPoint(-3.0F, 12.0F, 3.0F);
		this.midBack.setTextureSize(64, 32);
		this.midBack.mirror = true;
		this.setRotation(this.midBack, 0.0F, 0.0F, 0.0F);
		this.midLeft = new ModelRenderer(this, 23, 7);
		this.midLeft.addBox(0.0F, 0.0F, 0.0F, 1, 6, 5);
		this.midLeft.setRotationPoint(-3.0F, 12.0F, -2.0F);
		this.midLeft.setTextureSize(64, 32);
		this.midLeft.mirror = true;
		this.setRotation(this.midLeft, 0.0F, 0.0F, 0.0F);
	}
	
	@Override
	public void renderModel(float f5) {
		this.lightWire.render(f5);
		this.lightBulb.render(f5);
		this.topBack.render(f5);
		this.topRight.render(f5);
		this.topLeft.render(f5);
		this.topFront.render(f5);
		this.midRight.render(f5);
		this.midFront.render(f5);
		this.midBack.render(f5);
		this.midLeft.render(f5);
	}
}
