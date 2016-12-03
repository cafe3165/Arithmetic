package test;
import java.util.Scanner;

import static java.lang.System.in;

/**
 * Input
 * Created by X on 2016/12/3.
 */
public class Input {
    public static void Input(){
        int num = Arith.n;
        int input[][] = Arith.input;
        //Pattern pattern = Pattern.compile("[0-9]+");
        Scanner s = new Scanner(in);
        String answer=s.nextLine();
        String[] answerarray = answer.split(" ");
        String temp="";
        boolean flag=true;
        for(int i=0;i<10;i++){
            int t=0;
            for(int j=0;j<answerarray[i].length();j++){
                if(answerarray[i].charAt(j)>=48&&answerarray[i].charAt(j)<=57){
                    temp=temp+answerarray[i].charAt(j);
                    flag=true;
                }else{
                    if(flag){
                        int n=Integer.parseInt(temp);
                        input[i][t]=n;
                        t++;
                        temp="";
                        flag=false;
                    }
                }
            }
        }

    }
}
