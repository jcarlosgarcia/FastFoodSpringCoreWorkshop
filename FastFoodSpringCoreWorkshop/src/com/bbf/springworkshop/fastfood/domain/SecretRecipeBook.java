package com.bbf.springworkshop.fastfood.domain;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

@Component
public class SecretRecipeBook {
	
	public Map<Ingredient, Integer> getIngredientsAndQuantities(BurgerType type) {
		return new HashMap<Ingredient, Integer>();
	}

}
