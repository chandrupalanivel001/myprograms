import javax.print.DocFlavor;
import java.util.*;
public class TestClass {
    public static void main(String[] args) {
       Scanner in=new Scanner(System.in);
       char c1,c2;
        System.out.print("Enter the 1st word :");
        String a=in.next();
        System.out.print("Enter the 2nd word :");
        String b=in.next();
        StringBuffer sb=new StringBuffer(30);
        char c[]=new char[a.length()];
        char d[]=new char[b.length()];
        for(int i=0;i<a.length();i++){
            c[i]=a.charAt(i);
        }
        for(int i=0;i<b.length();i++){
            d[i]=b.charAt(i);
        }
        for(int i=0;i<a.length();i++){
            for(int j=0;j<b.length();j++){
                if(c[i]!=d[j]){
                    sb.append(c[i]);
                    break;
                }
            }
        }
        System.out.println(sb);
    }
}
