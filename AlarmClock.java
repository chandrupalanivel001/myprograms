import java.util.Scanner;
public class AlarmClock {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the day(from 0 to 6):");
		int d=in.nextInt();
		System.out.println("Enter is vacation(true or false):");
		boolean v=in.nextBoolean();
		if((v==false)&&(d!=0)) {
			System.out.println("7.00");
		}else {
			System.out.println("10.00");
		}

	}
}
