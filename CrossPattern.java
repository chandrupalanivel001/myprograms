import java.util.Scanner;
public class CrossPattern {

	public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	System.out.println("Enter the row length:");
	int row=input.nextInt();
	System.out.println("Enter the column length:");
	int column=input.nextInt();
	System.out.print("Enter the elements:");
	int[] singleDimension=new int[row*column];
	for(int i=0;i<row*column;i++) {
		System.out.println("["+i+"]");
		singleDimension[i]=input.nextInt();
	}
	int[][] elements=new int[row][column];
	int k=0;
	for (int i=0;i<row;i++) 
		for(int j=0;j<column;j++) {
			elements[i][j]=singleDimension[k++];
		}
	for(int i=0;i<row;i++) {
		for(int j=0;j<column;j++) {
			System.out.print(elements[i][j]+"\t");
		}
		System.out.println();
	}
	int sum=0,rowMax=0,columnMax=0;
	for (int i=0;i<row;i++) {
		for(int j=0;j<column;j++)
			sum+=elements[i][j];
		if(sum>rowMax)rowMax=sum;
		sum=0;
	}
	for(int j=0;j<column;j++) {
		for (int i=0;i<row;i++) 
			sum+=elements[i][j];
		if(sum>columnMax)columnMax=sum;
		sum=0;
	}
			System.out.println("The row max is: "+rowMax+"\nThe column max is: "+columnMax);
			System.out.println(rowMax+columnMax);
	}
}