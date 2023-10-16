import entity.*;
import repo.EmployeeRepository;

public class Main {
    public static void main(String[] args) {
        EmployeeRepository repository = new EmployeeRepository();

        Employee developer1 = new Developer("John", 1, 25.0, 160, 2022);
        Employee developer2 = new Developer("Alice", 2, 30.0, 150, 2020);
        Employee manager1 = new Manager("Bob", 3, 3000.0, 5, 2019);
        Employee salesperson1 = new Salesperson("Eve", 4, 2000.0, 10, 2021);

        repository.addEmployee(developer1);
        repository.addEmployee(developer2);
        repository.addEmployee(manager1);
        repository.addEmployee(salesperson1);

        // Повысить зарплату для работников с опытом от 2 до 5 лет на 10%
        for (Employee employee : repository.getAllEmployees()) {
            if (employee instanceof BaseEmployee) {
                BaseEmployee baseEmployee = (BaseEmployee) employee;
                baseEmployee.adjustSalaryByExperience(2, 5, 10);
            }
        }

        // Вывести информацию о работниках
        Employee[] allEmployees = repository.getAllEmployees();
        for (Employee employee : allEmployees) {
            System.out.println(employee.getName() + " - Salary: " + employee.calculateSalary());
        }
    }
}
