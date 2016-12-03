package test;
import java.util.Scanner;

/**
 * Input
 * Created by X on 2016/12/3.
 */
public class Input {
    public static void Input(){
        int num=Arith.n;
        int input[]=new int [num];
        Scanner s=new Scanner(System.in);
        for(int i=0;i<num;i++)
            input[i]=s.nextInt();
    }
}
