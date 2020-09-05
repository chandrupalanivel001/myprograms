import java.util.*;
public class DuplicateEncoder {
	public static String encode(String word) {
		String t="";
		word=word.toLowerCase();
		int count=0;
		String arr[]=word.split("");
		for(char e:word.toCharArray()) {
			count=0;
			for(int i=0;i<arr.length;i++) {
				if(e==arr[i].charAt(0)) count++;
			}
			if((count!=1&&count!=0)) {
				t=t+')';
			}
			else if(count==0||count==1) {
				t=t+'(';
			}
		}
		return t;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s=new Scanner(System.in).next();
		System.out.println(encode(s));
	}

}
