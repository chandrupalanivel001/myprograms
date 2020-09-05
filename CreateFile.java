import java.io.*;
public class CreateFile {

	public static void main(String[] args)throws IOException {
		String str="File handling in java using" + "FileWriter and Filereder";
		FileWriter fw=new FileWriter("outfile.txt");
		for(int i=0;i<str.length();i++) {
			fw.write(str.charAt(i));
		}
		System.out.println("Writing sucessfull");
		fw.close();
	}

}
