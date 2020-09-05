import java.util.*;
public class ex {
    static int sum(int n){
        int s=0;
        while (n!=0){
            s=s+n%10;
            n/=10;
        }
        return s;
    }
    public static void main(String[] args) {
       int s=new Scanner(System.in).nextInt();
        int a=sum(s);
        int b=0;
        for(int i=0;i<=9;i++){
            if(a==i){
                System.out.println(a);
            }
            else {
                b=sum(a);
            }
        }
        System.out.println(b);

    }
}
