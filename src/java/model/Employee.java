package java.model;

public class Employee implements Comparable<Employee> {

    private int EmpId;

    private String name;

    private Long salary;

    private Department department;

    public Employee(int empId, String name, Long salary, Department department) {
        EmpId = empId;
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee [" +
                "EmpId = " + EmpId +
                ", name = '" + name + '\'' +
                ", salary = " + salary +
                ", department = " + department +
                ']';
    }

    public int getEmpId() {
        return EmpId;
    }

    public void setEmpId(int empId) {
        EmpId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getSalary() {
        return salary;
    }

    public void setSalary(Long salary) {
        this.salary = salary;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }


    @Override
    public int compareTo(Employee o) {
        return 0;
    }
}



