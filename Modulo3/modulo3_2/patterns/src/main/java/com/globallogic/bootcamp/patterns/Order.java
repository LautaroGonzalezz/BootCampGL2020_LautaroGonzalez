package com.globallogic.bootcamp.patterns;

public class Order {
	private String description;
	private int count;
	private Currency currency;
	private Product producto;
	
	public Order(Currency curren,Product product) {
		description = "des1";
		count = 10;
		currency = curren;
		producto = product;
	}
	
	public Currency getCurrency() {
		return currency;
	}
	
	public Product getProduct() {
		return producto;
	}
}
