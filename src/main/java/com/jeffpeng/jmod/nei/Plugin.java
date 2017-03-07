package com.jeffpeng.jmod.nei;

import com.jeffpeng.jmod.JMODPlugin;
import com.jeffpeng.jmod.JMODPluginContainer;

import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.event.FMLInitializationEvent;

public class Plugin extends JMODPlugin {

	public Plugin(JMODPluginContainer container) {
		super(container);
		// TODO Auto-generated constructor stub
	}
	
	public void on(FMLInitializationEvent event) {
		if(Loader.isModLoaded("NotEnoughItem"))	new NEI_JMODConfig();
	}

}
