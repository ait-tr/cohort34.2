package entity;

import java.util.Calendar;

// Абстрактный класс BaseEmployee
public abstract class BaseEmployee implements Employee {
    private String name;
    private int id;
    private int hireYear;
    private double salary;

    public BaseEmployee(String name, int id, int hireYear) {
        this.name = name;
        this.id = id;
        this.hireYear = hireYear;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getId() {
        return id;
    }

    public int getHireYear() {
        return hireYear;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void adjustSalaryByExperience(int minExperience, int maxExperience, double percentage) {
        int currentYear = Calendar.getInstance().get(Calendar.YEAR); // Текущий год
        int experience = currentYear - hireYear;
        if (experience >= minExperience && experience <= maxExperience) {
            // Расчет новой зарплаты с учетом процента повышения
            double currentSalary = calculateSalary();
            double increaseAmount = (currentSalary * percentage) / 100;
            double newSalary = currentSalary + increaseAmount;
            // Установка новой зарплаты
            setSalary(newSalary);
        }
    }
}
