package jungsuck.ch14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamPractice1 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5);
        System.out.println(numbers);


        numbers.stream()
//                .filter(n->n%2 == 0)
                .map(n->n*2)
                .forEach(System.out::println);

        List<Integer> newList =
                numbers.stream()
                        .filter(n-> n % 2 == 0)
                        .map(n -> n * 2)
                        .collect(Collectors.toList());

        System.out.println(newList);

    }
}
