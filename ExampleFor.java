import java.util.Scanner;
public class ExampleFor {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.print("Enter the n value :");
		int n=in.nextInt();
		for(int i=0;i<=n;i++) {
			System.out.println("Enter the name "+i+" :");
			String a=in.next();
			System.out.println("a["+i+"]="+a);
		}
		
	}
	

}
