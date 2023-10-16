package entity;

// Класс Salesperson
public class Salesperson extends BaseEmployee {
    private double baseSalary;
    private int numberOfDeals;

    public Salesperson(String name, int id, double baseSalary, int numberOfDeals, int hireYear) {
        super(name, id, hireYear);
        this.baseSalary = baseSalary;
        this.numberOfDeals = numberOfDeals;
    }

    @Override
    public double calculateSalary() {
        return baseSalary + (numberOfDeals * 200);
    }
}
