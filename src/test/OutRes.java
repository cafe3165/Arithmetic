package test;

public class OutRes {

	
	public double outRes(){
		
		System.out.println("您答对了"+Arith.rightAnswer+"道题目！");
		 double rightRate;
		rightRate=((double)Arith.rightAnswer/Arith.n)*100;
		System.out.println("分数为"+rightRate);
		if(rightRate<60.0){
			System.out.println("您本次小测不及格，希望您下次继续努力！");
		}
		else if(rightRate>=60.0&&rightRate<80.0){
			System.out.println("考得一般，说明有念。");
		}
		
		else{
			System.out.println("你很棒哦！");
		}
		return rightRate;
		
		
	}
	
}
