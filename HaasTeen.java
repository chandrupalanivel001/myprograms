import java.util.*;
public class HaasTeen {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.print("Enter the A person age :");
		int a=in.nextInt();
		System.out.print("Enter the B person age :");
		int b=in.nextInt();
		System.out.print("Enter the C person age :");
		int c=in.nextInt();
		if((a<=19)&&(a>=13))
			System.out.println("True");
		else if((b<=19)&&(b>=13))
			System.out.println("True");
		else if((c<=19)&&(c>=13))
			System.out.println("True");
		else
			System.out.println("False");
	}

}
