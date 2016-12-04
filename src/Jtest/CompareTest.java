package Jtest;

import static org.junit.Assert.*;

import test.Arith;
import test.Compare;

import org.junit.Test;

public class CompareTest {

	@Test
	public void testCompare() {
		
		Arith.n = 1;
		
		Arith.score[0][1] = 4;
		Arith.score[0][0] = 2;
		Arith.input[0][1] = 2;
		Arith.input[0][0] = 1;
		
		Compare compare = new Compare();
		compare.Compare();
		
		assertEquals(true,compare.getResult(0));
	}

}
