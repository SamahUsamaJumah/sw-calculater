package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import main.calc;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.Test;


class calcTest {
	@Test
	public void tstadd(int x, int y) {
	calc c = new calc();
	int res= c.add(3,7);
	assertTrue(10==res);

}	
   @Test(expected= ArithmeticException.class)

	public void tstMessage(int x, int y) {
	calc c = new calc();
	c.negtivetst(-3,-7);
	System.out.println("Inside tstMessage()");

}
}
