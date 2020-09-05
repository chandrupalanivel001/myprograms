import java.util.*;
public class Makes10 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("enter the 1st integer :");
		int a=in.nextInt();
		System.out.println("Enter the 2nd integer :");
		int b=in.nextInt();
		if(((a==10)||(b==10))||((a+b)==10))
			System.out.println("True");
		else
			System.out.println("False");

	}

}
