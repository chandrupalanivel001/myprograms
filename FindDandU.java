import java.util.*;
public class FindDandU extends Temp{
	public static void main(String[] args) {
		int count=0;
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		String s=in.next();
		for(char c:s.toCharArray()) {
			if(ifDorU(c)) {
				count+=1;
				System.out.println(count);
			}
			else {
				count-=1;
				System.out.println(count);
			}
		}
		
		System.out.println(findcount(count));
	}

}
class Temp {
	public static boolean ifDorU(char c) {
		boolean ans=true;
		if(c=='u'||c=='U') {
			ans=true;
		}
		else if(c=='D'||c=='d') {
			ans=false;
		}
		return ans;
	}
	public static int findcount(int n) {
		int ans=0;
		ans=Math.abs(n+1);
		return ans;
	}
}