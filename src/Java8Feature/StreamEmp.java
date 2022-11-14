package Java8Feature;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamEmp {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(120, "vikas", 20000, "Meta"));
        employees.add(new Employee(201, "Rajesh", 5000, "Google"));
        employees.add(new Employee(324, "Anunhav", 5000, "Netflix"));
        employees.add(new Employee(157, "Brijesh", 10000, "Amazon"));
        employees.add(new Employee(541, "Rahul", 10000, "Microsoft"));
        employees.add(new Employee(321, "Anudeep", 15000, "TCS"));
        employees.add(new Employee(421, "Rahul", 8000, "Wipro"));
        employees.add(new Employee(654, "Ankush", 17000, "Masai"));

        System.out.println(employees);
        List<Employee> filterBySalary = employees.stream().filter(i -> i.getSalary() < 10000).collect(Collectors.toList());
        System.out.println("\nFilter by salary<=10000");
        System.out.println(filterBySalary);

        List<Employee> mapBySalary = employees.stream().map(i -> {
            if (i.getSalary() < 10000) {
                i.setSalary(i.getSalary() + 2000);
            }
            return i;
        }).collect(Collectors.toList());
        System.out.println("\nMap by Salary if salary<10000=>salary+2000");
        System.out.println(mapBySalary);

      
    }
}
