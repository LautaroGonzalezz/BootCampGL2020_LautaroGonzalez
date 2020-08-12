package com.globallogic.bootcamp.patterns;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class TestCurrency {

	@Mock
	Currency data;
	
	@Test
	public void testEjer1_2() {
		Currency data1 = data.getInstance();
		Currency data2 = data.getInstance();
		assertEquals(data1,data2);
	}
}
