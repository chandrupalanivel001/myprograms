import java.util.Scanner;
public class TeaParty {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.print("Enter the tea number :");
		int tea=in.nextInt();
		System.out.print("Enter the candy number :");
		int candy=in.nextInt();
		if((tea<=5)||(candy<=5))
			System.out.println("0");
		else if(((tea>5)&&(tea<(2*candy)))||((candy>5)&&(candy<(2*tea))))
			System.out.println("1");
		else if(((tea>(2*candy))||(candy>(2*tea))))
				System.out.println("2");
	}

}
