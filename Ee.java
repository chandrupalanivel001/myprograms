import java.util.Scanner;
public class Ee {

	public static void main(String[] args) {
		System.out.println("enter the string :");
		String a=new Scanner(System.in).next();
		System.out.println("Enter the char to insert :");
		char b=new Scanner(System.in).next().charAt(0);
		System.out.println("Enter the index :");
		int d=new Scanner(System.in).nextInt();
		int i=0;
		String j="";
		for(char c:a.toCharArray()) {
			if(i==d) {
				j=j+b;
			}
			i++;
			j=j+c;
		}
		System.out.print(j);
	}

}
