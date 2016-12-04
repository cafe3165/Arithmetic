package test;
import test.Arith;
public class Fomula {
	public  void printFomula()
	{
		int i,j,k;
		for(i = 0;i < Arith.n;i++)
		{
			for(j = 0;j < Arith.lenS[i];j++)
			{
				for(k = 0;k < 2;k++)
				{
					if(Arith.S[i][j][1] == 1)
						switch(Arith.S[i][j][1])
						{
						case 13:System.out.println('+');break;
						case 14:System.out.println('-');break;
						case 15:System.out.println('*');break;
						case 16:System.out.println('/');break;
						case 11:System.out.println('(');break;
						case 12:System.out.println(')');break;
						default:System.out.println(Arith.S[i][j][0]);
						}
					else
					{
						System.out.println(Arith.S[i][j][0]+'/'+Arith.S[i][j][1]);
						
					}
				}
				System.out.print('=');			
			}
		}
	}
}

