package com.komar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Program {

    private static Random random = new Random();

    /**
     * TODO: Переработать метод generateWorker. Метод должен возвращать случайного
     *  сотрудника (Freelancer или Worker)
     *
     * @return
     */

    public static Employee generateRandomEmployee() {
        String[] names = new String[]{"Анатолий", "Глеб", "Клим", "Мартин", "Лазарь", "Владлен", "Клим", "Панкратий", "Рубен", "Герман"};
        String[] surNames = new String[]{"Григорьев", "Фокин", "Шестаков", "Хохлов", "Шубин", "Бирюков", "Копылов", "Горбунов", "Лыткин", "Соколов"};
        int[] ages = new int[]{25, 35, 50, 42, 32, 22, 18, 21, 38};

        int salaryIndex = random.nextInt(200, 500);

        int employeeType = random.nextInt(3);

        switch (employeeType) {
            case 0:
                return new Worker(names[random.nextInt(names.length)],
                        surNames[random.nextInt(surNames.length)],
                        ages[random.nextInt(ages.length)],
                        100 * salaryIndex);
            case 1:
                return new Freelancer(names[random.nextInt(names.length)],
                        surNames[random.nextInt(surNames.length)],
                        ages[random.nextInt(ages.length)],
                        10 * salaryIndex);
            case 2:
                return new Intern(names[random.nextInt(names.length)],
                        surNames[random.nextInt(surNames.length)],
                        ages[random.nextInt(ages.length)],
                        0);
            default:
                throw new IllegalArgumentException("Invalid employee type: " + employeeType);
        }
    }

    public static Employee[] generateEmployee(int count) {
        Employee[] workers = new Employee[count];
        for (int i = 0; i < count; i++) {
            workers[i] = generateRandomEmployee();
        }
        return workers;
    }

    public static void main(String[] args) {

        Employee[] employees = generateEmployee(12);

        for (Employee employee : employees) {
            System.out.println(employee);
        }

        Arrays.sort(employees);
        System.out.println();
        System.out.println("Дефолтная сортировка (по возрасту)");
        for (Employee employee : employees) {
            System.out.println(employee);
        }

        Arrays.sort(employees, new AgeComparator());
        System.out.println();
        System.out.println("Сортировка по возрасту");
        for (Employee employee : employees) {
            System.out.println(employee);
        }

        Arrays.sort(employees, new SalaryComparator());
        System.out.println();
        System.out.println("сортировка по ЗП");
        for (Employee employee : employees) {
            System.out.println(employee);
        }

        Arrays.sort(employees, new NameDescendingComparator());
        System.out.println();
        System.out.println("сортировка по имени(по убыванию)");
        for (Employee employee : employees) {
            System.out.println(employee);
        }

        Arrays.sort(employees, new NameAscendingComparator());
        System.out.println();
        System.out.println("сортировка по имени(по возрастанию)");
        for (Employee employee : employees) {
            System.out.println(employee);
        }

    }
}
