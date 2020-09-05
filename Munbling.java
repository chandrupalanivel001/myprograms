import java.util.*;
public class Munbling {
	public static String accum(String s) {  
		StringBuilder bl=new StringBuilder();
		int i=0;
		for(char c:s.toCharArray()) {
			if(i>0) {
				bl.append('-');
			}
			bl.append(Character.toUpperCase(c));
			for(int j=0;j<i;j++) {
				bl.append(Character.toLowerCase(c));
			}
			i++;
		}
		return bl.toString();
	}

	public static void main(String[] args) {
		String str=new Scanner(System.in).next();
		System.out.println(accum(str));
	}

}
