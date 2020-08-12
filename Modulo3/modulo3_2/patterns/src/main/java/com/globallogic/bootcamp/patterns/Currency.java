package com.globallogic.bootcamp.patterns;

public class Currency {
	private String  name;
	
	private static final Currency instance = new Currency();
	
	private Currency() {
		name="ARS";
	}
	
	public Currency getInstance() {
		return this.instance;
	}
	
	public String mostrarDatos() {
		return name;
	}
		
}
