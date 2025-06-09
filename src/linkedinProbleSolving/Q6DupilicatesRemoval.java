package linkedinProbleSolving;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q6DupilicatesRemoval {

	public static void main(String[] args) {
		
		int arr[]= {1,2,43,5,54,5,3,2,1};
		
		List<Integer> userInput=Arrays.stream(arr).boxed().collect(Collectors.toList());
		List<Integer> result=removeDuplicates(userInput);
		System.out.println(result);
		System.out.println(removeDuplicates(result));

	}
	// java8 streams
	public static List<Integer> removeDuplicates(List<Integer> listValues){
		List<Integer> result=listValues.stream().distinct().collect(Collectors.toList());
		return result;
	}
	
	public static List<Integer> removeDups(List<Integer> listValues){
		List<Integer> required=new ArrayList<>();
		
		for(int num:listValues) {
			if(!required.add(num)) {
				required.add(num);
			}
		}
		return required;
	}

}
