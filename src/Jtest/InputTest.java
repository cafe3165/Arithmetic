package Jtest;
import test.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class InputTest {

	
	
	@Test
	public void testInput() {
		Arith.n=2;
		Input.Input();
		int x,y;
	
		x=Arith.input[0][0];
		
		y=Arith.input[1][0];
		
		assertEquals(1, x);
		assertEquals(2, y);
		
		for(int i=0;i<Arith.n;i++){
			System.out.println(Arith.input[i][0]);
		}
	}

	

}
