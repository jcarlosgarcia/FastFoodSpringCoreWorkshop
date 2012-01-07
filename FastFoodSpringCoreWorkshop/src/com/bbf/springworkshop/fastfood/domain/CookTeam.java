package com.bbf.springworkshop.fastfood.domain;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bbf.springworkshop.fastfood.service.OrderService;
import com.bbf.springworkshop.fastfood.service.StockService;

@Component
public class CookTeam {
	
	@Autowired
	StockService stockService;
	@Autowired
	OrderService orderService;
	
	public Burger prepareBurger(Map<Ingredient, Integer> ingredients, BurgerType type) {
		
		try {
			stockService.verifyAndUpdateStock(ingredients);
			orderService.addToNextOrder(ingredients);
		} catch (NotEnoughIngredientsException nei) {
			
		}
		
		return new Burger(type);
	}
	
}
