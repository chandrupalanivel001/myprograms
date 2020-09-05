import java.util.*;
public class tectq {
    public static void main(String[] args) {
        int o;
        System.out.println("Enter your name :");
        String n=new Scanner(System.in).next();
        for(int i=0;i<=n.length();i++){
            char c=n.charAt(i);
            if(c=='a'||c=='j'||c=='s'||c=='A'||c=='J'||c=='S')
                o=1;
            else if (c=='b'||c=='k'||c=='t'||c=='B'||c=='K'||c=='T')
                o=2;
            else if (c=='c'||c=='l'||c=='u'||c=='C'||c=='L'||c=='U')
                o=3;
            else if (c=='d'||c=='m'||c=='v'||c=='D'||c=='M'||c=='V')
                o=4;
            else if (c=='e'||c=='n'||c=='w'||c=='E'||c=='N'||c=='W')
                o=5;
            else if (c=='f'||c=='o'||c=='x'||c=='F'||c=='O'||c=='X')
                o=6;
            else if (c=='g'||c=='p'||c=='y'||c=='G'||c=='P'||c=='Y')
                o=7;
            else if (c=='h'||c=='q'||c=='z'||c=='H'||c=='Q'||c=='Z')
                o=8;
            else if (c=='i'||c=='r'||c=='I'||c=='R')
                o=9;

        }
    }
}
