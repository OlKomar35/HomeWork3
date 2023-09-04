package com.komar;

import java.util.Random;

public class Intern extends Employee {
    Random random = new Random();
    String[] names = new String[]{"Анатолий", "Глеб", "Клим", "Мартин", "Лазарь", "Владлен", "Клим", "Панкратий", "Рубен", "Герман"};
    String[] surNames = new String[]{"Григорьев", "Фокин", "Шестаков", "Хохлов", "Шубин", "Бирюков", "Копылов", "Горбунов", "Лыткин", "Соколов"};
    int salaryIndex = random.nextInt(200, 500);
    public Intern(String name, String surName, double salary) {
        super(name, surName, salary);
    }

    public Intern() {
        this.name = names[random.nextInt(names.length)];
        this.surName = surNames[random.nextInt(surNames.length)];
        this.salary = 100 * salaryIndex;
    }

    /**
     * работает бесплатно
     *
     * @return
     */
    @Override
    public double calculateSalary() {
        return 0;
    }

    @Override
    public String toString() {
        return String.format("%s %s; Стажер; Работает за еду, т.е. бесплатно",
                surName, name);
    }
}
