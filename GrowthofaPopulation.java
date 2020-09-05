import java.util.*;
public class GrowthofaPopulation {
	public static int nbYear(int p0, double percent, int aug, int p) {
		int ans=0,count=0;
		boolean a=true;
		percent=percent/100;
		int temp=p0;
		do {
			ans=(int)(temp+temp*percent+aug);
			temp=ans;
			count+=1;
			if(ans>=p) {
				a=false;
			}
		}while(a);
		return count;
	}
	public static void main(String[] args) {
		int p0=new Scanner(System.in).nextInt();
		double d=new Scanner(System.in).nextDouble();
		int aug=new Scanner(System.in).nextInt();
		int p=new Scanner(System.in).nextInt();
		System.out.println(nbYear(p0,d,aug,p));
	}

}
