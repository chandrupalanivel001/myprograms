import java.util.Scanner;
public class Ar{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the integer :");
		int a=in.nextInt();
		String output=(a%2==0)?"even number":"odd number";
		System.out.println(output);
	}
}