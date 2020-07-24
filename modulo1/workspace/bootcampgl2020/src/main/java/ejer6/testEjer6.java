package ejer6;

import java.util.Scanner;
public class testEjer6 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Empleados emp=new Empleados();
		System.out.println("ingrese la cantidad de empleados menor o igual a 20");
		int cant=entrada.nextInt();
		emp.setArray(cant);
		System.out.println("ingrese importe por horas extras");
		Empleado.setImporteHoraExtra(entrada.nextDouble());
		for(int i=0;i<cant;i++) {
			System.out.println("ingrese primero el nombre,casado o no (si o no),cantidad de hijos,dni,"
					+ "sueldo y cantidad de horas trabajadas");
			Empleado emple =new Empleado(entrada.next(),entrada.next(),entrada.nextInt(),entrada.nextInt(),entrada.nextDouble(),entrada.nextDouble());
			emp.agragarEmpleados(emple);
		}
		emp.tooSting();
		emp.empleadosMejorPeorPagado();
		emp.empleadosMejorPeorPagadoExtra();
		emp.ordenar();
		emp.tooSting();
	}

}
