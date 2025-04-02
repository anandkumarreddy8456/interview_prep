package java8fea;

import java.util.function.*;

public class Java8FunctionalExample {
    public static void main(String[] args) {
        Function<Integer, String> function = n -> "Number: " + n;
        System.out.println(function.apply(5));

        Predicate<Integer> predicate = n -> n > 10;
        System.out.println(predicate.test(15));

        Consumer<String> consumer = s -> System.out.println("Consumed: " + s);
        consumer.accept("Hello");

        Supplier<Double> supplier = Math::random;
        System.out.println(supplier.get());
    }
}