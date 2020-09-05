import java.util.*;
public class StrFun {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        boolean opt=true;
        a:while (opt){
            System.out.print("1.String Functions\n2.StringBuffer Functions\nEnter your option :");
            int n=in.nextInt();
            if(n==1){
                System.out.println("Enter your String :");
                String s=in.next();
                System.out.println("Demonstrate of length method :"+s.length());
                System.out.println("Demonstrate of toLowerCase method :"+s.toLowerCase());
                System.out.println("Demonstrate of toUpperCase method :"+s.toUpperCase());
                System.out.print("Demonstrate of repeat method(Enter the no of times to repet) :");
                int c=in.nextInt();
                System.out.println(s.repeat(c));
                System.out.println("Demonstrate of "+s.);

            }
        }
    }
}
