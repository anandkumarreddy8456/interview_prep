package linkedinProbleSolving;

import java.util.Arrays;
import java.util.List;

public class Q18FilterEvenNumbers {
//  Q18 Write a Java 8 program to filter even numbers from a list using Streams.
	public static void main(String[] args) {
		int arr[]= {8,9,2,5,27,10};
		filter(Arrays.stream(arr).boxed().toList());

	}
	public static void filter(List<Integer> list) {
		System.out.println("Before Applying streams"+ list);
		System.out.println("After Applying streams using Filter Option :"+ list.stream().filter(q->q%2==0).toList());
	}

}
