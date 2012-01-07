package com.bbf.springworkshop.fastfood.service;

import java.util.Map;

import org.springframework.stereotype.Service;

import com.bbf.springworkshop.fastfood.domain.Ingredient;
import com.bbf.springworkshop.fastfood.domain.NotEnoughIngredientsException;

@Service
public class StockService {
	
	public void verifyAndUpdateStock(Map<Ingredient, Integer> ingredient) throws NotEnoughIngredientsException {
		
	}
}