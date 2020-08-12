package com.globallogic.bootcamp.patterns;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class TestOrder {
	@InjectMocks
	Currency currency;
	@InjectMocks
	Product product;

	@Test
	public void testOrder() {
		Order order1 = new Order(currency.getInstance(), product.getInstance());
		Order order2 = new Order(currency.getInstance(), product.getInstance());
		Currency data1 = order1.getCurrency();
		Currency data2 = order2.getCurrency();
		assertEquals(data1, data2);
		System.out.println(data1.mostrarDatos());
		System.out.println(data2.mostrarDatos());
		Product data3 = order1.getProduct();
		Product data4 = order2.getProduct();
		assertEquals(data3, data4);
		System.out.println(data3.mostrarDatos());
		System.out.println(data4.mostrarDatos());
	}
}
