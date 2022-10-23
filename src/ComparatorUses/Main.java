package ComparatorUses;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student(31, "Vikas", 79);
        Student s2 = new Student(29, "Chandani", 80);
        Student s3 = new Student(21, "Brijesh", 69);
        Student s4 = new Student(26, "Anubhav", 72);
        Student s5 = new Student(34, "Shubham", 70);

        List<Student> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        list.add(s5);


        Collections.sort(list, new NameComparison());
        System.out.println("============================================\nName Sorting ");
        for (Student s : list) {
            System.out.println(" Roll Num : " + s.getRoll() + " Marks : " + s.getMarks() + " Name : " + s.getName());
        }
        Collections.sort(list, new RollComparison());
        System.out.println("============================================\nRoll Sorting ");
        for (Student s : list) {
            System.out.println(" Roll Num : " + s.getRoll() + " Marks : " + s.getMarks() + " Name : " + s.getName());
        }
        Collections.sort(list, new AgeComparison());
        System.out.println("============================================\nMarks Sorting ");
        for (Student s : list) {
            System.out.println(" Roll Num : " + s.getRoll() + " Marks : " + s.getMarks() + " Name : " + s.getName());
        }
    }
}
