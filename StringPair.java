import java.util.*;
public class StringPair {
	public static int FindVowlsum(String s) {
		int ans=0;
		s=s.toLowerCase();
		for(char ch:s.toCharArray()) {
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				ans++;
			}
		}
		return ans;
	}
	public static String findSum(String[] s) {
		int sum=0;
		int ans[]=new int[s.length];
		String arr[]= {"zero", "one",  "two",  "three",  "four",  "five",  "six",  "seven", "eight", "nine",
				 "ten",  "eleven",  "twelve",  "thirteen",  "fourteen", "fifteen", "sixteen",
					"seventeen",  "eighteen", "nineteen",  "twenty",  "twentyone", "twentytwo", 
					"twentythree", "twentyfour",  "twentyfive",  "twentysix",  "twentyseven",
					"twentyeight",  "twentynine", "thirty",  "thirtyone", "thirtytwo", "thirtythree", 
					"thirtyfour",  "thirtyfive", "thirtysix","thirtyseven", "thirtyeight", "thirtynine", 
					"forty", "fortyone", "fortytwo",  "fortythree",  "fortyfour",  "fortyfive",  "fortysix",
					 "fortyseven",  "fortyeight","fortynine", "fifty",  "fiftyone", "fiftytwo", 
					"fiftythree",  "fiftyfour",  "fiftyfive","fiftysix", "fiftyseven", "fiftyeight", "fiftynine",
					 "sixty","sixtyone", "sixtytwo", "sixtythree",  "sixtyfour", "sixtyfive",  "sixtysix",
					"sixtyseven",  "sixtyeight", "sixtynine", "seventy",  "seventyone", "seventytwo",
					 "seventythree",  "seventyfour",  "seventyfive",  "seventysix",  "seventyseven", 
					"seventyeight",  "seventynine",  "eighty",  "eightyone",  "eightytwo", "eightythree", 
					"eightyfour", "eightyfive",  "eightysix", "eightyseven",  "eightyeight",  "eightynine",
					"ninety", "ninetyone",  "ninetytwo", "ninetythree",  "ninetyfour",  "ninetyfive",
					"ninetysix",  "ninetyseven", "ninetyeight", "ninetynine", "hundred"};
		for(int i=0;i<s.length;i++) {
			ans[i]=Integer.parseInt(s[i]);
		}
		for(int i=0;i<ans.length;i++) {
			sum+=FindVowlsum(arr[ans[i]]);
		}
		String a=arr[sum];
		return  arr[FindVowlsum(a)];
	}
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		String s=in.nextLine();
		s+=in.nextLine();
		in.close();
		System.out.println(s);
		String arr[]=s.split(" ");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		System.out.println(findSum(arr));
	}

}
