import java.util.Scanner;
public class InOrder {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.print("Enter the 1st integer :");
		int a=in.nextInt();
		System.out.print("Enter the 2nd integer :");
		int b=in.nextInt();
		System.out.print("Enter the 3rd integer :");
		int c=in.nextInt();
		System.out.print("Enter the bokn(True or False):");
		boolean d=in.nextBoolean();
		if(((a<b)&&(c>b))&&((d==true)||(d==false)))
			System.out.println("True");
		else if((c>b)&&(d==true))
			System.out.println("True");
		else
			System.out.println("False");
	}

}
