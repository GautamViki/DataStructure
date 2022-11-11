package Java8Feature;

import java.util.ArrayList;
import java.util.Comparator;
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

        List<Integer> set = hashSet.stream().sorted().collect(Collectors.toList());
        System.out.println(set);
        Integer[] arr = {10, 20, 30, 14, 24, 25, 31, 61, 23, 36, 41, 17, 29};
        Stream<Integer> stream = Stream.of(arr);
        stream.forEach(e -> System.out.print(e + " "));
        System.out.println();

        List<Student> students = new ArrayList<>();
        students.add(new Student(10, "Vikas", "Lucknow", 27));
        students.add(new Student(60, "Brijesh", "Gajipur", 25));
        students.add(new Student(70, "Chandni", "Gorakhpur", 26));
        students.add(new Student(50, "Vikas", "Kanpur", 24));
        students.add(new Student(30, "Shivani", "Bihar", 23));
        students.add(new Student(20, "Anshul", "Allahabad", 26));

        System.out.println(students);
        System.out.println("=========================================================================\nFilter by age and Sort by age");
        List<Student> ageFilter = students.stream()
                .filter(i -> i.getAge() > 23)
                .sorted((i1, i2) -> (i1.getAge() > i2.getAge() ? -1 : (i1.getAge() < i2.getAge() ? 1 : i1.getRoll().compareTo(i2.getRoll()))))
                .collect(Collectors.toList());
        System.out.println(ageFilter);

        System.out.println("=========================================================================\nfilter by age > 23 / Map by age - 10 / sort by name");
        List<Student> ageMap = students.stream()
                .filter(i -> i.getAge() > 23)
                .map(i -> {
                    i.setAge(i.getAge() - 10);
                    return i;
                })
                .sorted((i1, i2) -> {
                    if (i1.getName().compareTo(i2.getName()) > 0) {
                        return 1;
                    } else if (i1.getName().compareTo(i2.getName()) < 0) {
                        return -1;
                    } else {
                        return i1.getAge() - i2.getAge();
                    }
                })
                .collect(Collectors.toList());
        System.out.println(ageMap);
        
    }
}

class Student {
    private Integer roll;
    private String name;
    private String address;
    private Integer age;

    Student(Integer roll, String name, String address, Integer age) {
        this.roll = roll;
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public Integer getRoll() {
        return roll;
    }

    public void setRoll(Integer roll) {
        this.roll = roll;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "roll=" + roll +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", age=" + age +
                '}' + "\n";
    }
}
