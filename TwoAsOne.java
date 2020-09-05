import java.util.Scanner;
public class TwoAsOne {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.print("Enter the 1st integer :");
		int a=in.nextInt();
		System.out.print("Enter the 2nd integer :");
		int b=in.nextInt();
		System.out.print("Enter the 3rd integer :");
		int c=in.nextInt();
		if((((a+b)==c)||((a+c)==b))||((b+c)==a))
			System.out.println("True");
		else
			System.out.println("False");
	}

}
