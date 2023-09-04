package com.komar;

import java.util.Comparator;

class NameDescendingComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee emp1, Employee emp2) {
        String name = emp2.getName();
        return  name.compareTo(emp1.getName());
    }
}

