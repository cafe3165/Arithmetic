package test;

import java.util.Random;
import java.util.Random;

public class Gens {
	public void Gens(){

		Random rand ;
	  
	   rand = new Random(System.currentTimeMillis());
	   int jud = 0;
	   int jud1 =0;
	   int[][][] s = new int[10][30][2];
	   int[] lens = new int[20]; 
	   for (int i = 0; i<10; i++) {
	   for (int j = 0; j <30; j++) {
		     jud1 = rand.nextInt(2)+0;
		     //if(jud1==1)
	    	 s[i][j][0] = rand.nextInt(10)+1;
	    	 lens[i]++;
	    	 if(lens[i]>=3){
	    		 jud = rand.nextInt(2)+0;
	    		 if(jud==1)break;
	    	 }
	    	 j=j+1;
            s[i][j][0] = rand.nextInt(4)+13;
            lens[i]++;              
	    }
	    
	   }

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

}
