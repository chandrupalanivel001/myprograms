import java.util.Scanner;
public class LeapYear {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.print("Enter the year to find if it is leap year or not :");
		int a=in.nextInt();
		String out=(a%4==0)?"The given year is leap year":"The given year is not leap year";
		System.out.println(out);
	}

}
