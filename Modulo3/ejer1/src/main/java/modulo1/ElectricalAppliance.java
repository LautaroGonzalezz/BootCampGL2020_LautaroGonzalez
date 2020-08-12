package modulo1;

public class ElectricalAppliance {

	private int power;
	
	public ElectricalAppliance() {
		power= 500;
	}
	
	public void TurnOn() {
		power= power-50;
	}
	
	public int getPower() {
		return power;
	}
	
	public void setPower(int poder) {
		power= poder;
	}
}
