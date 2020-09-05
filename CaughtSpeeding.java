import java.util.Scanner;
public class CaughtSpeeding {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the speed :");
		int s=in.nextInt();
		System.out.println("Enter your birhtday(true or false)");
		boolean b=in.nextBoolean();
		int c= s;
		if (b==true) {
			s-=5;
		}
		
	    if(s<=60) {
			System.out.println("coughtSpeeding("+c+","+b+")-->0");
		}else if(s<=80){
			System.out.println("coughtSpeeding("+c+","+b+")-->1");
		}else if(s>=81){
			System.out.println("coughtSpeeding("+c+","+b+")-->2");
		} 
		

	}

}
