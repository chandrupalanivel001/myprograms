package warmup2;
import java.util.Scanner;
public class ArrayFront9 {

	public static void main(String[] args) {
		System.out.print("Enter the n value :");
		int n=new Scanner(System.in).nextInt();
		int[] a=new int[n];
		int count=0;
		for(int i=0;i<n;i++) {
			System.out.print("Enter the integer a["+i+"] :");
			a[i]=new Scanner(System.in).nextInt();
			if(i<3&&a[i]==9) {
				count++;
				
			}
			
		}
		if(count==3||count==2||count==1) 
			System.out.println("True");
		else
			System.out.println("False");
		
	}

}
