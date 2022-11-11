package Java8Feature;

import java.util.ArrayList;
import java.util.HashSet;
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
        System.out.println("list   " + list);
        List<Integer> collect = list.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
        System.out.println("collect%2==0   " + collect);

        List<Integer> collect1 = list.stream().filter(i -> i >= 20).collect(Collectors.toList());
        System.out.println("collect1>20  " + collect1);

        List<Integer> collect2 = list.stream().filter(i -> i % 2 == 1).map(i -> i + 10).collect(Collectors.toList());
        System.out.println("collect2   " + collect2);

        long count = list.stream().filter(i -> i % 2 == 1).count();
        System.out.println("count  " + count);

        HashSet<Integer> hashSet = new HashSet<>(list);
        System.out.println("Hashset  " + hashSet);

        List<Integer> set = hashSet.stream().sorted((i1, i2) -> i2 - i1).collect(Collectors.toList());
        System.out.println("sorted set  " + set);

        Integer min = list.stream().min((i1, i2) -> i1.compareTo(i2)).get();
        System.out.println("Minimum value  " + min);

        Integer max = list.stream().max((i1, i2) -> i1.compareTo(i2)).get();
        System.out.println("Maximum value  " + max);
       
    }
}


