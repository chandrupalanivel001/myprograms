import java.io.*;
public class Calendar {

	public static void main(String[] args) {
		int m=0,y=0;
		try {
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			System.out.print("Enter month :");
			m=Integer.parseInt(br.readLine());
			System.out.print("Enter Year :");
			y=Integer.parseInt(br.readLine());
		}
		catch(IOException e) {
			System.out.println("Incorrect Input");
		}
		if(m<1||m>12||y<1900||y>2099) {
			System.out.println("Invalid month/year");
			return;
		}
		int[] Days= {31,28,31,30,31,30,31,31,30,31,30,31};
		if((y%400==0)||(y%100!=0)&&(y%4==0)) {
			Days[1]=29;}
		else {
			Days[1]=28;}
		int NormalDays=(y-1)*365;
		int LeapDays=(y-1)/4-(y-1)/100+(y-1)/400;
		int Totaldays=NormalDays+LeapDays;
		for(int i=0;i<m-1;i++) {
			Totaldays=Totaldays+Days[i];}
		int FirstDay=Totaldays%7;
		int col=FirstDay*6;
		int Row=0;
		String[] Months= {"January","February","March","April","May","June",
				"July","August","September","October","November","December"};
		String Str="	"+Months[m-1]+"/"+y;
		System.out.println("\t\t"+Str);
		System.out.println();
		System.out.println("\tMon \tTue \tWed \tThu \tFri \tSat \tSun");
		String s="";
		for(int n=1;n<=col;n++) {
			s=s+"";}
		for(int d=1;d<=Days[m-1];d++) {
			System.out.print("\t");
			if(d==1) {
				s=s+d;
				System.out.print(s);
			}
			else if(d<=10) {
				if(col==0) {
					s=""+d;
				}
				else {
					s=" "+d;
				}
				System.out.print(s);
			}
			else {
				if(col==0) {
					s=""+d;
				}
				else {
					s=" "+d;
				}
				System.out.print(s);
			}
			col=col+6;
			if(col>36) {
				System.out.println();
				col=0;
			}
		}
		System.out.println();
	}

}
