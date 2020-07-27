package ejer7_3;

import ejer7.Animal;

public class Hombre implements Persona,Animal {

	@Override
	public void hablar() {
		System.out.println("las personas hablan mucho");
		
	}

	@Override
	public void dormir() {
		System.out.println("el hombre duerme muchas horas");
		
	}

	@Override
	public void sonidoAnimal() {
		System.out.println("el hombre no hace sonidos de animal");
	}
	
	public static void main(String[] args) {
		Hombre hombre=new Hombre();
		hombre.hablar();
		hombre.dormir();
		hombre.sonidoAnimal();
	}

}
