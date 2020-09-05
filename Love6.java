import java.util.Scanner;
public class Love6 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the 1st integer :");
		int a=in.nextInt();
		System.out.println("Enter the 2nd integer :");
		int b=in.nextInt();
		if((a==6)||(b==6)) {
			System.out.println("True");
		}else if(((a+b)==6)||((a-b)==6)) {
			System.out.println("True");
		}else if ((b-a)==6){
			System.out.println("True");
		}else {
			System.out.println("False");
		}

	}

}
