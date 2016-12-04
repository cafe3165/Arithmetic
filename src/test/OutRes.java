package test;

public class OutRes {

	
	public void outRes(){
		
		System.out.println("你答对了"+Arith.rightAnswer+"道题目！");
		float rightRate;
		rightRate=Arith.rightAnswer/Arith.n;
		if(rightRate<60.0){
			System.out.println("您本次小测不及格，希望您下次继续努力！");
		}
		else if(rightRate>=60.0&&rightRate<80.0){
			System.out.println("考得一般，说明有念。");
		}
		
		else{
			System.out.println("你很棒哦！");
		}
		
		
	}
	
}
