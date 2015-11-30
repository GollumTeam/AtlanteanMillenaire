package com.gollum.atlanteanmillenaire.common.block;

import com.gollum.atlanteanmillenaire.client.ClientProxyAtlanteanMillenaire;
import com.gollum.core.tools.helper.blocks.HBlock;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.Facing;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;

public class BlockDemo extends HBlock {
	
	protected IIcon iconTop;
	protected IIcon iconBottom;
	protected IIcon iconRight;
	protected IIcon iconFront;
	protected IIcon iconBack;
	
	protected String suffixTop    = "_top";
	protected String suffixBottom = "_bottom";
	protected String suffixLeft   = "_left";
	protected String suffixRight  = "_right";
	protected String suffixFront  = "_front";
	protected String suffixBack   = "_back";
	
	public BlockDemo(String registerName, boolean active) {
		super(registerName, Material.rock);
	}
	
	//////////////////////////
	//Gestion des textures  //
	//////////////////////////
	
	/**
	 * Enregistre les textures
	 * Depuis la 1.5 on est obligé de charger les texture fichier par fichier
	 */
	@Override
	public void registerBlockIcons(IIconRegister iconRegister) {
		this.registerBlockIconsTop   (iconRegister);
		this.registerBlockIconsBottom(iconRegister);
		this.registerBlockIconsLeft(iconRegister);
		this.registerBlockIconsRight(iconRegister);
		this.registerBlockIconsFront(iconRegister);
		this.registerBlockIconsBack(iconRegister);
		
	}
	protected void registerBlockIconsTop(IIconRegister iconRegister) {
		this.iconTop = helper.loadTexture(iconRegister, suffixTop);
	}
	protected void registerBlockIconsBottom(IIconRegister iconRegister) {
		this.iconBottom = helper.loadTexture(iconRegister, suffixBottom);
	}
	protected void registerBlockIconsLeft(IIconRegister iconRegister) {
		this.blockIcon = helper.loadTexture(iconRegister, suffixLeft);
	}
	protected void registerBlockIconsRight(IIconRegister iconRegister) {
		this.iconRight = helper.loadTexture(iconRegister, suffixRight);
	}
	protected void registerBlockIconsFront(IIconRegister iconRegister) {
		this.iconFront = helper.loadTexture(iconRegister, suffixFront);
	}
	protected void registerBlockIconsBack(IIconRegister iconRegister) {
		this.iconBack = helper.loadTexture(iconRegister, suffixBack);
	}
	
	@Override
	public IIcon getIcon(int side, int metadata) {
		
		if (helper.vanillaTexture) return super.getIcon(side, metadata);
		
		switch (side) {
			case 0: 
				return this.iconBottom;
			case 1: 
				return this.iconTop;
			case 2: 
				return this.iconBack;
			case 3: 
				return this.iconFront;
			case 4: 
				return this.blockIcon;
			case 5: 
				return this.iconRight;
		}
		
		
		return this.blockIcon;
	}
	
	///////////////////
	// Data du block //
	///////////////////
	
	public int getOrientation(int metadata) {
		return metadata;
	}
	
	/**
	 * The type of render function that is called for this block
	 */
	@Override
	public int getRenderType() {
		return ClientProxyAtlanteanMillenaire.demoRenderID;
	}
	
	/**
	 * Is this block (a) opaque and (b) a full 1m cube? This determines whether
	 * or not to render the shared face of two adjacent blocks and also whether
	 * the player can attach torches, redstone wire, etc to this block.
	 */
	@Override
	public boolean isOpaqueCube() {
		return false;
	}

	/**
	 * If this block doesn't render as an ordinary block it will return False
	 * (examples: signs, buttons, stairs, etc)
	 */
	@Override
	public boolean renderAsNormalBlock() {
		return false;
	}
	
	@SideOnly(Side.CLIENT)
	public boolean shouldSideBeRendered(IBlockAccess world, int x, int y, int z, int side) {
		return true;
	}
}
