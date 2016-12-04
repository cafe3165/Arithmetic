package Jtest;
import test.*;
import static org.junit.Assert.*;

import org.junit.Test;

import test.Arith;

public class FomulaTest {

	@Test
	public void testPrintFomula() {
		Arith.n=2;
		Arith.S[0][0][0]=1;
		Arith.S[0][0][1]=2;
		
		Arith.S[0][1][0]=13;
		Arith.S[0][1][1]=1;
		
		Arith.S[0][2][0]=1;
		Arith.S[0][2][1]=3;
		
		//////////////////////
		Arith.S[1][0][0]=1;
		Arith.S[1][0][1]=2;
		
		Arith.S[1][1][0]=13;
		Arith.S[1][1][1]=1;
		
		Arith.S[1][2][0]=1;
		Arith.S[1][2][1]=3;
		
		Arith.S[1][3][0]=14;
		Arith.S[1][3][1]=1;
		
		Arith.S[1][4][0]=1;
		Arith.S[1][4][1]=3;
		
		Arith.lenS[0]=3;
		Arith.lenS[1]=5;
		Fomula f=new Fomula();
		f.printFomula();
	
		
	}

}
