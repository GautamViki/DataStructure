package ComparatorUses;

import java.util.Comparator;

public class RollComparison implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        if (s1.getRoll() < s2.getRoll()) return 1;
        else if (s1.getRoll() > s2.getRoll()) return -1;
        else return 0;
    }
}
