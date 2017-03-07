package com.jeffpeng.jmod.nei;

import com.jeffpeng.jmod.JMODRepresentation;
import com.jeffpeng.jmod.nei.actions.HideItem;
import com.jeffpeng.jmod.primitives.ModScriptObject;

public class Scripting extends ModScriptObject {
	public Scripting(JMODRepresentation owner){
		super(owner);
	}
	
	public void hideItem(String target){
		if(owner.testForMod("NotEnoughItems")) new HideItem(owner,target);
	}
	
	
}
