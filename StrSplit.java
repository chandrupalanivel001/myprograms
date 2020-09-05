import java.util.*;
public class StrSplit {
	public static String highAndLow(String numbers) {
		System.out.println(numbers);
		String ans="";
		String arr[]=numbers.split(" ");
		int ar[]=new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			ar[i]=Integer.parseInt(arr[i]);
		}
		Arrays.sort(ar);
		ans=ar[0]+" "+ar[arr.length-1];
		return ans;
	}
	public static void main(String[] args) {
		String num=new Scanner(System.in).next();
		System.out.println(highAndLow(num));
	}

}
