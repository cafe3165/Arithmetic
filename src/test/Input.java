package test;
import java.util.Scanner;

import static java.lang.System.in;

/**
 * 答案输入格式：所有答案一行输入，用空格隔开
 * Created by X on 2016/12/3.
 */
public class Input {
    public static void Input(){
        int num = Arith.n;
        int input[][] = Arith.input;
        Scanner s = new Scanner(in);
        String answer=s.nextLine();
        String[] answerarray = answer.split(" ");
        String temp="";
        boolean flag=true;
        for(int i=0;i<num;i++){
            input[i][1]=1;
        }
        for(int i=0;i<num;i++){
            int t=0;
            for(int j=0;j<answerarray[i].length();j++){
                if(answerarray[i].charAt(j)>=48&&answerarray[i].charAt(j)<=57||answerarray[i].charAt(j)=='-'){
                    temp=temp+answerarray[i].charAt(j);
                    flag=true;
                }else{
                    if(flag){
                        int n=Integer.parseInt(temp);
                        input[i][t]=n;
                        t=1;
                        temp="";
                    }
                }
            }
            if(temp!="")
                input[i][t]=Integer.parseInt(temp);
                temp="";
        }

    }

}
