import java.util.Scanner;
public class InOrderEqual {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.print("Enter the 1st integer :");
		int input1=in.nextInt();
		System.out.print("Enter the 2nd integer :");
		int input2=in.nextInt();
		System.out.print("Enter the 3rd integer :");
		int input3=in.nextInt();
		System.out.println("Enter the the equalOk(true ot false)");
		boolean a=in.nextBoolean();
		if((input1<input2)&&(input2<input3))
			if((a==true)||(a==false))
				System.out.println("True");
			else
				System.out.println("False");
		else if(a!=false)
			System.out.println("True");
		else 
			System.out.println("False");
	}

}
