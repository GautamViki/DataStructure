package ComparatorUses;

public class Student {
    private final int roll;
    private final String name;
    private final int age;

    public Student(int roll, String name, int age) {
        this.roll = roll;
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getRoll() {
        return roll;
    }
}
