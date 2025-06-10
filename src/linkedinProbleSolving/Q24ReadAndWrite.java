package linkedinProbleSolving;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Q24ReadAndWrite {
// Implement a program to read and write a properties file.
	public static void main(String[] args) throws IOException {
		File F=new File("abc1.txt");
		FileWriter fw=new FileWriter(F,true);
		PrintWriter pw=new PrintWriter(fw);
		pw.println("Thread A prints odd numbers.");
		pw.print("Thread B prints even numbers");
		pw.flush();
		pw.close();
		FileReader fr=new FileReader(F);
		BufferedReader br=new BufferedReader(fr);
		String line=br.readLine();
		while(line!=null) {
			System.out.println(line);
			line=br.readLine();
		}
		br.close();
		

	}

}
