package com.komar.employees;

import com.komar.employees.Employee;
import java.util.Random;

public class Freelancer extends Employee {
    Random random = new Random();
    String[] names = new String[]{"Анатолий", "Глеб", "Клим", "Мартин", "Лазарь", "Владлен", "Клим", "Панкратий", "Рубен", "Герман"};
    String[] surNames = new String[]{"Григорьев", "Фокин", "Шестаков", "Хохлов", "Шубин", "Бирюков", "Копылов", "Горбунов", "Лыткин", "Соколов"};
    int[] ages = new int[]{25, 35, 50, 42, 32, 22, 18, 21, 38};
    int salaryIndex = random.nextInt(200, 500);

    public Freelancer(String name, String surName, int age, double salary) {
        super(name, surName, age, salary);
    }

    public Freelancer() {
        this.name = names[random.nextInt(names.length)];
        this.surName = surNames[random.nextInt(surNames.length)];
        this.age = ages[random.nextInt(ages.length)];
        this.salary = 100 * salaryIndex;
    }

    @Override
    public double calculateSalary() {
        return salary*8*20.8;
    }

    @Override
    public String toString() {
        return String.format("%s %s %d лет; Freelancer; Почасовая заработная плата %.2f - зарплата за месяц %.2f ",
                surName, name, age, salary,calculateSalary());
    }
}
