package linkedinProbleSolving;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Q5OccurrencesOfCharacters {
// Q5. Write a program to count occurrences of each character in a string
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter the Name:");
		String name=sc.nextLine();
		occuranceOfString(name);
		sc.close();
	}
	public static void occuranceOfString(String name) {
		Map<Character,Integer> occuance=new HashMap<>();
		
		for(char ch: name.toCharArray()) {
			occuance.put(ch, occuance.getOrDefault(ch, 0)+1);
		}
		
		System.out.println(occuance);
	}

}
