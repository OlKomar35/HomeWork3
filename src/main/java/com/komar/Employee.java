package com.komar;

public abstract class Employee implements Comparable<Employee>{
    /**
     * Имя
     */
    protected String name;
    /**
     * Фамилия
     */
    protected String surName;
    /**
     * Ставка заработной платы
     */
    protected double salary;

    /**
     * Расчет среднемесячной заработной платы
     * @return
     */
    public abstract double calculateSalary();



    public Employee(String name, String surName, double salary) {
        this.name = name;
        this.surName = surName;
        this.salary = salary;
    }

    public Employee() {
        this("h","h",5);
    }

    @Override
    public String toString() {
        return String.format("%s %s", surName, name);
    }

    @Override
    public int compareTo(Employee o) {
        int surNameRes = surName.compareTo(o.surName);
        if (surNameRes == 0){
            return name.compareTo(o.name);
        }
        return surNameRes;
    }
}
