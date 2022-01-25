package com.google.bhasker.jstreams;

import com.google.bhasker.model.Employee;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class CollectorsExample {
  public static <Department> void main(){

    List<Employee> employees = new ArrayList<>();
    employees.add(new Employee(1, "Ram", 450, 600000.0f, "Manager"));
    employees.add(new Employee(2, "Ram", 450, 600000.0f, "Manager"));
    employees.add(new Employee(3, "Shyam", 40, 450000.0f, "Admin"));
    employees.add(new Employee(4, "Radha", 60, 600000.0f, "Engineer"));
    employees.add(new Employee(5, "Krishna", 21, 650000.0f, "DBA"));
    employees.add(new Employee(6, "Ganesh", 22, 500000.0f, "Developer"));
    employees.add(new Employee(7, "Shiva", 30, 400000.0f, "Technical Lead"));

    employees.add(new Employee(9, "Ganesh", 22, 500000.0f, "Developer"));
    employees.add(new Employee(9, "Ganesh", 22, 500000.0f, "Developer"));
    employees.add(new Employee(9, "Ganesh", 22, 500000.0f, "Developer"));
    // Accumulate names into a List
    List<String> list = employees.stream().map(Employee::getEmpName).collect(Collectors.toList());

    // Accumulate names into a TreeSet
    Set<String> set = employees.stream().map(Employee::getEmpName).collect(Collectors.toCollection(
        TreeSet::new));

    // Convert elements to strings and concatenate them, separated by commas
    String joined = employees.stream()
        .map(Object::toString)
        .collect(Collectors.joining(", "));

    // Compute sum of salaries of employee
    double total = employees.stream()
        .collect(Collectors.summingDouble(Employee::getEmpSalary)));

    // Group employees by department
    Map<Department, List<Employee>> byDept
        = employees.stream()
        .collect(Collectors.groupingBy(Employee::getDepartment));

    // Compute sum of salaries by department
    Map<Department, Integer> totalByDept
        = employees.stream()
        .collect(Collectors.groupingBy(Employee::getDepartment,
            Collectors.summingInt(Employee::getSalary)));

    // Partition students into passing and failing
    Map<Boolean, List<Student>> passingFailing =
        students.stream()
            .collect(Collectors.partitioningBy(s -> s.getGrade() >= PASS_THRESHOLD));
  }


}
