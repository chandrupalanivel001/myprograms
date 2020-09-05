package warmup2;
import java.util.Scanner;
public class StringSplosion {

	public static void main(String[] args) {
		System.out.println("Enter the string :");
		String a=new Scanner(System.in).next();
		String s="";
		int len=a.length();
		for(int i=0;i<len;i++) {
			s=s+a.substring(0,i+1);
		}
		System.out.println(s);
	}

}
