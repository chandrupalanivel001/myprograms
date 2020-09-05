import java.util.Scanner;
public class Examp {
	public static void main(String[] args) {
		int i=0;
		System.out.println("Enter the n value");
		int n=new Scanner(System.in).nextInt();
		while(i<=n) {
			i++;
			if(i==3) {
				continue;
			}
			else if(i==5) {
				break;
			}
			System.out.println(i);
			
		}

	}

}
