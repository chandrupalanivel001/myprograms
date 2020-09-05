import java.util.*;
public class CountAlpha {
	public static String AlphaCount(String s) {
		String ans="";
		int l=s.length();
		ans+=s.charAt(0)+l+"";
		return ans;
	}
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String s=in.nextLine();
		s+=in.nextLine();
		in.close();
		String arr[]=s.split(" ");
		String out="";
		for(int i=0;i<arr.length;i++) {
			out+=AlphaCount(arr[i]);
			out+=" ";
		}
		System.out.println(out);
	}

}
