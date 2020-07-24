package ejer6;

public class Empleado extends Persona implements Comparable<Empleado>  {
	private double sueldoBase;
	private double horasTrabajadasMes;
	private double tipoDeIRPF=17;
	private double sueldoBruto;
	private double sueldoHorasExtra;
	static private double importeHoraExtra;
	
public Empleado(String nombre,String casado,int cantidadH,int dni,double sueldo,double cantHoras){
	super(nombre,casado,cantidadH,dni);
	sueldoBase=sueldo;
	horasTrabajadasMes=cantHoras;
	this.actualizarValores();
}

public double getSueldoBase() {
	return sueldoBase;
}

public void setSueldoBase(double sueldoBase) {
	this.sueldoBase = sueldoBase;
}

public double getHorasTrabajadasMes() {
	return horasTrabajadasMes;
}

public void setHorasTrabajadasMes(double horasTrabajadasMes) {
	this.horasTrabajadasMes = horasTrabajadasMes;
}

public double getTipoDeIRPF() {
	return tipoDeIRPF;
}

public void setTipoDeIRPF(double tipoDeIRPF) {
	this.tipoDeIRPF = tipoDeIRPF;
}

public static double getImporteHoraExtra() {
	return importeHoraExtra;
}

public static void setImporteHoraExtra(double importeHoraExtra) {
	Empleado.importeHoraExtra = importeHoraExtra;
}

public double calculoHorasExtras() {
	sueldoHorasExtra=horasTrabajadasMes*importeHoraExtra;
	return sueldoHorasExtra;
}
public void calculaSueldoBruto() {
	setSueldoBruto(sueldoBase+this.calculoHorasExtras());;
}

public void calcularRetenciones() {
	if(super.getCasado().equals("si")) {
		tipoDeIRPF-=2;
	}
	if(super.getNumeroDeHijos()!=0) {
		tipoDeIRPF-=super.getNumeroDeHijos();
	}
}
public void actualizarValores() {
	this.calcularRetenciones();
	this.calculaSueldoBruto();
}

public void tooString() {
	System.out.println("Nombre: "+super.getNombre());
	System.out.println("Dni: "+super.getDni());
	System.out.println("Sueldo Base: "+this.getSueldoBase());
	System.out.println("Horas Extra: "+this.getHorasTrabajadasMes());
	System.out.println("Tipo De IRPF: "+this.getTipoDeIRPF());
	System.out.println("--------------------------------------------------");
}

public double getsueldoHorasExtra() {
	return sueldoBruto;
}

public void setSueldoBruto(double sueldoBruto) {
	this.sueldoBruto = sueldoBruto;
}


public int compareTo(Empleado emp) {
    if (this.getSueldoBase() < emp.getSueldoBase()) {
        return -1;
    }
    if (this.getSueldoBase() > emp.getSueldoBase()) {
        return 1;
    }
    return 0;
}



}
