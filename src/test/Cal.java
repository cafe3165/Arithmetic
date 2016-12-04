package test;

public class Cal {
	public static class cnum{
		int fz,fm;
		int next;
		
		cnum(int z,int m ){
			fz=z;fm=m;
		}
		
		cnum(){
			
		}
	};
	public static int gcd(int m, int n){
		while(true){
			m = m % n;
			if(m == 0)return n;
			n = n % m;
			if(n == 0)return m;
		}
	}
	public static cnum add(cnum a,cnum b){
		cnum c=new cnum(0,1);
		c.fz=a.fz*b.fm+a.fm*b.fz;
		c.fm=a.fm*b.fm;
		int x=gcd(c.fz,c.fm);
		c.fz/=x;
		c.fm/=x;
		if(c.fm<0){
			c.fm=-c.fm;
			c.fz=-c.fz;
		}
		c.next=a.next;
		return c;
	}
	public static cnum del(cnum a,cnum b){
		b.fz=-b.fz;
		return add(a,b);
	}
	public static cnum mul(cnum a,cnum b){
		cnum c=new cnum(0,1);
		c.fz=a.fz*b.fz;
		c.fm=a.fm*b.fm;
//		if(c.fz==0){
//			c.fm=1;
//			return c;
//		}
		int x=gcd(c.fz,c.fm);
		c.fz/=x;
		c.fm/=x;
		if(c.fm<0){
			c.fm=-c.fm;
			c.fz=-c.fz;
		}
		c.next=a.next;
		return c;
	}
	public static cnum unmul(cnum a,cnum b){
		int x=b.fm;
		b.fm=b.fz;
		b.fz=x;
		return mul(a,b);
	}
	public static cnum count(int nid, int lenid){
		cnum re = new cnum(0,1);
		
		int fuh = 1,fuh2 = 1;
		cnum cnt=new cnum(0,1);
		
//		cnt.fz=0;
//		cnt.fm=1;
		
		cnum coutmp=new cnum(1,1);
//		coutmp.fz=1;
//		coutmp.fm=1;
		for(int coui=lenid;coui<Arith.lenS[nid];coui++){
			
			if(Arith.S[nid][coui][0]==11){
				re=count(nid,coui+1);
				coui=re.next;
			}
			else{
				re.fz=Arith.S[nid][coui][0];
				re.fm=Arith.S[nid][coui][1];
			}
			//System.out.println(re.fz+ " "+ re.fm + " " + re.next);
			if(fuh2==1){
				coutmp=mul(coutmp,re);
			}
			else{
				coutmp=unmul(coutmp,re);
			}
			coui++;
			cnt.next=coui;
			if(Arith.S[nid][coui][0]==12||coui==Arith.lenS[nid]){
				//System.out.println("asda"+ cnt.next);
				if(fuh==1){
					cnt=add(cnt,coutmp);
				}
				else{
					cnt=del(cnt,coutmp);
				}
				break;
			}
			if(Arith.S[nid][coui][0]==13){
				if(fuh==1)cnt=add(cnt, coutmp);
				else cnt=del(cnt, coutmp);
				coutmp.fz=1;
				coutmp.fm=1;
				fuh2=1;
				fuh=1;
			}
			else if(Arith.S[nid][coui][0]==14){
				if(fuh==1)cnt=add(cnt, coutmp);
				else cnt=del(cnt, coutmp);
				coutmp.fz=1;
				coutmp.fm=1;
				fuh2=1;
				fuh=2;
			}
			else if(Arith.S[nid][coui][0]==15){
				fuh2=1;
			}
			else{
				fuh2=2;
			}
		}
		//System.out.println("out"+cnt.fz+" "+cnt.fm+" "+cnt.next);
		return cnt;
	}
	public static void cal(){
		cnum tmp=new cnum(0,1);
		for(int cali=0;cali<Arith.n;cali++){
			tmp = count(cali, 0);
			Arith.score[cali][0]=tmp.fz;
			Arith.score[cali][1]=tmp.fm;
			System.out.print(tmp.fz+" "+tmp.fm);
			System.out.println(" ");
		}
	}
	
	/*public static void main(String[] args){
		
	}*/
}
