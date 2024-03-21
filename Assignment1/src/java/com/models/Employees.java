/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.models;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import org.springframework.format.annotation.DateTimeFormat;

public class Employees {
    
    @NotNull(message = "Employee Id can't be empty!")
    @Pattern(regexp = "^\\w{4,}$", message = "Employee Id must be at least 4 characters")
    private String empId;
    @NotNull(message = "Employee Name can't be empty!")
    private String empName;
    @NotNull(message = "Employee Birthday can't be empty!")
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private String empBirthday;
    @NotNull(message = "Employee Salary can't be empty!")
    @Min(value = 500, message = "Employee Salary should be at least 500 USD")
    private Double empSalary;

    public Employees() {
    }

    public Employees(String empId, String empName, String empBirthday, Double empSalary) {
        this.empId = empId;
        this.empName = empName;
        this.empBirthday = empBirthday;
        this.empSalary = empSalary;
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpBirthday() {
        return empBirthday;
    }

    public void setEmpBirthday(String empBirthday) {
        this.empBirthday = empBirthday;
    }

    public Double getEmpSalary() {
        return empSalary;
    }

    public void setEmpSalary(Double empSalary) {
        this.empSalary = empSalary;
    }
    
}
