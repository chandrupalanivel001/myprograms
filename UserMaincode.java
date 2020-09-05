import java.util.*;
public class UserMaincode {
	public static double[] QuadraticAns(double input1,double input2,double input3) {
		double root1,root2,rp,ip;
		double ans[]=new double[2];
		double d=input2*input2-4*input1*input3;
		if(d>0) {
			root1=(-input2+Math.sqrt(d))/(2*input1);
			root2=(-input2-Math.sqrt(d))/(2*input1);
			ans[0]=root1;
			ans[1]=root2;
		}
		else if(d==0) {
			root1=root2=-input2/(2*input1);
			ans[0]=root1;
			ans[1]=root2;
		}
		else {
			rp=-input2/(2*input1);
			ip=Math.sqrt(-d/(2*input1));
			ans[0]=rp;
			ans[1]=ip;
		}
		ans[0]=Double.parseDouble(String.format("%.3f", ans[0]));
		ans[1]=Double.parseDouble(String.format("%.3f", ans[1]));
		return ans;
	}
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		double a=in.nextDouble();
		double b=in.nextDouble();
		double c=in.nextDouble();
		double ans[]=QuadraticAns(a,b,c);
		System.out.println(ans[0]+" "+ans[1]);
	}
}
