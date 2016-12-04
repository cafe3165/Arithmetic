package test;
import test.Arith;
public class Fomula {
	public  void printFomula()
	{
		int i,k;
		
		for(i = 0;i < Arith.n;i++)
		{
			
				 //  System.out.println("num"+i+" "+Arith.lenS[i]);
				   for(int j=0;j<Arith.lenS[i];j++){
					   if(Arith.S[i][j][1]==1){
						   
						   if(Arith.S[i][j][0]==11)System.out.print("(");
						   if(Arith.S[i][j][0]==12)System.out.print(")");
						   if(Arith.S[i][j][0]==13)System.out.print("+");
						   if(Arith.S[i][j][0]==14)System.out.print("-");
						   if(Arith.S[i][j][0]==15)System.out.print("*");
						   if(Arith.S[i][j][0]==16)System.out.print("/");
						   if(Arith.S[i][j][0]>=1&&Arith.S[i][j][0]<=10) System.out.print(Arith.S[i][j][0]+"/"+Arith.S[i][j][1]+" ");
					   }
					   else
					   System.out.print(Arith.S[i][j][0]+"/"+Arith.S[i][j][1]+" ");

				   }
//				   System.out.print("\n");
			   
				System.out.println("=");			
			
		}
	}
}

