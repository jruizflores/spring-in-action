package com.jc.learning.springinaction.dessert;

import org.springframework.stereotype.Component;

import com.jc.learning.springinaction.dessert.annotation.Cold;
import com.jc.learning.springinaction.dessert.annotation.Creamy;

@Component
@Cold
@Creamy
public class Popsicle implements Dessert {

	public void taste() {
		System.out.println("Having a popsicle, not much of a dessert...");
	}

}
