package com.gollum.atlanteanmillenaire.client.model;

public class ModelSofaCenter extends ModelBase {
	
	ModelRenderer chairBase;
	ModelRenderer chairBack;
	ModelRenderer foot4;
	ModelRenderer foot3;
	ModelRenderer foot1;
	ModelRenderer foot2;
	ModelRenderer cushion;

	public ModelSofaCenter() {
		this.textureWidth = 128;
		this.textureHeight = 128;

//		this.chairBase = new ModelRenderer(this, 0, 0);
//		this.chairBase.addBox(0.0F, 0.0F, 0.0F, 16, 8, 13);
//		this.chairBase.setRotationPoint(0.0F, 0.0F, 0.0F);
//		this.chairBase.setTextureSize(128, 128);
//		this.chairBase.mirror = true;
//		this.setRotation(this.chairBase, 0.0F, 0.0F, 0.0F);
		
		this.chairBase = new ModelRenderer(this, 0, 33);
		this.chairBase.addBox(0.0F, 0.0F, 0.0F, 16, 3, 16);
//		this.chairBase.setRotationPoint(-8.0F, 19.0F, -8.0F);
		this.chairBase.setTextureSize(128, 128);
		this.chairBase.mirror = true;
		this.setRotation(this.chairBase, 0.0F, 0.0F, 0.0F);
		
		this.chairBack = new ModelRenderer(this, 0, 13);
		this.chairBack.addBox(0.0F, 0.0F, 0.0F, 16, 14, 2);
		this.chairBack.setRotationPoint(-8.0F, 5.0F, 6.0F);
		this.chairBack.setTextureSize(128, 128);
		this.chairBack.mirror = true;
		
		this.setRotation(this.chairBack, 0.0F, 0.0F, 0.0F);
		this.foot4 = new ModelRenderer(this, 0, 54);
		this.foot4.addBox(0.0F, 0.0F, 0.0F, 2, 2, 2);
		this.foot4.setRotationPoint(6.0F, 22.0F, 6.0F);
		this.foot4.setTextureSize(128, 128);
		this.foot4.mirror = true;
		this.setRotation(this.foot4, 0.0F, 0.0F, 0.0F);
		this.foot3 = new ModelRenderer(this, 0, 54);
		this.foot3.addBox(0.0F, 0.0F, 0.0F, 2, 2, 2);
		this.foot3.setRotationPoint(-8.0F, 22.0F, 6.0F);
		this.foot3.setTextureSize(128, 128);
		this.foot3.mirror = true;
		this.setRotation(this.foot3, 0.0F, 0.0F, 0.0F);
		this.foot1 = new ModelRenderer(this, 0, 54);
		this.foot1.addBox(0.0F, 0.0F, 0.0F, 2, 2, 2);
		this.foot1.setRotationPoint(-8.0F, 22.0F, -8.0F);
		this.foot1.setTextureSize(128, 128);
		this.foot1.mirror = true;
		this.setRotation(this.foot1, 0.0F, 0.0F, 0.0F);
		this.foot2 = new ModelRenderer(this, 0, 54);
		this.foot2.addBox(0.0F, 0.0F, 0.0F, 2, 2, 2);
		this.foot2.setRotationPoint(6.0F, 22.0F, -8.0F);
		this.foot2.setTextureSize(128, 128);
		this.foot2.mirror = true;
		this.setRotation(this.foot2, 0.0F, 0.0F, 0.0F);
		this.cushion = new ModelRenderer(this, 67, 35);
		this.cushion.addBox(0.0F, 0.0F, 0.0F, 16, 3, 14);
		this.cushion.setRotationPoint(-8.0F, 16.0F, -7.5F);
		this.cushion.setTextureSize(128, 128);
		this.cushion.mirror = true;
		this.setRotation(this.cushion, 0.0F, 0.0F, 0.0F);
	}

	public void renderModel(float f5) {
		this.chairBase.render(f5);
//		this.chairBack.render(f5);
//		this.foot4.render(f5);
//		this.foot3.render(f5);
//		this.foot1.render(f5);
//		this.foot2.render(f5);
//		this.cushion.render(f5);
	}
	
}
