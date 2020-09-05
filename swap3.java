import java.util.Scanner;
public class swap3 {

	public static void main(String[] args) {
		int a,b,c;
		System.out.print("Enter the 1st number:");
		a=new Scanner(System.in).nextInt();
		System.out.print("Enter the 2nd number:");
		b=new Scanner(System.in).nextInt();
		System.out.print("Enter the 3rd number:");
		c=new Scanner(System.in).nextInt();
		a=a*b*c;
		b=a/(b*c);
		c=a/(b*c);
		a=a/(b*c);
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println("c="+c);
	}

}
