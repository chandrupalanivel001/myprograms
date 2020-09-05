import java.util.*;
public class IcyHot {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.print("Enter the 1st Temperature :");
		int a=in.nextInt();
		System.out.print("Enter the 2nd Temperature :");
		int b=in.nextInt();
		if((a<0)||(b>100))
			System.out.println("True");
		else if((a>100)||(b<0))
			System.out.println("True");
		else 
			System.out.println("False");
	}

}
