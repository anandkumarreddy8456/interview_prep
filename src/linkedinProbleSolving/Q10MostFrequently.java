package linkedinProbleSolving;


import java.util.Comparator;
import java.util.HashMap;


import java.util.Map;
import java.util.Scanner;


public class Q10MostFrequently {
// Q10. Find the most frequently occurring word in a given paragraph.
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String name=sc.nextLine();
		name=name.toLowerCase();
		mostFrequently(name);
		sc.close();
	}
	public static void mostFrequently(String name) {
		String arrList[]=name.split(" ");
		Map<String,Integer> mapValues=new HashMap<>();
		for(String str:arrList) {
			mapValues.put(str, mapValues.getOrDefault(str, 0)+1);
		}
		Map.Entry<String,Integer> required=mapValues.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).findFirst().orElse(null);
		System.out.println(required);
	}

}
