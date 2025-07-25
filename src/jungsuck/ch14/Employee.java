package jungsuck.ch14;

import java.time.LocalDate;
import java.util.List;

// 직원 클래스
class Employee {
    private String name;
    private String department;
    private int salary;
    private LocalDate hireDate;
    private List<String> skills;

    public Employee(String name, String department, int salary, LocalDate hireDate, List<String> skills) {
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.hireDate = hireDate;
        this.skills = skills;
    }

    // getter 메서드들
    public String getName() { return name; }
    public String getDepartment() { return department; }
    public int getSalary() { return salary; }
    public LocalDate getHireDate() { return hireDate; }
    public List<String> getSkills() { return skills; }

    @Override
    public String toString() {
        return String.format("%s(%s, %d원)", name, department, salary);

    }
}