package linkedinProbleSolving;

import java.util.Scanner;

public class Q4SwapNumbers {
//	Q4.Write a program to swap two numbers without using a third variable.
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		System.out.println("Before  Swaping the result is : num1: "+num1+" num2: "+num2);
		swapNumbers(num1, num2);
		sc.close();
	}
	public static void swapNumbers(int num1,int num2) {
		num1=num1+num2;
		num2=num1-num2;
		num1=num1-num2;
		System.out.println("After Swaping the result is : num1: "+num1+" num2: "+num2);
	}
}
