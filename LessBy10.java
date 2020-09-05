import java.util.Scanner;
public class LessBy10 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.print("Enter the 1st integer :");
		int a=in.nextInt();
		System.out.print("Enter the 2nd integer :");
		int b=in.nextInt();
		System.out.print("Enter the 3rd integer :");
		int c=in.nextInt();
		int d=a-b;
		int e=b-c;
		int f=c-a;
		if(((d==-10)||(e==-10))||(f==-10))
			System.out.println("Ture");
		else if(((d==10)||(e==10))||(f==10))
			System.out.println("Ture");
		else 
			System.out.println("False");
	}

}
