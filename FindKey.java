import java.util.*;
import java.io.*;
public class FindKey {
	public static int Fkey(String str) {
		int sum=0,sum1=0;
		String temp=new String(str);
		String s[]=str.split(" ");
		for(int i=0;i<s.length;i++) {
			sum1+=Sum(s[i]);
		}
		if(sum1>0&&sum1<=9) {
			sum=sum1;
		}
		else {
			while(sum1>0&&sum1<=9){
				sum+=sum1%10;
				sum1/=10;
			}
		}
		return sum;
	}
	public static int Sum(String str) {
		int ans=0,sum=0,ans1=0;
		for(char c:str.toCharArray()){
			if(c=='a'||c=='j'||c=='s') {
				ans1+=1;
			}else if(c=='b'||c=='k'||c=='t') {
				ans1+=2;
			}else if(c=='c'||c=='l'||c=='u') {
				ans1+=3;
			}else if(c=='d'||c=='m'||c=='v') {
				ans1+=4;
			}else if(c=='e'||c=='n'||c=='w') {
				ans1+=5;
			}else if(c=='f'||c=='o'||c=='x') {
				ans1+=6;
			}else if(c=='g'||c=='p'||c=='y') {
				ans1+=7;
			}else if(c=='h'||c=='q'||c=='z') {
				ans1+=8;
			}else if(c=='i'||c=='r') {
				ans1+=9;
			}
		}
		if(ans<=9&&ans>0) {
			ans=ans1;
		}
		else {
			while(ans>0&&ans<=9) {
				ans+=ans1%10;
				ans1/=10;
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		System.out.println("Enter the String to find key:");
		String key=new Scanner(System.in).nextLine();
		System.out.println(Fkey(key));
	}

}
