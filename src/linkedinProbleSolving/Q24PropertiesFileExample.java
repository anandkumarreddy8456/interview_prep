package linkedinProbleSolving;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Q24PropertiesFileExample {
// Implement a program to read and write a properties file.
	public static void main(String[] args) {
		String fileName="config.properties";
		
		try{
			FileOutputStream fos=new FileOutputStream(fileName);
			Properties prop=new Properties();
			prop.setProperty("username", "Anand");
			prop.setProperty("password", "Nandu@07_19");
			prop.setProperty("token", "Anand@33_12");
			prop.store(fos,"User Configuration");
			System.out.println("Properties file successFully Created");
		}catch(IOException e) {
			System.out.println("Failed to Create a Properties File");
		}
		try {
			FileInputStream file=new FileInputStream(fileName);
			Properties prop=new Properties();
			prop.load(file);
			System.out.println("Username : "+prop.getProperty("username"));
			System.out.println("password "+prop.getProperty("password"));
			System.out.println("Token : "+prop.getProperty("token"));
			
		}
		catch(IOException e) {
			System.out.println("Failed to get data from  a Properties File");
		}
		

	}

}
