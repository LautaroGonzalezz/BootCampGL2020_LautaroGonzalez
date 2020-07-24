package ejer5_4;

public class Berlina extends Automovil {

	@Override
	void retoceder() {		
		System.out.println("auto berlina retrocediendo");
	}
	public static void main(String[] args) {
		Berlina auto= new Berlina();
		auto.avanzar();
		auto.retoceder();
	}
}
