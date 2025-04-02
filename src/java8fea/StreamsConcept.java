package java8fea;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsConcept {
	public static void main(String[] args) {
//		map
		List<String> lis=Arrays.asList("Bogesh","Kamesh","Akshesh","Vokesh");
		List<String> lis2=Arrays.asList("Anand","Aajesh","Ramesh","Bogesh");
		lis.forEach(i->System.out.print(i));
		lis.forEach(System.out::println);
		
//		count
		long num3=Stream.concat(lis.stream(), lis2.stream()).filter(i->i.startsWith("A")).count();
		System.out.println(num3);
		long num2=lis.stream().filter((i)->lis2.contains(i)).count();
		System.out.println(num2);
		long num1=lis.stream().filter(lis2::contains).count();
		System.out.println(num1);
		
//      sort
//		asc
//		List<String> lis3=lis2.stream().sorted(Comparator.comparing(String::toString)).collect(Collectors.toList());
		List<String> lis3=lis2.stream().sorted(Comparator.comparing(String::toString)).sorted().toList();
		System.out.println(lis3+"ASC");
//		dsc
//		List<String> lis4=lis3.stream().sorted((a,b)->b.compareTo(a)).collect(Collectors.toList());
//		List<String> lis4=lis3.stream().sorted(Comparator.reverseOrder()).toList();
		List<String> lis4=lis3.stream().sorted((a,b)->b.compareTo(a)).toList();
	
		System.out.println(lis4+"DSC");
		
//		filter
		List<String>lis1=lis.stream().filter(nam->nam.startsWith("A")).collect(Collectors.toList());
		System.out.println(lis1);
		System.out.println("");
		
		
//		Method  Refference
		lis.forEach(System.out::println);
		
	}
}
