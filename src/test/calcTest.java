package test;

import static org.junit.Assert.*;

import org.junit.Test;

import main.calc;

public class calcTest {

	@Test
	public void tstadd() {
	calc c = new calc();
	int res= c.add(3,7);
	assertTrue(10==res);

	}	
   @Test(expected= ArithmeticException.class)

	public void tstMessage() {
	calc c = new calc();
	c.negtivetst(-3,-7);
	System.out.println("Inside tstMessage()");

}


}
