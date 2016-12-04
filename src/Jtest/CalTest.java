package Jtest;
import test.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class CalTest {
	
	@Test
	public void testCal() {
		Arith.S[0][0][0]=11;
		Arith.S[0][0][1]=0;
		Arith.S[0][1][0]=4;
		Arith.S[0][1][1]=1;
		Arith.S[0][2][0]=16;
		Arith.S[0][2][1]=0;
		Arith.S[0][3][0]=11;
		Arith.S[0][3][1]=0;
		Arith.S[0][4][0]=10;
		Arith.S[0][4][1]=1;
		Arith.S[0][5][0]=16;
		Arith.S[0][5][1]=0;
		Arith.S[0][6][0]=2;
		Arith.S[0][6][1]=1;
		Arith.S[0][7][0]=12;
		Arith.S[0][7][1]=0;
		Arith.S[0][8][0]=14;
		Arith.S[0][8][1]=0;
		Arith.S[0][9][0]=4;
		Arith.S[0][9][1]=1;
		Arith.S[0][10][0]=12;
		Arith.S[0][10][1]=0;
		Arith.S[0][11][0]=13;
		Arith.S[0][11][1]=0;
		Arith.S[0][12][0]=2;
		Arith.S[0][12][1]=1;
		Arith.lenS[0]=13;
		Arith.n=1;
		Cal.cal();
		
	}

}
