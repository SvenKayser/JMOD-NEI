package com.jeffpeng.jmod.nei;

import net.minecraft.item.ItemStack;
import codechicken.nei.api.API;

import com.jeffpeng.jmod.JMODPlugin;
import com.jeffpeng.jmod.JMODPluginContainer;
import com.jeffpeng.jmod.API.forgeevents.JMODHideItemStackEvent;

import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class Plugin extends JMODPlugin {

	public Plugin(JMODPluginContainer container) {
		super(container);
		// TODO Auto-generated constructor stub
	}
	
	public void on(FMLInitializationEvent event) {
		if(Loader.isModLoaded("NotEnoughItems"))	new NEI_JMODConfig();
	}
	
	@SubscribeEvent
	public void hideItemStack(JMODHideItemStackEvent event){
		if(Loader.isModLoaded("NotEnoughItems"))	API.hideItem((ItemStack) event.get());
	}

}
