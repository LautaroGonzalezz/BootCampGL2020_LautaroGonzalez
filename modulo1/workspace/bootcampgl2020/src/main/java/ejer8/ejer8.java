package ejer8;
import ejer6.Empleado;

public class ejer8 {
	public static void main(String[] args) {
		String var="esto es una excepcion";
		int a=0;
		try {
			a=12/0;
		}
		catch(NullPointerException e) {
			System.out.println("se genero una excepcion1: "+var);
		}catch(RuntimeException e) {
			System.out.println("se genero una excepcion: "+var);
			
		}finally {
			System.out.println("se ejecuta igual");
		}
		System.out.println("------------------------------------------------------------------");
		Empleado emp = null;
		try {
			emp.getNombre();
		}
		catch(NullPointerException e) {
			System.out.println("se generero una excepcion .null");
		}catch(RuntimeException e) {
			System.out.println("se genero una excepcion en tiempo de ejecucion");
		}
		System.out.println("------------------------------------------------------------------");	
		int[] vec= new int[1];
		try {
			for(int i=0;i<5;i++) {
				vec[i]=1;
				System.out.print(vec[i]);
			}
		}
		catch(NullPointerException e) {
			System.out.println("se generero una excepcion .null");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("\"Excepción: índice de array fuera de\r\n" + 
					"límites\"");
		}
	}
}
