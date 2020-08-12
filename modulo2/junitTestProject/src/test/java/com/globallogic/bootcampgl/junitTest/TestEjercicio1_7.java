package com.globallogic.bootcampgl.junitTest;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;

public class TestEjercicio1_7 {

	
	public boolean validarMax(int maximo){
		 boolean max = false; 
		 for (int i = 0; i < maximo; i++) {
		  if(i == 3){
		   max = true;
		   break;
		  }
		 }
		 return max;
		}
	
	@Test
	public void testValidarMax() {
	 assertFalse("Esta variable no es true:", validarMax(2));
	 assertTrue("Esta variable no es false:",validarMax(5));
	}
}
