package strimchiki;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.IntStream;

public class Runner {
    public static void main(String[] args) {
        long count = IntStream.of(-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5).filter(value -> value > 0).count();

        System.out.println(count);

        Collection<Integer> collection = Arrays.asList(-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5);
        collection.stream().peek(x -> System.out.println(x * 10)).close();
        collection.stream().map(integer -> {
            if (integer < 0) integer = integer * (-1);
            return integer;
        }).close();

//        collection.stream().forEach(x -> { if (x < 0) x;});
        collection.stream().forEach(System.out::println);
    }
}
