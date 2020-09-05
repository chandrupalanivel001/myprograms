package warmup2;
import java.util.Scanner;
public class MissingChar {

	public static void main(String[] args) {
		System.out.println("Enter the string :");
		String s=new Scanner(System.in).next();
		System.out.println("Enter the int :");
		int n=new Scanner(System.in).nextInt();
		int len=s.length();
		String f=s.substring(0,n);
		String b=s.substring(n+1,len);
		String r=f+b;
		System.out.println(r);
	}

}
