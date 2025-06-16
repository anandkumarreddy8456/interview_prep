package fileIOConcepts;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class TestFile2 {

	public static void main(String[] args) throws IOException {
		PrintWriter pw=new PrintWriter(new FileWriter("abc2.txt",false));
		pw.write(97);
		pw.println();
		pw.println("Anand Reddy R");
		pw.println(12345l);
		
		pw.close();
		
		
		
		
		BufferedReader br=new BufferedReader(new FileReader("abc2.txt"));
		String line=br.readLine();
		while(line!=null) {
			System.out.println(line);
			line=br.readLine();
		}
		
		br.close();
	}

}
