/**
 * 
 */
package mockito.example.services;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.when;

import java.util.stream.Stream;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import MiCustom.MiExcepcionCustom;
import mockito.example.services.impl.CalculatorServiceImpl;


@ExtendWith(MockitoExtension.class)
public class CalculatorServiceTest {

	@InjectMocks
	CalculatorServiceImpl calc = new CalculatorServiceImpl();
	
	@Mock
	BasicOperationsService basico;
	DataService data;
	
	//@Spy
	//CalculatorServiceImpl calco;
	
	@Test
	void testBasico() {
		when(basico.add(5,5)).thenReturn((double) 10);
		when(basico.subtract(10,2)).thenReturn((double) 8);
		when(basico.divide(2,2)).thenReturn((double) 1);
		when(basico.multiply(2,2)).thenReturn((double) 4);
		double value = calc.calculateSum(5, 5);
		System.out.println("valor 1: "+value);
		assertEquals(10,value);
		double value2 = basico.subtract(10, 2);
		System.out.println("valor 2: "+value2);
		assertEquals(8,value2);
		double value3 = basico.divide(2, 2);
		System.out.println("valor 3: "+value3);
		assertEquals(1,value3);
		double value4 = basico.multiply(2, 2);
		System.out.println("valor 3: "+value4);
		assertEquals(4,value4);
	}

	@Test
	void testPrueba3_4() {
		when(calc.getDataService().getListOfNumbers()).thenReturn(new int[] { 1, 2, 3, 4, 5 });
		int[] value= calc.getDataService().getListOfNumbers();
		for(int i=0; i< value.length;i++) {
			System.out.println(value[i]);
		}
		assertEquals(3, calc.calculateAverage());
	}
	
	@Test
	void testNull3_5() {
		when(data.getListOfNumbers()).thenReturn(null);
		assertEquals(null, calc.calculateAverage());
	}

	@Test
	void Test3_6() {
		IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
		        calc.calculateDivision(2, 0);
		    });
		System.out.println(exception.getMessage());
		assertEquals("Divider must not be 0",exception.getMessage());
	}
	
	@Test
	void Test3_7() {
		when(calc.calculateSum(2,3)).thenReturn((double) 5);
		double value = calc.calculateSum(2, 3);
		assertEquals("El resultado es: 5.0",calc.printResult(value));
	}
		
	@ParameterizedTest
	@ValueSource(ints = { 1, 2, 3, 4, 5 })
	void test3_8(int value) {
		assertEquals(true,calc.isEven(value));
	}
	
	 
	//@Test
	// void test3_9() {
	//	int suma = (int) calco.add(2, 2);
	//	assertEquals(4,suma);
//}
	
}
