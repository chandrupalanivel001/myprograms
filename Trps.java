import java.util.*;
public class Trps {
	public static boolean ass(int m,int n) {
		boolean ans=true;
		
		return ans;
	}
        public static void main(String[] args) {
            int n=new Scanner(System.in).nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=new Scanner(System.in).nextInt();
            }
            int ar[]=new int[arr.length];
            int count[]=new int[arr.length];
            for (int i=arr.length-1;i>=0;i--) {
                for(int j=0;j<arr.length;j++) {
                    ar[j]=arr[i];
                    count[j]=0;
                }    
            }
            for (int i=arr.length-1;i>=0;i--) {
                for(int j=0;j<arr.length;j++) {
                    if(arr[j]==ar[i]){
                        count[j]++;
                    }
                }    
            }
            int ans=0;
            for(int i=0;i<count.length;i++) {
                if(count[i]!=0){
                    ans+=1;
                }
        }
        if(ans<=3) {
        	System.out.println(ans);
        }
        else {
        	System.out.println(ans-1);
        }
    }
}
