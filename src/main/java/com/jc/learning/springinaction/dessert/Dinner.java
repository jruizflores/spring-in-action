package com.jc.learning.springinaction.dessert;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Dinner {

	private Dessert dessert;
	
	@Autowired
	public void setDessert(Dessert dessert) {
		this.dessert = dessert;
	}
	
	public void eat() {
		dessert.taste();
	}
	
	public Dessert getDessert() {
		return dessert;
	}
}
