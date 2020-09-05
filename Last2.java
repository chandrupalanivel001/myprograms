package warmup2;
import java.util.Scanner;
public class Last2 {

	public static void main(String[] args) {
		System.out.println("Enter the string :");
		String a=new Scanner(System.in).next();
		int count=0,len=a.length();
		String s="",b=a.substring(len-2);
		if(len<2)
			System.out.println("0");
		else {
			for(int i=0;i<len-2;i++) {
				String sub=a.substring(i,i+2);
				if(sub.equals(b)) {
					count++;
				}
			}
		}
			
		System.out.println(count);
	}

}
