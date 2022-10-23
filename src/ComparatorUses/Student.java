package ComparatorUses;

public class Student {
    private final int roll;
    private final String name;
    private final int marks;

    public Student(int roll, String name, int marks) {
        this.roll = roll;
        this.name = name;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }

    public int getRoll() {
        return roll;
    }
}
