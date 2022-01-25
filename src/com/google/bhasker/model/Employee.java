package com.google.bhasker.model;

import java.io.Serializable;
import java.util.Objects;

public class Employee implements Serializable {

  private int empId;
  private String empName;
  private int empAge;
  private float empSalary;
  private String empRole;
  private String email;
  private String mobile;


  public Employee(){
  }

  public Employee(int empId, String empName, int empAge, float empSalary, String empRole) {
    this.empId  = empId;
    this.empName = empName;
    this.empAge = empAge;
    this.empSalary = empSalary;
    this.empRole = empRole;
  }

  public Employee(String empName) {
    this.empName = empName;
  }

  public String getEmpName() {
    return empName;
  }

  public float getEmpSalary() {
    return empSalary;
  }

  public void setEmpSalary(float empSalary) {
    this.empSalary = empSalary;
  }

  public int getEmpAge() {
    return empAge;
  }

  public void setEmpAge(int empAge) {
    this.empAge = empAge;
  }

  public void setEmpName(String empName) {
    this.empName = empName;
  }

  public int getEmpId() {
    return empId;
  }

  public void setEmpId(int empId) {
    this.empId = empId;
  }

  public String getEmpRole() {
    return empRole;
  }

  public void setEmpRole(String empRole) {
    this.empRole = empRole;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getMobile() {
    return mobile;
  }

  public void setMobile(String mobile) {
    this.mobile = mobile;
  }

  @Override
  public String toString() {
    return "Employee{" +
        "empId=" + empId +
        ", empName='" + empName + '\'' +
        ", empAge=" + empAge +
        ", empSalary=" + empSalary +
        ", empRole='" + empRole + '\'' +
        ", email='" + email + '\'' +
        ", mobile='" + mobile + '\'' +
        '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof Employee)) {
      return false;
    }
    Employee employee = (Employee) o;
    return empId == employee.empId && empAge == employee.empAge
        && Float.compare(employee.empSalary, empSalary) == 0 && Objects
        .equals(empName, employee.empName) && Objects.equals(empRole, employee.empRole)
        && Objects.equals(email, employee.email) && Objects
        .equals(mobile, employee.mobile);
  }

  @Override
  public int hashCode() {
    return Objects.hash(empId, empName, empAge, empSalary, empRole, email, mobile);
  }
}

