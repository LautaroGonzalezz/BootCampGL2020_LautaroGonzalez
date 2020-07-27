package ejer8;

public class MiExcepcion extends Exception {
	private String cadena;
	
	public void mostrarCadena()  {
		if(cadena==null) {
			throw new NullPointerException("la cadena esta vacia");
		}
		else
		System.out.println(cadena);
	}
}
