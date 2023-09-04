package com.komar;

import java.util.Comparator;

class NameAscendingComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee emp1, Employee emp2) {
        String name = emp1.getName();
        return  name.compareTo(emp2.getName());
    }
}

