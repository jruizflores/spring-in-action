package com.jc.learning.springinaction.dessert;

import org.springframework.stereotype.Component;

@Component
public class IceCream implements Dessert {

	public void taste() {
		System.out.println("Tasting a delicious ice cream");
	}

}
