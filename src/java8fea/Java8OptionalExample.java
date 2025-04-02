package java8fea;

import java.util.Optional;

public class Java8OptionalExample {
    public static void main(String[] args) {
    	Optional<String> optional = Optional.of("Hello");
//        Optional<String> optional = Optional.ofNullable(null);

        // isPresent()
        if (optional.isPresent()) {
            System.out.println(optional.get());
        }

        // ifPresent()
        optional.ifPresent(System.out::println);

        // orElse()
        String value = optional.orElse("Default Value");

        // orElseGet()
        String value2 = optional.orElseGet(() -> "Generated Value");

        // orElseThrow()
        String value3 = optional.orElseThrow(() -> new RuntimeException("Value not found"));

        // map()
        Optional<Integer> length = optional.map(String::length);

        // flatMap()
        Optional<Optional<String>> nested = Optional.of(Optional.of("Nested"));
        Optional<String> flat = nested.flatMap(opt -> opt);
        System.out.println(flat.get()+" "+length.get()+" "+value3+" "+value2+" "+value);
    }
}