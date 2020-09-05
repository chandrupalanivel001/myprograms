package warmup2;
import java.util.Scanner;
public class ArrayCount9 {

	public static void main(String[] args) {
		int count=0;
		System.out.print("Enter the n value :");
		int n=new Scanner(System.in).nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++) {
			 System.out.print("Enter the integera["+i+"] :");
			  a[i]=new Scanner(System.in).nextInt();
			  if(a[i]==9)
				  count++;
		}
		System.out.println(count);
	}

}
