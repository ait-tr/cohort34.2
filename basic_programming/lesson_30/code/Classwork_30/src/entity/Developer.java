package entity;

// Класс Developer
public class Developer extends BaseEmployee {
    private double hourlyRate;
    private int hoursWorked;

    public Developer(String name, int id, double hourlyRate, int hoursWorked, int hireYear) {
        super(name, id, hireYear);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }
}
