package com.bbf.springworkshop.fastfood;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bbf.springworkshop.fastfood.domain.Burger;
import com.bbf.springworkshop.fastfood.domain.FastFoodImpl;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		FastFoodImpl fastFood = (FastFoodImpl) appContext.getBean("fastFoodImpl");
		
		List<Burger> order = fastFood.prepareOrder();
		for (Burger b : order) {
			System.out.println(b.getBurgerType());
		}
		
	}

}
