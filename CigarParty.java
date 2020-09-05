import java.util.Scanner;

public class CigarParty {

	public static void main(String[] args) {
		Scanner in=new Scanner (System.in);
		System.out.println("Enter the cigars :");;
		int cigasrs=in.nextInt();
		System.out.println("Enter the weekend Status ( true or false):");
		boolean weekend=in.nextBoolean();
		if((cigasrs>=40)&&(cigasrs>=60)) {
			if((weekend==true)||(weekend==false)) {
				System.out.println("cigarParty("+cigasrs+","+weekend+")-->True");
			}else {
				System.out.println("cigarParty("+cigasrs+","+weekend+")-->fale");
			}
		}else {
			System.out.println("cigarParty("+cigasrs+","+weekend+")-->fale");
		}
	}

}
