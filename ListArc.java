import java.util.*;
public class ListArc {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=in.nextInt();
		}
		in.close();
		Arrays.sort(arr);
		for(int a:arr) {
			for(int i=1;i<n;i++) {
				if(a==arr[i]) {
					a=arr[i];
				}
			}
		}
	}

}
