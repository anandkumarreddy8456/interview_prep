package linkedinProbleSolving;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Q21SecondHighestNumber {

	public static void main(String[] args) {
		int arr[]= {1,3,5,2,4,7,7,8,9,9,9,8};
		List<Integer> listArr=Arrays.stream(arr).boxed().toList();
		secondHighest(listArr);

	}
	public static void secondHighest(List<Integer> list) {
		System.out.println("Before Appling Streams"+list);
		System.out.println("After applying Streams"+list.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).limit(1).toList());
	}

}
