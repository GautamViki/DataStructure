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
        Integer[] arr = {10, 20, 30, 14, 24, 25, 31, 61, 23, 36, 41, 17, 29};
        Stream<Integer> stream = Stream.of(arr);
        stream.forEach(e -> System.out.print(e + " "));
        System.out.println();

        List<Student> students = new ArrayList<>();
        students.add(new Student(10, "Vikas", "Lucknow", 24));
        students.add(new Student(60, "Brijesh", "Jaipur", 25));
        students.add(new Student(40, "Vikas", "Gorakhpur", 26));
        students.add(new Student(50, "Vikas", "Kanpur", 24));
        students.add(new Student(30, "Shivani", "Bihar", 23));
        students.add(new Student(20, "Anshul", "Allahabad", 26));

        System.out.println(students);
        System.out.println("=========================================================================\n" +
                "Filter by age and Sort by age");
        List<Student> ageFilter = students.stream()
                .filter(i -> i.getAge() > 23)
                .sorted((i1, i2) -> (i1.getAge() > i2.getAge() ? -1 : (i1.getAge() < i2.getAge() ? 1 : i1.getRoll().compareTo(i2.getRoll()))))
                .collect(Collectors.toList());
        System.out.println(ageFilter);

        System.out.println("=========================================================================\n" +
                "filter by age > 23 / Map by age - 10 / sort by name =>age=>roll");
        List<Student> ageMap = students.stream()
                .filter(i -> i.getAge() > 23)
                .map(i -> {
                    i.setAge(i.getAge() - 10);
                    return i;
                })
                .sorted((i1, i2) -> {
                    if (i1.getName().compareTo(i2.getName()) > 0) return 1;
                    else if (i1.getName().compareTo(i2.getName()) < 0) return -1;
                    else {
                        if (i1.getAge() - i2.getAge() > 0) return 1;
                        else if (i1.getAge() - i2.getAge() < 0) return -1;
                        else {
                            return i1.getRoll() - i2.getRoll();
                        }
                    }
                })
                .collect(Collectors.toList());
        System.out.println(ageMap);

    }
}


