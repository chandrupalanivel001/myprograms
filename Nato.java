import java.util.Scanner;
public class Nato {
    public static void main(String[] args) {
        System.out.print("Enter the string:");
        String s=new Scanner(System.in).next();
        String a[]={"alpha","bravo", "charlie","delta","echo","foxtort","golg","hotel",
                "india","juliet","kilo","lima","milk","november","oscar","papa","quebec",
                "romeo","sierra","tango","uniform","victor","whiskey","xbox","yankee","zulu"};
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='a'||c=='A')
                System.out.print(a[0]+" ");
            else if (c=='b'||c=='B')
                System.out.print(a[1]+" ");
            else if (c=='c'||c=='C')
                System.out.print(a[2]+" ");
            else if (c=='d'||c=='D')
                System.out.print(a[3]+" ");
            else if (c=='e'||c=='E')
                System.out.print(a[4]+" ");
            else if (c=='f'||c=='F')
                System.out.print(a[5]+" ");
            else if (c=='g'||c=='G')
                System.out.print(a[6]+" ");
            else if (c=='h'||c=='H')
                System.out.print(a[7]+" ");
            else if (c=='i'||c=='I')
                System.out.print(a[8]+" ");
            else if (c=='j'||c=='J')
                System.out.print(a[9]+" ");
            else if (c=='k'||c=='K')
                System.out.print(a[10]+" ");
            else if (c=='l'||c=='L')
                System.out.print(a[11]+" ");
            else if (c=='m'||c=='M')
                System.out.print(a[12]+" ");
            else if (c=='n'||c=='N')
                System.out.print(a[13]+" ");
            else if (c=='o'||c=='O')
                System.out.print(a[14]+" ");
            else if (c=='p'||c=='P')
                System.out.print(a[15]+" ");
            else if (c=='q'||c=='Q')
                System.out.print(a[16]+" ");
            else if (c=='r'||c=='R')
                System.out.print(a[17]+" ");
            else if (c=='s'||c=='S')
                System.out.print(a[18]+" ");
            else if (c=='t'||c=='T')
                System.out.print(a[19]+" ");
            else if (c=='u'||c=='U')
                System.out.print(a[20]+" ");
            else if (c=='v'||c=='V')
                System.out.print(a[21]+" ");
            else if (c=='w'||c=='W')
                System.out.print(a[22]+" ");
            else if (c=='x'||c=='X')
                System.out.print(a[23]+" ");
            else if (c=='y'||c=='Y')
                System.out.print(a[24]+" ");
            else if (c=='z'||c=='Z')
                System.out.print(a[25]+" ");
            else
                System.out.print(c+" ");
        }
    }
}