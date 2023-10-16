package entity;

// Класс Manager
public class Manager extends BaseEmployee {
    private double baseSalary;
    private int numberOfProjects;

    public Manager(String name, int id, double baseSalary, int numberOfProjects, int hireYear) {
        super(name, id, hireYear);
        this.baseSalary = baseSalary;
        this.numberOfProjects = numberOfProjects;
    }

    @Override
    public double calculateSalary() {
        return baseSalary + (numberOfProjects * 1000);
    }
}
