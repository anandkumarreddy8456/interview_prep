package java8fea;

import java.util.*;
import java.util.stream.*;

public class Java8ExamplesChatGPT {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // filter()
        List<Integer> evenNumbers = numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
        System.out.println(evenNumbers);
//        evenNumbers.forEach(System.out::print);

        // map()
        List<Integer> squaredNumbers = numbers.stream()
                .map(n -> n * n)
                .collect(Collectors.toList());
        System.out.println(squaredNumbers);
        
       
        // flatMap()
        List<List<String>> listOfLists = Arrays.asList(
                Arrays.asList("A", "B","C"), Arrays.asList("C", "D","A"));
       System.out.println(listOfLists);
        List<String> flatList = listOfLists.stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());
        System.out.println(flatList);
        // forEach()
        numbers.stream().forEach(System.out::print);

        // collect()
        Set<Integer> numberSet = numbers.stream().collect(Collectors.toSet());
        
        System.out.println(numberSet);

       
//        int sum = numbers.stream().reduce(0, Integer::average);
        OptionalDouble ave=numbers.stream().mapToInt(Integer::intValue).average();
        
        System.out.println(ave.getAsDouble());

        // sorted()
        List<Integer> sortedNumbers = numbers.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        System.out.println(sortedNumbers);
        
        List<Integer> sortedNumbers2=numbers.stream().sorted((a,b)->a.compareTo(b)).toList();
        System.out.println(sortedNumbers2);
        
        List<Integer> asc=numbers.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(asc);
        // distinct()
        List<Integer> distinctNumbers = Arrays.asList(1, 2, 2, 3, 3, 4, 5).stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println(distinctNumbers);

        // peek()
        numbers.stream()
                .peek(n -> System.out.println("Processing: " + n))
                .collect(Collectors.toList());
        
        
        // limit()
        List<Integer> limitedNumbers = numbers.stream().sorted(Comparator.reverseOrder())
                .limit(5)
                .collect(Collectors.toList());
        System.out.println(limitedNumbers+"limi");
        // skip()
        List<Integer> skippedNumbers = numbers.stream()
                .skip(5)
                .collect(Collectors.toList());
        System.out.println(skippedNumbers);
        // anyMatch()
        boolean hasEven = numbers.stream().anyMatch(n -> n % 2 == 0);
        System.out.println(hasEven);
        // allMatch()
        boolean allPositive = numbers.stream().allMatch(n -> n > 0);
        System.out.println(allPositive);
        // noneMatch()
        boolean noneNegative = numbers.stream().noneMatch(n -> n < 0);
        System.out.println(noneNegative);
        // findFirst()
        Optional<Integer> first = numbers.stream().findFirst();
        System.out.println(first.get());
        // findAny()
        Optional<Integer> any = numbers.stream().findAny();
        System.out.println(any.get());
        
        List<Person> people = Arrays.asList(
                new Person("Alice", 30),
                new Person("Bob", 25),
                new Person("Charlie", 35)
            );
        List<Person> reverse=people.stream().sorted(Comparator.comparing(Person::getAge).reversed()).collect(Collectors.toList());
        reverse.forEach((i)->System.out.println(i.getName()));
    }
}
class Person{
	String name;
	int age;
	Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }
    public int getAge() {
    	return age;
    }
}