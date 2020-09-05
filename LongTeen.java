import java.util.*;
public class LongTeen {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.print("Enter the 1st integer :");
		int a=in.nextInt();
		System.out.print("Enter the 2nd integer :");
		int b=in.nextInt();
		/*The entered value is compared with each other
		 * The give compared  value is greater then one another then 
		 * The conditional statements are executed otherwise 
		 * return false*/
		if(a>b) {
			if((a>=13)&&(a<=19)) {
				System.out.println("True");
			}
			else if((b>=13)&&(b<=19)) {
				System.out.println("True");
			}
			else {
				System.out.println("False");
			}
		}
		else if(b>a) {
			if((a>=13)&&(a<=19)) {
			System.out.println("True");
			}
			else if((b>=13)&&(b<=19)) {
			System.out.println("True");
			}
			else {
			System.out.println("False");
			}
		}
		else {
			System.out.println("False");
		}

	}

}
