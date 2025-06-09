package java8fea;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;


public class java8miscellionsExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);

        // foreach()
        numbers.forEach(System.out::println);

        // max()
        long max = numbers.stream().max(Integer::compareTo).get();

        // min()
        Optional<Integer> min = numbers.stream().min(Integer::compareTo);

        // count()
        long count = numbers.stream().count();
        System.out.println(max+" "+min+" "+count);
        
        int arr[]=new int[] {5,4,5,43,2,43};
        List<Integer> lis=Arrays.stream(arr).boxed().toList();
        System.out.println(lis);
    }
}