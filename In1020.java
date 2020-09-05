import java.util.*;
public class In1020 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.print("Enter the 1st integer :");
		int a=in.nextInt();
		System.out.print("Enter the 2nd integer :");
		int b=in.nextInt();
		if((a<=20)&&(a>=10))
			System.out.println("True");
		else if((b<=20)&&(b>=10))
			System.out.println("True");
		else
			System.out.println("False");
	}

}
