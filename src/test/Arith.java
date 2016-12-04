package test;
import java.util.*;

public class Arith {

	public static int[][][] S=new int[10][20][2];
	public static int[] lenS=new int [20];//
	public static int[][] score=new int[10][2];
	public static int[][] input=new int[10][2];	
	public static boolean[] result=new boolean[10];
	public static int n;
	public static int rightAnswer;
	
	public static void main(String[] args) {
		
		while(true){
	Scanner s=new Scanner(System.in)	;
	n=s.nextInt();
	//生成式子
	@SuppressWarnings("unused")
	Gens gs=new Gens();
	


//	//显示式子
	Fomula f=new Fomula();
	f.printFomula();
//	
	
//	//计算
	Cal.cal();
//	
	//用户输入答案
	Input.Input();
	
//	//对答案
	Compare com=new Compare();
	com.Compare();
//	
//	//输出结果
	OutRes or=new OutRes();
	or.outRes();
	
	int want=0;
	System.out.println("想不想再挑战一下？");
	System.out.println("再来一遍输入1，任意数字退出。");
	want=s.nextInt();
	if(want!=1) break;
	
		}
		System.out.println("再见！");
	}

}
