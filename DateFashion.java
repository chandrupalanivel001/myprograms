import java.net.SocketTimeoutException;
import java.util.Scanner;
public class DateFashion {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the you stalishness :");
		int a=in.nextInt();
		System.out.println("Enter the your date stalishness :");
		int b=in.nextInt();
		if(((a>=8)||(a<=10))||((b<=10)||(a>=8))) {
			System.out.println("dateFashion("+a+","+b+")-->2");
		}else if(((a<8)||(a>2))||((b<8)||(b>2))) {
			System.out.println("dateFashion("+a+","+b+")-->1");
		}else if(((a>=0)||(a<=2))||((b>=0)||(b<=2))) {
			System.out.println("dateFashion("+a+","+b+")-->0");
		}else 
			System.out.println("The value must in 0 to 10");
	}

}
