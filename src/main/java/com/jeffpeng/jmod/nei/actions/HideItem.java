package com.jeffpeng.jmod.nei.actions;

import net.minecraft.item.ItemStack;
import codechicken.nei.api.API;

import com.jeffpeng.jmod.JMODRepresentation;
import com.jeffpeng.jmod.primitives.BasicAction;

import cpw.mods.fml.common.event.FMLLoadCompleteEvent;

public class HideItem extends BasicAction {
	
	private String itemToHide;
	
	public HideItem(JMODRepresentation owner, String is){
		super(owner);
		itemToHide = is;
	}
	
	@Override
	public boolean on(FMLLoadCompleteEvent event){
		Object is = lib.stringToItemStack(itemToHide);
		if(is instanceof ItemStack){
			API.hideItem((ItemStack) is);
			return true;
		}
		return false;
	}
	

	@Override
	public boolean isValid() {
		return true;
	}

}
