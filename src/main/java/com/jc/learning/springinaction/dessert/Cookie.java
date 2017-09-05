package com.jc.learning.springinaction.dessert;

import org.springframework.stereotype.Component;

@Component
public class Cookie implements Dessert {

	public void taste() {
		System.out.println("Having a cookie!");
	}

}
