import java.util.*;
public class Fib {
    public static void main(String[] args) {
        System.out.println("Enter the number :");
        int n=new Scanner(System.in).nextInt();
        long x=985745635672992478L;
        long count=2L;
        long t1=0L,t2=1L,nt=0L,m=0L;
        if(n==1){
            System.out.println("0");
        }
        else if(n==2){
            System.out.println("1");
        }
        else {
                for (int i = 1; i <= 10; i++) {
                    nt = t1 + t2;
                    t1 = t2;
                    t2 = nt;
                    count++;
                    if (count == n) {
                        System.out.println(t2);
                        break;
                    }
                }
            }
        }
    }

