package com.komar.employees;

import com.komar.employees.Employee;
import java.util.Random;

/**
 * Обычный рабочий (фулл-тайм)
 */

public class Worker extends Employee {

    Random random = new Random();
    String[] names = new String[]{"Анатолий", "Глеб", "Клим", "Мартин", "Лазарь", "Владлен", "Клим", "Панкратий", "Рубен", "Герман"};
    String[] surNames = new String[]{"Григорьев", "Фокин", "Шестаков", "Хохлов", "Шубин", "Бирюков", "Копылов", "Горбунов", "Лыткин", "Соколов"};
    int[] ages = new int[]{25, 35, 50, 42, 32, 22, 18, 21, 38};

    int salaryIndex = random.nextInt(200, 500);

    public Worker(String name, String surName, int age, double salary) {
        super(name, surName, age, salary);
    }

    public Worker() {
        this.name = names[random.nextInt(names.length)];
        this.surName = surNames[random.nextInt(surNames.length)];
        this.salary = 100 * salaryIndex;
        this.age = ages[random.nextInt(ages.length)];
    }



    @Override
    public double calculateSalary() {
        return salary;
    }


    @Override
    public String toString() {
        return String.format("%s %s %d лет; Рабочий; Среднемесячная заработная плата (фиксированная) %.2f",
                surName, name, age, salary);
    }

}
