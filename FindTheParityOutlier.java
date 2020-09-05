import java.util.*;
public class FindTheParityOutlier {
	public static int find(int[] integers) {
		int ans=0;
		int temp=0,temp1=0,c1=0,c2=0;
		int l=integers.length;
		for(int i=0;i<l;i++) {
			if(integers[i]%2==0) {
				temp=integers[i];
				c1++;
			}
			else if(integers[i]%2!=0) {
				temp1=integers[i];
				c2++;
			}
		}
		if(c1!=1) {
			ans=temp1;
		}
		else {
			ans=temp;
		}
		return ans;
	}
	
	public static void main(String[] args) {
		List<Integer> I=new ArrayList<Integer>();
		String i;
		boolean s=true;
		do {
			i=new Scanner(System.in).next();
			if(i=="end") {
				s=false;
			}
			else {
				I.add(Integer.parseInt(i));
			}
		}while(s);
		int arr[]=new int[I.size()];
		for(int j=0;j<I.size();j++) {
			arr[j]=I.indexOf(j);
		}
		for(int k=0;k<arr.length;k++) {
			System.out.println(arr[k]);
		}
		System.out.println(find(arr));
}

}
