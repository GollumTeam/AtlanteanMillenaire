package com.gollum.atlanteanmillenaire;

import com.gollum.atlanteanmillenaire.common.CommonProxyAtlanteanMillenaire;
import com.gollum.atlanteanmillenaire.common.config.ConfigAtlanteanMillenaire;
import com.gollum.atlanteanmillenaire.inits.ModBlocks;
import com.gollum.atlanteanmillenaire.inits.ModItems;
import com.gollum.atlanteanmillenaire.inits.ModRecipes;
import com.gollum.core.ModGollumCoreLib;
import com.gollum.core.common.i18n.I18n;
import com.gollum.core.common.log.Logger;
import com.gollum.core.common.mod.GollumMod;
import com.gollum.core.common.version.VersionChecker;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(
	modid = ModAtlanteanMillenaire.MODID,
	name = ModAtlanteanMillenaire.MODNAME,
	version = ModAtlanteanMillenaire.VERSION,
	acceptedMinecraftVersions = ModAtlanteanMillenaire.MINECRAFT_VERSION,
	dependencies = ModAtlanteanMillenaire.DEPENDENCIES
)
public class ModAtlanteanMillenaire extends GollumMod {

	public final static String MODID = "AtlanteanMillenaire";
	public final static String MODNAME = "Atlantean Millenaire";
	public final static String VERSION = "1.0.0DEV";
	public final static String MINECRAFT_VERSION = "1.7.10";
	public final static String DEPENDENCIES = "required-after:"+ModGollumCoreLib.MODID;
	
	@Instance(ModAtlanteanMillenaire.MODID)
	public static ModAtlanteanMillenaire instance;
	
	@SidedProxy(clientSide = "com.gollum.atlanteanmillenaire.client.ClientProxyAtlanteanMillenaire", serverSide = "com.gollum.atlanteanmillenaire.common.CommonProxyAtlanteanMillenaire")
	public static CommonProxyAtlanteanMillenaire proxy;
	
	/**
	 * Gestion des logs
	 */
	public static Logger log;
	
	/**
	 * Gestion de l'i18n
	 */
	public static I18n i18n;
	
	/**
	 * La configuration
	 */
	public static ConfigAtlanteanMillenaire config;
	
	@EventHandler public void handler(FMLPreInitializationEvent event)  { super.handler (event); }
	@EventHandler public void handler(FMLInitializationEvent event)     { super.handler (event); }
	@EventHandler public void handler(FMLPostInitializationEvent event) { super.handler (event); }
	
	/** 1 */
	@Override
	public void preInit(FMLPreInitializationEvent event) {
		
		// Initialisation des blocks
		ModBlocks.init ();
		
		// Initialisation des items
		ModItems.init ();
		
		// Test la version du mod
		new VersionChecker();
	}

	/** 2 **/
	public void init(FMLInitializationEvent event) {
		
		// Execution du renderer en fonction du serveur ou du client
		proxy.registerRenderers();
		
		// Ajout des recettes
		ModRecipes.init ();
		
	}
	
	/** 3 **/
	public void postInit(FMLPostInitializationEvent event) {
	}
}
