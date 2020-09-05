import java.util.Scanner;
public class FizzString2 {

	public static void main(String[] args) {
		System.out.println("Enter the integer :");
		int a=new Scanner(System.in).nextInt();
		if(((a%3)==0)&&((a%5)==0))
			System.out.println("FizzBuzz");
		else if((a%3)==0)
			System.out.println("Fizz");
		else if((a%5)==0)
			System.out.println("Buzz");
		else 
			System.out.println(a+"!");

	}

}
