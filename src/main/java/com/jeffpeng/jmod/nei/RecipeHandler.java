package com.jeffpeng.jmod.nei;

import com.jeffpeng.jmod.crafting.StringListRecipe;

import net.minecraft.item.ItemStack;
import codechicken.nei.NEIServerUtils;
import codechicken.nei.recipe.ShapedRecipeHandler;


public class RecipeHandler extends ShapedRecipeHandler {
	
	@Override
	public void loadCraftingRecipes(ItemStack result) {
        for (StringListRecipe slrecipe : StringListRecipe.recipeList) {
            if (NEIServerUtils.areStacksSameTypeCrafting(slrecipe.getRecipeOutputProxy(), result)) {
                CachedShapedRecipe recipe = new CachedShapedRecipe(slrecipe.getWidth(), slrecipe.getHeight(), slrecipe.getIngredientArray(), slrecipe.getRecipeOutputProxy());
                recipe.computeVisuals();
                arecipes.add(recipe);
            }
        }
    }
	
	 @Override
	 public void loadUsageRecipes(ItemStack ingredient) {
		 for (StringListRecipe slrecipe : StringListRecipe.recipeList) {
			 if (slrecipe.containsIngredient(ingredient)) {
				 CachedShapedRecipe recipe = new CachedShapedRecipe(slrecipe.getWidth(), slrecipe.getHeight(), slrecipe.getIngredientArray(), slrecipe.getRecipeOutputProxy());
	             recipe.computeVisuals();
	             arecipes.add(recipe);
	         }
		 }
	 }
}
