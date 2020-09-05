import java.util.*;
public class UserIdGenerator {
	public static String IdGen(String input1,String input2,int input3,int input4) {
		int l1=input1.length();
		int l2=input2.length();
		int g,m=input3,n=input3;
		String h,i;
		if(l1>=l2){
			g=l1-1;
			h=input1.substring(g);
			i=(h+input2);
		}
		else{
			g=l2-1;
			h=input2.substring(g);
			i=(h+input1);
		}
		int j=0,l=0;
		while(input3!=0){
			j=j%10;
			input3=input3/10;
			l++;
		}
		int o=0,p=0,q;
		for(int u=0;u<input4;u++){
			o=m%10;
			m=m/10;
		}
		q=l-input4;
		for(int y=0;y<=q;y++){
			p=n%10;
			n=n/10;
		}
		int r=i.length();
		String s="";
		for(int t=0;t<r;t++){
			if(Character.isUpperCase(i.charAt(t))){
				s=s+Character.toLowerCase(i.charAt(t));
			}
			else{
				s=s+Character.toUpperCase(i.charAt(t));
			}
		}
		m=(10*p)+o;
		System.out.println(s+""+m);
		return s+m;
	}
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String a=in.next();
		String b=in.next();
		int c=in.nextInt();
		int d=in.nextInt();
		System.out.println(IdGen(a,b,c,d));

	}

}
