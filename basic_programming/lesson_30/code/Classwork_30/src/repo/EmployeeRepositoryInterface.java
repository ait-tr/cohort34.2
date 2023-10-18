package repo;

import entity.Employee;

/**
 * Интерфейс для репозитория работников.
 */
public interface EmployeeRepositoryInterface {

    /**
     * Добавляет работника в репозиторий.
     *
     * @param employee Добавляемый работник.
     */
    Employee addEmployee(Employee employee);

    /**
     * Удаляет работника из репозитория по его ID.
     *
     * @param id ID работника, которого необходимо удалить.
     */
    boolean removeEmployee(int id);

    /**
     * Ищет работника в репозитории по его ID.
     *
     * @param id ID работника, которого необходимо найти.
     * @return Найденный работник или null, если работник не найден.
     */
    Employee findEmployeeById(int id);

    /**
     * Получает массив всех работников в репозитории.
     *
     * @return Массив всех работников в репозитории.
     */
    Employee[] getAllEmployees();

    /**
     * Возвращает количество работников в репозитории.
     *
     * @return Количество работников в репозитории.
     */
    int countEmployees();
}
