package java.model;

public class Employees {

    private int EmpId;

    private String name;

    private long salary;

    private String grade;

    private String department;

    public Employees(int id, String name, long salary,String grade, String dept) {
        this.EmpId = id;
        this.name = name;
        this.salary = salary;
        this.grade = grade;
        this.department = dept;
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

    public long getSalary() {
        return salary;
    }

    public String getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return "Employees{" +
                "EmpId=" + EmpId +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", grade='" + grade + '\'' +
                ", department='" + department + '\'' +
                '}';
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

}
