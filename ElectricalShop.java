import java.util.*;
public class ElectricalShop {
	public static int sum(int i,int j) {
		return i+j;
	}

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int b=in.nextInt();
		int n=in.nextInt();
		int m=in.nextInt();
		int k[]=new int[n];
		int u[]=new int[m];
		for(int i=0;i<n;i++) {
			k[i]=in.nextInt();
		}
		for(int i=0;i<m;i++) {
			u[i]=in.nextInt();
		}
		int max=-1;
		for(int i:k) {
			for(int j:u) {
				if((i+j<=b)&&(i+j>max)) {
					max=j+i;
				}
			}
		}
		System.out.println(max);
	}

}
