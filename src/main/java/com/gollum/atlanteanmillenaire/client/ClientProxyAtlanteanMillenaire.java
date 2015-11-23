package com.gollum.atlanteanmillenaire.client;

import com.gollum.atlanteanmillenaire.client.render.DemoRenderer;
import com.gollum.atlanteanmillenaire.common.CommonProxyAtlanteanMillenaire;

import cpw.mods.fml.client.registry.RenderingRegistry;

public class ClientProxyAtlanteanMillenaire extends CommonProxyAtlanteanMillenaire {

	/////////////////
	// Renders IDs //
	/////////////////
	public static int DemoRenderID;

	public void registerRenderers() {
		
		ClientProxyAtlanteanMillenaire.DemoRenderID  = RenderingRegistry.getNextAvailableRenderId();
		
		RenderingRegistry.registerBlockHandler(ClientProxyAtlanteanMillenaire.DemoRenderID, new DemoRenderer());
	}
}