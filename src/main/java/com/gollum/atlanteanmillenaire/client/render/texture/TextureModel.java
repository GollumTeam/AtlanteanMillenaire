package com.gollum.atlanteanmillenaire.client.render.texture;

import com.gollum.atlanteanmillenaire.ModAtlanteanMillenaire;
import com.google.common.collect.Lists;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import net.minecraft.client.resources.IResourceManager;
import net.minecraft.client.resources.data.AnimationFrame;
import net.minecraft.client.resources.data.AnimationMetadataSection;
import net.minecraft.crash.CrashReport;
import net.minecraft.crash.CrashReportCategory;
import net.minecraft.util.IIcon;
import net.minecraft.util.ReportedException;
import net.minecraft.util.ResourceLocation;

@SideOnly(Side.CLIENT)
public class TextureModel implements IIcon {

	private static HashMap<String, ResourceLocation> textures = new HashMap<String, ResourceLocation>();
	
	private String name;
	
	public TextureModel(String name) {
		this.name = name;
	}
	
	protected ResourceLocation getTexture (String name) {
		if (this.textures.containsKey(name)) {
			return this.textures.get (name);
		}
		ResourceLocation texture = new ResourceLocation(ModAtlanteanMillenaire.MODID.toLowerCase()+":textures/blocks/"+name+".png");
		this.textures.put(name, texture);
		return texture;
	}
	
	@Override
	public int getIconWidth() {
		return 128;
	}

	@Override
	public int getIconHeight() {
		return 32;
	}

	@Override
	public float getMinU() {
		// stub
		return 0;
	}

	@Override
	public float getMaxU() {
		// stub
		return 0;
	}

	@Override
	public float getInterpolatedU(double p_94214_1_) {
		// stub
		return 0;
	}

	@Override
	public float getMinV() {
		// stub
		return 0;
	}

	@Override
	public float getMaxV() {
		// stub
		return 0;
	}

	@Override
	public float getInterpolatedV(double p_94207_1_) {
		// stub
		return 0;
	}

	@Override
	public String getIconName() {
		// TODO Auto-generated method stub
		return null;
	}
}