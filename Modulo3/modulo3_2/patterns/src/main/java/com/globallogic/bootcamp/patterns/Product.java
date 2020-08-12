package com.globallogic.bootcamp.patterns;

public class Product {
	
	private String name;
	
	private static final Product instance = new Product();
	
	private Product() {
		name="clavos";
	}
	
	public Product getInstance() {
		return this.instance;
	}
	
	public String mostrarDatos() {
		return name;
	}
}
