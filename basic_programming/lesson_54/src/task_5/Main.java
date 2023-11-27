package task_5;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee("Aleks", "Developer", 1500));
        employees.add(new Employee("Thomas", "Manager", 680.50));
        employees.add(new Employee("Thea", "CEO", 2000));
        employees.add(new Employee("Mary", "Manager", 700));
        employees.add(new Employee("Ken", "Developer", 900));

        //        0. Создать класс Employee
//        1. Вывести всех сотрудников без высшего руководителя
//        2. Сгруппировать сотрудников по должности
//        3. Вычислить среднюю зарплату всех сотрудников (двумя способами)
//        4. Получить список сотрудников с зп > 1000
//        5. Получить список сотрудников из отдела маркетинг и увеличить зп на 15%
//        6. Получить сотрудника с самой низкой зп
//        7. Получите сотрудников из всех отделов с максимальной зп

        List<Employee> result1 = employees.stream()
                .filter(x -> !x.getPosition().equals("CEO"))
                .collect(Collectors.toList());

        System.out.println("Задача 1:");
        result1.forEach(System.out::println);

        Map<String, List<Employee>> result2 = employees.stream()
                .collect(Collectors.groupingBy(x -> x.getPosition()));

        System.out.println("Задача 2:");
        result2.forEach((position, employeeList) -> {
            System.out.println(position);
            employeeList.forEach(System.out::println);
        });
    }
}