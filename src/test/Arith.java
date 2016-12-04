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
		// TODO Auto-generated method stub
		
	//@SuppressWarnings("resource")
	Scanner s=new Scanner(System.in)	;
	n=s.nextInt();
	//System.out.println("hello!");
	//生成式子
	@SuppressWarnings("unused")
	Gens gs=new Gens();
	


//	//显示式子
	Fomula f=new Fomula();
	f.printFomula();
//	
	
//	//计算
	Cal c=new Cal();
	Cal.cal();
//	
	//用户输入答案
	
	
//	//对答案
//	Compare com=new Compare();
//	com.Compare();
//	
//	//输出结果
//	OutRes or=new OutRes();
//	or.outRes();
	
//		System.out.println("hello");
	}

}
