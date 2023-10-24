import entity.BaseEmployee;
import entity.Developer;
import entity.Manager;
import entity.Salesperson;
import repo.EmployeeRepository;

import java.util.Comparator;

public class Main2 {
    public static void main(String[] args) {
        EmployeeRepository repository = new EmployeeRepository();

        BaseEmployee developer1 = new Developer("John", 25.0, 160, 2022);
        BaseEmployee developer2 = new Developer("Alice", 30.0, 150, 2020);
        BaseEmployee manager1 = new Manager("Bob", 3000.0, 5, 2019);
        BaseEmployee salesperson1 = new Salesperson("Eve", 2000.0, 10, 2021);

        repository.addEmployee(developer1);
        repository.addEmployee(developer2);
        repository.removeEmployee(46987);
        repository.addEmployee(manager1);
        repository.addEmployee(salesperson1);


        System.out.println("Sort by...");

        System.out.println("\nSort by hire year");
        printArray(repository.sortByComparator((o1, o2) -> o1.getHireYear() - o2.getHireYear()));

        System.out.println("\nSort by id");
        BaseEmployee[] sortedById = repository.sortByComparator((o1, o2) -> o1.getId() - o2.getId());
        printArray(sortedById);

        System.out.println("\nSort by name");
        Comparator<BaseEmployee> comparatorByName = (o1, o2) -> o1.getName().compareTo(o2.getName());
        BaseEmployee[] sortedByName = repository.sortByComparator(comparatorByName);
        printArray(sortedByName);
    }


    private static void printArray(BaseEmployee[] array) {
        for (int i = 0; i < array.length; i++) {
            BaseEmployee employee = array[i];
            System.out.println(employee);
        }
    }
}
