import java.util.*;
public class Targ {
	public static boolean find(int m,int n) {
		boolean ans=true;
		if(m==n) {
			ans=true;
		}
		else if(m!=n) {
			ans=false;
		}
		System.out.println(ans);
		return ans;
	}

	public static void main(String[] args) {
		int ans=0;
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int arr[]=new int[n];
		int ar[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=in.nextInt();
		}
		for(int i=0;i<n;i++) {
			for(int j=n-1;j<=0;j--) {
				ar[i]=arr[j];
			}
		}
		for(int i=0;i<n;i++) {
			if(find(arr[i],ar[i])) {
				ans+=1;
			}
		}
		System.out.println(ans);
	}

}
