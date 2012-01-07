package com.bbf.springworkshop.fastfood.domain;

public class Burger {

	private BurgerType type;
	
	public Burger() {
		
	}
	
	public Burger(BurgerType type) {
		this.type = type;
	}
	
	public BurgerType getBurgerType() {
		return type;
	}
	
	public void setBurgerType(BurgerType type) {
		this.type = type;
	}
	
	@Override
	public String toString() {
		return "Burger - " + type;
		
	}
	
}
