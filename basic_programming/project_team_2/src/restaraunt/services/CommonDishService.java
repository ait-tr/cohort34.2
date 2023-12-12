package restaraunt.services;

import restaraunt.domain.interfaces.Dish;
import restaraunt.repositories.interfaces.DishRepository;
import restaraunt.services.interfaces.DishService;

import java.util.List;

public class CommonDishService implements DishService {

    private DishRepository repository;

    public CommonDishService(DishRepository repository) {
        this.repository = repository;
    }

    @Override
    public void addDish(String name, double price) {  // Реализация метода интерфейса DishService для добавления блюда
        if (name == null) {  // Проверка на null и выброс исключения, если name равно null
            throw new IllegalArgumentException("Dish name can't be empty");
        }
        repository.addDish(name, price);  // Вызов метода добавления блюда из repository
    }

    @Override
    public List<Dish> getAllDishe() {  // Реализация метода интерфейса DishService для получения всех блюд
        return repository.getAllDishes();       // Возврат списка всех блюд из repository
    }

    @Override
    public void removeDish(int id) {  // Реализация метода интерфейса DishService для удаления блюда по ID
        if (id == 0) {   // Проверка на корректность ID и выброс исключения при несоответствии
            throw new IllegalArgumentException("Error");
        }
        if (id <= 0) {
            throw new IllegalArgumentException("Index can't be negative number");
        }
        repository.removeDish(id);   // Вызов метода удаления блюда из repository
    }

    @Override
    public int getTotalNumberOfDishes() {  // Реализация метода интерфейса DishService для получения общего числа блюд
        List<Dish> dishes = repository.getAllDishes();   // Получение списка всех блюд и возврат их общего числа
        return dishes.size();
    }

    @Override
    public boolean isDishExist(int id) {  // Реализация метода интерфейса DishService для проверки существования блюда по ID
        List<Dish> dishes = repository.getAllDishes(); // Получение списка всех блюд и проверка существования блюда по ID
        for (int i = 0; i < dishes.size(); i++) {
            if (dishes.get(i).getId() == id) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void setPrice(int id, double newPrice) {
        if (id <= 0) {
            throw new IllegalArgumentException("Invalid ID. ID must be a positive number.");
        }
        List<Dish> dishes = repository.getAllDishes();
        boolean dishExists = false;

        for (Dish dish : dishes) {
            if (dish.getId() == id) {
                dish.setPrice(newPrice);
                dishExists = true;
                break;
            }
        }
        if (!dishExists) {
            throw new IllegalArgumentException("Dish with ID " + id + " does not exist.");
        }
    }
}