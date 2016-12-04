package Jtest;
import test.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class OutResTest {

	
	@SuppressWarnings("deprecation")
	@Test
	public void testoutRes() {

		Arith.rightAnswer=6;
		
		Arith.n=10;
		
		OutRes or=new OutRes();
		double rr=or.outRes();
		System.out.println(rr);
		assertEquals(60.0,rr);
	}

}
