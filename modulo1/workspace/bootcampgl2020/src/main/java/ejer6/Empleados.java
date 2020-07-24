package ejer6;

import java.util.Arrays;

public class Empleados {
	private Empleado[] empleados;
	private int dml=0;
	
	public void agragarEmpleados(Empleado emp) {
		empleados[dml]=emp;
		dml++;
	}
	
	public void setArray(int var) {
		empleados=new Empleado[var];
	}
	
	public void empleadosMejorPeorPagado() {
		double max=0;
		String nombreMax=null;
		double min=9999;
		String nombreMin=null;
		for(int i=0;i<dml;i++) {
			if(this.empleados[i].getSueldoBase()>max) {
				max=this.empleados[i].getSueldoBase();
				nombreMax=this.empleados[i].getNombre();
			}
			if(this.empleados[i].getSueldoBase()<min) {
				min=this.empleados[i].getSueldoBase();
				nombreMin=this.empleados[i].getNombre();
			}
		}
		System.out.println("la persona mejor pagada es: "+nombreMax+" la persona peor pagada es: "+nombreMin);
	}
	public void empleadosMejorPeorPagadoExtra() {
		double max=0;
		String nombreMax=null;
		double min=9999;
		String nombreMin=null;
		for(int i=0;i<dml;i++) {
			if(this.empleados[i].getsueldoHorasExtra()>max) {
				max=this.empleados[i].getSueldoBase();
				nombreMax=this.empleados[i].getNombre();
			}
			if(this.empleados[i].getsueldoHorasExtra()<min) {
				min=this.empleados[i].getSueldoBase();
				nombreMin=this.empleados[i].getNombre();
			}
		}
		System.out.println("la persona con mejor paga en horas extra es: "+nombreMax+" y la peor  es: "+nombreMin);	
	}
	
	public void ordenar() {
		Arrays.sort(this.empleados);
	}
	
	public void tooSting() {
		for(int i=0;i<dml;i++) {
			this.empleados[i].tooString();
		}
	}
}
