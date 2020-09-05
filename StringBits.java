package warmup2;
import java.util.Scanner;
public class StringBits {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the string :");
		String a=in.next();
		String s="";
		int len=a.length();
		for(int i=0;i<len;i+=2) {
			s=s+a.charAt(i);
		}
		System.out.println(s);

	}

}
