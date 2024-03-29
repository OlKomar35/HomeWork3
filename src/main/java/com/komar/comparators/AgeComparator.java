package com.komar.comparators;

import com.komar.employees.Employee;
import java.util.Comparator;

public class AgeComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee emp1, Employee emp2) {
        return Integer.compare(emp1.getAge(), emp2.getAge());
    }
}

