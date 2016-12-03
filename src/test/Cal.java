package test;

public class Cal {
	public class cnum{
		int fz,fm;
		int next;
	};
	public static int gcd(int m, int n){
		while(true){
			if((m = m % n) == 0)return n;
			if((n = n % m) == 0)return m;
		}
	}
	@SuppressWarnings("null")
	public static cnum add(cnum a,cnum b){
		cnum c=null;
		c.fz=a.fz*b.fm+a.fm*b.fz;
		c.fm=a.fm*b.fm;
		int x=gcd(c.fz,c.fm);
		c.fz/=x;
		c.fm/=x;
		if(c.fm<0){
			c.fm=-c.fm;
			c.fz=-c.fz;
		}
		return c;
	}
	public static cnum del(cnum a,cnum b){
		b.fz=-b.fz;
		return add(a,b);
	}
	@SuppressWarnings("null")
	public static cnum mul(cnum a,cnum b){
		cnum c=null;
		c.fz=a.fz*b.fz;
		c.fm=a.fm*b.fm;
		int x=gcd(c.fz,c.fm);
		c.fz/=x;
		c.fm/=x;
		if(c.fm<0){
			c.fm=-c.fm;
			c.fz=-c.fz;
		}
		return c;
	}
	public static cnum unmul(cnum a,cnum b){
		int x=b.fm;
		b.fm=b.fz;
		b.fz=x;
		return mul(a,b);
	}
	@SuppressWarnings("null")
	public static cnum count(int nid, int lenid){
		cnum cnt = null,coutmp = null,re = null;
		int fuh = 1,fuh2 = 1;
		cnt.fz=0;
		cnt.fm=1;
		coutmp.fz=1;
		coutmp.fm=1;
		for(int coui=lenid;coui<Arith.lenS[nid];coui++){
			if(Arith.S[nid][coui][0]==11){
				re=count(nid,coui+1);
				lenid=re.next;
			}
			else{
				re.fz=Arith.S[nid][coui][0];
				re.fm=Arith.S[nid][coui][1];
			}
			if(fuh2==1){
				coutmp=mul(coutmp,re);
			}
			else{
				coutmp=unmul(coutmp,re);
			}
			coui++;
			if(coui==Arith.lenS[nid]){
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
		return cnt;
	}
	public static void cal(){
		cnum tmp=null;
		for(int cali=0;cali<Arith.n;cali++){
			tmp = count(cali, 0);
			Arith.score[cali][0]=tmp.fz;
			Arith.score[cali][1]=tmp.fm;
		}
	}
	
	/*public static void main(String[] args){
		
	}*/
}
