import java.util.*;
public class EncodeApp {
    public static void main(String[] args) {
        char opt='y';
      a:do{
          System.out.print("1.Encode\n2.Decode\nEnter your option(1or2):");
          char opt1=new Scanner(System.in).next().charAt(0);
          if(opt1=='1'){
              StringBuffer sb=new StringBuffer();
              System.out.print("Enter the string(Enter under score for space):");
              String s=new Scanner(System.in).next();
              for(int i=0;i<s.length();i++){
                  char c=s.charAt(i);
                  int p=c<<2;
                  sb.append(p);
              }
              System.out.println(sb);
              System.out.print("Do you want to continue(y/n):");
              opt=new Scanner(System.in).next().charAt(0);
          }
          else if(opt1=='2'){
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
              System.out.print("Do you want to continue(y/n):");
              opt=new Scanner(System.in).next().charAt(0);
          }
          else{
              System.out.println("your option is worng!!!");
              System.out.print("Do you want to continue(y/n):");
              opt=new Scanner(System.in).next().charAt(0);
          }
      }while(opt!='n'||opt!='N');
    }
}
