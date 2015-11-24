package com.gollum.atlanteanmillenaire.client.model;

import net.minecraft.entity.Entity;

public abstract class ModelBase {
	
	public int textureWidth = 0;
	public int textureHeight = 0;
	
	public abstract void renderModel(float f5);

	protected void setRotation(ModelRenderer model, float x, float y, float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}
	
}
