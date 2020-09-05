import java.util.Scanner;
public class TeenSum {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the integer a :");
		int a=in.nextInt();
		System.out.println("Enter the integer b");
		int b=in.nextInt();
		int c=a+b;
		if(c<=13)
			System.out.println(c);
		else
			System.out.println("19");

	}

}
