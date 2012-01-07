package com.bbf.springworkshop.fastfood.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FastFoodImpl implements FastFood {
	
	private static Logger logger = Logger.getLogger(FastFoodImpl.class.getName());
	
	@Autowired
	SecretRecipeBook recipeBook;
	@Autowired
	CookTeam team;
	List<Burger> order;
	
	public FastFoodImpl() {
		this.order = new ArrayList<Burger>();
	}
	
	@Override
	public Burger deliverBurger(BurgerType type) {
		Map<Ingredient, Integer> ingredientsNeeded =  recipeBook.getIngredientsAndQuantities(type);
		
		logger.info("Ready to prepare a burger");
		
		Burger burger = team.prepareBurger(ingredientsNeeded, type);
		this.order.add(burger);
		
		logger.info("Delivering burger: " + burger);
		return burger;
	}

	@Override
	public List<Burger> prepareOrder() {

		Scanner scanner = new Scanner(this.getClass().getResourceAsStream("/com/bbf/springworkshop/fastfood/resources/burger.txt"));
		
		try {
			while (scanner.hasNextLine()) {
				processOrder(scanner.nextLine());
			}
		} finally {
			scanner.close();
		}
		
		return this.order;
	}
	
	private void processOrder(String order) {
		Scanner scanner = new Scanner(order);
		scanner.useDelimiter(" ");
		int amount;
		String type;
		while (scanner.hasNext()) {
			type = scanner.next();
			amount = scanner.nextInt();
			deliverBurger(Enum.valueOf(BurgerType.class, type), amount);
		}
		
	}

	private void deliverBurger(BurgerType type, int amount) {
		
		for (int i = 1; i <= amount; i++) {
			deliverBurger(type);
		}
	}
	
}
