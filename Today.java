import java.util.*;
import java.lang.*;
public class Today {
    public static void main(String[] args) {
        String s=new String();
        StringBuffer sb=new StringBuffer();
        s="Today is nice day";
        sb.append(s);
        StringBuffer sb1=new StringBuffer();
        sb1.append(sb,0,5);
        sb1.replace(5,7,"oT");
        sb1.delete(0,2);
        sb1.append(sb,5,9);
        sb1.replace(6,7,"si");
        sb1.delete(8,9);
        
        System.out.println(sb1);
    }
}
