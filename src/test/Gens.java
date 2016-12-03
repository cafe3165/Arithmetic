package test;

import java.util.Random;

public class Gens {
	
	public void Gens(){

		Random rand ;
	  
		rand = new Random(System.currentTimeMillis());
		   int jud = 0;
		   int jud1 =0;
		   for (int i = 0; i<10; i++) {
		   for (int j = 0; j <30; j++) {
			     jud1 = rand.nextInt(2)+0;
			     //if(jud1==1)
		    	 Arith.S[i][j][0] = rand.nextInt(10)+1;
		    	 Arith.lenS[i]++;
		    	 if(Arith.lenS[i]>=3){
		    		 jud = rand.nextInt(2)+0;
		    		 if(jud==1)break;
		    	 }
		    	 j=j+1;
	            Arith.S[i][j][0] = rand.nextInt(4)+13;
	            Arith.lenS[i]++;              
		    }
		    
		   }
	
			for (int i = 0; i<10; i++) {
				for (int j = 0; j <Arith.lenS[i]; j++) {
				 	if(Arith.S[i][j][0]>=13&&Arith.S[i][j][0]<=16)
						Arith.S[i][j][1] = 1;
					else Arith.S[i][j][1] = rand.nextInt(10)+1;
				   
				    	             
				}
				    
			}
			for (int i = 0; i<10; i++) {
				System.out.println("num"+i+" "+Arith.lenS[i]);
				 	for (int j = 0; j <Arith.lenS[i]; j++) {	  
					System.out.print(Arith.S[i][j][0]+" "); 
					System.out.print(Arith.S[i][j][1]+" "); 
					  
				   
				}
				System.out.print("\n");
			}
			 
			  
			 
			  // return n;
			}
			   
	
	}

