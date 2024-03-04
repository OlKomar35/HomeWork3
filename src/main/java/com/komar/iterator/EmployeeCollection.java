package com.komar.iterator;

import com.komar.employees.Employee;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EmployeeCollection implements Iterable<Employee> {
  private List<Employee> employees;

  public EmployeeCollection(Employee[] employees) {
   this.employees = List.of(employees);
  }

  public void addEmployee(Employee employee) {
    employees.add(employee);
  }

  @Override
  public Iterator<Employee> iterator() {
    return employees.iterator();
  }
}

