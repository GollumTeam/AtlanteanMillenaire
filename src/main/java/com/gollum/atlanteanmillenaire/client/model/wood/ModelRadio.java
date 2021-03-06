package com.gollum.atlanteanmillenaire.client.model.wood;

import com.gollum.atlanteanmillenaire.client.model.JFIModel;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelRadio extends ModelBase implements JFIModel {
	
	ModelRenderer radio;
	ModelRenderer areial;
	ModelRenderer handlep3;
	ModelRenderer handlep2;
	ModelRenderer handlep1;
	ModelRenderer speakerpanel;
	ModelRenderer screen;
	ModelRenderer button2;
	ModelRenderer button1;

	public ModelRadio() {
		this.textureWidth = 64;
		this.textureHeight = 64;
		this.radio = new ModelRenderer(this, 0, 10);
		this.radio.addBox(0.0F, 0.0F, 0.0F, 14, 8, 5);
		this.radio.setRotationPoint(-7.0F, 16.0F, -2.5F);
		this.radio.setTextureSize(64, 64);
		this.radio.mirror = true;
		this.setRotation(this.radio, 0.0F, 0.0F, 0.0F);
		this.areial = new ModelRenderer(this, 0, 0);
		this.areial.addBox(0.0F, 0.0F, 0.0F, 1, 7, 1);
		this.areial.setRotationPoint(-6.5F, 9.0F, 1.0F);
		this.areial.setTextureSize(64, 64);
		this.areial.mirror = true;
		this.setRotation(this.areial, 0.0F, 0.0F, 0.0F);
		this.handlep3 = new ModelRenderer(this, 19, 4);
		this.handlep3.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1);
		this.handlep3.setRotationPoint(3.0F, 15.0F, -0.5F);
		this.handlep3.setTextureSize(64, 64);
		this.handlep3.mirror = true;
		this.setRotation(this.handlep3, 0.0F, 0.0F, 0.0F);
		this.handlep2 = new ModelRenderer(this, 5, 1);
		this.handlep2.addBox(0.0F, 0.0F, 0.0F, 8, 1, 1);
		this.handlep2.setRotationPoint(-4.0F, 14.0F, -0.5F);
		this.handlep2.setTextureSize(64, 64);
		this.handlep2.mirror = true;
		this.setRotation(this.handlep2, 0.0F, 0.0F, 0.0F);
		this.handlep1 = new ModelRenderer(this, 5, 4);
		this.handlep1.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1);
		this.handlep1.setRotationPoint(-4.0F, 15.0F, -0.5F);
		this.handlep1.setTextureSize(64, 64);
		this.handlep1.mirror = true;
		this.setRotation(this.handlep1, 0.0F, 0.0F, 0.0F);
		this.speakerpanel = new ModelRenderer(this, 0, 29);
		this.speakerpanel.addBox(0.0F, 0.0F, 0.0F, 13, 4, 1);
		this.speakerpanel.setRotationPoint(-6.5F, 19.5F, -3.0F);
		this.speakerpanel.setTextureSize(64, 64);
		this.speakerpanel.mirror = true;
		this.setRotation(this.speakerpanel, 0.0F, 0.0F, 0.0F);
		this.screen = new ModelRenderer(this, 0, 25);
		this.screen.addBox(0.0F, 0.0F, 0.0F, 8, 2, 1);
		this.screen.setRotationPoint(-6.0F, 17.0F, -3.0F);
		this.screen.setTextureSize(64, 64);
		this.screen.mirror = true;
		this.setRotation(this.screen, 0.0F, 0.0F, 0.0F);
		this.button2 = new ModelRenderer(this, 26, 26);
		this.button2.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1);
		this.button2.setRotationPoint(5.0F, 17.5F, -3.0F);
		this.button2.setTextureSize(64, 64);
		this.button2.mirror = true;
		this.setRotation(this.button2, 0.0F, 0.0F, 0.0F);
		this.button1 = new ModelRenderer(this, 20, 26);
		this.button1.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1);
		this.button1.setRotationPoint(3.0F, 17.5F, -3.0F);
		this.button1.setTextureSize(64, 64);
		this.button1.mirror = true;
		this.setRotation(this.button1, 0.0F, 0.0F, 0.0F);
	}

	/**
	 * Sets the models various rotation angles then renders the model.
	 */
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		super.render(entity, f, f1, f2, f3, f4, f5);
		this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		this.radio.render(f5);
		this.areial.render(f5);
		this.handlep3.render(f5);
		this.handlep2.render(f5);
		this.handlep1.render(f5);
		this.speakerpanel.render(f5);
		this.screen.render(f5);
		this.button2.render(f5);
		this.button1.render(f5);
	}

	public void renderModel(float f5) {
		this.radio.render(f5);
		this.areial.render(f5);
		this.handlep3.render(f5);
		this.handlep2.render(f5);
		this.handlep1.render(f5);
		this.speakerpanel.render(f5);
		this.screen.render(f5);
		this.button2.render(f5);
		this.button1.render(f5);
	}

	private void setRotation(ModelRenderer model, float x, float y, float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	/**
	 * Sets the model's various rotation angles. For bipeds, par1 and par2 are
	 * used for animating the movement of arms and legs, where par1 represents
	 * the time(so that arms and legs swing back and forth) and par2 represents
	 * how "far" arms and legs can swing at most.
	 */
	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
	}
}
