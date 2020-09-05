import java.util.Scanner;
public class Example {

	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the string :");
		String a=in.next();
		System.out.println("Enter the letter to delete:");
		char b=in.next().charAt(0);
		int count=0;
		for(char c:a.toCharArray()) {
			count++;
			if(c==b) {
				continue;
			}
			System.out.print(c);
		}
	}

}
