import java.util.Scanner;
public class NearTen {

	public static void main(String[] args) {
		System.out.println("Enter the integer :");
		int a=new Scanner(System.in).nextInt();
		if(a>0) {
			int b=(a%10);
			if(b==2)
				System.out.println("True");
			else if(b==1)
				System.out.println("True");
			else if(b==(10-1))
				System.out.println("True");
			else if(b==(10-2))
				System.out.println("True");
			else 
				System.out.println("False");
		}
		else
			System.out.println("False");
	}

}
