package modulo1;

public class ElectricalOven extends ElectricalAppliance{
	private LedAppliance led;

	
	public ElectricalOven(LedAppliance leD) {
		led= leD;
	}
	
	public void print() {
		System.out.println("power: "+this.getPower());
	}

	public void TurnOn() {
		this.setPower(this.getPower()-75);
	}
	
	public void TurnLed() {
		this.setPower(led.TurnOn(this.getPower()));
	}
}
