package com.practice.main.com.practice.beans;

public class Employee {
    private String empName;
    private Double empSal;
    private Integer empId;

    public Employee(String empName, Double empSal, Integer empId) {
        this.empName = empName;
        this.empSal = empSal;
        this.empId = empId;
    }

    public Employee() {
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Double getEmpSal() {
        return empSal;
    }

    public void setEmpSal(Double empSal) {
        this.empSal = empSal;
    }

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empName='" + empName + '\'' +
                ", empSal=" + empSal +
                ", empId=" + empId +
                '}';
    }
}
