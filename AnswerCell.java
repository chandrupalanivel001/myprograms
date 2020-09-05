import java.util.Scanner;
public class AnswerCell {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.print("is morning :");
		boolean n=in.nextBoolean();
		System.out.print("is mom :");
		boolean m=in.nextBoolean();
		System.out.print("is a sleep :");
		boolean s=in.nextBoolean();
		if(n==m==s==true)
			System.out.println("false");
		else if(n==m==s==false)
			System.out.println("true");
		else if (n==m==false)
			if(s==true)
				System.out.println("False");
			else 
				System.out.println("false");
		else if(n==true)
			if(s==m==false)
				System.out.println("false");
			else 
				System.out.println("fasle");
		else if(n==s==false)
			if(m==true)
				System.out.println("true");
			else 
				System.out.println("false");
		else 
			System.out.println("false");
	}
}