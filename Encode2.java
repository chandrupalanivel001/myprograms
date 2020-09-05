import java.util.*;
public class Encode2 {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer();
        System.out.print("Enter the string(Enter under score for space):");
        String s=new Scanner(System.in).next();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            int p=c<<2;
            sb.append(p);
        }
        System.out.println(sb);

    }
}
