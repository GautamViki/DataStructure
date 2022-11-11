package Java8Feature;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamOnObjects {
    public static void main(String[] args) {
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
                        if (i1.getAge() - i2.getAge() > 0) return -1;
                        else if (i1.getAge() - i2.getAge() < 0) return 1;
                        else {
                            return i1.getRoll() - i2.getRoll();
                        }
                    }
                })
                .collect(Collectors.toList());
        System.out.println(ageMap);

        System.out.println("==========================================================\n"
                + "filter by roll < 40 / count");
        long count = students.stream().filter(i -> i.getRoll() < 40).count();
        System.out.println("count   " + count);

        System.out.println(students);
        Student min = students.stream().min((i1, i2) -> {
                    if (i1.getAge().compareTo(i2.getAge()) == 0) {
                        return i1.getRoll() - i2.getRoll();
                    } else return i1.getAge().compareTo(i2.getAge());
                })
                .get();
        System.out.println("Minimum by age=>roll   \n" + min);
    }
}
