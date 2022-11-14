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

        Long count = employees.stream().filter(i -> i.getEmpId() > 400).count();
        System.out.println("\nCount f Id>400");
        System.out.println(count);

        Employee minEmp = employees.stream().min((i1, i2) -> i1.getSalary() - i2.getSalary()).get();
        System.out.println("\nMin employee by Salary");
        System.out.println(minEmp);

        Employee maxEmp = employees.stream().max((i1, i2) -> i1.getSalary() - i2.getSalary()).get();
        System.out.println("\nMax employee by salary");
        System.out.println(maxEmp);

        List<Employee> filterMap = employees.stream()
                .filter(i -> i.getSalary() <= 10000)
                .map(i -> {
                    i.setCompany(i.getCompany() + " tech");
                    return i;
                })
                .collect(Collectors.toList());
        System.out.println("\nFilter by salary<=10000 and Map by company + tech");
        System.out.println(filterMap);

        System.out.println(employees);

        List<Employee> sortSalary = employees.stream().sorted((i1, i2) -> i1.getSalary() - i2.getSalary())
                .collect(Collectors.toList());
        System.out.println("\nSort by salary");
        System.out.println(sortSalary);

        List<Employee> sortByName = employees.stream()
                .sorted((i1, i2) -> i1.getEmpName().compareTo(i2.getEmpName()))
                .collect(Collectors.toList());
        System.out.println("\nSort by Name");
        System.out.println(sortByName);


    }
}
