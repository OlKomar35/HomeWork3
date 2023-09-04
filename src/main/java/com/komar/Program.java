package com.komar;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Program {

    public static <T> T generateRandomObject(List<Class<? extends T>> classList) throws IllegalAccessException, InstantiationException {
        Random random = new Random();
        int index = random.nextInt(classList.size());
        Class<? extends T> randomClass = classList.get(index);
        return randomClass.newInstance();
    }

    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        List<Employee> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            List<Class<? extends Employee>> classList = List.of(Worker.class, Freelancer.class, Intern.class);
            Employee randomObject = generateRandomObject(classList);
            list.add(randomObject);
        }
        for (Employee l : list) {
            System.out.println(l);
        }
    }
}
