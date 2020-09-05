import java.util.Scanner;
public class FizzString {

	public static void main(String[] args) {
		System.out.println("Enter the string :");
		String str=new Scanner(System.in).next();
		int count=0;
		for(char c:str.toCharArray()) {
			count++;
			int i=count;
			if((c=='f')&&(count==1))
				System.out.print("Fizz");
			else if((c=='b')&&(count==i))
				System.out.print("Buzz");
				
			else if(((c=='f')&&(count==1))&&((c=='b')&&(count==i)))
				System.out.println("FizzBuzz");
		}
		
	}

}
