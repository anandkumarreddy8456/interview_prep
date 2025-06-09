package java8fea;


import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SortBasedonValues {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Map<Character,Integer> test=new HashMap<>();
		
		String name="AnandReddyR";
		
		for(char ch:name.toCharArray()) {
			test.put(ch, test.getOrDefault(ch, 0)+1);
		}
		Map<Character,Integer> result=test.entrySet().stream()
				.sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,(old,newValue)->old,LinkedHashMap::new));
		System.out.println(result);
	}

}
