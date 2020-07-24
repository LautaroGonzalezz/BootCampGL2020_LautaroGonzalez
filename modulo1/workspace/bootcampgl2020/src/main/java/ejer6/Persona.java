package ejer6;

public  class Persona {
	private String nombre;
	private String casado;
	private int numeroDeHijos;
	private int dni;
	
	
	public Persona(String nom,String condicion,int numh,int dni1) {
		nombre=nom;
		casado=condicion;
		numeroDeHijos= numh;
		dni=dni1;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getNumeroDeHijos() {
		return numeroDeHijos;
	}
	public void setNumeroDeHijos(int numeroDeHijos) {
		this.numeroDeHijos = numeroDeHijos;
	}
	public String getCasado() {
		return casado;
	}
	public void setCasado(String casado) {
		this.casado = casado;
	}
	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}

	
	
}
