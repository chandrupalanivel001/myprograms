import java.util.Scanner;
public class FibonacciSeries {
	public static void Fib(int n, int n1){
		int a = 0, b = 0;
		System.out.println(n);
		for(int i = n; i <=n1; i++){
			n +=i;
			System.out.println(n);
		}
	}
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.print("Enter the 1st integer:");
		int a=in.nextInt();
		System.out.print("ENter the 2nd integer:");
		int b=in.nextInt();
		in.close();
		Fib(a, b);
		
	}

}
