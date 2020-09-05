import java.util.*;
public class MonkeyTrouble {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.print("Enter the Monkey a smileing status :");
		boolean a=in.nextBoolean();
		System.out.print("Enter the monkey b smileing status :");
		boolean b=in.nextBoolean();
		if(a==b)
			System.out.println("True");
		else 
			System.out.println("False");
	}

}
