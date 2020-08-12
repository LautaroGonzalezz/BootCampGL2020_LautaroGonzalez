package com.globallogic.bootcampgl.junitTest;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;

public class Test2 {

	private static final String VAR1 = "lautaro";
	 private static final String VAR2 = "lautaro";
	 private static final String VAR3 = null;
	private static Long VAR4 = null;
	

	@Test
	@DisplayName(value = "test prueba2")
	public void test() {
		assertEquals(VAR1,VAR2);
		assertNull(VAR1,VAR3);
	}
	
	@Test
	public void ejercicio1_3() {
		assertTrue("esto es verdadero  ",25 >12);
		boolean var=false;
		if(25>27) {
			assertFalse("es falso",var);
		}
		assertFalse("es false ",25 > 27);	
	}
	
	@Test
	public void ejercicio1_4() {
		assertNull("verdadero",VAR3);
		VAR4 =  (long) 1;
		assertNotNull("no es null",1);
	}
	
	@Test
	public void ejercicio1_6() {
		metodo1_6 meto= new metodo1_6();
		assertEquals(meto.metodoEjercicio1_6(5,5),10);
		assertEquals("la suma esta mal"+meto.metodoEjercicio1_6(5,5),5);
	}	
	
	
}
