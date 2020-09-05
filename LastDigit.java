import java.util.Scanner;
public class LastDigit {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.print("Enter the 1st integer :");
		int a=in.nextInt();
		System.out.print("Enter the 2nd integer :");
		int b=in.nextInt();
		System.out.print("Enter the 3rd integer :");
		int c=in.nextInt();
		if(((a>0)&&(b>0))&&(c>0)) {
			int d=(a%10);
			int e=(b%10);
			int f=(c%10);
			if((d==e)&&(e==f))
				System.out.println("True");
			else if (((d==e)||(e==f))||(f==d))
				System.out.println("True");
			else 
				System.out.println("False");
		}
		else
			System.out.println("False");
	}

}
