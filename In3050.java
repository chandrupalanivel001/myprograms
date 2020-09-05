import java.net.SocketTimeoutException;
import java.util.Scanner;
public class In3050 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.print("Enter the 1st integer :");
		int a=in.nextInt();
		System.out.print("Enter the 2nd integer :");
		int b=in.nextInt();
		if(((a<=40)&&(a>=30))&&((b<=40)&&(b>=30))) {
			System.out.println("True :-)");
		}else {
			if(((a<=50)&&(a>=40))&&((b<=50)&&(b>=40))){
				System.out.println("True :-)");
			}else {
				System.out.println("False :-(");
			}
		}

	}

}
