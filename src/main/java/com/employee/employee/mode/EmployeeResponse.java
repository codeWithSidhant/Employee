package com.employee.employee.mode;

public class EmployeeResponse {
    private String name;
    private String department;
    private int age;

    public EmployeeResponse(String name, String department, int age) {
        this.name = name;
        this.department = department;
        this.age = age;
    }

    public EmployeeResponse() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
