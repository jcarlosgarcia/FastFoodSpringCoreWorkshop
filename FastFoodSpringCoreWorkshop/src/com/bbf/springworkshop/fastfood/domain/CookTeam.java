package com.bbf.springworkshop.fastfood.domain;

import java.util.Map;

import org.springframework.stereotype.Component;

@Component
public class CookTeam {

	public Burger prepareBurger(Map<Ingredient, Integer> ingredients, BurgerType type) {
		return new Burger();
	}
	
}
