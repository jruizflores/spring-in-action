package com.jc.learning.springinaction.dessert;

import org.springframework.stereotype.Component;

@Component
public class Pie implements Dessert {

	public void taste() {
		System.out.println("Bye, bye, Miss American Pie");
	}

}
