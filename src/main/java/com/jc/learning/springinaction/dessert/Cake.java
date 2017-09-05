package com.jc.learning.springinaction.dessert;

import org.springframework.stereotype.Component;

@Component
public class Cake implements Dessert {

	public void taste() {
		System.out.println("Fatting with the cake :)");
	}

}
