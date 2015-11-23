package com.gollum.atlanteanmillenaire.inits;

import net.minecraft.item.Item;

import static com.gollum.atlanteanmillenaire.ModAtlanteanMillenaire.config;

import com.gollum.core.ModGollumCoreLib;
import com.gollum.core.common.items.ItemBuilding;
import com.gollum.core.common.items.ItemInfos;
import com.gollum.core.common.items.ItemWrench;
import com.gollum.core.tools.helper.items.HItem;

public class ModItems {

	/////////////////////
	// Liste des items //
	/////////////////////
	public static Item itemDemo;
	
	public static void init() {
		ModItems.itemDemo = new HItem("itemDemo");
	}
}
