package warmup2;
import java.util.*;
public class Bus {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.print("Enter the destination(Salem to Mettur-S Mettur to Salem-M ) :");
		char d=in.next().charAt(0);
		int km=0;
		if(d=='S') {
			System.out.print("amount details\nSalem to Omalur-O \nSalem to Mecheri-E\nSalem to Mettur-T\nOmalur to Mecheri-X\nOmalur to Mettur-Z\nMecheri to Mettur-C:");
			char a=in.next().charAt(0);
			if(a=='O') {
				km=15;
				int ₹=(km*10)/15;
				System.out.println("Salem to Omalur:₹"+₹);
			}
			else if(a=='E') {
				km=31;
				int ₹=(km*10)/15;
				System.out.println("Salem to Mecheri:₹"+₹);
			}
			else if(a=='T') {
				km=51;
				int ₹=(km*10)/15;
				System.out.println("Salem to Mettur:₹"+₹);
			}
			else if(a=='X') {
				km=16;
				int ₹=(km*10)/15;
				System.out.println("Omalur to Mecheri:₹"+₹);
			}
			else if(a=='Z') {
				km=38;
				int ₹=(km*10)/15;
				System.out.println("Omalut ot Mettur:₹"+₹);
			}
			else if(a=='C') {
				km=21;
				int ₹=(km*10)/15;
				System.out.println("Mecheri to Mettur:₹"+₹);
			}
			else
				System.out.println("You enter worng option!!!!");
		}
		else if(d=='M') {
			System.out.print("amount details\n Omalur to Salem-O\n Mecheri to Salem-E\n Mettur to Salem-T\n Mecheri to Omalur-X\n Mettur to Omalur-Z\n Mettur to Mecheri-C:");
			char a=in.next().charAt(0);
			if(a=='O') {
				km=15;
				int ₹=(km*10)/15;
				System.out.println("Omalur to Salem :₹"+₹);
			}
			else if(a=='E') {
				km=31;
				int ₹=(km*10)/15;
				System.out.println("Mecheri to Salam:₹"+₹);
			}
			else if(a=='T') {
				km=51;
				int ₹=(km*10)/15;
				System.out.println("Mettur to Salem:₹"+₹);
			}
			else if(a=='X') {
				km=16;
				int ₹=(km*10)/15;
				System.out.println("Mecheri to Omalur:₹"+₹);
			}
			else if(a=='Z') {
				km=38;
				int ₹=(km*10)/15;
				System.out.println("Mettur to Omalur:₹"+₹);
			}
			else if(a=='C') {
				km=21;
				int ₹=(km*10)/15;
				System.out.println("Mettur to Mecheri:₹"+₹);
			}
			else
				System.out.println("You enter worng option!!!!");
		}
		else 
			System.out.println("You enter worng option!!!");

	}

}
