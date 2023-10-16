package repo;

import entity.Employee;

public class EmployeeRepository implements EmployeeRepositoryInterface {
    private Employee[] employees = new Employee[100]; // Массив для хранения работников
    private int size = 0; // Размер массива

    public void addEmployee(Employee employee) {
        if (size < employees.length) {
            employees[size] = employee;
            size++;
        } else {
            System.out.println("Репозиторий работников заполнен.");
        }
    }

    public void removeEmployee(int id) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getId() == id) {
                // Если найден работник с заданным ID, удаляем его и сдвигаем остальных работников
                for (int j = i; j < size - 1; j++) {
                    employees[j] = employees[j + 1];
                }
                employees[size - 1] = null;
                size--;
                return;
            }
        }
        System.out.println("Работник с ID " + id + " не найден.");
    }

    public Employee findEmployeeById(int id) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getId() == id) {
                return employees[i];
            }
        }
        return null;
    }

    public Employee[] getAllEmployees() {
        return employees;
    }

    public int countEmployees() {
        return size;
    }
}
