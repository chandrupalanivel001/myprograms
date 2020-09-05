import java.util.*;
public class CheckStr {
    public static void main(String[] args) {
        String s=new Scanner(System.in).next();
        String str="abcdefghijklmnopqrstuvwxyz";
        String num="1234567890";
        int strc=0,stri=0,strsp=0;
        for(char c:str.toCharArray()){
            for(char m:s.toCharArray()) {
                if (c == m) { strc++; }
            }
        }
        for(char t:num.toCharArray()){
            for(char m:s.toCharArray()){
                if(t==m){stri++;}
            }
        }
        if((strc>0&&stri>0)||strc>0){
            System.out.println("String");
        }
        else if(stri>0){
            System.out.println("Integer");
        }
        else {
            System.out.println("Special char");
        }

    }
}
