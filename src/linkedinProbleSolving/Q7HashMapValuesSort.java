package linkedinProbleSolving;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Q7HashMapValuesSort {
//	Q7.Write a program to sort a HashMap by values.
	public static void main(String[] args) {
		Map<String,Integer> userInput=new HashMap<>();
		userInput.put("Anand", 10);
		userInput.put("Raju", 23);
		userInput.put("Rahul", 3);
		
		sortByValues(userInput);
		sortByVal(userInput);
	}
	// java 8 feature
	public static void sortByValues(Map<String,Integer> userInput) {
		@SuppressWarnings("unused")
		Map<String,Integer> result=
				userInput.entrySet().stream()
				.sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,(old,newValue)->old,LinkedHashMap::new));
		System.out.println(result);
	}
	// without using javaFeature
	public static void sortByVal(Map<String,Integer> userInurut) {
		List<Map.Entry<String,Integer>> entryset=new ArrayList<>(userInurut.entrySet());
		Collections.sort(entryset,new Comparator<Map.Entry<String, Integer>>(){
			@Override
			public int compare(Map.Entry<String, Integer> entry1,Map.Entry<String, Integer> entry2) {
				return entry2.getValue().compareTo(entry1.getValue());
			}
		});
		Map<String, Integer> res=new LinkedHashMap<>();
		for(Map.Entry<String, Integer> entry:entryset) {
			res.put(entry.getKey(), entry.getValue());
		}
		System.out.println(res);
	}

}
