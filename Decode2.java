import java.util.*;
public class Decode2 {
    public static void main(String[] args) {
        System.out.print("Enter your value :");
        String s=new Scanner(System.in).next();
        int l=s.length();
        int i=0;
        String str;
        char ar[]={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o',
                'p','q','r','s','t','u','v','w','x','y','z'};
        char ar1[]={'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O',
                'P','Q','R','S','T','U','V','W','X','Y','Z'};
        char ar2[]={'!','@','#','$','%','^','&','*','(',')','-','_','=','+','"',';',
                ':','|','`','~','<','>','.','/','?','[',']','{','}'};
        char ar3[]={'1','2','3','4','5','6','7','8','9','0'};
        try {
            do {
                char a = s.charAt(i);
                char b = s.charAt(i + 1);
                char c = s.charAt(i + 2);
                StringBuffer sb = new StringBuffer();
                sb.append(a);
                sb.append(b);
                sb.append(c);
                str = sb.toString();
                int e = Integer.parseInt(str);
                int ch = e >> 2;
                for (int j = 0; j <= 25; j++) {
                    if (ch == ar[j]) {
                        System.out.print(ar[j]);
                    } else if (ch == ar1[j]) {
                        System.out.print(ar1[j]);
                    }
                }
                for(int k=0;k<29;k++){
                    if(ch==ar2[k]){
                        System.out.print(ar2[k]);
                    }
                }
                for(int m=0;m<=9;m++){
                    if(ch==ar3[m]){
                        System.out.print(ar3[m]);
                    }
                }
                i += 3;
            } while (i != 1);
        }
        catch (StringIndexOutOfBoundsException e){
            System.out.println("");
        }
    }
}