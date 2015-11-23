package com.gollum.atlanteanmillenaire.inits;

import com.gollum.atlanteanmillenaire.common.block.BlockDemo;

import net.minecraft.creativetab.CreativeTabs;

public class ModBlocks {

	/////////////////////
	// Liste des blocs //
	/////////////////////
	
	public static BlockDemo blockDemo;
	
	public static void init() {
		
		ModBlocks.blockDemo = (BlockDemo)new BlockDemo ("blockDemo" ,true  ).setHardness(0.5F).setCreativeTab(CreativeTabs.tabBlock);
		
	}
	
}
