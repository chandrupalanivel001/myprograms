import java.util.*;
public class Terv {

	public static void main(String[] args) {
		int n=new Scanner(System.in).nextInt();
		String s=new Scanner(System.in).next();
		int valley=0,count=0;
        s=s.toLowerCase();
        for(char c:s.toCharArray()){
            if(c=='u')
                count++;
            else
                count--;
            if(count==0)valley++;
        }
        if(s.charAt(0)=='u')valley-=1;
        if(s.charAt(s.length()-1)=='d')valley-=1;
        System.out.println(valley);
	}
}
