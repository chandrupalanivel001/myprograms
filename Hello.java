import java.util.*;
public class Hello {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        System.out.print("\n1.Add\n2.Sub\n3.Mul\n4.Div\nEnter your option:");
        int a=in.nextInt();
        switch (a){
            case 1:{
                System.out.print("Enter the value to Add:");
                int b=in.nextInt();
                int c=in.nextInt();
                System.out.println("The added value is :"+(b+c));
                break;
            }
            case 2:{
                System.out.print("Enter the value to Sub:");
                int b=in.nextInt();
                int c=in.nextInt();
                System.out.println("The added value is :"+(b-c));
                break;
            }
            case 3:{
                System.out.print("Enter the value to Mul:");
                int b=in.nextInt();
                int c=in.nextInt();
                System.out.println("The added value is :"+(b*c));
                break;
            }
            case 4:{
                System.out.print("Enter the value to Div:");
                int b=in.nextInt();
                int c=in.nextInt();
                System.out.println("The added value is :"+(b/c));
                break;
            }
            default:
                System.out.println("worng option!!!");
        }
    }
}
