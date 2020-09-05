import java.util.Scanner;
public class Name {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter your option \nif you have son enter 1 \nif you have daughter enter 2 \nif you hava both son and daughter enter 3 ");
		int a=in.nextInt();
		if(a==1) {
			System.out.print("Enter your son Name:");
			String b=in.next();
			System.out.println("Your son name is Mr."+b);
		}
		else if(a==2) {
			System.out.println("Enter your daughter Name:");
			String b=in.next();
			System.out.println("your daugter is Miss."+b);
		}
		else if(a==3) {
			System.out.println("Enter your son Name:");
			String b=in.next();
			System.out.println("Enter your daugther Name:");
			String c=in.next();
			System.out.println("your son is Mr."+b);
			System.out.println("your daughter is Miss."+c);
		}
		else {
			System.out.println("Error!!!");
		}
	}

}
