import java.util.Scanner;
public class Swap {

	public static void main(String[] args) {
		String a,b,c;
		System.out.println("Enter the 1st string");
		a=new Scanner(System.in).next();
		System.out.println("Enter the 2nd string");
		b=new Scanner(System.in).next();
		c=a;
		a=b;
		b=c;
		System.out.println(a);
		System.out.println(b);

	}

}
