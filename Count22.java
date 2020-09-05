import java.util.*;
public class Count22 {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String s=in.next();
		s+=in.nextLine();
		in.close();
		s=s.toLowerCase();
		String arr[]=s.split(" ");
		String out="";
		for(int i=0;i<arr.length;i++) {
			char ch=arr[i].charAt(0);
			out+=Character.toString(ch)+arr[i].length()+"";
		}
		System.out.println(out);
	}

}