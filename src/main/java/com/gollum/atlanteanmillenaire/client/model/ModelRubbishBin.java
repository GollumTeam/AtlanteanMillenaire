package com.gollum.atlanteanmillenaire.client.model;

public class ModelRubbishBin extends ModelBase {
	
	ModelRenderer binLid;
	ModelRenderer binBase;
	ModelRenderer handleP1;
	ModelRenderer handleP2;
	ModelRenderer handleP3;

	public ModelRubbishBin() {
		this.textureWidth = 64;
		this.textureHeight = 64;
		
		this.binLid = new ModelRenderer(this, 0, 28);
		this.binLid.addBox(-1.0F, -2.0F, 0.0F, 14, 2, 14);
		this.binLid.setRotationPoint(-6.0F, 10.0F, -7.0F);
		this.binLid.setTextureSize(64, 64);
		this.binLid.mirror = true;
		this.setRotation(this.binLid, 0.0F, 0.0F, 0.0F);
		
		this.binBase = new ModelRenderer(this, 0, 0);
		this.binBase.addBox(0.0F, 0.0F, 0.0F, 12, 14, 12);
		this.binBase.setRotationPoint(-6.0F, 10.0F, -6.0F);
		this.binBase.setTextureSize(64, 64);
		this.binBase.mirror = true;
		
		this.handleP1 = new ModelRenderer(this, 0, 46);
		this.handleP1.addBox(6.0F, -3.0F, 10.0F, 1, 1, 1);
		this.handleP1.setRotationPoint(-6.0F, 10.0F, -8.0F);
		this.handleP1.setTextureSize(64, 64);
		this.handleP1.mirror = true;
		this.setRotation(this.handleP1, 0.0F, 0.0F, 0.0F);

		this.handleP2 = new ModelRenderer(this, 6, 46);
		this.handleP2.addBox(6.0F, -4.0F, 4.0F, 1, 1, 6);
		this.handleP2.setRotationPoint(-6.0F, 10.0F, -7.0F);
		this.handleP2.setTextureSize(64, 64);
		this.handleP2.mirror = true;
		this.setRotation(this.handleP2, 0.0F, 0.0F, 0.0F);
		
		this.handleP3 = new ModelRenderer(this, 0, 46);
		this.handleP3.addBox(6.0F, -3.0F, 4.0F, 1, 1, 1);
		this.handleP3.setRotationPoint(-6.0F, 10.0F, -7.0F);
		this.handleP3.setTextureSize(64, 64);
		this.handleP3.mirror = true;
		this.setRotation(this.handleP3, 0.0F, 0.0F, 0.0F);
	}

	public void renderModel(float f5) {
		this.binLid.render(f5);
		this.binBase.render(f5);
		this.handleP1.render(f5);
		this.handleP2.render(f5);
		this.handleP3.render(f5);
	}

//	public void setDoorProgess(float doorProgess) {
//		float rotation = -(doorProgess * (float) Math.PI / 2.0F);
//		this.binLid.rotateAngleZ = rotation;
//		this.handleP1.rotateAngleZ = rotation;
//		this.handleP2.rotateAngleZ = rotation;
//		this.handleP3.rotateAngleZ = rotation;
//	}
}
