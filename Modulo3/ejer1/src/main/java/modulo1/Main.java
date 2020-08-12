package modulo1;

public class Main {

	
	public static void main(String[] args) {
		ElectricalOven electrical= new ElectricalOven(new LedAppliance());
		electrical.print();
		electrical.TurnOn();
		electrical.print();
		electrical.TurnLed();
		electrical.print();
	}
}
