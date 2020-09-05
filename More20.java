import java.util.Scanner;
public class More20 {

	public static void main(String[] args) {
		System.out.println("Enter the integer:");
		int a=new Scanner(System.in).nextInt();
		if(a>0) {
			if(((a%20)==1)||((a%20)==2)) {
				System.out.println("True");
			}else {
				System.out.println("False");
			}
		}else {
			System.out.println("False");
		}
	}

}
