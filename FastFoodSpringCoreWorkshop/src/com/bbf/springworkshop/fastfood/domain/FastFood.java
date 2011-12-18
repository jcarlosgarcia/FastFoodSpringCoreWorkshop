package com.bbf.springworkshop.fastfood.domain;

import java.util.List;

public interface FastFood {

	public Burger deliverBurger(BurgerType type);
	public List<Burger> prepareOrder();

}
