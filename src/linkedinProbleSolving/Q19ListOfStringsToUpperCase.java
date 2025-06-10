package linkedinProbleSolving;

import java.util.Arrays;
import java.util.List;

public class Q19ListOfStringsToUpperCase {
// Q19 Convert a List of Strings to uppercase using Lambda expressions.
	public static void main(String[] args) {
		String arr[]= {"Anand","kumar","reddy"};
		upperCase(Arrays.asList(arr));
		upperCase(Arrays.stream(arr).toList());

	}
	public static void upperCase(List<String> list) {
		System.out.println("Before Applying Streams"+list);
		System.out.println("After Applying Streams using map"+ list.stream().map(q->q.toUpperCase()).toList());
	}

}
