package com.komar.employees;

public abstract class Employee implements Comparable<Employee> {
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
    protected int age;

    /**
     * Расчет среднемесячной заработной платы
     *
     * @return
     */
    public abstract double calculateSalary();


    public Employee(String name, String surName, int age, double salary) {
        this.name = name;
        this.surName = surName;
        this.salary = salary;
        this.age =age;
    }

    public Employee() {
        this("h", "h",25, 5);
    }

    @Override
    public String toString() {
        return String.format("%s %s %d лет", surName, name, age);
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public double getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(Employee o) {
        int ageRes =  Integer.compare(this.age, o.age);
        if (ageRes == 0) {
            int surNameRes = surName.compareTo(o.surName);
            if (surNameRes == 0) {
                return name.compareTo(o.name);
            }
            return surNameRes;
        }
        return ageRes;
    }
}
