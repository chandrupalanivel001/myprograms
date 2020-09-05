import java.util.Scanner;
public class SquirrelPlay {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the Squirrel number :");
		int t=in.nextInt();
		System.out.println("Enter the isSummer(true or false) :");
		boolean s=in.nextBoolean();
		if(((t>59)&&(t<90))&&(s==false)) {
			System.out.println("squirrelPlay("+t+","+s+")-->true");
		}else if(((t>59)&&(t<101))&&(s==true)) {
			System.out.println("squirrelPlay("+t+","+s+")-->true");
		}else {
			System.out.println("squirrelPlay("+t+","+s+")-->false");
		}
	}

}
