import java.util.*;
public class TempT {
    public static String Dig(int n[]){
        int a,b,c;
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(lar(n));
        arr.add(Hun(n));
        arr.add(Tens(n));
        arr.add(Once(n));
        return arr.toString();
    }
    public static int lar(int n[]){
        ArrayList<Integer> arr=new ArrayList<>();
        int temp;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++) {
                temp = n[i] % 10;
                n[i] /= 10;
                arr.add(temp);
            }
        }
        System.out.println(arr);
        return (Collections.max(arr));
    }
    public static int Hun(int n[]){
        ArrayList<Integer> arr=new ArrayList<>();
        int t;
        for(int i=0;i<3;i++){
            n[i] /= 10;
            n[i]/= 10;
            arr.add(n[i]);
        }
        System.out.println(arr);
        return (Collections.min(arr));
    }
    public static int Tens(int n[]){
        ArrayList<Integer> arr=new ArrayList<>();
        int t;
        for(int i=0;i<3;i++){
            n[i]/=10;
            arr.add(n[i]%10);
        }
        System.out.println(arr);
        return (Collections.min(arr));
    }
    public static int Once(int n[]){
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0;i<3;i++){
            arr.add(n[i]%10);
        }
        System.out.println(arr);
        return (Collections.min(arr));
    }
    public static void main(String[] args) {
        int arr[]=new int[3];
        for(int i=0;i<3;i++){
            arr[i]=new Scanner(System.in).nextInt();
        }
        System.out.println(Dig(arr));
    }
}
