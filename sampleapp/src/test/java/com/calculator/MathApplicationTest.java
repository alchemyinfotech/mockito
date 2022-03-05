package com.calculator;


import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;


@RunWith(MockitoJUnitRunner.class)
public class MathApplicationTest {

	public MathApplicationTest() {
		super();
		// TODO Auto-generated constructor stub
	}


	@InjectMocks
	MathApplication mathApplication=new MathApplication();
	@Mock
	CalculatorService calcService;


	@Test
	   public void testAdd(){
	      //add the behavior of calc service to add two numbers
	      when(calcService.add(10.0,20.0)).thenReturn(30.00);
			
	      //test the add functionality
	      Assert.assertEquals(mathApplication.add(10.0, 20.0),30.0,0);
	      verify(calcService).add(10.0, 20.0);   
	}

	
}
