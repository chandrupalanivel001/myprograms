import java.util.Scanner;
public class Array123 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.print("Enter the n value :");
		int n=in.nextInt();
		int a[]=new int[n];
		int count=0;
		for(int i=0;i<n;i++) {
			System.out.print("Enter the integer :");
			a[i]=in.nextInt();
			count++;
			for(int j=0;j<count-2;j++) {
				if(a[j]==1&&a[j+1]==2&&a[j+2]==3) 
					System.out.println("True");
				else 
					System.out.println("False");
			}
		}
		
	}

}
