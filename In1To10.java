import java.util.Scanner;
public class In1To10 {

	public static void main(String[] args) {
	System.out.println("Enter the n value :");
	int n=new Scanner(System.in).nextInt();
	System.out.println("Enter the outsideMode(True or False):");
	boolean o=new Scanner(System.in).nextBoolean();
	if((n>=1)&&(n<=10)) {
		if(o==true) {
			System.out.println("True");
		}else {
			System.out.println("True");
		}
	}else if(o==true) {
		System.out.println("True");
	}else
		System.out.println("False");
	}

}
