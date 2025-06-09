package linkedinProbleSolving;

import java.util.Scanner;

public class Q1IsPlaindrome {
	//q1 Write a Java program to check if a given string is a Palindrome.
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String name=sc.next();
		if(isPlaindrome(name)) {
			 System.out.println("The Given "+ name+" is palindrome") ;
		}else {
			 System.out.println("the Given "+name+" is not palindrome");
		}
		sc.close();
		
	}
	public static boolean isPlaindrome(String checkPalindrome) {
		String requiredString="";
		for(int i=checkPalindrome.length()-1;i>=0;i--) {
			requiredString=requiredString+checkPalindrome.charAt(i);
		}
		return requiredString.equalsIgnoreCase(checkPalindrome);
	}

}
