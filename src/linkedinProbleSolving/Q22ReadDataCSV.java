package linkedinProbleSolving;

import java.io.BufferedReader;
import java.io.File;

import java.io.FileReader;
import java.io.IOException;

public class Q22ReadDataCSV {
//  Q22.Write a Java program to read data from a CSV file.
	public static void main(String[] args) throws IOException {
		File f=new File("test.csv"); // fileLocation
		FileReader fw=new FileReader(f); //reader
		BufferedReader br=new BufferedReader(fw);
		
		String line=br.readLine();
		while(line!=null) {
			System.out.println(line);
			line=br.readLine();
		}
		br.close();

	}

}
