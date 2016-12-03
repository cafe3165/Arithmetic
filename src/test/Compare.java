package test;

import test.Arith;

public class Compare {
	
	public void Compare(){
		
		int count = Arith.n;
		
		for(int i = 0 ; i < count; i++){
			
			int score_Member = Arith.score[i][0]*Arith.input[i][1];
			int input_Member = Arith.input[i][0]*Arith.score[i][1];
				
			Arith.result[i] = (score_Member == input_Member)?true:false;
			
			if(Arith.result[i] == true){
				
				Arith.rightAnswer++;
			}
		}
	}
}
