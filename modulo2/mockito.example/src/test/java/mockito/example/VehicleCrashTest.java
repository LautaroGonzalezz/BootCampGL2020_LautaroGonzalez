package mockito.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import mockito.example.model.Vehicle;

@ExtendWith(MockitoExtension.class)
public class VehicleCrashTest {
	@Mock
	Vehicle vehicleMock; 
	VehicleCrash crashTest;
	
	@Test
	public void WhenNoCrashNoValueThenOk() {
		VehicleCrash crashTest = new VehicleCrash();
		
		assertEquals(0, crashTest.getTotalEnergy());
		assertEquals(0, crashTest.getTotalVehicles());
		assertEquals("No crashes measured",crashTest.toString());
	}

	@Test
	public void WhenCrashAndCorrectValueThenOk() {
		Mockito.when(vehicleMock.getMass()).thenReturn(10.0);

		Mockito.when(vehicleMock.getMaxSpeed()).thenReturn(5.0);

		crashTest.crash(vehicleMock);
	}

}
