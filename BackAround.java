package warmup2;
import java.util.Scanner;
public class BackAround {

	public static void main(String[] args) {
		System.out.println("Enter the string :");
		String s=new Scanner(System.in).next();
		int len=s.length();
		String f=s.substring(len-1);
		System.out.println(f+s+f);
	}

}
