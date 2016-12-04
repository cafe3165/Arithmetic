package Jtest;
import test.*;
import static org.junit.Assert.*;

import org.junit.Test;

import test.Arith;

public class GensTest {

	@Test
	public void testGens() {
		
		Arith.n=2;
		Gens s=new Gens();
		
		Fomula f=new Fomula();
		f.printFomula();
		
		for(int i = 0;i < Arith.n;i++)
		{
			System.out.println(Arith.lenS[i]);
		for(int j=0;j<Arith.lenS[i];j++){
			   System.out.print("*"+j+" ");
				System.out.print(Arith.S[i][j][0]+" "+Arith.S[i][j][1]+" ");		
			
		}
		System.out.println(" ");
	}

		boolean flag=false;
		if(Arith.S[0][Arith.lenS[0]][0]<11&&Arith.S[1][Arith.lenS[1]][0]<11)
		{
			flag=true;
		}
		assertEquals(true, flag);
	}
}
