package test;

import java.util.Random;
import java.util.Random;

public class Gens {
	public void Gens(){

		   for (int i = 0; i<10; i++) {
			   for (int j = 0; j <lens[i]; j++) {
				   if(s[i][j][0]>=13&&s[i][j][0]<=16)
					   s[i][j][1] = 1;
				   else s[i][j][1] = rand.nextInt(10)+1;
			   
			    	             
			    }
			    
			   }
		   for (int i = 0; i<10; i++) {
			   System.out.println("num"+i+" "+lens[i]);
			   for (int j = 0; j <lens[i]; j++) {	  
				   System.out.print(s[i][j][0]+" "); 
				   System.out.print(s[i][j][1]+" "); 
				  
			   
			    }
			   System.out.print("\n");
			   }
		 
		  
		 
		  // return n;
		 }
		   
	   }

}
public static void main(String[] args) {
}
}
