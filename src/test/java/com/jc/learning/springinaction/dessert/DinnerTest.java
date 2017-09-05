package com.jc.learning.springinaction.dessert;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=DessertConfig.class)
public class DinnerTest {
	
	@Autowired
	private Dinner dinner;

	@Test
	public void testDessert() {
		Dessert dessert = dinner.getDessert();
		assertTrue("Not the right dessert", dessert instanceof Cake);
	}
}
