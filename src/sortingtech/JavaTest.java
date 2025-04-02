package sortingtech;

import java.util.*;
import java.util.Arrays;

import java.util.List;

public class JavaTest {

	public static void main(String[] args) {
		List<Integer> sort=Arrays.asList(5, 6, 7, 8, 9, 10, 1, 2, 3);
		List<Integer> res=new ArrayList<>();
		
		
		System.out.println(res);
		sort.forEach(System.out::println);
		int search=11;
		System.out.println(sort.contains(search)?"Available at "+sort.get(search):search+" is not available");
		
		HashMap<Integer,Integer> map=new HashMap<>();
		for(int i=0;i<sort.size();i++) {
			map.put(sort.get(i),i);
		}
		if(map.containsKey(search)) {
			System.out.println(search+" is Available at "+sort.get(search));
		}else {
			System.out.println(search+" is not Available  ");
		}
	}

}
