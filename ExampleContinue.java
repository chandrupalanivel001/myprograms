import java.util.Scanner;
public class ExampleContinue {
	public static void main(String args[]) {
		Scanner in=new Scanner(System.in);
		System.out.print("Enter the n value:");
		int n=in.nextInt();
		for(int i=1;i<=n;i++) {
			if(i==5) {
				continue;
			}
			System.out.println(i);
		}
	}
}
