package Java8Feature;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApiFeature {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(21);
        list.add(10);
        list.add(14);
        list.add(31);
        list.add(19);
        list.add(25);
        System.out.println(list);
        List<Integer> collect = list.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
        System.out.println(collect);

        List<Integer> collect1 = list.stream().filter(i -> i >= 20).collect(Collectors.toList());
        System.out.println(collect1);

        Integer[] arr = {10, 20, 30, 14, 24, 25, 31, 61, 23, 36, 41, 17, 29};
        Stream<Integer> stream = Stream.of(arr);
        stream.forEach(e -> System.out.print(e + " "));
    }
}
