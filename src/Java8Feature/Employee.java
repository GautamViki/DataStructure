package Java8Feature;

public class Employee {
    private Integer empId;
    private String empName;
    private Integer salary;
    private String company;

    public Employee(Integer empId, String empName, Integer salary, String company) {
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
        this.company = company;
    }

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", salary=" + salary +
                ", company='" + company + '\'' +
                '}' + "\n";
    }
}
