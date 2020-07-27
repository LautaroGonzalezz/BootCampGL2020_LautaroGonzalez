package ejer7;

public interface Animal {
	
public void dormir();
public void sonidoAnimal();
default void come(String var) {
	System.out.println("el "+var+" se alimenta");
}

default void camina(String var) {
	System.out.println("el "+var+" camina");
}
}
