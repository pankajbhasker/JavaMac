package com.google.bhasker.collectionapi;

import com.google.bhasker.model.Employee;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateEmployee {

  public static void main(String args[]) {

    List<Employee> empList = new ArrayList<>();
    empList.add(new Employee(1, "Ram", 450, 600000.0f, "Manager"));
    empList.add(new Employee(2, "Ram", 450, 600000.0f, "Manager"));
    empList.add(new Employee(3, "Shyam", 40, 450000.0f, "Admin"));
    empList.add(new Employee(4, "Radha", 60, 600000.0f, "Engineer"));
    empList.add(new Employee(5, "Krishna", 21, 650000.0f, "DBA"));
    empList.add(new Employee(6, "Ganesh", 22, 500000.0f, "Developer"));
    empList.add(new Employee(7, "Shiva", 30, 400000.0f, "Technical Lead"));
    empList.add(new Employee(9, "Ganesh", 22, 500000.0f, "Developer"));
    empList.add(new Employee(9, "Ganesh", 22, 500000.0f, "Developer"));
    empList.add(new Employee(9, "Ganesh", 22, 500000.0f, "Developer"));

    DuplicateEmployee.findDuplicateEmployee(empList);
    DuplicateEmployee.getDuplicateEmpList();

    final Map<Employee, Long> groupedWithCount = empList.stream()
        .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    System.out.println("  GroupedWithCount  " + groupedWithCount);


  }

  private static Map<String, Integer> findDuplicateEmployee(List<Employee> empList) {

    Map<String, Integer> map = new HashMap<>();
    Map<String, Integer> dupMap = new HashMap<>();
    int count = 1;
    for (Employee el : empList) {

      if (!map.containsKey(el.getEmpName())) {
        map.put(el.getEmpName(), count);
      } else {
        dupMap.put(el.getEmpName(), count++);
      }

    }

    System.out.println(dupMap);
    return dupMap;

  }

  public static Set<Employee> getDuplicateEmpList() {

    Employee e1 = new Employee(1, "Ram", 450, 600000.0f, "Manager");
    Employee e2 = new Employee(1, "Ram", 450, 600000.0f, "Manager");
    Employee e3 = new Employee(3, "Shyam", 40, 450000.0f, "Admin");
    Employee e4 = new Employee(4, "Radha", 60, 600000.0f, "Engineer");
    Employee e5 = new Employee(5, "Krishna", 21, 650000.0f, "DBA");



    List<Employee> list = Arrays.asList(e1, e2, e3, e4, e5);



    Set<Employee> set = new HashSet<>();
    for (int i = 0; i < list.size(); i++) {
      for (int j = i + 1; j < list.size(); j++) {
        if (list.get(i).equals(list.get(j))) {
          set.add(list.get(i));
        }
      }
    }
    //System.out.println("Set of Employee: " + set);
    return set;
  }

}
