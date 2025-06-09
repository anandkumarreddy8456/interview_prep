package linkedinProbleSolving;

import java.util.Scanner;

public class Q2Factorial {
	//	Q2.Write a program to find the factorial of a number using recursion.
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);	
		int num=sc.nextInt();
		if(num<0)  { System.out.println("Please Provide Integer"); return;}
		System.out.println(new Q2Factorial().factorial(num));
		sc.close();
	}
	public int factorial(int num) {
		if(num==1) {
			return 1;
		}else {
			return num * factorial(num -1);
		}
	}
}
