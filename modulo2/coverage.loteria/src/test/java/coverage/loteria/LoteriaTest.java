package coverage.loteria;

import static org.junit.Assert.assertEquals;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import coverage.loteria.model.CartonGenerator;
public class LoteriaTest {

	private Loteria loteria;
	
	@Test
	@DisplayName("Test de Loteria")
	public void jugadaDeLoteria() {
		CartonGenerator carton = new CartonGenerator();
		loteria = new Loteria((float) 100.1, 10, carton);
		loteria.jugada();	
		assertEquals(false,loteria.hayGanadorUnico());
		boolean result=loteria.hayCuadrupleGanador();
		assertFalse(result);	
	}
}
