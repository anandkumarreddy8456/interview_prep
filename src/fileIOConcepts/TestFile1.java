package fileIOConcepts;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class TestFile1 {

	public static void main(String[] args) throws IOException{
		File f=new File("abc1.txt");
		f.createNewFile();
		FileWriter fw=new FileWriter(f);
		PrintWriter pw=new PrintWriter(fw);
		pw.write(100);
		pw.println("Anand");
		pw.flush();
		pw.close();
		FileReader fr=new FileReader(f);
		BufferedReader br=new BufferedReader(fr);
		String line=br.readLine();
		while(line!=null) {
			System.out.println(line);
			line=br.readLine();
		}
		br.close();

	}

}
