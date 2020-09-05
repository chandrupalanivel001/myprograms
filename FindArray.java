import java.lang.*;
import java.util.*;
public class FindArray {
	public static int Findans(int input1,int input2[]) {
		int ans=0,temp;
		int a[]=new int[input1];
		int a1[]=new int[input1];
		Arrays.sort(input2);
		for(int i=0;i<input1;i++) {
			if(input2[i]<10) {
				a[i]=input2[i];
			}
			else {
				a1[i]=input2[i];
			}
		}
		
		return ans;
	}

	public static void main(String[] args) {
		int n=new Scanner(System.in).nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=new Scanner(System.in).nextInt();
		}
		System.out.println(Findans(n,arr));
	}

}
