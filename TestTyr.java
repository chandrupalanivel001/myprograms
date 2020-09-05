import java.util.*;
public class TestTyr {

	public static void main(String[] args) {
		ArrayList<Integer> arr=new ArrayList<Integer>();
		ArrayList<Integer> arr1=new ArrayList<Integer>();
		String str="12345678900987654321";
		String str1="12345678901234567890";
		for(char c:str.toCharArray()) {
			int s=Integer.parseInt(String.valueOf(c));
			arr.add(s);
		}
		for(char c:str1.toCharArray()) {
			int s=Integer.parseInt(String.valueOf(c));
			arr1.add(s);
		}
		System.out.println(arr.addAll(arr1));
		System.out.println(arr);

	}

}
