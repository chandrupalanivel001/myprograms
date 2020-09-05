import java.util.*;
public class Vowel {

	public static void main(String[] args) {
		String a;		
		System.out.print("Enter the string:");
		a=new Scanner(System.in).next();
		//loop for finding vowel
		for (int i=0;i<a.length();i++) {
			//charAt is used to convert the string into character 
			//depending upon the index value
			char c=a.charAt(i);
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U') {
				System.out.print(c+" ");
			}
		}

	}

}
