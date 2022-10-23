package ComparatorUses;

import java.util.Comparator;

public class NameComparison implements Comparator<Student> {
    public int compare(Student student1, Student student2) {
        return student2.getName().compareTo(student1.getName());
    }
}
