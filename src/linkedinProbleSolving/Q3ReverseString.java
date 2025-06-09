package linkedinProbleSolving;

import java.util.Scanner;

public class Q3ReverseString {
//	Q3.Implement a Java program to reverse a string without using built-in methods.
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String name=sc.next();
	System.out.println("The Rerverse String is : "+reverse(name));
	sc.close();
	
	}
	public static String reverse(String name) {
		String reqString="";
		for(int i=name.length()-1;i>=0;i--) {
			reqString=reqString+name.charAt(i);
		}
		return reqString;
	}

}
