package linkedinProbleSolving;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Q9FirstNonRepeatingCharacter {
// Q9  Write a program to find the first non-repeating character in a string.
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String name=sc.next();
		System.out.println(firstNonRepeating(name));
		sc.close();

	}
	public static char firstNonRepeating(String name) {
		name=name.toLowerCase();
		Map<Character,Integer> res=new LinkedHashMap<>();
		for(char ch:name.toCharArray()) {
			res.put(ch,res.getOrDefault(ch, 0)+1);
		}
		for(Map.Entry<Character, Integer> entryset: res.entrySet()) {
			if(entryset.getValue()==1) {
				return entryset.getKey();
			}
		}
		return '_';
	}
	

}
