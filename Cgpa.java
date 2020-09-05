import java.util.Scanner;
public class Cgpa {
	
	public static void main(String[] args) {
		int s1=0,s2=0,s3=0,total;
		Scanner in=new Scanner(System.in);
		System.out.print("Enter the Roll number:");
		int roll_no=in.nextInt();
		System.out.print("Enter the student name:");
		String name=in.next();
		System.out.println("Enter the number of labs:");
		int lb=in.nextInt();
		int cr1=lb*2;
		System.out.println("Enter the number of theory subjects:");
		int th=in.nextInt();
		int cr2=th*3;
		System.out.println("Enter the number of problamatic subjects");
		int pr=in.nextInt();
		int cr3=pr*4;
		String c2[]=new String[lb];
		String c3[]=new String[th];
		String c4[]=new String[pr];
		int g2[]=new int[lb];
		int g3[]=new int[th];
		int g4[]=new int[pr];
		System.out.println("Enter the lab gread:");
		for(int i=0;i<lb;i++) { 
			c2[i]=in.next();
			switch(c2[i]) {
			case"o": 
				g2[i]=10*2;
				break;
			case"a+":
				g2[i]=9*2;
				break;
			case"a":
				g2[i]=8*2;
				break;
			case"b+":
				g2[i]=7*2;
				break;
			case"b":
				g2[i]=6*2;
				break;
			default:
				g2[i]=0;
				if(g2[i]==0) {
					cr1=cr1-(1*2);
				}
			}
			s1+=g2[i];
		}
		System.out.println("Enter the theory subject greads:");
		for(int i=0;i<th;i++) {
			c3[i]=in.next();
			switch(c3[i]) {
			case"o": 
				g3[i]=10*3;
				break;
			case"a+":
				g3[i]=9*3;
				break;
			case"a":
				g3[i]=8*3;
				break;
			case"b+":
				g3[i]=7*3;
				break;
			case"b":
				g3[i]=6*3;
				break;
			default:
				g3[i]=0;
				if(g3[i]==0) {
					cr2=cr2-(1*3);
				}
			}
			s2+=g3[i];
		}
		System.out.println("Enter the probalamatic subject greads:");
		for(int i=0;i<pr;i++) {
			c4[i]=in.next();
			switch(c4[i]) {
			case"o": 
				g4[i]=10*4;
				break;
			case"a+":
				g4[i]=9*4;
				break;
			case"a":
				g4[i]=8*4;
				break;
			case"b+":
				g4[i]=7*4;
				break;
			case"b":
				g4[i]=6*4;
				break;
			default:
				g4[i]=0;
				if(g4[i]==0) {
					cr3=cr3-(1*4);
				}
			}
			s3=g4[i];
		}
		int crt=cr1+cr2+cr3;
		System.out.println(crt);
		total=s1+s2+s3;
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(total);
		float GPA=total/crt;
		System.out.println("The GPA is:"+GPA);
	}

}
