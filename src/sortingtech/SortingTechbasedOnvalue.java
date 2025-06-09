package sortingtech;


import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SortingTechbasedOnvalue {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Map<Integer,String>  map=new HashMap<>();	
		map.put(1,"Anand");
		map.put(2, "Aravind");
		map.put(10, "Ajith");
		
		map.entrySet().stream()
		.sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
		.forEach(q->System.out.println(q.getKey()+" :" +q.getValue()));
		
		Map<Integer,String> sorted=map.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.reverseOrder())).collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,(old,newValue)->old,LinkedHashMap::new));
		
		System.out.println(sorted);

	}

}
