package test;

import java.util.Random;

public class Gens {
	
	public Gens(){

		Random rand;
		rand = new Random (System. currentTimeMillis());
		int jud=0;
		int jud1=0;
		int knum=0;
		int num=0;
	
		for(int i=0;i<Arith.n;i++){
			for(int j=0;j<20;j++){
				
				jud1=rand.nextInt(2)+0;	
				if(jud1==1&&num<3){
					Arith.S[i][j][0]=11;
					j++;
					Arith.lenS[i]++;
					knum++;
					num++;
				}
				
				Arith.S[i][j][0]=rand.nextInt(10)+1;
				Arith.lenS[i]++;
				j=j+1;
				
				
				jud1=rand.nextInt(2)+0;	
				if(j>=4&&j<35){
					if(knum>=1)jud1=1;
				if(jud1==1&&Arith.S[i][j-2][0]!=11&&knum!=0){
					Arith.S[i][j][0]=12;
					j++;
					Arith.lenS[i]++;
					if(knum>0)knum--;
				}}
				if(j>=35){
					jud1=1;
					if(jud1==1&&Arith.S[i][j-2][0]!=11&&knum!=0){
						Arith.S[i][j][0]=12;
					j++;
					Arith.lenS[i]++;knum--;}
				}
					
				if(Arith.lenS[i]>=5){
					jud=rand.nextInt(2)+0;
					if(jud==1&&knum==0)break;
				
				}
				Arith.S[i][j][0]=rand.nextInt(4)+13;
				Arith.lenS[i]++;
			}
		}
	 
	   for(int i=0;i<10;i++){
		   for(int j=0;j<Arith.lenS[i];j++){
			   if(Arith.S[i][j][0]>=1&&Arith.S[i][j][0]<=16)Arith.S[i][j][1]=1;
			   else Arith.S[i][j][1]=rand.nextInt(10)+1;
		   }
	   }

	   

	}
	

}
