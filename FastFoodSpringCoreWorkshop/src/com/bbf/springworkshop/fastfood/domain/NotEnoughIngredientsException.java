package com.bbf.springworkshop.fastfood.domain;

import java.util.Map;

public class NotEnoughIngredientsException extends Exception {
	
	Map missingIngredients;
	
	public NotEnoughIngredientsException() {
		
	}
	
	public NotEnoughIngredientsException(Map ingredients) {
		missingIngredients = ingredients;
	}
	
	public String getMessage() {
		return "Not enough ingredients";
	}
	
	public Map getMissingIngredient() {
		return missingIngredients;
	}
	
}
