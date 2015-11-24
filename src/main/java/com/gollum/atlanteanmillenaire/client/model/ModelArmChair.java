package com.gollum.atlanteanmillenaire.client.model;

import net.minecraft.entity.Entity;

public class ModelArmChair extends ModelBase {
	
	ModelRenderer chairBase;
	ModelRenderer chairBack;
	ModelRenderer chairSideR;
	ModelRenderer chairSideTopR;
	ModelRenderer chairSideL;
	ModelRenderer chairSideTopL;
	ModelRenderer foot4;
	ModelRenderer foot3;
	ModelRenderer foot1;
	ModelRenderer foot2;
	ModelRenderer cushion;

	public ModelArmChair() {
		this.textureWidth = 128;
		this.textureHeight = 128;
		
		this.chairBase = new ModelRenderer(this, 0, 108);
		this.chairBase.addBox(0.0F, 0.0F, 0.0F, 16, 3, 16);
//		this.chairBase.setRotationPoint(-8.0F, 19.0F, -8.0F);
		this.chairBase.setTextureSize(128, 128);
		this.chairBase.mirror = true;
//		this.setRotation(this.chairBase, 0.0F, 0.0F, 0.0F);
//		this.chairBack = new ModelRenderer(this, 0, 13);
//		this.chairBack.addBox(0.0F, 0.0F, 0.0F, 16, 14, 2);
//		this.chairBack.setRotationPoint(-8.0F, 5.0F, 6.0F);
//		this.chairBack.setTextureSize(128, 128);
//		this.chairBack.mirror = true;
//		this.setRotation(this.chairBack, 0.0F, 0.0F, 0.0F);
//		this.chairSideR = new ModelRenderer(this, 38, 9);
//		this.chairSideR.addBox(0.0F, 0.0F, 0.0F, 2, 6, 14);
//		this.chairSideR.setRotationPoint(6.0F, 13.0F, -8.0F);
//		this.chairSideR.setTextureSize(128, 128);
//		this.chairSideR.mirror = true;
//		this.setRotation(this.chairSideR, 0.0F, 0.0F, 0.0F);
//		this.chairSideTopR = new ModelRenderer(this, 75, 12);
//		this.chairSideTopR.addBox(0.0F, 0.0F, 0.0F, 3, 3, 14);
//		this.chairSideTopR.setRotationPoint(6.0F, 11.0F, -8.0F);
//		this.chairSideTopR.setTextureSize(128, 128);
//		this.chairSideTopR.mirror = true;
//		this.setRotation(this.chairSideTopR, 0.0F, 0.0F, 0.0F);
//		this.chairSideL = new ModelRenderer(this, 38, 9);
//		this.chairSideL.addBox(0.0F, 0.0F, 0.0F, 2, 6, 14);
//		this.chairSideL.setRotationPoint(-8.0F, 13.0F, -8.0F);
//		this.chairSideL.setTextureSize(128, 128);
//		this.chairSideL.mirror = true;
//		this.setRotation(this.chairSideL, 0.0F, 0.0F, 0.0F);
//		this.chairSideTopL = new ModelRenderer(this, 75, 12);
//		this.chairSideTopL.addBox(0.0F, 0.0F, 0.0F, 3, 3, 14);
//		this.chairSideTopL.setRotationPoint(-9.0F, 11.0F, -8.0F);
//		this.chairSideTopL.setTextureSize(128, 128);
//		this.chairSideTopL.mirror = true;
//		this.setRotation(this.chairSideTopL, 0.0F, 0.0F, 0.0F);
//		this.foot4 = new ModelRenderer(this, 0, 54);
//		this.foot4.addBox(0.0F, 0.0F, 0.0F, 2, 2, 2);
//		this.foot4.setRotationPoint(6.0F, 22.0F, 6.0F);
//		this.foot4.setTextureSize(128, 128);
//		this.foot4.mirror = true;
//		this.setRotation(this.foot4, 0.0F, 0.0F, 0.0F);
//		this.foot3 = new ModelRenderer(this, 0, 54);
//		this.foot3.addBox(0.0F, 0.0F, 0.0F, 2, 2, 2);
//		this.foot3.setRotationPoint(-8.0F, 22.0F, 6.0F);
//		this.foot3.setTextureSize(128, 128);
//		this.foot3.mirror = true;
//		this.setRotation(this.foot3, 0.0F, 0.0F, 0.0F);
//		this.foot1 = new ModelRenderer(this, 0, 54);
//		this.foot1.addBox(0.0F, 0.0F, 0.0F, 2, 2, 2);
//		this.foot1.setRotationPoint(-8.0F, 22.0F, -8.0F);
//		this.foot1.setTextureSize(128, 128);
//		this.foot1.mirror = true;
//		this.setRotation(this.foot1, 0.0F, 0.0F, 0.0F);
//		this.foot2 = new ModelRenderer(this, 0, 54);
//		this.foot2.addBox(0.0F, 0.0F, 0.0F, 2, 2, 2);
//		this.foot2.setRotationPoint(6.0F, 22.0F, -8.0F);
//		this.foot2.setTextureSize(128, 128);
//		this.foot2.mirror = true;
//		this.setRotation(this.foot2, 0.0F, 0.0F, 0.0F);
//		this.cushion = new ModelRenderer(this, 67, 35);
//		this.cushion.addBox(0.0F, 0.0F, 0.0F, 12, 3, 14);
//		this.cushion.setRotationPoint(-6.0F, 16.0F, -7.5F);
//		this.cushion.setTextureSize(128, 128);
//		this.cushion.mirror = true;
//		this.setRotation(this.cushion, 0.0F, 0.0F, 0.0F);
	}
	
	@Override
	public void renderModel(float f5) {
		this.chairBase.render(f5);
//		this.chairBack.render(f5);
//		this.chairSideR.render(f5);
//		this.chairSideTopR.render(f5);
//		this.chairSideL.render(f5);
//		this.chairSideTopL.render(f5);
//		this.foot4.render(f5);
//		this.foot3.render(f5);
//		this.foot1.render(f5);
//		this.foot2.render(f5);
//		this.cushion.render(f5);
	}
}
